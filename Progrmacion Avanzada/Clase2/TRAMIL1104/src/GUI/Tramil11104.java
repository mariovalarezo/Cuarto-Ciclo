/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.*;
import Logica.Metodos;



/**
 *
 * @author Mario
 */
public class Tramil11104 {
    
    public static void main(String[] args) {
        Metodos op = new Metodos();
        String auxCodigo = op.CrearCodigo();
        // Desde pantalla
        String auxDescripcion = "Televisor";
        int auxEstado = 1;
        String auxCedula= "110597502";
        
        Cliente cl = new Cliente(auxCedula);
        
        Paquete paq = new Paquete(auxCodigo,auxDescripcion,auxEstado,cl);
        
        op.guardarPaquete(paq);
        
        System.out.println(paq.toString());
        
               
    }
    
        
}
