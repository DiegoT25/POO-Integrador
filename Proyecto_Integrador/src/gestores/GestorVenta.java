/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import modelo.*;

/**
 *
 * @author diego
 */
public class GestorVenta {
    private Venta[] arr;
    private final static int MAX = 100;
    private int n;

    public GestorVenta() {
        arr = new Venta[MAX];
        n = 0;
    }
    public int longitud() {
        return n;
    }
    
    public void agregar(Venta venta) {
        if (n < MAX) {
            arr[n] = venta;
            n++;
        }
    }

    public void eliminar(int pos) {
        if (pos >= 0 && pos < n) { 
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }
    }
    
    public int posicion(int numero) {
        for (int i = 0; i < n; i++) {
            if (arr[i].getNumero() == numero) {
                return i;
            }
        }
        return -1;
    }

    public Venta iesimo(int pos) {
        if (pos >= 0 && pos < n) {
            return arr[pos];
        }
        return null;
    }
}

