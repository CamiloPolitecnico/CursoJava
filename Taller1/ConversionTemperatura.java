package Taller1;

import java.util.Scanner;

public class ConversionTemperatura {
    public static Scanner Input;
    public static void main(String[] args) {
        System.out.println("Ejercicio 2. Farenheit a Celcius");
        Input = new Scanner(System.in);

        System.out.println("Por favor ingrese la temperatura a convertir: ");
        float dato = Float.parseFloat(Input.nextLine());
        float result = ((dato - 32) / 1.8f);
        System.out.println(dato + "°F equivalen a "+result + " °C");
    }
}
