/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
        table();
    }
    
    void cari(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Id");
        tbl.addColumn("Nama");
        tbl.addColumn("Wahana");
        tbl.addColumn("Tanggal");
        tbl.addColumn("Biaya");
        
        try {
            String sql = "SELECT * FROM tb_wisata WHERE id like '%" + tCari.getText() + "%'";
             Connection Con = (Connection) Koneksi.getConnection();
             Statement st = Con.createStatement();
                   ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("Id"),
                    rs.getString("Nama"),
                    rs.getString("Wahana"),
                    rs.getString("Tanggal"),
                    rs.getString("Biaya"),
                } );
                jTable.setModel(tbl);
            }
                   
        } catch (Exception e) {
        }
    }

    public void table(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Id");
        tbl.addColumn("Nama");
        tbl.addColumn("Wahana");
        tbl.addColumn("Tanggal");
        tbl.addColumn("Biaya");
        
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tb_wisata");
            
            while(rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString("Id"),
                    rs.getString("Nama"),
                    rs.getString("Wahana"),
                    rs.getString("Tanggal"),
                    rs.getString("Biaya"),
                } );
                jTable.setModel(tbl);
            }
            JOptionPane.showMessageDialog(null, "Koneksi Database Berhasil");            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());            
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tId = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        rHantu = new javax.swing.JRadioButton();
        rMemanah = new javax.swing.JRadioButton();
        rParalayang = new javax.swing.JRadioButton();
        tTanggal = new javax.swing.JTextField();
        tBiaya = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tCari = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Transaksi Tiket Masuk");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 6, -1, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setText("Wahana");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel5.setText("Tanggal");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel6.setText("Biaya");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));
        getContentPane().add(tId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 270, -1));
        getContentPane().add(tNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 270, 30));

        rHantu.setText("Rumah Hantu");
        getContentPane().add(rHantu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        rMemanah.setText("Memanah");
        getContentPane().add(rMemanah, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        rParalayang.setText("Paralayang");
        getContentPane().add(rParalayang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        tTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTanggalActionPerformed(evt);
            }
        });
        getContentPane().add(tTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 270, 20));
        getContentPane().add(tBiaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 270, -1));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 466, 99));

        jButton1.setText("Simpan");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jButton2.setText("Tampilkan Data");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, -1, -1));

        jButton3.setText("Edit");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 63, -1));

        jButton4.setText("Hapus");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        tCari.setText("Cari");
        tCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tCariMouseClicked(evt);
            }
        });
        tCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCariActionPerformed(evt);
            }
        });
        getContentPane().add(tCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 92, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Borneo Land");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jButton6.setText("Keluar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String jk =null;
        if(rHantu.isSelected()){
            jk = "Rumah Hantu";
        } else if(rMemanah.isSelected()){
            jk = "Memanah";
        } else if(rParalayang.isSelected()){
            jk = "Paralayang";
        }
        try {
            String sql = "INSERT INTO tb_wisata VALUE ('" + tId.getText() +"','"
                    + tNama.getText() + "','" + jk  + "','" + tTanggal.getText() 
                    + "','" + tBiaya.getText() + "')";
            
                    Connection Con = (Connection) Koneksi.getConnection();
                    PreparedStatement pst = Con.prepareStatement(sql);
                    pst.execute();
                    
                    JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan" + e.getMessage());
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        try {
             String sql = "SELECT * FROM tb_wisata WHERE Id = '" +tId.getText()+"'";
             Connection Con = (Connection) Koneksi.getConnection();
                    PreparedStatement pst = Con.prepareStatement(sql);
                    pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            table();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String jk =null;
        if(rHantu.isSelected()){
            jk = "Rumah Hantu";
        } else if(rMemanah.isSelected()){
            jk = "Memanah";
        } else if(rParalayang.isSelected()){
            jk = "Paralayang";
        }  
        try {
            String sql = "UPDATE tb_wisata SET id='" + tId.getText()+ "',nama='"+ tNama.getText()
                    + "',wahana='"+ jk + "', tanggal ='" + tTanggal.getText() + 
                    "',biaya='"+ tBiaya.getText() +"' WHERE id='" + tId.getText()
                    + "'";
             Connection Con = (Connection) Koneksi.getConnection();
                    PreparedStatement pst = Con.prepareStatement(sql);
                    pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Edit");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        
        int baris =jTable.rowAtPoint(evt.getPoint());
        String id = jTable.getValueAt(baris, 0).toString();
        tId.setText(id);
        String nama = jTable.getValueAt(baris, 1).toString();
        tNama.setText(nama);
        String tanggal = jTable.getValueAt(baris, 3).toString();
        tTanggal.setText(tanggal);
        String biaya = jTable.getValueAt(baris, 4).toString();
        tBiaya.setText(biaya);
    }//GEN-LAST:event_jTableMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        try {
            String sql ="DELETE FROM tb_wisata where id ='" + tId.getText() + "'";
            Connection Con = (Connection) Koneksi.getConnection();
                    PreparedStatement pst = Con.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Berhasil Hapus");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void tCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tCariMouseClicked
        // TODO add your handling code here:
        cari();
        
    }//GEN-LAST:event_tCariMouseClicked

    private void tCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCariActionPerformed
        // TODO add your handling code here:
          cari();
    }//GEN-LAST:event_tCariActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTanggalActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JRadioButton rHantu;
    private javax.swing.JRadioButton rMemanah;
    private javax.swing.JRadioButton rParalayang;
    private javax.swing.JTextField tBiaya;
    private javax.swing.JButton tCari;
    private javax.swing.JTextField tId;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tTanggal;
    // End of variables declaration//GEN-END:variables
}