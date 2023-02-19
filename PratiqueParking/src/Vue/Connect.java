/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

/**
 *
 * @author mon pc
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Connect {
    Connection con = null;
     String dbuser = "root";
    String dbmdp = "";
    String dbhost = "jdbc:mysql://localhost:3306/gestionparking";
    
    public Connect(){
        try {
           // Class.forName("com.mysql.Driver");
        } catch (Exception e) {
            System.out.println("Erreur ici "+e.getMessage());
        }
        try {
            con = DriverManager.getConnection(dbhost, dbuser, dbmdp);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erreur ici "+e);
        }
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
