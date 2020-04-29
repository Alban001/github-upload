/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author user
 */
public class EntidadUsuario {
    int id;
    String CI;
    String nombre;
    String apellido;
    
    public EntidadUsuario(int id, String CI, String nombre, String apellido, String usuario, String ciudad, String celular) {
        this.id = id;
        this.CI = CI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.ciudad = ciudad;
        this.celular = celular;
    }
    public EntidadUsuario(){}
    String usuario;
    String ciudad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    String celular;
    
}
