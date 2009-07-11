/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuProfessor.java
 *
 * Created on 08/07/2009, 11:21:16
 */
package interfaceGraficaUsuario;

import controle.DadosUsuarioEnum;
import controle.Sistema;
import controle.UsuariosEnum;
import java.awt.Color;
import java.util.List;

/**
 *
 * @author João Paulo
 */
public class MenuProfessor extends javax.swing.JFrame {

    private List<String> dadosUsuario;
    private static MenuProfessor janelaMonitor = new MenuProfessor();

    /** Creates new form MenuProfessor */
    public MenuProfessor() {
        initComponents();

    }

    public MenuProfessor(List<String> dadosUsuario) {
        this.dadosUsuario = dadosUsuario;
        initComponents();
        inicializaPaineis();
        painelExibir.setEnabled(false);
        painelExibir.setForeground(Color.BLACK);
        painelDeAbas.setVisible(true);
        painelExibir.setText("");
        setTitle("Menu Professor");
        labelSaudacao.setText("Olá, " + dadosUsuario.get(DadosUsuarioEnum.NOME.ordinal()) + ". email: " + dadosUsuario.get(DadosUsuarioEnum.EMAIL.ordinal()));
    }

    private void inicializaPaineis() {
        painelDeAbas.setVisible(false);
        painelExibir.setVisible(false);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSaudacao = new javax.swing.JLabel();
        painelDeAbas = new javax.swing.JTabbedPane();
        abaPainelAvisos = new javax.swing.JTabbedPane();
        abaPainelPlanoDeAula = new javax.swing.JTabbedPane();
        abaPainelCriterio = new javax.swing.JTabbedPane();
        abaPainelInfoProjeto = new javax.swing.JTabbedPane();
        abaPainelNotas = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelExibir = new javax.swing.JTextPane();
        menuBarProfessor = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuAdicionar = new javax.swing.JMenu();
        addAluno = new javax.swing.JMenuItem();
        addMonitor = new javax.swing.JMenuItem();
        addExercicio = new javax.swing.JMenuItem();
        menuRemover = new javax.swing.JMenu();
        removerUsuario = new javax.swing.JMenuItem();
        removerExercicio = new javax.swing.JMenuItem();
        menuResetarBD = new javax.swing.JMenu();
        resetarAlunos = new javax.swing.JMenuItem();
        resetarSubmissões = new javax.swing.JMenuItem();
        resetarExercicios = new javax.swing.JMenuItem();
        resetaBD = new javax.swing.JMenuItem();
        Logoff = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuEditarDados = new javax.swing.JMenuItem();
        menuAlterarSenha = new javax.swing.JMenuItem();
        editarExercicio = new javax.swing.JMenuItem();
        menuExibir = new javax.swing.JMenu();
        exibirPaginaPrincipal = new javax.swing.JMenuItem();
        exibirAlunos = new javax.swing.JMenuItem();
        exibirModeradores = new javax.swing.JMenuItem();
        exibirExercicios = new javax.swing.JMenuItem();
        exibirPlanilha = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        ajudaHelp = new javax.swing.JMenuItem();
        ajudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        labelSaudacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        painelDeAbas.addTab("Avisos", abaPainelAvisos);
        abaPainelAvisos.getAccessibleContext().setAccessibleName("");

        painelDeAbas.addTab("Plano de Aula", abaPainelPlanoDeAula);
        painelDeAbas.addTab("Critério de Avaliação", abaPainelCriterio);
        painelDeAbas.addTab("Informações do Projeto", abaPainelInfoProjeto);
        painelDeAbas.addTab("Notas", abaPainelNotas);

        painelExibir.setBackground(new java.awt.Color(240, 240, 240));
        painelExibir.setBorder(null);
        painelExibir.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        painelExibir.setMargin(new java.awt.Insets(0, 0, 0, 0));
        painelExibir.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(painelExibir);

        menuArquivo.setText("Arquivo");

        menuAdicionar.setText("Adicionar");

        addAluno.setText("Aluno");
        addAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAlunoActionPerformed(evt);
            }
        });
        menuAdicionar.add(addAluno);

        addMonitor.setText("Monitor");
        addMonitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMonitorActionPerformed(evt);
            }
        });
        menuAdicionar.add(addMonitor);

        addExercicio.setText("Exercício");
        addExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addExercicioActionPerformed(evt);
            }
        });
        menuAdicionar.add(addExercicio);

        menuArquivo.add(menuAdicionar);

        menuRemover.setText("Remover");

        removerUsuario.setText("Usuário");
        removerUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerUsuarioActionPerformed(evt);
            }
        });
        menuRemover.add(removerUsuario);

        removerExercicio.setText("Exercício");
        menuRemover.add(removerExercicio);

        menuArquivo.add(menuRemover);

        menuResetarBD.setText("Resetar BD");

        resetarAlunos.setText("Alunos");
        resetarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetarAlunosActionPerformed(evt);
            }
        });
        menuResetarBD.add(resetarAlunos);

        resetarSubmissões.setText("Submissões");
        resetarSubmissões.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetarSubmissõesActionPerformed(evt);
            }
        });
        menuResetarBD.add(resetarSubmissões);

        resetarExercicios.setText("Exercícios");
        resetarExercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetarExerciciosActionPerformed(evt);
            }
        });
        menuResetarBD.add(resetarExercicios);

        resetaBD.setText("Resetar Tudo");
        resetaBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetaBDActionPerformed(evt);
            }
        });
        menuResetarBD.add(resetaBD);

        menuArquivo.add(menuResetarBD);

        Logoff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Logoff.setText("Logoff");
        Logoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoffActionPerformed(evt);
            }
        });
        menuArquivo.add(Logoff);

        menuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSair);

        menuBarProfessor.add(menuArquivo);

        menuEditar.setText("Editar");

        menuEditarDados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuEditarDados.setText("Editar Dados");
        menuEditarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarDadosActionPerformed(evt);
            }
        });
        menuEditar.add(menuEditarDados);

        menuAlterarSenha.setText("Alterar Senha");
        menuAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlterarSenhaActionPerformed(evt);
            }
        });
        menuEditar.add(menuAlterarSenha);

        editarExercicio.setText("Editar Exercício");
        menuEditar.add(editarExercicio);

        menuBarProfessor.add(menuEditar);

        menuExibir.setText("Exibir");

        exibirPaginaPrincipal.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        exibirPaginaPrincipal.setText("Página Principal");
        exibirPaginaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirPaginaPrincipalActionPerformed(evt);
            }
        });
        menuExibir.add(exibirPaginaPrincipal);

        exibirAlunos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        exibirAlunos.setText("Alunos");
        exibirAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirAlunosActionPerformed(evt);
            }
        });
        menuExibir.add(exibirAlunos);

        exibirModeradores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        exibirModeradores.setText("Moderadores");
        exibirModeradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirModeradoresActionPerformed(evt);
            }
        });
        menuExibir.add(exibirModeradores);

        exibirExercicios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exibirExercicios.setText("Exercícios");
        exibirExercicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirExerciciosActionPerformed(evt);
            }
        });
        menuExibir.add(exibirExercicios);

        exibirPlanilha.setText("Planilha de Notas");
        menuExibir.add(exibirPlanilha);

        menuBarProfessor.add(menuExibir);

        menuAjuda.setText("Ajuda");

        ajudaHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        ajudaHelp.setText("Help");
        menuAjuda.add(ajudaHelp);

        ajudaSobre.setText("Sobre");
        menuAjuda.add(ajudaSobre);

        menuBarProfessor.add(menuAjuda);

        setJMenuBar(menuBarProfessor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSaudacao, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(painelDeAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelSaudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelDeAbas, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(48, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        janelaMonitor.setVisible(false);

}//GEN-LAST:event_menuSairMouseClicked

    private void addMonitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMonitorActionPerformed

        AddUser addUser = new AddUser(UsuariosEnum.MONITOR);
        addUser.setVisible(true);
    }//GEN-LAST:event_addMonitorActionPerformed

    private void addAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAlunoActionPerformed
        AddUser addUser = new AddUser(UsuariosEnum.ALUNO);
        addUser.setVisible(true);

    }//GEN-LAST:event_addAlunoActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);

    }//GEN-LAST:event_menuSairActionPerformed

    private void exibirAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirAlunosActionPerformed
        inicializaPaineis();
        painelExibir.setText(Sistema.listaDeAlunos());
        painelExibir.setVisible(true);
    }//GEN-LAST:event_exibirAlunosActionPerformed

    private void exibirModeradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirModeradoresActionPerformed
        inicializaPaineis();
        painelExibir.setText(Sistema.listaDeModeradores());
        painelExibir.setVisible(true);
}//GEN-LAST:event_exibirModeradoresActionPerformed

    private void resetarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetarAlunosActionPerformed
        Sistema.removerTodosAlunos((dadosUsuario.get(DadosUsuarioEnum.LOGIN.ordinal())));
    }//GEN-LAST:event_resetarAlunosActionPerformed

    private void exibirExerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirExerciciosActionPerformed
        inicializaPaineis();
        painelExibir.setText(Sistema.listaDeExercicios());
        painelExibir.setVisible(true);
    }//GEN-LAST:event_exibirExerciciosActionPerformed

    private void exibirPaginaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirPaginaPrincipalActionPerformed
        inicializaPaineis();
        painelDeAbas.setVisible(true);
    }//GEN-LAST:event_exibirPaginaPrincipalActionPerformed

    private void resetarExerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetarExerciciosActionPerformed
        Sistema.removerTodosExercicios(dadosUsuario.get(DadosUsuarioEnum.LOGIN.ordinal()));
    }//GEN-LAST:event_resetarExerciciosActionPerformed

    private void resetarSubmissõesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetarSubmissõesActionPerformed
        Sistema.removerTodasSubmissoes(dadosUsuario.get(DadosUsuarioEnum.LOGIN.ordinal()));

    }//GEN-LAST:event_resetarSubmissõesActionPerformed

    private void LogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoffActionPerformed
        dispose();
        PaginaInicial telaLogin = new PaginaInicial();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_LogoffActionPerformed

    private void resetaBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetaBDActionPerformed
        Sistema.resetaBD(dadosUsuario.get(DadosUsuarioEnum.LOGIN.ordinal()));
    }//GEN-LAST:event_resetaBDActionPerformed

    private void addExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExercicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addExercicioActionPerformed

    private void menuEditarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarDadosActionPerformed
        EditarDados edit = new EditarDados(dadosUsuario, UsuariosEnum.PROFESSOR);
        edit.setVisible(true);

    }//GEN-LAST:event_menuEditarDadosActionPerformed

    private void removerUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerUsuarioActionPerformed
        RemoveUsuario remove = new RemoveUsuario(dadosUsuario.get(DadosUsuarioEnum.LOGIN.ordinal()));

        remove.setVisible(true);
}//GEN-LAST:event_removerUsuarioActionPerformed

    private void menuAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarSenhaActionPerformed
        AlteraSenha alteraSenha = new AlteraSenha(dadosUsuario);
        alteraSenha.setVisible(true);
    }//GEN-LAST:event_menuAlterarSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MenuProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Logoff;
    private javax.swing.JTabbedPane abaPainelAvisos;
    private javax.swing.JTabbedPane abaPainelCriterio;
    private javax.swing.JTabbedPane abaPainelInfoProjeto;
    private javax.swing.JTabbedPane abaPainelNotas;
    private javax.swing.JTabbedPane abaPainelPlanoDeAula;
    private javax.swing.JMenuItem addAluno;
    private javax.swing.JMenuItem addExercicio;
    private javax.swing.JMenuItem addMonitor;
    private javax.swing.JMenuItem ajudaHelp;
    private javax.swing.JMenuItem ajudaSobre;
    private javax.swing.JMenuItem editarExercicio;
    private javax.swing.JMenuItem exibirAlunos;
    private javax.swing.JMenuItem exibirExercicios;
    private javax.swing.JMenuItem exibirModeradores;
    private javax.swing.JMenuItem exibirPaginaPrincipal;
    private javax.swing.JMenuItem exibirPlanilha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelSaudacao;
    private javax.swing.JMenu menuAdicionar;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAlterarSenha;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBarProfessor;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuEditarDados;
    private javax.swing.JMenu menuExibir;
    private javax.swing.JMenu menuRemover;
    private javax.swing.JMenu menuResetarBD;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JTabbedPane painelDeAbas;
    private javax.swing.JTextPane painelExibir;
    private javax.swing.JMenuItem removerExercicio;
    private javax.swing.JMenuItem removerUsuario;
    private javax.swing.JMenuItem resetaBD;
    private javax.swing.JMenuItem resetarAlunos;
    private javax.swing.JMenuItem resetarExercicios;
    private javax.swing.JMenuItem resetarSubmissões;
    // End of variables declaration//GEN-END:variables
}