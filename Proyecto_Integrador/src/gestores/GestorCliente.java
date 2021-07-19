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
public class GestorCliente {
    private Cliente[] arr;
    private final static int MAX = 100;
    private int n;
    
    public GestorCliente() {
        arr = new Cliente[MAX];
        n = 0;
    }
    public int length() {
        return n;
    }
    public void add(Cliente cliente) {
        if (n < MAX) {
            arr[n] = cliente;
            n++;
        }
    }
    public void delete(int pos) {
        if (pos >= 0 && pos < n) {
            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }
    }
    public int posicion(int dni) {
        for (int i = 0; i < n; i++) {
            if (arr[i].getDni() == dni) {
                return i;
            }
        }
        return -1;
    }

    public Cliente iesimo(int pos) {
        if (pos >= 0 && pos < n) {
            return arr[pos];
        }
        return null;
    }

    public String mostrar() {
        String cad = "";
        for (int i = 0; i < n; i++) {
            cad = cad + arr[i].getNombre() + "\n";
        }
        return cad;
    }
    public void ordenarPorNombre() {
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j].getNombre().compareTo(arr[j - 1].getNombre()) < 0) {
                    // Intercambiar
                    Cliente aux = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = aux;
                }
            }
        }
    }
    
}
