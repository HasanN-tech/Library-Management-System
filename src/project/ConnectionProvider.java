/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
//import com.sun.tools.xjc.Driver;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ConnectionProvider {
    
    public static Connection getCon() throws SQLException{
        
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","root");
                return con;
            } catch (Exception e) {
                System.out.println(e);
                return null;
            }
   
    }
}
