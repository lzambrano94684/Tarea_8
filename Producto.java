package Tarea8;
public class Producto {

    private int noprod;
    private String produc;
    private double costo;

    public Producto(int noprod, String produc, double costo) {
        this.noprod = noprod;
        this.produc = produc;
        this.costo = costo;
    }

    public double getPrecio() {
        return costo;
    }
}
