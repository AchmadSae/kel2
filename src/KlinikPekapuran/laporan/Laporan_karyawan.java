/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KlinikPekapuran.laporan;

import KlinikPekapuran.Koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Nur
 */
public class Laporan_karyawan extends javax.swing.JInternalFrame {

    public final Connection Conn = new Koneksi().Connect();
    private DefaultTableModel tablemodel;
    
       public void tableBiaya(){
        Object baris[]={"ID Karyawan", "Nama Karyawan ", " Jabatan ", "Alamat", "Tanggal Masuk ", "Keterangan"};
        tablemodel = new DefaultTableModel(null, baris);
        tabel_karyawan.setModel(tablemodel);
        String sql = " select * from karyawan order by id_karyawan asc";
        try{
            java.sql.Statement put = Conn.createStatement();
            ResultSet hasil = put.executeQuery(sql);
            while (hasil.next()){
                String id_karyawan = hasil.getString("id_karyawan");
                String nama_kryawan = hasil.getString("nama_karyawan");
                String jabatan = hasil.getString("jabatan");
                String alamat = hasil.getString("alamat");
                String tgl_masuk = hasil.getString("tgl_masuk");
                String keterangan = hasil.getString("keterangan");
                String hasilAll[] = {id_karyawan, nama_kryawan, jabatan, alamat, tgl_masuk, keterangan};
                tablemodel.addRow(hasilAll);
            }
            
        } catch (Exception e){
           
        }
        
    }
    
    public Laporan_karyawan() {
        initComponents();
        tableBiaya();
        
        
    }
    
    protected void blank(){
        id_karyawan.setText("");
        tgl_masuk.setDate(Date.from(Instant.now()));
        alamat.setText("");
        jabatan.setText("");
        id_karyawan.setText("");
        nama_karyawan.setText("");
        keterangan.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id_karyawan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Hapus1 = new javax.swing.JButton();
        Simpan1 = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jabatan = new javax.swing.JTextField();
        nama_karyawan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tgl_masuk = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        keterangan = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_karyawan = new javax.swing.JTable();
        print = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1541, 800));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Laporan Data Pasien Poli Umum");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID Karyawan");

        id_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Jabatan");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal Masuk");

        Hapus1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Hapus1.setText("Hapus");
        Hapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hapus1ActionPerformed(evt);
            }
        });

        Simpan1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Simpan1.setText("Simpan");
        Simpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Simpan1ActionPerformed(evt);
            }
        });

        Ubah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ubah.setText("Ubah");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Alamat");

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane2.setViewportView(alamat);

        jabatan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        nama_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nama Karyawan");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Keterangan");

        keterangan.setColumns(20);
        keterangan.setRows(5);
        jScrollPane1.setViewportView(keterangan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel11)
                                .addComponent(jLabel5)
                                .addComponent(jLabel15))
                            .addGap(50, 50, 50)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tgl_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jabatan)
                                    .addComponent(nama_karyawan)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(Ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Hapus1)
                                        .addGap(51, 51, 51)
                                        .addComponent(Simpan1))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(nama_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tgl_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hapus1)
                            .addComponent(Simpan1))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        tabel_karyawan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabel_karyawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tabel_karyawan.setRowHeight(25);
        tabel_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_karyawanMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabel_karyawan);

        print.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        print.setText("CETAK");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TABEL DATA KARYAWAN KLINIK PEKAPURAN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Simpan1ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String tgl = String.valueOf(format.format(tgl_masuk.getDate())); 
        String sql = "insert into karyawan values (?,?,?,?,?,?)";
        try{
            PreparedStatement stat = Conn.prepareStatement(sql);
            stat.setString(1, id_karyawan.getText());
            stat.setString(2, nama_karyawan.getText());
            stat.setString(3, jabatan.getText());
            stat.setString(4, alamat.getText());
            stat.setString(5, tgl);
            stat.setString(6, keterangan.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data akan disimpan");
            blank();
            id_karyawan.requestFocus();
            tableBiaya();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal disimpan"+e);
            tableBiaya();
        }
    }//GEN-LAST:event_Simpan1ActionPerformed

    private void tabel_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_karyawanMouseClicked
                // TODO add your handling code here:
      SimpleDateFormat tglview = new SimpleDateFormat("yyyy-MM-dd");   
        
     //if (evt.getClickCount()==1) { 
        Date dateView = null;
        int baris = tabel_karyawan.getSelectedRow();
        try {
                dateView = tglview.parse((String) tabel_karyawan.getValueAt(baris, 4));
            } catch (ParseException ex) {
                Logger.getLogger(Laporan_karyawan.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        id_karyawan.setText(tabel_karyawan.getModel().getValueAt(baris, 0).toString());
        nama_karyawan.setText(tabel_karyawan.getModel().getValueAt(baris, 1).toString()); 
        
        jabatan.setText(tabel_karyawan.getModel().getValueAt(baris, 2).toString());
        alamat.setText(tabel_karyawan.getModel().getValueAt(baris, 3).toString());
        tgl_masuk.setDate(dateView);
        keterangan.setText(tabel_karyawan.getModel().getValueAt(baris, 5).toString());
    }//GEN-LAST:event_tabel_karyawanMouseClicked

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed

        SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");   
        String tgl = String.valueOf(fm.format(tgl_masuk.getDate()));
        try{
            String sql = "update karyawan set "
                    + "id_karyawan=?,"
                    + "nama_karyawan=?,"
                    + "jabatan=?,"
                    + "alamat=?, "
                    + "tgl_masuk=?, "
                    + "keterangan=? "
                    + "where id_karyawan='"+id_karyawan.getText()+"'";
            PreparedStatement stat = Conn.prepareStatement(sql);
            stat.setString(1, id_karyawan.getText());
            stat.setString(2, nama_karyawan.getText());
            stat.setString(3, jabatan.getText());
            stat.setString(4, alamat.getText());
            stat.setString(5, tgl);
            stat.setString(6, keterangan.getText());
    
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data akan diubah");
            blank();
            id_karyawan.requestFocus();
            }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal diubah"+e);
            }
            tableBiaya();
    }//GEN-LAST:event_UbahActionPerformed

    private void Hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hapus1ActionPerformed
                 int ok = JOptionPane.showConfirmDialog(null,"Hapus data ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
                if (ok==0){
                    String sql = "delete from karyawan where id_karyawan ='"+id_karyawan.getText()+"'";
                    try{
                       PreparedStatement stat = Conn.prepareStatement(sql);
                       stat.executeUpdate();
                       JOptionPane.showMessageDialog(null, "Data akan di hapus dari sistem?");
                       blank();
                       id_karyawan.requestFocus();
                    }
                       catch (SQLException e){
                       JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);
                    }
         
                }
    }//GEN-LAST:event_Hapus1ActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
             java.sql.Connection Conn = null;
             try{
                String jdbcDriver = "com.mysql.jdbc.Driver";
                Class.forName(jdbcDriver);
                
                String url = "jdbc:mysql://localhost:3306/dbklinik_pekapuran";
                String user = "root";
                String pas = "";
                
                Conn = DriverManager.getConnection(url, user, pas);
                Statement stat = Conn.createStatement();
                
                try{
                    String report = "A:\\temporary_project\\NetBeansProjects\\Kel2\\src\\KlinikPekapuran\\report\\report4.jrxml";
                   
                    JasperReport jr = JasperCompileManager.compileReport(report);
                    JasperPrint jp = JasperFillManager.fillReport(jr, null, Conn);
                    JasperViewer.viewReport(jp);
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Tidak Bisa Review Print" + e);
                }
             }
                catch (SQLException e){
                JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);
             } catch (ClassNotFoundException ex) {
            Logger.getLogger(Laporan_karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus1;
    private javax.swing.JButton Simpan1;
    private javax.swing.JButton Ubah;
    private javax.swing.JTextArea alamat;
    private javax.swing.JTextField id_karyawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jabatan;
    private javax.swing.JTextArea keterangan;
    private javax.swing.JTextField nama_karyawan;
    private javax.swing.JButton print;
    private javax.swing.JTable tabel_karyawan;
    private com.toedter.calendar.JDateChooser tgl_masuk;
    // End of variables declaration//GEN-END:variables
}
