/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * BaixarExercicio.java
 *
 * Created on 12/07/2009, 08:50:18
 */

package interfaceGraficaUsuario;

import controle.Sistema;
import users.Usuario;

/**
 *
 * @author João Paulo
 */
public class BaixarExercicio extends javax.swing.JFrame {

    /** Creates new form BaixarExercicio */
    public BaixarExercicio() {
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

        labelID = new javax.swing.JLabel();
        labelNotFound = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        botaoProcurarID = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelExibir = new javax.swing.JTextPane();
        labelIDExercicio = new javax.swing.JLabel();
        campoIDExercicio = new javax.swing.JTextField();
        botaoProcurarIDExercicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        labelID.setText("Informe o ID do usuário: ");

        labelNotFound.setText("Usuário não encontrado");

        botaoProcurarID.setText("Procurar");
        botaoProcurarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarIDActionPerformed(evt);
            }
        });

        painelExibir.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(painelExibir);

        labelIDExercicio.setText("Informe o ID do Exercício: ");

        botaoProcurarIDExercicio.setText("Procurar");
        botaoProcurarIDExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarIDExercicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(labelNotFound, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoProcurarID))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                        .addGap(371, 371, 371))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelIDExercicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoIDExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoProcurarIDExercicio)
                        .addContainerGap(364, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(labelNotFound)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcurarID))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDExercicio)
                    .addComponent(campoIDExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoProcurarIDExercicio))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void botaoProcurarIDExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarIDExercicioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_botaoProcurarIDExercicioActionPerformed

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
                new BaixarExercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoProcurarID;
    private javax.swing.JButton botaoProcurarIDExercicio;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoIDExercicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelIDExercicio;
    private javax.swing.JLabel labelNotFound;
    private javax.swing.JTextPane painelExibir;
    // End of variables declaration//GEN-END:variables

}