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
public class Laporan_DataObat extends javax.swing.JInternalFrame {

    public final Connection Conn = new Koneksi().Connect();
    private DefaultTableModel tablemodel;
    
       public void tableObat(){
        Object baris[]={"ID Obat", "Nama Obat", "Stok Total", "Keterangan", "Tanggal Update"};
        tablemodel = new DefaultTableModel(null, baris);
        tabelBiaya.setModel(tablemodel);
        String sql = " select * from obat order by id_obat asc";
        try{
            java.sql.Statement put = Conn.createStatement();
            ResultSet hasil = put.executeQuery(sql);
            while (hasil.next()){
                String id_obat = hasil.getString("id_obat");
                String nama_obat = hasil.getString("nama_obat");
                String tgl_update = hasil.getString("tgl_update");
                String total = hasil.getString("stok_total");
                String ket = hasil.getString("keterangan");
                
                
                String hasilAll[] = {id_obat, nama_obat,total, ket, tgl_update};
                tablemodel.addRow(hasilAll);
            }
            
        } catch (Exception e){}
        
    }
    
    public Laporan_DataObat() {
        initComponents();
        tableObat();
        
        
    }
    
    protected void blank(){
//menghapus text field
        tgl_berobat.setDate(Date.from(Instant.now()));
        ket.setText("");
        stok_total.setText("");
        nama_obat.setText("");
        ket.setText("");
//        jenis_kelamin.setSelectedIndex(0);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id_obat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tgl_berobat = new com.toedter.calendar.JDateChooser();
        Hapus = new javax.swing.JButton();
        Simpan1 = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        cari = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ket = new javax.swing.JTextArea();
        nama_obat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Obat_Masuk = new javax.swing.JRadioButton();
        Obat_Keluar = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        stok_total = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelBiaya = new javax.swing.JTable();
        print = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        load = new javax.swing.JLabel();

        jLabel3.setText("DIALOG 1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel3)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(1541, 800));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Laporan Data Obat");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19))))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Id Obat");

        id_obat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal update");

        Hapus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
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
        Ubah.setText("Update Stok");
        Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahActionPerformed(evt);
            }
        });

        cari.setBackground(new java.awt.Color(0, 102, 102));
        cari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cari.setText("Cek ID");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Keterangan");

        ket.setColumns(20);
        ket.setRows(5);
        jScrollPane2.setViewportView(ket);

        nama_obat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nama Obat");

        jLabel7.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("masukan salah satu id untuk cekdata medis");

        Obat_Masuk.setText("Obat Masuk");
        Obat_Masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obat_MasukActionPerformed(evt);
            }
        });

        Obat_Keluar.setText("Obat Keluar");
        Obat_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Obat_KeluarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Stok Update");

        stok_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stok_totalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("* id harus di isi ketika menyimpan data !!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nama_obat, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tgl_berobat, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(id_obat, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cari))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Obat_Masuk)
                                        .addGap(29, 29, 29)
                                        .addComponent(Obat_Keluar))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Ubah)
                                .addGap(53, 53, 53)
                                .addComponent(Hapus)
                                .addGap(79, 79, 79)
                                .addComponent(Simpan1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stok_total, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 101, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari)
                    .addComponent(id_obat, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nama_obat, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tgl_berobat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Obat_Masuk)
                    .addComponent(Obat_Keluar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(stok_total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hapus)
                    .addComponent(Simpan1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        tabelBiaya.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelBiaya.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tabelBiaya.setRowHeight(25);
        tabelBiaya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBiayaMouseClicked(evt);
            }
        });
        tabelBiaya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelBiayaKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(tabelBiaya);

        print.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        print.setText("CETAK");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TABEL LAPORAN OBAT KLINIK PEKAPURAN");

        load.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reload.png"))); // NOI18N
        load.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        load.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(load)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(load)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
       try {
              String sql="Select * from obat where id_obat like '%" + id_obat.getText() + "%'";          
              java.sql.Statement put = Conn.createStatement();
              ResultSet rs = put.executeQuery(sql);
           
                if(rs.next()){
                                       String add1 = rs.getString("nama_obat");
                                       nama_obat.setText(add1);
                                       Date t = rs.getDate("tgl_update");
                                       tgl_berobat.setDate(t);
                                       String add2 =rs.getString("stok_total");
                                       stok_total.setText(add2);
                                       String add3 = rs.getString("keterangan");
                                       ket.setText(add3);

                               }
                ket.requestFocus();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cariActionPerformed

    private void Simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Simpan1ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String tgl = String.valueOf(format.format(tgl_berobat.getDate()));

        
        
        String sql = "insert into obat values (?,?,?,?,?)";
        try{
            PreparedStatement stat = Conn.prepareStatement(sql);
            stat.setString(1, id_obat.getText());
            stat.setString(2, nama_obat.getText());
            stat.setString(3, stok_total.getText());
            stat.setString(4, ket.getText());
            stat.setString(5, tgl);


            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data akan disimpan");
            blank();
            id_obat.requestFocus();
            tableObat();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal disimpan"+e);
            tableObat();
        }
    }//GEN-LAST:event_Simpan1ActionPerformed

    private void tabelBiayaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBiayaMouseClicked
    tableObat();
    }//GEN-LAST:event_tabelBiayaMouseClicked

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed

        SimpleDateFormat fm = new SimpleDateFormat("yyyy-MM-dd");   
        String tgl = String.valueOf(fm.format(tgl_berobat.getDate()));
        try{
            String sql = "update obat set "
                    +  "id_obat=?,"
                     + "nama_obat=?,"
                     + "stok_total=?,"
                     + "keterangan=?,"
                    + "tgl_update=? "
                    + "where id_obat='"+id_obat.getText()+"'";
            PreparedStatement stat = Conn.prepareStatement(sql);
            stat.setString(1, id_obat.getText());
            stat.setString(2, nama_obat.getText());
            stat.setString(3, stok_total.getText());
            stat.setString(4, ket.getText());
            stat.setString(5, tgl);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data akan diubah");
            blank();
            id_obat.requestFocus();
            }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal diubah"+e);
            }
            tableObat();
    }//GEN-LAST:event_UbahActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
                 int ok = JOptionPane.showConfirmDialog(null,"Hapus data ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
         if (ok==0){
             String sql = "delete from obat where id_obat ='"+id_obat.getText()+"'";
             try{
                PreparedStatement stat = Conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data akan di hapus dari sistem?");
                blank();
                id_obat.requestFocus();
             }
                catch (SQLException e){
                JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);
             }
         
         }
         tableObat();
    }//GEN-LAST:event_HapusActionPerformed

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
                    String report = "A:\\temporary_project\\NetBeansProjects\\Kel2\\src\\KlinikPekapuran\\report\\report2.jrxml";

                    
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
            Logger.getLogger(Laporan_DataObat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printActionPerformed

    private void Obat_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obat_KeluarActionPerformed
       String a = JOptionPane.showInputDialog(null, " Masukan Jumlah Obat masuk : ");
        
        int keluar = Integer.parseInt(a);
        int total = Integer.parseInt(stok_total.getText());
        
        String hasil = String.valueOf(total-keluar);
        stok_total.setText(hasil);        
    }//GEN-LAST:event_Obat_KeluarActionPerformed

    private void stok_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stok_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stok_totalActionPerformed

    private void Obat_MasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Obat_MasukActionPerformed
     
        String a = JOptionPane.showInputDialog(null, " Masukan Jumlah Obat masuk : ");
        
        int masuk = Integer.parseInt(a);
        int total = Integer.parseInt(stok_total.getText());
        
        String hasil = String.valueOf(masuk+total);
        stok_total.setText(hasil);
    }//GEN-LAST:event_Obat_MasukActionPerformed

    private void tabelBiayaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelBiayaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelBiayaKeyPressed

    private void loadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadMouseClicked
        tableObat();
    }//GEN-LAST:event_loadMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JRadioButton Obat_Keluar;
    private javax.swing.JRadioButton Obat_Masuk;
    private javax.swing.JButton Simpan1;
    private javax.swing.JButton Ubah;
    private javax.swing.JButton cari;
    private javax.swing.JTextField id_obat;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea ket;
    private javax.swing.JLabel load;
    private javax.swing.JTextField nama_obat;
    private javax.swing.JButton print;
    private javax.swing.JTextField stok_total;
    private javax.swing.JTable tabelBiaya;
    private com.toedter.calendar.JDateChooser tgl_berobat;
    // End of variables declaration//GEN-END:variables
}
