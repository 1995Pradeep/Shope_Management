
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pradeep Kumara
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
//    Connection con= null;
    
    public  Connection ConnectionDb(){
//    public static void main(String[] args){
        try{
//            Class.forName("org.sqlite.JDBC");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shope","root","");
            
//             Connection con=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Pradeep Kumara\\Documents\\db.db");
            return con;
          
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
        return null;
        
     
}
}
