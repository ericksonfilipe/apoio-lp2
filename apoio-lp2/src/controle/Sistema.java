package controle;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;


import users.Aluno;
import users.Moderador;
import users.Professor;
import users.Usuario;
import util.Util;
import disciplina.Exercicio;
import java.util.ArrayList;
import util.IO;

/**
 * Classe que gerencia o sistema.
 * @author Joao Paulo
 * @author Jessica Priscila
 * @author Erickson Filipe
 * @author Arnett Rufino
 * 
 * @version 0.5 - 25 de junho de 2009
 */
public class Sistema {

    public static String excecao = "";
    public static String addUserSucesso = "";
    public static String addExercicioSucesso = "";

    /**
     * Edita os dados do usuario
     * @param dados
     * @param tipo
     */
    public static boolean editaDadosUsuario(List<String> dados, UsuariosEnum tipo) {
        Usuario usr = criaUsuario(dados, tipo);
        return BD.atualizaUsuario(usr);

    }

    /**
     * Cria um usuario
     * @param dados
     * @param tipo
     * @return o usuario criado
     */
    public static Usuario criaUsuario(List<String> dados, UsuariosEnum tipo) {
        Usuario usr = null;
        if (tipo == UsuariosEnum.ALUNO) {

            try {
                usr = new Aluno(dados.get(DadosUsuarioEnum.NOME.ordinal()),
                        dados.get(DadosUsuarioEnum.LOGIN.ordinal()),
                        dados.get(DadosUsuarioEnum.SENHA.ordinal()),
                        dados.get(DadosUsuarioEnum.MATRICULA.ordinal()),
                        dados.get(DadosUsuarioEnum.EMAIL.ordinal()),
                        dados.get(DadosUsuarioEnum.TURMA.ordinal()));
                addUserSucesso = "Usuario adicionado com sucesso";
            } catch (Exception e) {
                excecao = e.getMessage();
            }
        } else if (tipo == UsuariosEnum.PROFESSOR) {
            try {
                usr = new Professor(dados.get(DadosUsuarioEnum.NOME.ordinal()),
                        dados.get(DadosUsuarioEnum.LOGIN.ordinal()),
                        dados.get(DadosUsuarioEnum.SENHA.ordinal()),
                        dados.get(DadosUsuarioEnum.MATRICULA.ordinal()),
                        dados.get(DadosUsuarioEnum.EMAIL.ordinal()),
                        dados.get(DadosUsuarioEnum.TURMA.ordinal()));
                addUserSucesso = "Usuario adicionado com sucesso";
            } catch (Exception e) {
                excecao = e.getMessage();
            }
        } else {
            try {
                usr = new Moderador(dados.get(DadosUsuarioEnum.NOME.ordinal()),
                        dados.get(DadosUsuarioEnum.LOGIN.ordinal()),
                        dados.get(DadosUsuarioEnum.SENHA.ordinal()),
                        dados.get(DadosUsuarioEnum.MATRICULA.ordinal()),
                        dados.get(DadosUsuarioEnum.EMAIL.ordinal()),
                        dados.get(DadosUsuarioEnum.TURMA.ordinal()));
                addUserSucesso = "Usuario adicionado com sucesso";
            } catch (Exception e) {
                excecao = e.getMessage();

            }

        }
        return usr;
    }

    /**
     * Retorna os usuarios cadastrados no banco de dados
     * @return uma lista de usuarios
     */
    public static List<Usuario> getUsuarios() {
        return BD.getUsuarios();
    }

    /**
     * Muda a senha do usuario
     * @param login
     * @param senhaAntiga
     * @param novaSenha
     * @param confirmaNovaSenha
     * @return true se foi possivel mudar a senha
     */
    public static boolean mudaSenha(String login, String senhaAntiga, String novaSenha, String confirmaNovaSenha) {
        Usuario usr = BD.getUsuario(login);
        if (usr.getSenha().equals(senhaAntiga) && novaSenha.equals(confirmaNovaSenha)) {
            try {
                usr.setSenha(novaSenha);
            } catch (Exception e) {
                return false;
            }
            BD.atualizaUsuario(usr);
            return true;
        }
        return false;
    }

    /**
     * Retorna os dados de um usario
     * @param login
     * @return List<String> - os dados de um usuario
     */
    public static List<String> dadosUsuario(String login) {
        for (Usuario usuario : getUsuarios()) {
            if (usuario.getLogin().equals(login)) {
                return usuario.getDadosUsuario();
            }
        }
        return null;
    }

    /**
     * baixa um arquivo
     * @param caminho
     */
    public static void mandaBaixar(String caminho) {
        // TODO Auto-generated method stub
    }
    


    /**
     * Confere o login e senha do usuario
     * @param login
     * @param senha
     * @return um tipo enum indicando o tipo de usuario
     */
    public static UsuariosEnum confereLoginSenha(String login, String senha) {

        Iterator<Usuario> it = BD.getUsuarios().iterator();
        while (it.hasNext()) {
            Usuario usr = it.next();
            if (usr.getLogin().equals(login) && usr.getSenha().equals(senha)) {
                return tipoUsuario(usr);
            }
        }
        return UsuariosEnum.INEXISTENTE;
    }

    /**
     * retorna o tipo do usuario passado como parametro
     * @param usr
     * @return um tipo enum indicando o tipo de usuario
     */
    public static UsuariosEnum tipoUsuario(Usuario usr) {
        if (usr instanceof Professor) {
            return UsuariosEnum.PROFESSOR;
        } else if (usr instanceof Moderador) {
            return UsuariosEnum.MONITOR;
        }
        return UsuariosEnum.ALUNO;
    }

    /**
     * Envia a resposta de um exercicio se estiver dentro do
     * prazo estipulado para a entrega do exercicio
     * @param login
     * @param caminho
     * @param idExercicio
     * @return true se foi possivel enviar
     */
    public static boolean enviarSubmissao(String login, String caminho, int idExercicio) {
        Submissao sub = new Submissao(idExercicio, login, new GregorianCalendar(), caminho);
        Exercicio exercicio = BD.getExercicio(idExercicio);
        if (sub.getDataDeEntrega().compareTo(exercicio.getDataEntrega()) < 0) {
            try {
                BD.cadastraSubmissao(sub);
            } catch (IOException e) {
                System.out.println(e);
            }
            return true;
        }
        return false;
    }

    /**
     * cadastra um exercicio
     * @param nome
     * @param descricao
     * @param dataEntrega
     * @param id
     * @return true se foi possivel cadastrar o exercicio
     */
    public static boolean cadastrarExercicio(String nome, String descricao, Calendar dataEntrega,
            List<String> questoes) {
        try {
            Exercicio ex = new Exercicio(nome, descricao, dataEntrega, questoes);
            if (!BD.getExercicios().contains(ex)) {
                BD.cadastraExercicio(ex);
                addExercicioSucesso = "Exercício adicionado com sucesso";
                return true;
            }
        } catch (IllegalArgumentException e) {
            excecao = e.getMessage();
        } catch (Exception e) {
            excecao = e.getMessage();
        }
        return false;
    }

    /**
     * Adciona um usuario no sistema
     * @param dadosUsuario
     * @param tipo
     * @throws IOException
     */
    public static boolean addUsuario(List<String> dadosUsuario, UsuariosEnum tipo) throws IOException {
        Usuario usr = criaUsuario(dadosUsuario, tipo);
        return BD.cadastraUsuario(usr);

    }

    /**
     * remove um exercicio
     * @param id
     * @return true se foi possivel
     */
    public static boolean removerExercicio(int id) {
        return BD.removeExercicio(id);

    }

    /**
     * atualiza um exercicio no sistema
     * @param id
     * @param nome
     * @param descricao
     * @param dataDeEntrega
     * @return true se foi possivel atualizar
     * @throws Exception
     */
    public static boolean atualizarExercicio(int id, String nome,
            String descricao, Calendar dataDeEntrega, List<String> questoes) throws Exception {
        Exercicio exercicio = new Exercicio(nome, descricao, dataDeEntrega, questoes);
        return BD.atualizaExercicio(id, exercicio);

    }

    /**
     * retorna uma lista de exercicios
     * @return List<Exercicio> uma lista de exercicios
     */
    public static List<Exercicio> verExercicios() {
        return BD.getExercicios();
    }

    public static List<String> getNomeExercicios() {
        Iterator<Exercicio> it = verExercicios().iterator();
        List<String> nomes = new ArrayList();
        while (it.hasNext()) {
            nomes.add(it.next().getNome());
        }
        return nomes;
    }

    /**
     * Lista os usuarios
     * @return um string com os usuarios
     */
    public static String listarUsuarios() {
        Iterator<Usuario> it = BD.getUsuarios().iterator();
        String dados = "";
        while (it.hasNext()) {
            dados += it.next().toString();
        }
        return dados;
    }

    /**
     * Retorna a correcao para determinado exercicio
     * @param idExercicio
     * @param login
     * @return a correcao para determinado exercicio em forma de string
     */
    public static String getCorrecao(int idExercicio, String login) {
        List<Submissao> submissoes = BD.getSubmissoes();
        Iterator<Submissao> it = submissoes.iterator();
        while (it.hasNext()) {
            Submissao submissao = it.next();
            if (submissao.getIdExercicio() == idExercicio) {
                return submissao.getNota() + submissao.getComentario();
            }
        }
        return "";
    }

    /**
     * Lista todas as submissoes
     * @return List<Submissao> as submissoes
     */
    public static List<Submissao> getSubmissoes() {
        List<Submissao> submissoes = BD.getSubmissoes();
        return submissoes;
    }

    /**
     * Corrige uma submissao de um aluno
     * @param loginModerador
     * @param loginAluno
     * @param idSubmissao
     * @param nota
     * @param comentarioLab
     * @return true se foi possivel corrigir
     */
    public static boolean corrigirSubmissao(String loginModerador, String loginAluno,
            int idSubmissao, double nota, String comentarioLab) {
        Iterator<Usuario> it = BD.getModeradores().iterator();
        while (it.hasNext()) {
            Usuario moderador = it.next();
            if (moderador.getLogin().equals(loginModerador)) {
                Submissao submissao = BD.getSubmissao(idSubmissao);
                submissao.setNota(nota);
                submissao.setComentario(comentarioLab);
                return true;
            }
        }

        return false;
    }

    /**
     * remove um usuario do sistema
     * @param loginUsuario
     * @param idUsuario
     * @return true se foi possivel
     */
    public static boolean removerUsuario(String loginUsuario, int idUsuario) {
        if (BD.getUsuario(loginUsuario) instanceof Professor) {
            BD.removeUsuario(idUsuario);
            return true;
        }
        return false;
    }

    /**
     * prepara o sistema
     */
    public static void inicia() {
        try {
            BD.cadastraUsuario(new Professor("Raquel Vigolvino Lopes",
                    "raquelvl", "123456", "matricula", "raquel@dsc.ufcg.edu.br", "2009.1"));
        } catch (Exception e) {
        }

    }

    /**
     * reseta o banco de dados
     * @param loginUsuario
     */
    public static void resetaBD(String loginUsuario) {
        if (BD.getUsuario(loginUsuario) instanceof Professor) {
            BD.reset();
            inicia();
        }
    }

    /**
     * remove todos os alunos do banco de dados
     * @param login
     */
    public static void removerTodosAlunos(String login) {
        if (BD.getUsuario(login) instanceof Professor) {
            BD.resetAlunos();
        }
    }

    /**
     * remove todos os moderadores do banco de dados
     * @param login
     */
    public static void removerTodosModeradores(String login) {
        if (BD.getUsuario(login) instanceof Professor) {
            BD.resetModeradores();
        }

    }

    /**
     * remove todos os exercicios e submissoes correspondentes do banco de dados
     * @param login
     */
    public static void removerTodosExercicios(String login) {
        if (BD.getUsuario(login) instanceof Professor) {
            BD.resetExercicios();
            removerTodasSubmissoes(login);
        }

    }

    /**
     * remove todas as submissoes do banco de dados
     * @param login
     */
    public static void removerTodasSubmissoes(String login) {
        if (BD.getUsuario(login) instanceof Professor) {
            BD.resetSubmissoes();
        }

    }

    /**
     *
     * Cria uma string com a lista de Alunos
     * @return uma string com a lista de alunos
     */
    public static String listaDeAlunos() {
        List<Usuario> alunos = BD.getAlunos();
        return Util.ListToString(alunos);
    }

    /**
     *
     * Cria uma string com a lista de Moderadores (monitores e prof)
     * @return uma string com a lista de moderadores
     */
    public static String listaDeModeradores() {
        List<Usuario> moderadores = BD.getModeradores();
        return Util.ListToString(moderadores);
    }

    /**
     *
     * Cria uma string com a lista de Exercicios
     * @return uma string com a lista de exercicios
     */
    public static String listaDeExercicios() {
        List<Exercicio> exercicios = BD.getExercicios();
        return Util.ListToString(exercicios);
    }

    /**
     * cria uma string com a lista de exercicios
     * @return uma string com a lista de exercicios
     */
    public static String listaDeExerciciosDoAluno(String login) {
        String listaSubmissoes = "";
        List<Submissao> submissoes = Sistema.getSubmissoes();
        Iterator<Submissao> it = submissoes.iterator();
        while (it.hasNext()) {
            Submissao sub = it.next();
            if (sub.getLogin().equals(login)) {
                listaSubmissoes += sub;
            }
        }
        return listaSubmissoes;
    }

    /**
     * procura um usuario pelo id
     * @param id
     * @return retorna o usuario do id informado
     */
    public static Usuario getUsuario(int id) {
        return BD.getUsuario(id);
    }

    /**
     *  procura um exercicio pelo id
     * @param id
     * @return retorna o exercicio do id informado
     */
    public static Exercicio getExercicio(int id) {
        return BD.getExercicio(id);
    }

    public static String exibirQuestoes(Exercicio exercicio) {
        return exercicio.exibirQuestoes();
    }

    public static void salvaQuadroDeInformacoes(String[] quadroDeInformacoes){
        BD.gravaInformacoesPainel(quadroDeInformacoes);
    }

    public static String[] getQuadroDeInformacoes(){
        return BD.quadroDeInformacoes();
    }
    
    /**
     * Envia a senha do usuario por e-mail
     * @param login
     * @return true se foi possivel enviar a senha do usuario
     */ 
    public static boolean enviaSenhaPorEmail(String login) {
    	Usuario usr = BD.getUsuario(login);
    	try {
            Util.enviaEmail(usr.getEmail(), usr.getNome(), usr.getSenha());
            return true;
	} catch (Exception e) {
		return false;
	}
    }

    public static String getSubmissoesAluno(String login) {
        String submissoes = "";
        for (Submissao sub: getSubmissoes()) {
            if (sub.getLogin().equals(login)) {
                submissoes += sub + IO.NOVA_LINHA;
            }
        }

        return submissoes;
    }

    public static Submissao getSubmissao(int i) {
        return BD.getSubmissao(i);
    }

    public static void atualizaSubmissao(int id, Submissao sub) {
        BD.atualizaSubmissao(id, sub);
    }

}
