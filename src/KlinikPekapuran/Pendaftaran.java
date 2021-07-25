/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KlinikPekapuran;

import java.sql.*;
import java.text.*;
import java.time.Instant;
import java.util.Date;
import java.util.logging.*;
import javax.swing.table.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Nur
 */
public class Pendaftaran extends javax.swing.JInternalFrame {
    public final Connection Conn = new Koneksi().Connect();
    private DefaultTableModel tablemode;
    
    
    
    
    public void tablePasien(){
        Object baris[]={"ID Pasien", "Nama Pasien", "Jenis Kelamin", "Tanggal Lahir", "Tempat Lahir", "No. Telepon", "Alamat", "NO. KTP"};
        tablemode = new DefaultTableModel(null, baris);
        tabelPasien.setModel(tablemode);
        String sql = " select * from pasien order by id_pasien asc";
        try{
            java.sql.Statement put = Conn.createStatement();
            ResultSet hasil = put.executeQuery(sql);
            while (hasil.next()){
                String id_pasien = hasil.getString("id_pasien");
                String nama_pasien = hasil.getString("nama_pasien");
                String jenis_kelamin = hasil.getString("jenis_kelamin");
                String tgl_lahir = hasil.getString("tgl_lahir");
                String tempat_lahir = hasil.getString("tempat_lahir");
                String telp = hasil.getString("telp");
                String alamat = hasil.getString("alamat");
                String nomor_ktp = hasil.getString("nomor_ktp");
                
                String hasilAll[] = {id_pasien, nama_pasien, jenis_kelamin, tgl_lahir, tempat_lahir, telp, alamat, nomor_ktp};
                tablemode.addRow(hasilAll);
            }
            
        } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Koneksi Gagal"+e);
        }
        
    }
   
    public Pendaftaran() {
        initComponents();
        tablePasien();
        
        
    }
    
    protected void blank(){
        id_pasien.setText("");
        nama_pasien.setText("");
        jenis_kelamin.setSelectedIndex(0);
        tgl_lahir_pasien.setDate(Date.from(Instant.now()));
        tempat_lahir_pasien.setText("");
        telp_pasien.setText("");
        alamat_pasien.setText("");
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
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        id_pasien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nama_pasien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tgl_lahir_pasien = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        tempat_lahir_pasien = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        telp_pasien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat_pasien = new javax.swing.JTextArea();
        Hapus1 = new javax.swing.JButton();
        Simpan1 = new javax.swing.JButton();
        Ubah = new javax.swing.JButton();
        jenis_kelamin = new javax.swing.JComboBox<>();
        no_ktp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pencarian_pasien = new javax.swing.JTextField();
        Cari = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelPasien = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1541, 800));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pendaftaran Pasien");

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("No. KTP");

        id_pasien.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        id_pasien.setPreferredSize(new java.awt.Dimension(6, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nama Pasien");

        nama_pasien.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        nama_pasien.setMinimumSize(new java.awt.Dimension(6, 24));
        nama_pasien.setPreferredSize(new java.awt.Dimension(6, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Kelamin");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tanggal Lahir");

        tgl_lahir_pasien.setPreferredSize(new java.awt.Dimension(91, 27));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tempat Lahir");

        tempat_lahir_pasien.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tempat_lahir_pasien.setPreferredSize(new java.awt.Dimension(6, 27));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("No. Telepon");

        telp_pasien.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        telp_pasien.setPreferredSize(new java.awt.Dimension(6, 27));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Alamat");

        alamat_pasien.setColumns(20);
        alamat_pasien.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        alamat_pasien.setRows(5);
        jScrollPane1.setViewportView(alamat_pasien);

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

        jenis_kelamin.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jenis_kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Laki-laki", "Perempuan" }));
        jenis_kelamin.setPreferredSize(new java.awt.Dimension(101, 27));

        no_ktp.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        no_ktp.setPreferredSize(new java.awt.Dimension(6, 27));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("No. Pasien");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel11))
                                        .addGap(2, 2, 2))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(id_pasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jenis_kelamin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(no_ktp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nama_pasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel9))
                                            .addComponent(jLabel6))
                                        .addGap(19, 19, 19))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telp_pasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Hapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Simpan1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tempat_lahir_pasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tgl_lahir_pasien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(id_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no_ktp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tgl_lahir_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempat_lahir_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(telp_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hapus1)
                    .addComponent(Simpan1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Database Pasien");

        pencarian_pasien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Cari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Search.png"))); // NOI18N
        Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariActionPerformed(evt);
            }
        });

        tabelPasien.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tabelPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelPasien.setRowHeight(25);
        tabelPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPasienMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelPasien);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(pencarian_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Cari, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pencarian_pasien))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void Simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Simpan1ActionPerformed
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String tgl = String.valueOf(format.format(tgl_lahir_pasien.getDate())); 
        
        String sql = "insert into pasien values (?,?,?,?,?,?,?,?)";
            try{
                PreparedStatement stat = Conn.prepareStatement(sql);
                stat.setString(1, id_pasien.getText());
                stat.setString(2, nama_pasien.getText());
                stat.setString(3, jenis_kelamin.getSelectedItem().toString());
                stat.setString(4, tgl);
                stat.setString(5, tempat_lahir_pasien.getText());
                stat.setString(6, telp_pasien.getText());
                stat.setString(7, alamat_pasien.getText());
                stat.setString(8, no_ktp.getText());
                
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data akan disimpan");
                blank();
                id_pasien.requestFocus();
                tablePasien();
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data gagal disimpan"+e);
                tablePasien();
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_Simpan1ActionPerformed

    private void Hapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hapus1ActionPerformed
             int ok = JOptionPane.showConfirmDialog(null,"Hapus data ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
             if (ok==0){
             String sql = "delete from pasien where id_pasien ='"+id_pasien.getText()+"'";
             try{
                PreparedStatement stat = Conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data akan di hapus dari sistem?");
                blank();
                id_pasien.requestFocus();
             }
                catch (SQLException e){
                JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);
             }
         
         }
        
        tablePasien();
        blank();
    }//GEN-LAST:event_Hapus1ActionPerformed

    private void tabelPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPasienMouseClicked
        // TODO add your handling code here:
        SimpleDateFormat tglKlik = new SimpleDateFormat("yyyy-MM-dd");
        
        Date dateView = null;
        int baris = tabelPasien.getSelectedRow();
        try {
                dateView = tglKlik.parse((String) tabelPasien.getValueAt(baris, 3));
        }catch (ParseException ex) {
            Logger.getLogger(Pendaftaran.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        id_pasien.setText(tabelPasien.getModel().getValueAt(baris, 0).toString());
        nama_pasien.setText(tabelPasien.getModel().getValueAt(baris, 1).toString()); 
        jenis_kelamin.setSelectedItem(tabelPasien.getModel().getValueAt(baris, 2).toString());
        tgl_lahir_pasien.setDate(dateView);
        tempat_lahir_pasien.setText(tabelPasien.getModel().getValueAt(baris, 4).toString()); 
        telp_pasien.setText(tabelPasien.getModel().getValueAt(baris, 5).toString());
        alamat_pasien.setText(tabelPasien.getModel().getValueAt(baris, 6).toString());
    }//GEN-LAST:event_tabelPasienMouseClicked

    private void UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat tglKlik = new SimpleDateFormat("yyyy-MM-dd");
        String tgl = String.valueOf(tglKlik.format(tgl_lahir_pasien.getDate()));
        try{
            String sql = "update pasien set "
                    + "id_pasien=?,"
                    + "nama_pasien=?,"
                    + "jenis_kelamin=?,"
                    + "tgl_lahir=?,"
                    + "tempat_lahir=?,"
                    + "telp=?,"
                    + "alamat=?, "
                    + "no_ktp=? "
                    + "where id_pasien ='"+id_pasien.getText()+"'";
            PreparedStatement stat = Conn.prepareStatement(sql);
            stat.setString(1, id_pasien.getText());
            stat.setString(2, nama_pasien.getText());
            stat.setString(3, jenis_kelamin.getSelectedItem().toString());
            stat.setString(4, tgl);
            stat.setString(5, tempat_lahir_pasien.getText());
            stat.setString(6, telp_pasien.getText());
            stat.setString(7, alamat_pasien.getText());
            stat.setString(8, no_ktp.getText());
                
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data akan diubah");
            blank();
            id_pasien.requestFocus();
        }      
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal diubah"+e);
        }
        tablePasien();
    }//GEN-LAST:event_UbahActionPerformed

    private void CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CariActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cari;
    private javax.swing.JButton Hapus1;
    private javax.swing.JButton Simpan1;
    private javax.swing.JButton Ubah;
    private javax.swing.JTextArea alamat_pasien;
    private javax.swing.JTextField id_pasien;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jenis_kelamin;
    private javax.swing.JTextField nama_pasien;
    private javax.swing.JTextField no_ktp;
    private javax.swing.JTextField pencarian_pasien;
    private javax.swing.JTable tabelPasien;
    private javax.swing.JTextField telp_pasien;
    private javax.swing.JTextField tempat_lahir_pasien;
    private com.toedter.calendar.JDateChooser tgl_lahir_pasien;
    // End of variables declaration//GEN-END:variables
}