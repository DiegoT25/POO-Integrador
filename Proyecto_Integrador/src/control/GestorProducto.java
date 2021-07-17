package control;
import modelo.*;
public class GestorProducto {
    private final static int MAX=200;
    private Producto[] arr;
    private int n; 
    public GestorProducto(){
        arr = new Producto[MAX];
        n = 0;
    }
   
    public int longitud(){
        return n;
    }
    // Agregar un elemnto al Arreglo
    public boolean agregar(Producto objProducto){
        // Verificar si tenemos espacio en el arreglo
        if (n<MAX){ // Tenemos espacio libre
            arr[n] = objProducto;
            n++;
            return true;
        }else{
            return false;
        }
    }

    public boolean eliminar(int pos){
        if (pos>=0 && pos<n){ 
            for (int i = pos; i < n-1; i++) {
                arr[i] = arr[i+1];
            }
            n--;
            return true;
        }else{
            return false;
        }
    }

    public int ubicacion(int codigo){
        for (int i = 0; i < n; i++) {
            if(arr[i].getCodigo()==codigo){
                return i;
            }
        }
        return -1; 
    }
 
    public Producto iesimo(int pos){
        if (pos>=0 && pos<n){
            return arr[pos];
        }else{
            return null; 
        }
    }
    public String mostrar(){
        String cadena = "";
        for (int i = 0; i < n; i++) {
            cadena = cadena+arr[i].getCategoria()+"\n";
        }
        return cadena;
    }
    

    public void ordenarPorMarca(){
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--) {
                if (arr[j].getCategoria().
                        compareTo(arr[j-1].getCategoria())<0)
                {
                    Producto aux = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = aux;
                }
            }            
        }
    }
    
    
    
}
