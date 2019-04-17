/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Clases.*;


/**
 *
 * @author Mario
 */
public class Metodos {
    public static String CrearCodigo(){
        return "PA001";
    }
    
    public static void guardarPaquete(Paquete paq){
        buscarCliente(paq);
        
    }
    
    public static boolean buscarCliente(Paquete paq){
        //if (paq.Cliente.Cedula.equals("1105975062")) {         
        //}
        paq.Cliente.Nombre= "";
        paq.Cliente.Direccion="";
        return true;
    }
    
}
