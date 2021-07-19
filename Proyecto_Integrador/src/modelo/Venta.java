package modelo;

import java.util.Date;
import java.util.Calendar;

public class Venta {
    private int numero;
    private Date fecha;
    private Cliente cliente;
    private LineaVenta[] lineVenta;
    private int MAX;
    private int numLinea;

    public Venta(int numero, Date fecha, Cliente cliente) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.numLinea = 0;
        this.lineVenta = new LineaVenta[MAX];
    }

    public Venta() {
        this.numero = 0;
        Calendar calendar = Calendar.getInstance();
        this.fecha = calendar.getTime();
        this.numLinea = 0;
        this.lineVenta = new LineaVenta[MAX];
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LineaVenta[] getLineVenta() {
        return lineVenta;
    }

    public void setLineVenta(LineaVenta[] lineVenta) {
        this.lineVenta = lineVenta;
    }

    public int getMAX() {
        return MAX;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }

    public int getNumLinea() {
        return numLinea;
    }

    public void setNumLinea(int numLinea) {
        this.numLinea = numLinea;
    }
    public void agregarLinea(LineaVenta linea) {
        if (numLinea >= 0 && numLinea < MAX) {
            lineVenta[numLinea] = linea;
            numLinea++;
        }
    }

    public void eliminar(int pos) {
        if (pos >= 0 && pos < numLinea) { // La posicion existe en el arreglo
            // Desplazar los elementos a la izquieda
            for (int i = pos; i < numLinea - 1; i++) {
                lineVenta[i] = lineVenta[i + 1];
            }
            numLinea--;
        }
    }
    
    public int numLinea(){
        return numLinea;
    }
    
    public double getTotal(){
        double sum=0;
        LineaVenta[] lista = this.getLineVenta();
        for (int i = 0; i < numLinea; i++) {
            int cantidad = lista[i].getCantidad();
            double precio = lista[i].getProducto().getPrecioUnd();
            sum += cantidad*precio;
        }
        return sum;
    }
    

    

        
    
    
    
}
