package modelo;

public class Producto {
    private int codigo;
    private String categoria;
    private String nombre;
    private int precioUnd;
    private float descuento;
    private float impuesto;

    public Producto(int codigo, String categoría, String nombre, int precioUnd, float descuento, float impuesto) {
        this.codigo = codigo;
        this.categoria = categoría;
        this.nombre = nombre;
        this.precioUnd = precioUnd;
        this.descuento = descuento;
        this.impuesto = impuesto;
    }

    public Producto() {
        this.codigo = 0;
        this.categoria = "";
        this.nombre = "";
        this.precioUnd = 0;
        this.descuento = 0;
        this.impuesto = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioUnd() {
        return precioUnd;
    }

    public void setPrecioUnd(int precioUnd) {
        this.precioUnd = precioUnd;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }
    



}

    



