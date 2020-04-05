
package gestiondoc;

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Conexion {
    public String bd = "GestionDoc";
    public String login = "postgres";
    public String password = "";
    public String url = "jdbc:postgresql://localhost:5432/"+bd;
    
    public Conexion(){
     }
    
    public Connection conectar(String url, String login, String password) { 
        Connection link = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            link = DriverManager.getConnection(this.url, this.login, this.password);
        }
        catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
  
    }
}
