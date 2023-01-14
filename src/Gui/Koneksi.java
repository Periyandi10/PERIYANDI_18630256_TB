/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class Koneksi {
    
    private static Connection Koneksi;
    
    public static Connection getConnection() throws SQLException {
            String db =  "jdbc:mysql://localhost:3306/data_wisata";
            String user = "root";
            String pass = "";    
            
            if(Koneksi == null);{
         Koneksi = DriverManager.getConnection(db, user, pass);
    }
            return Koneksi;
    }
}
