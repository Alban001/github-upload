
package Modelos;
import java.sql.*;
/**
 *
 * @author user
 */
public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/Sistema-ventas";
    String user="root";
    String pass="1234";
            
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch(Exception e){
            
        }
        return con;
    }
}
