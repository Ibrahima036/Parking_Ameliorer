
package Modele;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author mon pc
 */
public class Connect {
    String dbhost = "jdbc:mysql://localhost:3306/gestionparking";
    String dbuser = "root";
    String dbmdp = "";
    Connection c = null;
    
    public Connect(){
        try {
            c = DriverManager.getConnection(dbhost, dbuser, dbmdp);
            JOptionPane.showMessageDialog(null, "Connection établie");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ereur ici "+e.getMessage());
        }
        
    }
    
}
