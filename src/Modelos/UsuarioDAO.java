/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;
import java.sql.*; // paquete con métodos que trabajan con SQL 

/**
 *
 * @author user
 */
public class UsuarioDAO {
    /*Dentro de esta clase se creará los métodos para la extracción de datos dela DB */
    PreparedStatement ps;
    ResultSet rs; 
    Conexion co=new Conexion();
    Connection acceso;
    
    
    public EntidadUsuario ValidarUsuario(String CI,String usuario){
        EntidadUsuario eu=new EntidadUsuario(); //Instanciacion de la entidadUsuario
        String sql="select*from usuario where CI=? and user=?";
        try{
            acceso=co.conectar();
            ps=acceso.prepareStatement(sql);
            ps.setString(1,CI);
            ps.setString(2,usuario);
            rs=ps.executeQuery();
        }catch(Exception e){
            
        }
        return eu;
    }
}
