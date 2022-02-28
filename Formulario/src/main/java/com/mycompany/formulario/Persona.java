/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.formulario;
/**
 *
 * @author hp
 */
public class Persona {
    String Nombre, Apellidos,Telefono,Sexo,Edad,Direccion;
    //Constructor
    public Persona(String Nombre, String Apellidos, String Telefono, String Sexo, String Edad, String Direccion) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.Sexo = Sexo;
        this.Edad = Edad;
        this.Direccion = Direccion;
    }
    //getters y setters (asiganar un valor inicial a un atributo) (acceder al valor y utilizarlo para cierto metodo)
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    public String getEdad() {
        return Edad;
    }
    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
  
}
