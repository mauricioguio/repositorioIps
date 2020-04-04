/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondoc;

import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBconfiguraciones = new javax.swing.JButton();
        jBgenerar = new javax.swing.JButton();
        jBradicar = new javax.swing.JButton();
        jBexterna = new javax.swing.JButton();
        jBvisualizar = new javax.swing.JButton();
        jLcerrar = new javax.swing.JLabel();
        jLminimizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBconfiguraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos configuraciones.png"))); // NOI18N
        jBconfiguraciones.setBorder(null);
        jBconfiguraciones.setBorderPainted(false);
        jBconfiguraciones.setContentAreaFilled(false);
        jBconfiguraciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jBconfiguraciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));

        jBgenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono generar documento.png"))); // NOI18N
        jBgenerar.setBorder(null);
        jBgenerar.setContentAreaFilled(false);
        jBgenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jBgenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jBradicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos radicar documento.png"))); // NOI18N
        jBradicar.setBorder(null);
        jBradicar.setBorderPainted(false);
        jBradicar.setContentAreaFilled(false);
        jBradicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBradicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono radicar on.png"))); // NOI18N
        jBradicar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono radicar on.png"))); // NOI18N
        jBradicar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono radicar on.png"))); // NOI18N
        jBradicar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jBradicarMouseMoved(evt);
            }
        });
        jBradicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBradicarMouseExited(evt);
            }
        });
        getContentPane().add(jBradicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        jBexterna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos documentacion externa.png"))); // NOI18N
        jBexterna.setBorder(null);
        jBexterna.setBorderPainted(false);
        jBexterna.setContentAreaFilled(false);
        jBexterna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jBexterna, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        jBvisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos visualizar factura.png"))); // NOI18N
        jBvisualizar.setBorder(null);
        jBvisualizar.setBorderPainted(false);
        jBvisualizar.setContentAreaFilled(false);
        jBvisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBvisualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono visualizar on.png"))); // NOI18N
        jBvisualizar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono visualizar on.png"))); // NOI18N
        jBvisualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono visualizar on.png"))); // NOI18N
        getContentPane().add(jBvisualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 100, 110));

        jLcerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar2.png"))); // NOI18N
        jLcerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLcerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLcerrarMouseClicked(evt);
            }
        });
        getContentPane().add(jLcerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 2, -1, -1));

        jLminimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimizar2.png"))); // NOI18N
        jLminimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLminimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLminimizarMouseClicked(evt);
            }
        });
        getContentPane().add(jLminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 2, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fundacion mira tu salud.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLcerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLcerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir de esta ventana?","Exit",dialog);
        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLcerrarMouseClicked

    private void jLminimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLminimizarMouseClicked
        this.setState(Inicio.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_jLminimizarMouseClicked

    private void jBradicarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBradicarMouseMoved
        
    }//GEN-LAST:event_jBradicarMouseMoved

    private void jBradicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBradicarMouseExited
       
    }//GEN-LAST:event_jBradicarMouseExited

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBconfiguraciones;
    private javax.swing.JButton jBexterna;
    private javax.swing.JButton jBgenerar;
    private javax.swing.JButton jBradicar;
    private javax.swing.JButton jBvisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcerrar;
    private javax.swing.JLabel jLminimizar;
    // End of variables declaration//GEN-END:variables
}
