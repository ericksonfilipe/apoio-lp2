/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuMonitor.java
 *
 * Created on 11/07/2009, 00:17:03
 */
package interfaceGraficaUsuario;

import controle.DadosUsuarioEnum;
import controle.Sistema;
import controle.UsuariosEnum;
import java.util.List;

/**
 *
 * @author João Paulo
 */
public class MenuMonitor extends javax.swing.JFrame {

    private List<String> dadosUsuario;
    private static MenuMonitor janelaMonitor = new MenuMonitor();

    /** Creates new form MenuMonitor */
    public MenuMonitor() {
        initComponents();
    }

    public MenuMonitor(List<String> dadosUsuario) {
        this.dadosUsuario = dadosUsuario;
        initComponents();
        painelExibir.setEnabled(false);
        inicializaPaineis();
//        painelDeAbas.setVisible(true);
        painelExibir.setText("");
        setTitle("Menu Monitor");
        labelSaudacao.setText("Olá, " + dadosUsuario.get(DadosUsuarioEnum.NOME.ordinal()) + ". email: " + dadosUsuario.get(DadosUsuarioEnum.EMAIL.ordinal()));
    }

    private void inicializaPaineis() {
//        painelDeAbas.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        painelExibir = new javax.swing.JTextPane();
        menuBarMonitor = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuAdicionar = new javax.swing.JMenu();
        addAluno = new javax.swing.JMenuItem();
        addExercicio = new javax.swing.JMenuItem();
        menuRemover = new javax.swing.JMenu();
        removerUsuario = new javax.swing.JMenuItem();
        removerExercicio = new javax.swing.JMenuItem();
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

        painelExibir.setBackground(new java.awt.Color(240, 240, 240));
        painelExibir.setBorder(null);
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

        menuBarMonitor.add(menuArquivo);

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
        menuEditar.add(menuAlterarSenha);

        editarExercicio.setText("Editar Exercício");
        menuEditar.add(editarExercicio);

        menuBarMonitor.add(menuEditar);

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

        menuBarMonitor.add(menuExibir);

        menuAjuda.setText("Ajuda");

        ajudaHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        ajudaHelp.setText("Help");
        menuAjuda.add(ajudaHelp);

        ajudaSobre.setText("Sobre");
        menuAjuda.add(ajudaSobre);

        menuBarMonitor.add(menuAjuda);

        setJMenuBar(menuBarMonitor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSaudacao, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelSaudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAlunoActionPerformed
        AddUser addUser = new AddUser(UsuariosEnum.ALUNO);
        addUser.setVisible(true);
}//GEN-LAST:event_addAlunoActionPerformed

    private void addExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addExercicioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_addExercicioActionPerformed

    private void removerUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerUsuarioActionPerformed
        RemoveUsuario remove = new RemoveUsuario(dadosUsuario.get(DadosUsuarioEnum.LOGIN.ordinal()));

        remove.setVisible(true);
}//GEN-LAST:event_removerUsuarioActionPerformed

    private void LogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoffActionPerformed
        dispose();
        PaginaInicial telaLogin = new PaginaInicial();
        telaLogin.setVisible(true);
}//GEN-LAST:event_LogoffActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        janelaMonitor.setVisible(false);
}//GEN-LAST:event_menuSairMouseClicked

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
}//GEN-LAST:event_menuSairActionPerformed

    private void menuEditarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarDadosActionPerformed
        EditarDados edit = new EditarDados(dadosUsuario, UsuariosEnum.MONITOR);
        edit.setVisible(true);
}//GEN-LAST:event_menuEditarDadosActionPerformed

    private void exibirPaginaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirPaginaPrincipalActionPerformed
        inicializaPaineis();
    //        painelDeAbas.setVisible(true);
}//GEN-LAST:event_exibirPaginaPrincipalActionPerformed

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

    private void exibirExerciciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirExerciciosActionPerformed
        inicializaPaineis();
        painelExibir.setText(Sistema.listaDeExercicios());
        painelExibir.setVisible(true);
}//GEN-LAST:event_exibirExerciciosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MenuMonitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Logoff;
    private javax.swing.JMenuItem addAluno;
    private javax.swing.JMenuItem addExercicio;
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
    private javax.swing.JMenuBar menuBarMonitor;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuEditarDados;
    private javax.swing.JMenu menuExibir;
    private javax.swing.JMenu menuRemover;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JTextPane painelExibir;
    private javax.swing.JMenuItem removerExercicio;
    private javax.swing.JMenuItem removerUsuario;
    // End of variables declaration//GEN-END:variables
}
