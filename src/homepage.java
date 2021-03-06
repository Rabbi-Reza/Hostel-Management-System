/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eva
 */
public class homepage extends javax.swing.JFrame {

    /**
     * Creates new form homepage
     */
    public homepage() {
        initComponents();
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
        buidinfo = new javax.swing.JButton();
        studentinfo = new javax.swing.JButton();
        stuInout = new javax.swing.JButton();
        hostelbill = new javax.swing.JButton();
        visitor = new javax.swing.JButton();
        adminMaster = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Hostel Management System");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buidinfo.setBackground(new java.awt.Color(0, 0, 255));
        buidinfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buidinfo.setForeground(new java.awt.Color(255, 51, 51));
        buidinfo.setText("Building Information");
        buidinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buidinfoActionPerformed(evt);
            }
        });

        studentinfo.setBackground(new java.awt.Color(0, 0, 204));
        studentinfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentinfo.setForeground(new java.awt.Color(255, 51, 51));
        studentinfo.setText("Student Information");
        studentinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentinfoActionPerformed(evt);
            }
        });

        stuInout.setBackground(new java.awt.Color(0, 0, 255));
        stuInout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stuInout.setForeground(new java.awt.Color(255, 0, 0));
        stuInout.setText("Student in & out Information");
        stuInout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuInoutActionPerformed(evt);
            }
        });

        hostelbill.setBackground(new java.awt.Color(0, 0, 255));
        hostelbill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hostelbill.setForeground(new java.awt.Color(255, 0, 0));
        hostelbill.setText("Hostel Bill Collection Information ");
        hostelbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostelbillActionPerformed(evt);
            }
        });

        visitor.setBackground(new java.awt.Color(0, 0, 255));
        visitor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        visitor.setForeground(new java.awt.Color(255, 0, 0));
        visitor.setText("Visitors Record");
        visitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorActionPerformed(evt);
            }
        });

        adminMaster.setBackground(new java.awt.Color(153, 153, 0));
        adminMaster.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adminMaster.setForeground(new java.awt.Color(0, 0, 153));
        adminMaster.setText("Login");
        adminMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminMasterActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(hostelbill)
                        .addGap(65, 65, 65)
                        .addComponent(visitor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(buidinfo)
                        .addGap(43, 43, 43)
                        .addComponent(studentinfo)
                        .addGap(42, 42, 42)
                        .addComponent(stuInout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buidinfo)
                    .addComponent(studentinfo)
                    .addComponent(stuInout))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostelbill)
                    .addComponent(visitor))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addComponent(adminMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buidinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buidinfoActionPerformed
        // TODO add your handling code here:
        buildinfo buildinfo = new buildinfo();
        this.dispose();
        buildinfo.setVisible(true);
    }//GEN-LAST:event_buidinfoActionPerformed

    private void studentinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentinfoActionPerformed
        // TODO add your handling code here:
         studentinfo studentinfo = new studentinfo();
        this.dispose();
        studentinfo.setVisible(true);
    }//GEN-LAST:event_studentinfoActionPerformed

    private void hostelbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostelbillActionPerformed
        // TODO add your handling code here:
          hostelbill hostelbill = new hostelbill();
        this.dispose();
        hostelbill.setVisible(true);
        
    }//GEN-LAST:event_hostelbillActionPerformed

    private void visitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorActionPerformed
        visitor visitor = new visitor();
        this.dispose();
        visitor.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_visitorActionPerformed

    private void adminMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminMasterActionPerformed
              adminMaster adminMaster = new adminMaster();
        this.dispose();
        adminMaster.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_adminMasterActionPerformed

    private void stuInoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuInoutActionPerformed
       
          admin1 admin1 = new admin1();
        this.dispose();
        admin1.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_stuInoutActionPerformed

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminMaster;
    private javax.swing.JButton buidinfo;
    private javax.swing.JButton hostelbill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton stuInout;
    private javax.swing.JButton studentinfo;
    private javax.swing.JButton visitor;
    // End of variables declaration//GEN-END:variables
}
