/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmSelectClassforNanny.java
 *
 * Created on Nov 24, 2011, 12:53:37 AM
 */
package GUI;

import DAO.Connect;
import DatabaseAccess.Class;
import DatabaseAccess.quanLyBaoMau;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class FrmSelectClassforNanny extends javax.swing.JFrame {
    public String ClassID;
    public static String ClassID1;
    DefaultTableModel model;
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;
    Connect connect = new Connect();
    public static String idclass;
    quanLyBaoMau nhap = new quanLyBaoMau();

    /** Creates new form FrmSelectClassforNanny */
    public FrmSelectClassforNanny() {
        initComponents();
        nhap.btnLoadClass(tblClass);
        new Class().inittableClass(tblClass);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        ListActive = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        txtSearchClass = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClass = new javax.swing.JTable();
        btnView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Add Class For Nanny");

        ListActive.setBorder(javax.swing.BorderFactory.createTitledBorder("List Active of Class"));
        ListActive.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ListActive.setForeground(new java.awt.Color(0, 0, 204));
        ListActive.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(ListActive);

        jLabel1.setFont(new java.awt.Font("VNI-Present", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Add Class for Nanny");

        txtSearchClass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearchClass.setForeground(new java.awt.Color(0, 0, 204));

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 0, 204));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setPreferredSize(new java.awt.Dimension(65, 29));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 0, 204));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close2.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.setPreferredSize(new java.awt.Dimension(83, 31));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 204));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tblClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ClassID", "ClassName", "AgeGroupID"
            }
        ));
        jScrollPane1.setViewportView(tblClass);

        btnView.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(0, 0, 204));
        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Modify.png"))); // NOI18N
        btnView.setText("View Active");
        btnView.setPreferredSize(new java.awt.Dimension(87, 29));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSearchClass, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-590)/2, (screenSize.height-405)/2, 590, 405);
    }// </editor-fold>//GEN-END:initComponents

private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    model = (DefaultTableModel) tblClass.getModel();
    if (txtSearchClass.getText().length() == 0) {
        JOptionPane.showMessageDialog(this, "Enter a key to Search!");
        return;
    }
    if (txtSearchClass.getText().equals("all")) {
        nhap.btnLoadClass(tblClass);
    }
    try {
        conn = connect.getConnection();
        String strSQL = "select * from tblClass where AgeGroupID =?";
        pstmt = conn.prepareStatement(strSQL);
        pstmt.setString(1, txtSearchClass.getText());
        rs = pstmt.executeQuery();

        while (rs.next()) {
            Vector v = new Vector();

            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                v.addElement(rs.getString(i));
            }

            model.addRow(v);
        }

        tblClass.setModel(model);
        conn.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
        return;
    }

}//GEN-LAST:event_btnSearchActionPerformed

private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    this.dispose();
}//GEN-LAST:event_btnCloseActionPerformed

private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    int m = tblClass.getSelectedRow();
    if (m == -1) {
        JOptionPane.showMessageDialog(this, "Choose a Active to Add");
        return;
    }
    new Class().inittableClass(tblClass);
    Vector temp = (Vector) Class.vtData.get(m);
    ClassID1 = (String) temp.get(0);


    conn = connect.getConnection();
        int n = 0;
        try {
            String strSql = "insert tblDetailsClassNanny values(?,?)";
            pstmt = conn.prepareStatement(strSql);
            //ClassID = tblClass.getValueAt(tblClass.getSelectedRow(),0).toString();
            pstmt.setString(1, ClassID1);
            pstmt.setString(2, FrmQuanLyBaoMau1.NannyID);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Insert successfully!");
            this.dispose();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error:" + ex.getMessage());
            return;
        }
}//GEN-LAST:event_btnAddActionPerformed

private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
// TODO add your handling code here:
            int n= tblClass.getSelectedRow();
        if(n==-1)
        {
            JOptionPane.showMessageDialog(this,"Choose a Class to View");
            return;
        }
       ClassID=tblClass.getValueAt(tblClass.getSelectedRow(), 0).toString();
                ListActive.setModel(new DefaultListModel());
        InitListActive(ListActive);
}//GEN-LAST:event_btnViewActionPerformed
    public void InitListActive(JList jlist){
        try {
            String MySql = "SELECT ActiveID FROM tblDetailsActiveClass where ClassID=?";
            conn = connect.getConnection();
            pstmt = conn.prepareStatement(MySql);
           // pstmt.setString(1,tblClass.getValueAt(tblClass.getSelectedRow(), 0).toString());
                       pstmt.setString(1,ClassID);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                String id = rs.getString(1);
                ((DefaultListModel) ListActive.getModel()).addElement("  ID:" + id + "");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
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
            java.util.logging.Logger.getLogger(FrmSelectClassforNanny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSelectClassforNanny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSelectClassforNanny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSelectClassforNanny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmSelectClassforNanny().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListActive;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblClass;
    private javax.swing.JTextField txtSearchClass;
    // End of variables declaration//GEN-END:variables
}