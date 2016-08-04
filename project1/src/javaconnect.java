/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xeeshan
 */

import java.sql.*;
import javax.swing.*;
public class javaconnect {
    Connection conn=null;
    public static Connection connecrDb(){
        try{
            
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:D:\\NetBeansProjects\\project1\\project1.sqlite");
            JOptionPane.showMessageDialog(null, "Connection Estiblished");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
    }
    
}
