/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CorrigirExercicio.java
 *
 * Created on 14/07/2009, 03:08:24
 */

package interfaceGraficaUsuario;

import com.mysql.jdbc.Util;
import controle.BD;
import controle.Sistema;
import controle.Submissao;
import java.awt.Color;
import users.Usuario;

/**
 *
 * @author Administrador
 */
public class CorrigirExercicio extends javax.swing.JFrame {

    /** Creates new form CorrigirExercicio */
    public CorrigirExercicio() {
        initComponents();
        mensagem.setVisible(false);
        labelNotFound.setVisible(false);
        labelNotFound.setForeground(Color.red);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCancelar = new javax.swing.JButton();
        labelID = new javax.swing.JLabel();
        botaoProcurarID = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelExibir = new javax.swing.JTextPane();
        labelNotFound = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        campoIDSubmissao = new javax.swing.JTextField();
        labelIDExercicio = new javax.swing.JLabel();
        labelCorrecao = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        comentarioECorrecoes = new javax.swing.JTextArea();
        botaoSalvar = new javax.swing.JButton();
        mensagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        labelID.setText("Informe o ID do usuário: ");

        botaoProcurarID.setText("Procurar");
        botaoProcurarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarIDActionPerformed(evt);
            }
        });

        painelExibir.setBackground(new java.awt.Color(240, 240, 240));
        painelExibir.setEditable(false);
        painelExibir.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        painelExibir.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(painelExibir);

        labelNotFound.setText("Usuario não encontrado");

        labelIDExercicio.setText("Informe o ID do Exercício: ");

        labelCorrecao.setText("Digite aqui os comentários e correções do exercício:");

        comentarioECorrecoes.setColumns(20);
        comentarioECorrecoes.setRows(5);
        jScrollPane2.setViewportView(comentarioECorrecoes);

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        mensagem.setText("erro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoProcurarID))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelIDExercicio)
                                .addGap(18, 18, 18)
                                .addComponent(campoIDSubmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCorrecao)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoCancelar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(mensagem))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelNotFound, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                        .addGap(330, 330, 330))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(labelNotFound)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcurarID)
                    .addComponent(mensagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCorrecao)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDExercicio)
                    .addComponent(campoIDSubmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoCancelar))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
}//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoProcurarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarIDActionPerformed
        int idUsuario = Integer.parseInt(campoID.getText());
        if (procuraUsuario(idUsuario) != null) {
            Usuario usuario = procuraUsuario(idUsuario);
            painelExibir.setText(Sistema.listaDeExerciciosDoAluno(usuario.getLogin()));
            painelExibir.setVisible(true);
            labelNotFound.setVisible(false);
        } else {
            labelNotFound.setVisible(true);

        }
}//GEN-LAST:event_botaoProcurarIDActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        try {
            int id = Integer.parseInt(campoIDSubmissao.getText());
            Submissao sub = Sistema.getSubmissao(id);
            sub.setComentario(comentarioECorrecoes.getText());
            Sistema.atualizaSubmissao(id, sub);
            mensagem.setText("Correcao efetuada com sucesso!");
            mensagem.setForeground(Color.blue);
            mensagem.setVisible(true);
        } catch(Exception e) {
            mensagem.setText("Nao foi possivel corrigir o exercicio!");
            mensagem.setForeground(Color.red);
            mensagem.setVisible(true);
        }
}//GEN-LAST:event_botaoSalvarActionPerformed
/**
     * retorna o usuario
     * @param id identificaçao do usuario
     * @return usuario procurado pelo id
     */
    private Usuario procuraUsuario(int id) {
        return Sistema.getUsuario(id);
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CorrigirExercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoProcurarID;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoIDSubmissao;
    private javax.swing.JTextArea comentarioECorrecoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCorrecao;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelIDExercicio;
    private javax.swing.JLabel labelNotFound;
    private javax.swing.JLabel mensagem;
    private javax.swing.JTextPane painelExibir;
    // End of variables declaration//GEN-END:variables

}