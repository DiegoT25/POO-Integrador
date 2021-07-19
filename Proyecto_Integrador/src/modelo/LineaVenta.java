/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author diego
 */
class LineaVenta {
    private int numeroLinea;
    private Venta venta;
    private Producto producto;
    private int cantidad;

    public LineaVenta(int numeroLinea, Venta venta, Producto producto, int cantidad) {
        this.numeroLinea = numeroLinea;
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public LineaVenta() {
        this.numeroLinea = numeroLinea;
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
