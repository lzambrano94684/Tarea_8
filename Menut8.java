package Tarea8;
import java.util.Scanner;

public class Menut8 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int noprod, anios, op, anios2;
        String produc, estudiante, carne;
        double precioProducto, precioComparacion;

        Igual Igual = new Igual();

        do{
            System.out.println("****************** Por favor seleccione un menu ******************");
            System.out.println();
            System.out.println("1: Ingrese un nuevo producto a la base ");
            System.out.println("2: Ingrese un nuevo estudiante");
            System.out.println("3: Si desea FINALIZAR ");
            System.out.print("Escriba el numero que desa ingresar para seguir con el programa: ");
            op = leer.nextInt();

            switch(op){
                case 1:
                    System.out.println();
                    System.out.print("Ingrese el Codigo/numero del producto que desea agregar: ");
                    noprod = leer.nextInt();
                    leer.nextLine();
                    System.out.print("Por favor ingrese el nombre del producto: ");
                    produc = leer.nextLine();
                    System.out.print("Por favor ingrese el costo del producto " + produc + ": ");
                    precioProducto = leer.nextDouble();
                    System.out.print("Ingrese el costo que desea comparar: ");
                    precioComparacion = leer.nextDouble();

                    Producto producto = new Producto(noprod, produc, precioProducto);

                    Igual.setPrecio(precioComparacion);

                    if(Igual.igual1(producto) == true){
                        System.out.println("El costo del producto es igual ");
                    }

                    if(Igual.menor1(producto) == true){
                        System.out.println("El costo del producto es menor");
                    }

                    if(Igual.mayor1(producto) == true){
                        System.out.println("El costo del producto es mayor");
                    }

                    if(Igual.mayorIgual1(producto) == true){
                        System.out.println("El costo del producto es mayor/igual ");
                    }

                    if (Igual.menorIgual1(producto) == true){
                        System.out.println("El costo del producto es menor/igual");
                    }
                    break;
                case 2:

                    leer.nextLine();
                    System.out.println();
                    System.out.print("Ingrese el nombre del estudiante: ");
                    estudiante = leer.nextLine();
                    System.out.print("Por favor ingrese el carne del estudiante: ");
                    carne = leer.nextLine();
                    System.out.print("Ingrese los anios del estudiante: ");
                    anios = leer.nextInt();
                    System.out.print("Ingrese los anios que desa comparar: ");
                    anios2 = leer.nextInt();

                    Datos alumno = new Datos(carne, estudiante, anios);

                    Igual.setEdad(anios2);

                    if(Igual.igual(alumno) == true){
                        System.out.println("Los anios son iguales");
                    }

                    if(Igual.menor(alumno) == true){
                        System.out.println("Los anios son menores");
                    }

                    if(Igual.mayor(alumno) == true){
                        System.out.println("Los anios son mayores");
                    }

                    if(Igual.mayorIgual(alumno) == true){
                        System.out.println("Los anios son mayoes/iguales");
                    }

                    if (Igual.menorIgual(alumno) == true){
                        System.out.println("Los anios son menores/iguales");
                    }

                    break;
                case 3:
                    System.out.println();
                    System.out.print("Gracias por utilizar este programa, vuelva pronto");
                    break;
            }

        }while(op !=3);

    }
}