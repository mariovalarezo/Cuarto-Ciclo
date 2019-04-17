package Clases;


import java.util.*;

/**
 * 
 */
public class Cliente {

   
    public Cliente() {
    }

    public Cliente(String Cedula) {
        this.Cedula = Cedula;
    }
    
  
    public String Cedula;
    public String Nombre;
    public String Direccion;

    @Override
    public String toString() {
        return "Cliente{" + "Cedula=" + Cedula + ", Nombre=" + Nombre + ", Direccion=" + Direccion + '}';
    }

}