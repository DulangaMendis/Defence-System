/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Demo.obs;

import Demo.Obseverble;
import Demo.obs.Observer;


/**
 *
 * @author ASUS
 */
public class Tank extends javax.swing.JFrame implements Observer{

    private Obseverble obs;
  

    /**
     * Creates new form Tank
     */
    public Tank() {
        initComponents();
        setVisible(true);
        this.setTitle("Tank");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblarea = new javax.swing.JLabel();
        btnmissile = new javax.swing.JButton();
        btnrotate1 = new javax.swing.JButton();
        btnrotate2 = new javax.swing.JButton();
        btnshoot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textareaT = new javax.swing.JTextArea();
        textfield1 = new javax.swing.JTextField();
        btnsend = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSlider1 = new javax.swing.JSlider();
        positioncheck = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblarea.setText("Area Not Cleared");
        jPanel1.add(lblarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 190, 30));

        btnmissile.setText("Missile Operating");
        jPanel1.add(btnmissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 140, 30));

        btnrotate1.setText("Reader Operation");
        jPanel1.add(btnrotate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, 30));

        btnrotate2.setText("Rotate Shooting");
        btnrotate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrotate2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnrotate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 30));

        btnshoot.setText("Shoot");
        btnshoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshootActionPerformed(evt);
            }
        });
        jPanel1.add(btnshoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 140, 30));

        textareaT.setColumns(20);
        textareaT.setRows(5);
        jScrollPane1.setViewportView(textareaT);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 410, 180));
        jPanel1.add(textfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 342, 340, 30));

        btnsend.setText("Send");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });
        jPanel1.add(btnsend, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 60, 30));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 50, -1));
        jPanel1.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 50, -1));

        jSlider1.setMajorTickSpacing(20);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jPanel1.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 50, 270));

        positioncheck.setText("Position");
        jPanel1.add(positioncheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabel2.setText("Soldier Count");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 110, 20));

        jLabel3.setText("Ammo Count");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 110, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnshootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnshootActionPerformed

    private void btnrotate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrotate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrotate2ActionPerformed

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        if(obs!=null){
            String data = textfield1.getText();
            obs.DiliverMessege("Tank : "+data+"\n");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnsendActionPerformed
    
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
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmissile;
    private javax.swing.JButton btnrotate1;
    private javax.swing.JButton btnrotate2;
    private javax.swing.JButton btnsend;
    private javax.swing.JButton btnshoot;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel lblarea;
    private javax.swing.JCheckBox positioncheck;
    public javax.swing.JTextArea textareaT;
    private javax.swing.JTextField textfield1;
    // End of variables declaration//GEN-END:variables

     //------------------JSlider & Position CheckBox-----------------
    @Override
    public void updateValue(int value) {
        if(positioncheck.isSelected()==true){ 
            btnshoot.setEnabled(30<value);
            btnmissile.setEnabled(50<value);
            btnrotate1.setEnabled(60<value);
            btnrotate2.setEnabled(70<value);
        }else{
            btnshoot.setEnabled(false);
            btnmissile.setEnabled(false);
            btnrotate1.setEnabled(false);
            btnrotate2.setEnabled(false);
              }
        }

    //------------------Area Cleared-----------------

     public void AreaCleared(boolean slected) {
        if(slected){
            lblarea.setText("Area Cleared");
        }else{
            lblarea.setText("Area Not Cleared");
        }
    }
     
     //------------------Maincontroller -> Observerse-----------------
     
      public void SendMainMessege(String messege) {
          textareaT.append(messege);
  
    }

    @Override
    public void DiliverMianMessege(String messege) {
        
    }

    public void setObserver(Obseverble obs){
        
        this.obs=obs;
    }
      
     

}
  
