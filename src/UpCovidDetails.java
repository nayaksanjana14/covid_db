/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author sanja
 */
public class UpCovidDetails extends javax.swing.JFrame {

    /**
     * Creates new form UpCovidDetails
     */
    public UpCovidDetails() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(155, 125));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("REPORT ID");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("YOUR ID");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("REPORT");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PLACE");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        jButton1.setText("UPDATE COVID REPORT");
        jButton1.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 240, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, 30));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, 30));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("REPORT ID");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 122, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("PATIENT NO");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 122, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("SYMPTOMS");
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 330, 122, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("RECOVERY DAYS");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 30));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 122, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 130, -1, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, -1, -1));

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField7.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 330, -1, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField8.setPreferredSize(new java.awt.Dimension(150, 30));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        jButton3.setText("UPDATE TREATMENT");
        jButton3.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 220, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton4.setText("SEARCH");
        jButton4.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        jButton5.setText("CLOSE");
        jButton5.setPreferredSize(new java.awt.Dimension(150, 30));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inside.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String report_id=jTextField1.getText();
        
        try
        {
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from covid where report_id='"+report_id+"'");
            if(rs.next())
            {
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
                jTextField1.setEditable(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Report ID does not exists");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String report_id=jTextField1.getText();
        String id=jTextField2.getText();
        String report=jTextField3.getText();
        String place=jTextField4.getText();
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("update covid set id='"+id+"',report='"+report+"',place='"+place+"' where report_id='"+report_id+"'");
             JOptionPane.showMessageDialog(null,"Successfully Updated");
            setVisible(false);
            new UpCovidDetails().setVisible(true);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"PLease enter data in correct format");
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String report_id=jTextField5.getText();
        
            try{
            Connection con1=ConnectionProvider.getCon();
                    Statement st1=con1.createStatement();
                    ResultSet rs1=st1.executeQuery("Select * from treatment where report_id='"+report_id+"'");
                    if(rs1.next())
                    {
                        jTextField6.setText(rs1.getString(1));
                        jTextField7.setText(rs1.getString(3));
                        jTextField8.setText(rs1.getString(4));
                    }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String patient_no=jTextField6.getText();
        String symptoms=jTextField7.getText();
        String recov_days=jTextField8.getText();
        String report_id=jTextField5.getText();
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            
            
            st.executeUpdate("update treatment set patient_no='"+patient_no+"',symptoms='"+symptoms+"',recov_days='"+recov_days+"' where report_id='"+report_id+"'");
            
            
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            setVisible(false);
            new UpCovidDetails().setVisible(true);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"PLease enter data in correct format");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(UpCovidDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpCovidDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpCovidDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpCovidDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpCovidDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}