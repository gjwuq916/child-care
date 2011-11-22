/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmQuanLyBaoMau.java
 *
 * Created on Nov 22, 2011, 4:14:21 PM
 */
package GUI;

import DAO.Connect;
import DatabaseAccess.quanLyBaoMau;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class FrmQuanLyBaoMau extends javax.swing.JFrame {

    DefaultTableModel model;
    Connection conn;
    Statement st;
    PreparedStatement pstmt;
    ResultSet rs;
    quanLyBaoMau nhap = new quanLyBaoMau();
    Connect connect = new Connect();
    public static String NannyIDD, NannyIDE;

    /** Creates new form FrmQuanLyBaoMau */
    public FrmQuanLyBaoMau() {
        initComponents();
        model = (DefaultTableModel) jTableQLBM.getModel();
        nhap.Load(jTableQLBM);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBannerBM = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableQLBM = new javax.swing.JTable();
        cboSelect = new javax.swing.JComboBox();
        txtSearch = new javax.swing.JTextField();
        btnDetail = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnAddClass = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quan ly bao mau");

        lblBannerBM.setFont(new java.awt.Font("Tahoma", 0, 24));
        lblBannerBM.setText("Quản lý bảo mẫu");

        jTableQLBM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NannyID", "Name", "DateOfBirth", "Address", "Contact Number", "Charge Paid To Her", "Working Hours"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableQLBM);

        cboSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Name" }));

        btnDetail.setText("Chi tiet");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        btnAdd.setText("Them");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Sua");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Xoa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Tim");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAddClass.setText("Them Lop");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(lblBannerBM, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(btnDetail)
                                .addGap(56, 56, 56)
                                .addComponent(btnAdd)
                                .addGap(65, 65, 65)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(cboSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddClass))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBannerBM, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetail)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnSearch)
                    .addComponent(btnAddClass))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-781)/2, (screenSize.height-487)/2, 781, 487);
    }// </editor-fold>//GEN-END:initComponents

private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
// TODO add your handling code here:
    int n = jTableQLBM.getSelectedRow();

    if (n == -1) {
        JOptionPane.showMessageDialog(null, "Chon bao mau can xem!");
        return;
    }
    NannyIDD = jTableQLBM.getValueAt(n, 0).toString();

    FrmDetailNanny frmdetailnanny = new FrmDetailNanny();
    frmdetailnanny.setVisible(true);
}//GEN-LAST:event_btnDetailActionPerformed

private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
// TODO add your handling code here:
    //Xóa dữ liệu trong data Vector object
    model.getDataVector().removeAllElements();
    //Cập nhật lại jTable để hiển thị trên màn hình
    jTableQLBM.repaint();
    if (txtSearch.getText().length() == 0) {
        JOptionPane.showMessageDialog(null, "Dien vao tu khoa can tim!");
        return;
    }
    if (txtSearch.getText().equals("all")) {
        nhap.Load(jTableQLBM);
    }
    if (cboSelect.getSelectedItem().toString().equals("ID")) {

        try {
            conn = connect.getConnection();
            String strSQL = "select NannyID,Name,DateOfBirth,Address,ContactNumber,ChargerPaidToHer,WorkingHours from tblNanny where NannyID=?";
            Vector v = new Vector();


            pstmt = conn.prepareStatement(strSQL);
            pstmt.setString(1, txtSearch.getText());
            rs = pstmt.executeQuery();
            try {

                while (rs.next()) {
                    v = new Vector();
                    v.addElement(rs.getString(1));
                    v.addElement(rs.getString(2));
                    v.addElement(rs.getDate(3));
                    v.addElement(rs.getString(4));
                    v.addElement(rs.getString(5));
                    v.addElement(rs.getFloat(6));
                    v.addElement(rs.getInt(7));
                    model.addRow(v);
                }
                //set lai model cho jtable
                jTableQLBM.setModel(model);
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
            return;
        }
    }
    if (cboSelect.getSelectedItem().toString().equals("Name")) {
        try {
            conn = connect.getConnection();
            String strSQL = "SELECT NannyID,Name,DateOfBirth,Address,ContactNumber,ChargerPaidToHer,WorkingHours from tblNanny where Name like ?";
            Vector v = new Vector();


            pstmt = conn.prepareStatement(strSQL);
            pstmt.setString(1, "%" + txtSearch.getText() + "%");
            rs = pstmt.executeQuery();
            try {

                while (rs.next()) {
                    v = new Vector();
                    v.addElement(rs.getString(1));
                    v.addElement(rs.getString(2));
                    v.addElement(rs.getDate(3));
                    v.addElement(rs.getString(4));
                    v.addElement(rs.getString(5));
                    v.addElement(rs.getFloat(6));
                    v.addElement(rs.getInt(7));
                    model.addRow(v);
                }
                //set lai model cho jtable
                jTableQLBM.setModel(model);
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
            return;
        }
    }
}//GEN-LAST:event_btnSearchActionPerformed

private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
// TODO add your handling code here:
    int m = jTableQLBM.getSelectedRow();
    if (m == -1) {
        JOptionPane.showMessageDialog(this, "Chon du lieu can sua!");
        return;
    }
    NannyIDE = jTableQLBM.getValueAt(m, 0).toString();
    FrmEditNanny frmeditnany = new FrmEditNanny();
    frmeditnany.setVisible(true);
}//GEN-LAST:event_btnEditActionPerformed

private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
// TODO add your handling code here:
    FrmAddNanny frmaddnanny = new FrmAddNanny();
    frmaddnanny.setVisible(true);
}//GEN-LAST:event_btnAddActionPerformed

private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
// TODO add your handling code here:
    int n = jTableQLBM.getSelectedRow();
    if (n == -1) {
        JOptionPane.showMessageDialog(null, "Chọn dòng cần xóa");
        return;
    }
//         model.getDataVector().removeAllElements();
//    //Cập nhật lại jTable để hiển thị trên màn hình
//    jTableQLT.repaint();
    try {
        if (JOptionPane.showConfirmDialog(null, "Ban co chac chan xoa?" + "\n"
                + "Ho ten: " + jTableQLBM.getValueAt(n, 1) + "\n" + "NannyID: "
                + jTableQLBM.getValueAt(n, 0), "Xóa", JOptionPane.YES_NO_OPTION) == 0) {
            conn = connect.getConnection();
            String strSQL = "Delete  from tblChild where ChildID=?";
            Vector v = new Vector();


            pstmt = conn.prepareStatement(strSQL);
            pstmt.setString(1, jTableQLBM.getValueAt(n, 0).toString());
            pstmt.executeUpdate();
            model.removeRow(jTableQLBM.getSelectedRow());
            conn.close();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(FrmQuanLyBaoMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmQuanLyBaoMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmQuanLyBaoMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmQuanLyBaoMau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmQuanLyBaoMau().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddClass;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cboSelect;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableQLBM;
    private javax.swing.JLabel lblBannerBM;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
