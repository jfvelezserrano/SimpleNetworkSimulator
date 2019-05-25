/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.Windows;

import app.Elements.SimulatorItem;
import java.math.BigDecimal;
import objects.Linker;

/**
 *
 * @author alber
 */
public class VConfLinker extends javax.swing.JFrame {

    private SimulatorItem si;
    private VMain vMain;

    /**
     * Creates new form VConfLinker
     */
    public VConfLinker(VMain vMain) {
        this.si = vMain.getSI();
        this.vMain = vMain;
        initComponents();
        setLocation((getToolkit().getScreenSize().width - this.getWidth()) / 2, 
                (getToolkit().getScreenSize().height - this.getHeight()) / 2);
    }

    public VConfLinker() {
        initComponents();
        setLocation((getToolkit().getScreenSize().width - this.getWidth()) / 2, 
                (getToolkit().getScreenSize().height - this.getHeight()) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jConfLinker = new javax.swing.JPanel();
        lblConfLinker = new javax.swing.JLabel();
        lblSpeedLinker = new javax.swing.JLabel();
        lblSizeLinker = new javax.swing.JLabel();
        txtSpeedLinker = new javax.swing.JTextField();
        txtSizeLinker = new javax.swing.JTextField();
        lblBSConfLinker = new javax.swing.JLabel();
        lblMConfLinker = new javax.swing.JLabel();
        btnAceptarConfLinker = new javax.swing.JButton();
        btnCancelarConfLinker = new javax.swing.JButton();
        lblNameLinker = new javax.swing.JLabel();
        txtNameLinker = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Configuracion del Enlace");
        setResizable(false);

        lblConfLinker.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConfLinker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfLinker.setText("Configuracion del Enlace");

        lblSpeedLinker.setText("Velocidad del Enlace");

        lblSizeLinker.setText("Distancia del Enlace");

        lblBSConfLinker.setText("b/s");

        lblMConfLinker.setText("m");
        lblMConfLinker.setToolTipText("");

        btnAceptarConfLinker.setText("Aceptar");
        btnAceptarConfLinker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarConfLinkerActionPerformed(evt);
            }
        });

        btnCancelarConfLinker.setText("Cancelar");
        btnCancelarConfLinker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarConfLinkerActionPerformed(evt);
            }
        });

        lblNameLinker.setText("Nombre del Enlace");

        javax.swing.GroupLayout jConfLinkerLayout = new javax.swing.GroupLayout(jConfLinker);
        jConfLinker.setLayout(jConfLinkerLayout);
        jConfLinkerLayout.setHorizontalGroup(
            jConfLinkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jConfLinkerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jConfLinkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jConfLinkerLayout.createSequentialGroup()
                        .addComponent(lblSizeLinker)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(txtSizeLinker, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jConfLinkerLayout.createSequentialGroup()
                        .addGroup(jConfLinkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jConfLinkerLayout.createSequentialGroup()
                                .addComponent(lblSpeedLinker)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jConfLinkerLayout.createSequentialGroup()
                                .addComponent(lblNameLinker)
                                .addGap(51, 51, 51)))
                        .addGroup(jConfLinkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSpeedLinker, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txtNameLinker))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jConfLinkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMConfLinker)
                    .addComponent(lblBSConfLinker))
                .addGap(49, 49, 49))
            .addGroup(jConfLinkerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnAceptarConfLinker, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelarConfLinker, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jConfLinkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jConfLinkerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblConfLinker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jConfLinkerLayout.setVerticalGroup(
            jConfLinkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jConfLinkerLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jConfLinkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameLinker)
                    .addComponent(txtNameLinker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jConfLinkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeedLinker)
                    .addComponent(txtSpeedLinker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBSConfLinker))
                .addGap(28, 28, 28)
                .addGroup(jConfLinkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSizeLinker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMConfLinker)
                    .addComponent(lblSizeLinker))
                .addGap(29, 29, 29)
                .addGroup(jConfLinkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarConfLinker, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarConfLinker, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jConfLinkerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jConfLinkerLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblConfLinker)
                    .addContainerGap(210, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jConfLinker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jConfLinker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarConfLinkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarConfLinkerActionPerformed
        this.vMain.setRouting(false);
        Linker l = new Linker();
        l.setDistance(new BigDecimal(txtSizeLinker.getText()));
        l.setSpeed(new BigDecimal(txtSpeedLinker.getText()));
        l.setIp(txtNameLinker.getText());
        si.setL(l);
        this.setVisible(false);
        si.setConectarHosts(true);
        
        if (si.getWorkSpacePanel().getChildsItems().size() > 0 && si.getWorkSpacePanel().getLinkers().size() + 1 >= si.getWorkSpacePanel().getChildsItems().size() - 1) {
            this.vMain.getBtnStart().setEnabled(true);
        } else {
            this.vMain.getBtnStart().setEnabled(false);
        }
        
        this.vMain.getJAddItems().setVisible(false);
        this.vMain.getJMenu().setVisible(false);
        this.vMain.getSI().getWorkSpacePanel().paint(this.getGraphics());
    }//GEN-LAST:event_btnAceptarConfLinkerActionPerformed

    private void btnCancelarConfLinkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarConfLinkerActionPerformed
        this.setVisible(false);
        si.setConectarHosts(false);
    }//GEN-LAST:event_btnCancelarConfLinkerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VConfLinker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VConfLinker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VConfLinker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VConfLinker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VConfLinker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarConfLinker;
    private javax.swing.JButton btnCancelarConfLinker;
    private javax.swing.JPanel jConfLinker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBSConfLinker;
    private javax.swing.JLabel lblConfLinker;
    private javax.swing.JLabel lblMConfLinker;
    private javax.swing.JLabel lblNameLinker;
    private javax.swing.JLabel lblSizeLinker;
    private javax.swing.JLabel lblSpeedLinker;
    private javax.swing.JTextField txtNameLinker;
    private javax.swing.JTextField txtSizeLinker;
    private javax.swing.JTextField txtSpeedLinker;
    // End of variables declaration//GEN-END:variables
}