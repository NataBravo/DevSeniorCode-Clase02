/*Crea un programa que calcule el área y el perímetro de un rectángulo. Solicita al usuario la longitud y el ancho del rectángulo. */

import java.util.Scanner;

public class AreaPerimetroRectangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora de Area y Perimetro de un rectangulo");
        System.out.println("Introduzca el largo del rectangulo");
        float largo = teclado.nextFloat();
        System.out.println("Introduzca el ancho del rectangulo");
        float ancho = teclado.nextFloat();
        teclado.close();
        double area = ancho*largo;
        float perimetro = ancho*(2) + largo *(2);
        System.out.println("El area es: "+ area + "metros cuadrados");
        System.out.println("El perimetro es: "+ perimetro);

    }
}
