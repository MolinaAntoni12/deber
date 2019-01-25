/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_prueba_tercer_parcial;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Antoni
 */
public class BaseProducto {
           //Creando un array list de tipo objeto
            private ArrayList<Producto>listaProducto=new ArrayList<Producto>();
            
            
            //Metodo
            public void insertarProducto(Producto producto){
                listaProducto.add(producto);
                
            }
           
           
            //Recorrer el Array list
            public void imprimirProducto(){
               Iterator miIterator=listaProducto.iterator();//Descompone el listado o lista empleados para pasar uno a uno
               while(miIterator.hasNext())
               {
                  Producto elemento=(Producto) miIterator.next();
                  System.out.println(elemento.toString());
               }
            }
            
            public void elminarProducto(Producto em){
                listaProducto.remove(em);
                
            }
            
            
            public void buscarProducto(String codigo){
                boolean op=false;
                Iterator miIterator=listaProducto.iterator();//Descompone el listado o lista empleados para pasar uno a uno
               while(miIterator.hasNext())
               {
                  Producto elemento=(Producto) miIterator.next();
                  if(elemento.equals(codigo)){
                  System.out.println("1.-Nombre : "+elemento.getNombre());
                  System.out.println("2.-Tipo : "+elemento.getTipo());
                  System.out.println("3.-Precio : "+elemento.getPrecio());
                  op=true;   
                  }
               }
               if(op==false)
               {
                 //System.out.println("No se encontro producto a buscar");
               }
            }
            
            public void modificarProducto(int opDatos,String dato,String codigo){
                Iterator miIterator=listaProducto.iterator();//Descompone el listado o lista empleados para pasar uno a uno
               while(miIterator.hasNext())
               {
                  Producto elemento=(Producto) miIterator.next();
                  if(elemento.equals(codigo)){
                   switch(opDatos){
                       case 1:
                           elemento.setNombre(dato);
                           break;
                       }
                  }
                
            }
}
}
