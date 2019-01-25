/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_prueba_tercer_parcial;

import java.util.Scanner;

/**
 *
 * @author Antoni
 */
public class TipoProducto {
    
    Scanner teclado=new Scanner (System.in);
    private String tipo="Frutas";
    public TipoProducto(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
  
    
     @Override
    public String toString() {
        return "Tipo Producto{" + "tipo=" + tipo + '}';
    }
    
}
