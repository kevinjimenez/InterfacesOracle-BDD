/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import FrontEnd.Auditoria;
import FrontEnd.interfazAlbum;
import FrontEnd.interfazCancion;
import FrontEnd.interfazGenero;
import FrontEnd.interfazIdioma;
import FrontEnd.interfazInterprete;
import FrontEnd.interfazReplicaInterprete;
import FrontEnd.interfazReplicaAlbum;
import FrontEnd.interfazReplicaIdioma;

/**
 *
 * @author KEVIN
 */
public class interfazPrincipal extends javax.swing.JFrame {

    interfazInterprete interpretre;
    interfazAlbum album;
    interfazCancion cancion;
    interfazGenero genero;
    interfazIdioma idioma;
    Auditoria auditoria; 
    interfazReplicaInterprete r1;
    interfazReplicaAlbum r2;
    interfazReplicaIdioma r3;
    interfazDisquera dis;
    //interfazPrincipal ventan ;
        
    /**
     * Creates new form interfazPrincipal
     */
    public interfazPrincipal() {
        initComponents();
        interpretre=new interfazInterprete();
        album=new interfazAlbum();
        cancion=new interfazCancion();
        genero=new interfazGenero();
        idioma=new interfazIdioma();
        auditoria=new Auditoria();
        r1=new interfazReplicaInterprete();
        r2=new interfazReplicaAlbum();
        r3=new interfazReplicaIdioma();
        dis=new interfazDisquera();
        //ventan = new interfazPrincipal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_interprete = new javax.swing.JButton();
        btn_album = new javax.swing.JButton();
        btn_cancion = new javax.swing.JButton();
        btn_genero = new javax.swing.JButton();
        btn_idioma = new javax.swing.JButton();
        btnAuditoria = new javax.swing.JButton();
        btnReplica1 = new javax.swing.JButton();
        btnReplica2 = new javax.swing.JButton();
        btnReplica3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_interprete.setText("Interprete");
        btn_interprete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_interpreteActionPerformed(evt);
            }
        });

        btn_album.setText("Album");
        btn_album.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_albumActionPerformed(evt);
            }
        });

        btn_cancion.setText("Canciones");
        btn_cancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancionActionPerformed(evt);
            }
        });

        btn_genero.setText("Genero");
        btn_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generoActionPerformed(evt);
            }
        });

        btn_idioma.setText("Idioma");
        btn_idioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_idiomaActionPerformed(evt);
            }
        });

        btnAuditoria.setText("Auditoria");
        btnAuditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuditoriaActionPerformed(evt);
            }
        });

        btnReplica1.setText("Replica Interprete");
        btnReplica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplica1ActionPerformed(evt);
            }
        });

        btnReplica2.setText("Replica Album");
        btnReplica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplica2ActionPerformed(evt);
            }
        });

        btnReplica3.setText("Replica Idioma");
        btnReplica3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplica3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tablas");

        jLabel2.setText("Replicas");

        jLabel3.setText("Auditoria");

        jButton1.setText("Disquera");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnAuditoria))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReplica2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReplica3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_album, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_interprete)
                                    .addComponent(btn_cancion)
                                    .addComponent(btn_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnReplica1)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_interprete)
                    .addComponent(btnAuditoria)
                    .addComponent(btnReplica1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_album)
                    .addComponent(btnReplica2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancion)
                    .addComponent(btnReplica3))
                .addGap(1, 1, 1)
                .addComponent(btn_genero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_idioma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_interpreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_interpreteActionPerformed
        // TODO add your handling code here:        
        //this.dispose();
        interpretre.setVisible(true);                        
    }//GEN-LAST:event_btn_interpreteActionPerformed

    private void btn_albumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_albumActionPerformed
        // TODO add your handling code here:
        //this.dispose();
        album.setVisible(true);
    }//GEN-LAST:event_btn_albumActionPerformed

    private void btn_cancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancionActionPerformed
        // TODO add your handling code here:
        //this.dispose();
        cancion.setVisible(true);
    }//GEN-LAST:event_btn_cancionActionPerformed

    private void btn_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generoActionPerformed
        // TODO add your handling code here:
        //this.dispose();
        genero.setVisible(true);
    }//GEN-LAST:event_btn_generoActionPerformed

    private void btn_idiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_idiomaActionPerformed
        // TODO add your handling code here:
        //this.dispose();
        idioma.setVisible(true);
    }//GEN-LAST:event_btn_idiomaActionPerformed

    private void btnReplica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplica1ActionPerformed
        // TODO add your handling code here:
        //this.dispose();
        r1.setVisible(true);        
    }//GEN-LAST:event_btnReplica1ActionPerformed

    private void btnReplica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplica2ActionPerformed
        // TODO add your handling code here:
        //this.dispose();
        r2.setVisible(true);
    }//GEN-LAST:event_btnReplica2ActionPerformed

    private void btnReplica3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplica3ActionPerformed
        // TODO add your handling code here:
        //this.dispose();
        r3.setVisible(true);
    }//GEN-LAST:event_btnReplica3ActionPerformed

    private void btnAuditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuditoriaActionPerformed
        // TODO add your handling code here:
        //this.dispose();
        auditoria.setVisible(true);
    }//GEN-LAST:event_btnAuditoriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dis.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuditoria;
    private javax.swing.JButton btnReplica1;
    private javax.swing.JButton btnReplica2;
    private javax.swing.JButton btnReplica3;
    private javax.swing.JButton btn_album;
    private javax.swing.JButton btn_cancion;
    private javax.swing.JButton btn_genero;
    private javax.swing.JButton btn_idioma;
    private javax.swing.JButton btn_interprete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
