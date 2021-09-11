package Tarea8;
public class Igual {

    private int anios;
    private double costo;

    public Igual() {
        this.anios=0;
        this.costo=0;
    }

    public void setEdad(int anios) {

        this.anios = anios;
    }

    public void setPrecio(double costo) {

        this.costo = costo;
    }


    //Igual para producto
    public boolean igual1(Object pr) {
        Producto pro = (Producto) pr;
        return this.costo == pro.getPrecio();
    }

    public boolean menor1(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() < this.costo;
    }

    public boolean mayor1(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() > this.costo;
    }

    public boolean mayorIgual1(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() >= this.costo;
    }

    public boolean menorIgual1(Object pr) {
        Producto pro = (Producto) pr;
        return pro.getPrecio() <= this.costo;
    }

    //Igual para alumno
    public boolean igual(Object al) {
        Datos a = (Datos) al;
        return this.anios == a.getEdad();
    }

    public boolean menor(Object al) {
        Datos a = (Datos) al;
        return a.getEdad() < this.anios;
    }

    public boolean mayor(Object al) {
        Datos a = (Datos) al;
        return a.getEdad() > this.anios;
    }

    public boolean mayorIgual(Object al) {
        Datos a = (Datos) al;
        return a.getEdad() >= this.anios;
    }

    public boolean menorIgual(Object al) {
        Datos a = (Datos) al;
        return a.getEdad() <= this.anios;
    }

}