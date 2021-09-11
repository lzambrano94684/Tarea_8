package Tarea8;
public class Datos {

    private String carne;
    private String estudiante;
    private int anios;

    public Datos(String carne, String estudiante, int anios) {
        this.carne = carne;
        this.estudiante = estudiante;
        this.anios = anios;
    }

    public int getEdad() {
        return anios;
    }
}