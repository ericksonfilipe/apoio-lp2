/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuAluno.java
 *
 * Created on 11/07/2009, 08:42:23
 */
package interfaceGraficaUsuario;

import controle.DadosUsuarioEnum;
import controle.Sistema;
import controle.UsuariosEnum;
import java.awt.Color;
import java.util.List;
import util.Util;

/**
 *
 * @author João Paulo
 */
public class MenuAluno extends javax.swing.JFrame {

    private List<String> dadosUsuario;
    private static MenuAluno janelaAluno = new MenuAluno();

    /** Creates new form MenuAluno */
    public MenuAluno() {
        initComponents();
    }

    public MenuAluno(List<String> dadosUsuario) {
        this.dadosUsuario = dadosUsuario;
        initComponents();
        inicializaPaineis();
//        painelDeAbas.setVisible(true);
        painelExibir.setText("");
        painelExibir.setEnabled(false);
        painelExibir.setForeground(Color.BLACK);
        setTitle("Menu Aluno");
        labelSaudacao.setText("Olá, " + dadosUsuario.get(DadosUsuarioEnum.NOME.ordinal()) + ". email: " + dadosUsuario.get(DadosUsuarioEnum.EMAIL.ordinal()));

    }

    private void inicializaPaineis() {
//        painelDeAbas.setVisible(false);
        painelExibir.setVisible(false);
//        labelSaudacao.setText("Olá, " + dadosUsuario.get(DadosUsuarioEnum.NOME.ordinal()) + ". email: " + dadosUsuario.get(DadosUsuarioEnum.EMAIL.ordinal()));

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        painelExibir = new javax.swing.JTextPane();
        labelSaudacao = new javax.swing.JLabel();
        menuBarAluno = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuExercicios = new javax.swing.JMenu();
        enviarExercicio = new javax.swing.JMenuItem();
        baixarExercicio = new javax.swing.JMenuItem();
        Logoff = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuEditarDados = new javax.swing.JMenuItem();
        menuAlterarSenha = new javax.swing.JMenuItem();
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

        painelExibir.setBackground(new java.awt.Color(240, 240, 240));
        painelExibir.setBorder(null);
        painelExibir.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        painelExibir.setEnabled(false);
        painelExibir.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(painelExibir);

        labelSaudacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        menuArquivo.setText("Arquivo");

        menuExercicios.setText("Exercícios");

        enviarExercicio.setText("Enviar");
        menuExercicios.add(enviarExercicio);

        baixarExercicio.setText("Baixar");
        menuExercicios.add(baixarExercicio);

        menuArquivo.add(menuExercicios);

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

        menuBarAluno.add(menuArquivo);

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

        menuBarAluno.add(menuEditar);

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

        menuBarAluno.add(menuExibir);

        menuAjuda.setText("Ajuda");

        ajudaHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        ajudaHelp.setText("Help");
        ajudaHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaHelpActionPerformed(evt);
            }
        });
        menuAjuda.add(ajudaHelp);

        ajudaSobre.setText("Sobre");
        ajudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(ajudaSobre);

        menuBarAluno.add(menuAjuda);

        setJMenuBar(menuBarAluno);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
            .addGap(0, 695, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSaudacao, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
            .addGap(0, 527, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelSaudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoffActionPerformed
        dispose();
        PaginaInicial telaLogin = new PaginaInicial();
        telaLogin.setVisible(true);
}//GEN-LAST:event_LogoffActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        janelaAluno.setVisible(false);
}//GEN-LAST:event_menuSairMouseClicked

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
}//GEN-LAST:event_menuSairActionPerformed

    private void menuEditarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarDadosActionPerformed
        EditarDados edit = new EditarDados(dadosUsuario, UsuariosEnum.ALUNO);
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

    private void menuAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlterarSenhaActionPerformed
        AlteraSenha alteraSenha = new AlteraSenha(dadosUsuario);
        alteraSenha.setVisible(true);
    }//GEN-LAST:event_menuAlterarSenhaActionPerformed

    private void ajudaHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaHelpActionPerformed
        painelExibir.setText(Util.HELP);
        painelExibir.setVisible(true);
    }//GEN-LAST:event_ajudaHelpActionPerformed

    private void ajudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaSobreActionPerformed
        painelExibir.setText(Util.ABOUT);
        painelExibir.setVisible(true);
    }//GEN-LAST:event_ajudaSobreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MenuAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Logoff;
    private javax.swing.JMenuItem ajudaHelp;
    private javax.swing.JMenuItem ajudaSobre;
    private javax.swing.JMenuItem baixarExercicio;
    private javax.swing.JMenuItem enviarExercicio;
    private javax.swing.JMenuItem exibirAlunos;
    private javax.swing.JMenuItem exibirExercicios;
    private javax.swing.JMenuItem exibirModeradores;
    private javax.swing.JMenuItem exibirPaginaPrincipal;
    private javax.swing.JMenuItem exibirPlanilha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelSaudacao;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuAlterarSenha;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBarAluno;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuEditarDados;
    private javax.swing.JMenu menuExercicios;
    private javax.swing.JMenu menuExibir;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JTextPane painelExibir;
    // End of variables declaration//GEN-END:variables
}
