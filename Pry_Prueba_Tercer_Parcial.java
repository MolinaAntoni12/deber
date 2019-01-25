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
public class Pry_Prueba_Tercer_Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner (System.in);
        BaseProducto obj1;
        obj1=new BaseProducto();
        TipoProducto d1=new TipoProducto("Fruta");
        Producto e1=new Producto("1","Manzana", d1 , 250);
        TipoProducto d2=new TipoProducto("Lacteos");
        Producto e2=new Producto("2","Atun", d2 , 500);
        obj1.insertarProducto(e1);
        obj1.insertarProducto(e2);
        obj1.imprimirProducto();
        obj1.elminarProducto(e1);
        System.out.println("Eliminacion de Producto");
        obj1.imprimirProducto();
        System.out.println("Bucar Producto");
        obj1.buscarProducto("2");
        System.out.println("Seleccione lo que desea modificar:");
        int op=teclado.nextInt();
        switch(op){
            case 1:
                 System.out.println("Ingrese el nombre:");
                 String nombre=teclado.next();
                 obj1.modificarProducto(1,"Maracuya",nombre);
                 obj1.imprimirProducto();
                 break;

    }
    
}

    }
