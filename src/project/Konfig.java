/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Asus
 */
public class Konfig {
    private static Connection MySQConfig;
    public static Connection configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost/kelompok11";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQConfig=DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.out.println("Koneksi gagal "+e.getMessage());
        }
        return MySQConfig;
    }
}
