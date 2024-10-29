//Crea un programa que calcule la media aritmética de tres números introducidos por el usuario.

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros para calcular el promedio");
        System.out.println("Numero 1:");
        var numero1 = teclado.nextInt();
        System.out.println("Numero 2:");
        var numero2 = teclado.nextInt();
        System.out.println("Numero 3:");
        var numero3 = teclado.nextInt();
        teclado.close();
        float promedio = (numero1 + numero2 + numero3)/3;
        System.out.println("El promedio de los 3 numeros es: " +  promedio);
    }
}
