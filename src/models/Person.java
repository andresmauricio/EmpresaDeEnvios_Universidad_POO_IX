/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author PC
 */
public class Person {

    public String id;
    public String nombres;
    public String identificacion;
    public String nacimiento;
    public String telefono;
    public String direccion;
    public String password;
    public String rol;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNacimiento() {
        return nacimiento;
    }
    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCelular() {
        return rol;
    }
    public void setCelular(String rol) {
        this.rol = rol;
    }

    public Person(String id, String nombres, String identificacion, String nacimiento, String direccion, String telefono,
        String rol, String password) {
        super();
        this.id = id;
        this.nombres = nombres;
        this.identificacion = identificacion;
        this.nacimiento = nacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rol = rol;
        this.password = password;
    }

}