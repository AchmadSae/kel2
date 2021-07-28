/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KlinikPekapuran;

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
public class Laporan_bidan extends javax.swing.JInternalFrame {

    public final Connection Conn = new Koneksi().Connect();
    private DefaultTableModel tablemodel;
    
       public void tableBiaya(){
        Object baris[]={"ID Bidan", " Tanggal Berobat ", " Keluhan ", "Nama Dokter", "Diagnosa ", "Resep Obat", "ID Pasien", "Jenis Berobat"};
        tablemodel = new DefaultTableModel(null, baris);
        tabel_poliumum.setModel(tablemodel);
        String sql = " select * from rm_bidan order by id_bidan asc";
        try{
            java.sql.Statement put = Conn.createStatement();
            ResultSet hasil = put.executeQuery(sql);
            while (hasil.next()){
                String id_poligigi = hasil.getString("id_bidan");
                String tgl_berobat = hasil.getString("tgl_berobat");
                String keluhan = hasil.getString("keluhan");
                String nama_dokter = hasil.getString("nama_dokter");
                String diagnosa = hasil.getString("diagnosa");
                String resep_obat = hasil.getString("resep_obat");
                String id_pasien = hasil.getString ("id_pasien");
                String jenis_berobat = hasil.getString ("jenis_berobat");
                String hasilAll[] = {id_poligigi, tgl_berobat, keluhan, nama_dokter, diagnosa, resep_obat, id_pasien, jenis_berobat};
                tablemodel.addRow(hasilAll);
            }
            
        } catch (Exception e){
           
        }
        
    }
    
    public Laporan_bidan() {
        initComponents();
        tableBiaya();
        
        
    }
    
    protected void blank(){
        id_bidan.setText("");
        tgl_berobat.setDate(Date.from(Instant.now()));
        diagnosa.setText("");
        nama_dokter.setText("");
        id_pasien.setText("");
        keluhan.setText("");
        jenis_berobat.setText("");
        resep_obat.setText ("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id_bidan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Hapus1 = new javax.swing.JButton();
        Simpan1 = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        nama_dokter = new javax.swing.JTextField();
        keluhan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tgl_berobat = new com.toedter.calendar.JDateChooser();
        diagnosa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        id_pasien = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        resep_obat = new javax.swing.JTextArea();
        jenis_berobat = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_poliumum = new javax.swing.JTable();
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
        jLabel2.setText("Id Bidan");

        id_bidan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nama Dokter");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal Berobat");

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
        jLabel11.setText("Diagnosa");

        nama_dokter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        keluhan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        keluhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluhanActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Keluhan");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Jenis Berobat");

        diagnosa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Resep Obat");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Id Pasien");

        id_pasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        resep_obat.setColumns(20);
        resep_obat.setRows(5);
        jScrollPane4.setViewportView(resep_obat);

        jenis_berobat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(id_bidan, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12)
                                .addComponent(jLabel13)
                                .addComponent(jLabel5))
                            .addGap(50, 50, 50)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tgl_berobat, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nama_dokter, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                    .addComponent(keluhan)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(Hapus1)
                                        .addGap(51, 51, 51)
                                        .addComponent(Simpan1))
                                    .addComponent(diagnosa, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                    .addComponent(id_pasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jenis_berobat, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))))
                    .addComponent(jLabel15))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id_bidan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(keluhan, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(diagnosa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tgl_berobat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jenis_berobat, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Hapus1)
                        .addComponent(Ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Simpan1))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        tabel_poliumum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabel_poliumum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "", "Title 8"
            }
        ));
        tabel_poliumum.setRowHeight(25);
        tabel_poliumum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_poliumumMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabel_poliumum);

        print.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        print.setText("CETAK");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TABEL DATA PELAYANAN  BIDAN  KLINIK PEKAPURAN");

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
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
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
        String tgl = String.valueOf(format.format(tgl_berobat.getDate())); 
        String sql = "insert into rm_bidan values (?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement stat = Conn.prepareStatement(sql);
            stat.setString(1, id_bidan.getText());
            stat.setString(2, tgl);
            stat.setString(3, keluhan.getText());
            stat.setString(4, nama_dokter.getText());
            stat.setString(5, diagnosa.getText());
            stat.setString(6, resep_obat.getText());
            stat.setString(7, id_pasien.getText());
            stat.setString(8, jenis_berobat.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data akan disimpan");
            blank();
            id_bidan.requestFocus();
            tableBiaya();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal disimpan"+e);
            tableBiaya();
        }
    }//GEN-LAST:event_Simpan1ActionPerformed

    private void tabel_poliumumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_poliumumMouseClicked
                // TODO add your handling code here:
      SimpleDateFormat tglview = new SimpleDateFormat("yyyy-MM-dd");   
        
     //if (evt.getClickCount()==1) { 
        Date dateView = null;
        int baris = tabel_poliumum.getSelectedRow();
        try {
                dateView = tglview.parse((String) tabel_poliumum.getValueAt(baris, 1));
            } catch (ParseException ex) {
                Logger.getLogger(Laporan_bidan.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        id_bidan.setText(tabel_poliumum.getModel().getValueAt(baris, 0).toString());
         tgl_berobat.setDate(dateView);
        keluhan.setText(tabel_poliumum.getModel().getValueAt(baris, 2).toString());
        nama_dokter.setText(tabel_poliumum.getModel().getValueAt(baris, 3).toString());
        diagnosa.setText(tabel_poliumum.getModel().getValueAt(baris, 4).toString());
        resep_obat.setText(tabel_poliumum.getModel().getValueAt(baris, 5).toString());
        id_pasien.setText(tabel_poliumum.getModel().getValueAt(baris, 6).toString());
        jenis_berobat.setText(tabel_poliumum.getModel().getValueAt(baris, 7).toString());
    }//GEN-LAST:event_tabel_poliumumMouseClicked

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed

        SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");   
        String tgl = String.valueOf(fm.format(tgl_berobat.getDate()));
        try{
            String sql = "update rm_bidan set "
                    + "id_bidan=?,"
                    + "tgl_berobat=?,"
                    + "keluhan=?,"
                    + "nama_dokter=?, "
                    + "diagnosa=?, "
                    + "resep_obat=?, "
                    + "id_pasien=?,"
                    + "jenis_berobat=?"
                    + "where id_bidan='"+id_bidan.getText()+"'";
            PreparedStatement stat = Conn.prepareStatement(sql);
            stat.setString(1, id_bidan.getText());
            stat.setString(2, tgl);
            stat.setString(3, keluhan.getText());
            stat.setString(4, nama_dokter.getText());
            stat.setString(5, diagnosa.getText());
            stat.setString(6, resep_obat.getText());
            stat.setString(7, id_pasien.getText());
            stat.setString(8, jenis_berobat.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data akan diubah");
            blank();
            id_bidan.requestFocus();
            }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal diubah"+e);
            }
            tableBiaya();
    }//GEN-LAST:event_UbahActionPerformed

    private void Hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hapus1ActionPerformed
                 int ok = JOptionPane.showConfirmDialog(null,"Hapus data ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
                if (ok==0){
                    String sql = "delete from rm_bidan where id_bidan ='"+id_bidan.getText()+"'";
                    try{
                       PreparedStatement stat = Conn.prepareStatement(sql);
                       stat.executeUpdate();
                       JOptionPane.showMessageDialog(null, "Data akan di hapus dari sistem?");
                       blank();
                       id_bidan.requestFocus();
                    }
                       catch (SQLException e){
                       JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);
                    }
         
                }
             blank();
            id_bidan.requestFocus();
            tableBiaya();
            
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
                    String report = "A:\\temporary_project\\NetBeansProjects\\Kel2\\src\\KlinikPekapuran\\report\\report3.jrxml";
                   
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
            Logger.getLogger(Laporan_bidan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printActionPerformed

    private void keluhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keluhanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus1;
    private javax.swing.JButton Simpan1;
    private javax.swing.JButton Ubah;
    private javax.swing.JTextField diagnosa;
    private javax.swing.JTextField id_bidan;
    private javax.swing.JTextField id_pasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jenis_berobat;
    private javax.swing.JTextField keluhan;
    private javax.swing.JTextField nama_dokter;
    private javax.swing.JButton print;
    private javax.swing.JTextArea resep_obat;
    private javax.swing.JTable tabel_poliumum;
    private com.toedter.calendar.JDateChooser tgl_berobat;
    // End of variables declaration//GEN-END:variables
}
