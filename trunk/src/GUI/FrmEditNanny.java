/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmEditNanny.java
 *
 * Created on Nov 22, 2011, 5:18:59 PM
 */
package GUI;

import DAO.Connect;
import DatabaseAccess.quanLyBaoMau;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class FrmEditNanny extends javax.swing.JFrame {

    Connect connect = new Connect();
    Connection conn;
    ResultSet rs;
    PreparedStatement pstmt;
    quanLyBaoMau nhap = new quanLyBaoMau();

    /** Creates new form FrmEditNanny */
    public FrmEditNanny() {
        initComponents();
        fillDataEditNanny();
    }

    private void fillDataEditNanny() {
        try {

            conn = connect.getConnection();
            String strSql = "select NannyID,Name,DateOfBirth,Address,ContactNumber,ChargePaidToHer,WorkingHours from tblNanny where NannyID=?";
            pstmt = conn.prepareStatement(strSql);
            pstmt.setString(1, FrmQuanLyBaoMau.NannyIDE);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                txtNannyID.setText(rs.getString(1));
                txtName.setText(rs.getString(2));
                txtBirthday.setDate(rs.getDate(3));
                txtAddress.setText(rs.getString(4));
                txtContactNumber.setText(rs.getString(5));
                txtWorkingHours.setText(rs.getString(6));
                txtCharge.setText(rs.getString(7));


            }
            conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEditNanny = new javax.swing.JLabel();
        PanelAddNanny = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNannyID = new javax.swing.JTextField();
        lblNannyID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblBirthday = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtBirthday = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        txtCharge = new javax.swing.JTextField();
        txtContactNumber = new javax.swing.JTextField();
        txtWorkingHours = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEditNanny.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblEditNanny.setForeground(new java.awt.Color(255, 0, 0));
        lblEditNanny.setText("Sửa thông tin bảo mẫu");

        PanelAddNanny.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblNannyID.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblNannyID.setText("Nanny ID:");

        lblName.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblName.setText("Name:");

        lblBirthday.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblBirthday.setText("Birthday:");

        lblAddress.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblAddress.setText("Address:");

        txtBirthday.setDateFormatString("MMMM/dd/yyyy");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel10.setText("WorkingHours:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel9.setText("Charge:");

        lblContactNumber.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblContactNumber.setText("Contact Number:");

        txtCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChargeActionPerformed(evt);
            }
        });

        txtWorkingHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWorkingHoursActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblNannyID)
                    .addComponent(lblBirthday)
                    .addComponent(lblAddress))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAddress)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName)
                    .addComponent(txtNannyID, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lblContactNumber)
                    .addComponent(jLabel9))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtWorkingHours, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addGap(18, 18, 18))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addContainerGap()))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNannyID)
                            .addComponent(txtNannyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContactNumber)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBirthday)
                            .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWorkingHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelAddNannyLayout = new javax.swing.GroupLayout(PanelAddNanny);
        PanelAddNanny.setLayout(PanelAddNannyLayout);
        PanelAddNannyLayout.setHorizontalGroup(
            PanelAddNannyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddNannyLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelAddNannyLayout.setVerticalGroup(
            PanelAddNannyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAddNannyLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/save1.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setPreferredSize(new java.awt.Dimension(87, 31));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close2.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.setPreferredSize(new java.awt.Dimension(87, 31));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelAddNanny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(74, 74, 74)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(lblEditNanny)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEditNanny, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(PanelAddNanny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void txtChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChargeActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_txtChargeActionPerformed

private void txtWorkingHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWorkingHoursActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_txtWorkingHoursActionPerformed

private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    if (txtNannyID.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please,Enter NannyID");
        txtNannyID.requestFocus();
        return;
    }
    if (txtName.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please,Enter Name");
        txtName.requestFocus();
        return;
    }
    if (txtAddress.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please,Enter Address");
        txtAddress.requestFocus();
        return;
    }
    if (txtContactNumber.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please,Enter PhoneNumber");
        txtContactNumber.requestFocus();
        return;
    }
    try {
        int age = Integer.parseInt(txtContactNumber.getText());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Contact NumBer must Number");
        return;
    }
    if (txtCharge.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please,Enter Charge");
        txtCharge.requestFocus();
        return;
    }
    if (txtWorkingHours.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "Please,Enter WorkingHours");
        txtWorkingHours.requestFocus();
        return;
    }
    Date d = new Date();
    if (txtBirthday.getDate() != null) {
        if (txtBirthday.getCalendar().getTime().after(d)) {
            JOptionPane.showMessageDialog(this, "Birthday Date < today");
            txtBirthday.setDate(null);
            txtBirthday.requestFocus();
            return;
        }
    }
    try {
        String strsql = "insert tblNanny values (?,?,?,?,?,?,?)";
        pstmt = conn.prepareStatement(strsql);
        pstmt.setString(1, txtNannyID.getText());
        pstmt.setString(2, txtName.getText());
        if (txtBirthday.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please,Enter Birthday");
        } else {
            pstmt.setString(3, txtBirthday.getCalendar().getTime().toLocaleString());
        }
        pstmt.setString(4, txtAddress.getText());
        pstmt.setString(5, txtContactNumber.getText());
        pstmt.setFloat(6, Float.parseFloat(txtCharge.getText()));
        pstmt.setInt(7, Integer.parseInt(txtWorkingHours.getText()));
        pstmt.executeUpdate();
        JOptionPane.showMessageDialog(this, "Insert successfully!");
        this.dispose();

        conn.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
        return;
    }
}//GEN-LAST:event_btnSaveActionPerformed

private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
// TODO add your handling code here:
    txtNannyID.setText("");
    txtName.setText("");
    txtBirthday.setDate(null);
    txtContactNumber.setText("");
    txtCharge.setText("");
    txtWorkingHours.setText("");
    txtAddress.setText("");
}//GEN-LAST:event_btnResetActionPerformed

private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    this.dispose();
}//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEditNanny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEditNanny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEditNanny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEditNanny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmEditNanny().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAddNanny;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblEditNanny;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNannyID;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtBirthday;
    private javax.swing.JTextField txtCharge;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNannyID;
    private javax.swing.JTextField txtWorkingHours;
    // End of variables declaration//GEN-END:variables
}