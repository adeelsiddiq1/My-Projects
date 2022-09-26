/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lbmsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Connectivity {
    
    
     public static Connection con;
    public static Statement st;
    public static ResultSet rs;
    
    public static void connect(){
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://LAB6PC15\\SQL2016ENT;databaseName=lbsys;";
            con = DriverManager.getConnection(url, "sa","sa9");
            st=con.createStatement();
          
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
    }
    
}
