/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuMonitor.java
 *
 * Created on 09/07/2009, 20:07:54
 */
package interfaceGraficaUsuario;

import controle.BD;
import controle.DadosUsuarioEnum;
import controle.UsuariosEnum;
import java.util.List;

/**
 *
 * @author João Paulo
 */
public class MenuMonitor extends MenuProfessor {

    private List<String> dadosUsuario;
    private static MenuMonitor janelaMonitor = new MenuMonitor();

    /** Creates new form MenuMonitor */
    public MenuMonitor() {
        initComponents();
    }

    public MenuMonitor(List<String> dadosUsuario) {
        this.dadosUsuario = dadosUsuario;
        initComponents();

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
        painelExibirAlunos = new javax.swing.JTextPane();
        menuBarMonitor = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuAdicionar = new javax.swing.JMenu();
        addAluno = new javax.swing.JMenuItem();
        addExercicio = new javax.swing.JMenuItem();
        menuRemover = new javax.swing.JMenu();
        removerAluno = new javax.swing.JMenuItem();
        removerExercicio = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuEditarDados = new javax.swing.JMenuItem();
        menuAlterarSenha = new javax.swing.JMenuItem();
        editarExercicio = new javax.swing.JMenuItem();
        menuExibir = new javax.swing.JMenu();
        exibirAlunos = new javax.swing.JMenuItem();
        exibirMonitores = new javax.swing.JMenuItem();
        exibirExercicios = new javax.swing.JMenuItem();
        exibirPlanilha = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        ajudaHelp = new javax.swing.JMenuItem();
        ajudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        labelSaudacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        painelExibirAlunos.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(painelExibirAlunos);

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
        menuAdicionar.add(addExercicio);

        menuArquivo.add(menuAdicionar);

        menuRemover.setText("Remover");

        removerAluno.setText("Aluno");
        menuRemover.add(removerAluno);

        removerExercicio.setText("Exercício");
        menuRemover.add(removerExercicio);

        menuArquivo.add(menuRemover);

        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuArquivo.add(menuSair);

        menuBarMonitor.add(menuArquivo);

        menuEditar.setText("Editar");

        menuEditarDados.setText("Editar Dados");
        menuEditar.add(menuEditarDados);

        menuAlterarSenha.setText("Alterar Senha");
        menuEditar.add(menuAlterarSenha);

        editarExercicio.setText("Editar Exercício");
        menuEditar.add(editarExercicio);

        menuBarMonitor.add(menuEditar);

        menuExibir.setText("Exibir");

        exibirAlunos.setText("Alunos");
        exibirAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirAlunosActionPerformed(evt);
            }
        });
        menuExibir.add(exibirAlunos);

        exibirMonitores.setText("Monitores");
        menuExibir.add(exibirMonitores);

        exibirExercicios.setText("Exercícios");
        menuExibir.add(exibirExercicios);

        exibirPlanilha.setText("Planilha de Notas");
        menuExibir.add(exibirPlanilha);

        menuBarMonitor.add(menuExibir);

        menuAjuda.setText("Ajuda");

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
            .addComponent(labelSaudacao, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelSaudacao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exibirAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirAlunosActionPerformed
        painelExibirAlunos.setVisible(true);
}//GEN-LAST:event_exibirAlunosActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        janelaMonitor.setVisible(false);
}//GEN-LAST:event_menuSairMouseClicked

    private void addAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAlunoActionPerformed
        AddUser addUser = new AddUser(UsuariosEnum.ALUNO);
        addUser.setVisible(true);
}//GEN-LAST:event_addAlunoActionPerformed

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
    private javax.swing.JMenuItem addAluno;
    private javax.swing.JMenuItem addExercicio;
    private javax.swing.JMenuItem ajudaHelp;
    private javax.swing.JMenuItem ajudaSobre;
    private javax.swing.JMenuItem editarExercicio;
    private javax.swing.JMenuItem exibirAlunos;
    private javax.swing.JMenuItem exibirExercicios;
    private javax.swing.JMenuItem exibirMonitores;
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
    private javax.swing.JTextPane painelExibirAlunos;
    private javax.swing.JMenuItem removerAluno;
    private javax.swing.JMenuItem removerExercicio;
    // End of variables declaration//GEN-END:variables
}
