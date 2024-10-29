/*Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin. Usa las siguientes fórmulas:

Fahrenheit = Celsius * 9/5 + 32
Kelvin = Celsius + 273.15 */

import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Conversor de grados Celcius a grados Fahrenheit y Kelvin");
        System.out.println("Ingrese los grados Celcius");
        var celcius = teclado.nextFloat();
        float fahrenheit;
        fahrenheit = celcius * 9/5 + 32;
        var kelvin = celcius + 273.15;
        teclado.close();
        System.out.println("Fahrenheit: " + fahrenheit+"ºF");
        System.out.println("Kelvin: " + kelvin+"K");
    }
}
