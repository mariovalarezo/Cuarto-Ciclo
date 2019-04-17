package Clases;


import java.util.*;

/**
 * 
 */
public class Paquete {

    /**
     * Default constructor
     */
    
    public Paquete(String Codigo, String Descripcion, int Estado, Cliente objCliente) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Estado = Estado;
        this.Cliente = objCliente;
    }

    public String Codigo;
    public String Descripcion;
    public int Estado;
    public Cliente Cliente;

    @Override
    public String toString() {
        return "Paquete{" + "Codigo=" + Codigo + ", Descripcion=" + Descripcion + ", Estado=" + Estado + ", Cliente=" + Cliente + '}';
    }

    
    
}

