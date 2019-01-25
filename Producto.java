/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_prueba_tercer_parcial;

/**
 *
 * @author Antoni
 */
public class Producto {
    private String codigo;
    private String nombre;
    TipoProducto t;
    private float precio;

    public Producto(String codigo, String nombre,TipoProducto t, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.t = t;
        this.precio = precio;
    }

  
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoProducto getTipo() {
        return t;
    }

    public void setTipo(String tipo) {
        this.t = t;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", Tipo=" + t + ", Precio=" + precio + '}';
    }

}
