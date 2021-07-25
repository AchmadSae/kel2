/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KlinikPekapuran;
import java.sql.*;
/**
 *
 * @author Nur
 */
public class Koneksi {
    private Connection Koneksi;
    public Connection Connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Koneksi OK");
        } catch (ClassNotFoundException ex){
            System.out.println("Gagal Koneksi "+ex);
        }
        String url = "jdbc:mysql//localhost:3306/dbklinik_pekapuran";
        try{
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbklinik_pekapuran", "root","");
            System.out.println("Database Connected");
            }
        catch (SQLException ex){
            System.out.println("Database Not Connected "+ex);
        }
        return Koneksi;
    }
    
}
