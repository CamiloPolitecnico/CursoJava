package Taller1;

import java.util.Scanner;

public class CalculadoraFracciones{

    public static Scanner Input;

    public static void main(String[] args) {
        float numerador = 0f, denominador = 0f, resultado = 0f;
        String operacion = "", messageResult = "";
        messageResult = "El resultado de la operación de ";
        Input = new Scanner(System.in);

        System.out.println("Ejercicio 1. Caculadora de fracciones");


        numerador = IngreseDato("Por favor ingrese numerador primera fraccion: ", false);
        denominador = IngreseDato("Por favor ingrese denominador primera fraccion: ", true);
        float fracion1 = numerador / denominador;
        messageResult = messageResult + numerador + "/" + denominador;

        numerador = IngreseDato("Por favor ingrese numerador segunda fraccion: ", true);
        denominador = IngreseDato("Por favor ingrese denominador segunda fraccion: ", true);
        float fracion2 = numerador / denominador;

        System.out.println("Por favor ingrese el simbolo de la operación a realizar.");
        System.out.println("Recuerde que los simbolos de las operaciones permitidas son:\n Suma(+)---Resta(-)---Mulpiplicación(+)---División(/)");

        boolean validarOperacion = true;
        do {
            operacion = Input.nextLine().trim();
            if (!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("*") && !operacion.equals("/")) {
                 System.out.println("Recuerde que los simbolos de las operaciones permitidas son:\n Suma(+)---Resta(-)---Mulpiplicación(+)---División(/)");
            } else {
                validarOperacion = false;
            }
        } while (validarOperacion);

        messageResult = messageResult + " " + operacion + " " + numerador + "/" + denominador;

        switch (operacion) {
            case "+":
            resultado = fracion1 + fracion2;
                break;
            case "-":
            resultado = fracion1 - fracion2;
                break;
            case "*":
            resultado = fracion1 * fracion2;
                break;
            case "/":
            resultado = fracion1 / fracion2;
                break;
            default:
                break;
        }

        messageResult = messageResult + " = " + resultado;

        System.out.println(messageResult);

        Input.close();
  }

  public static float IngreseDato(String message, boolean validar){
    Float dato = 0f;

    do{
        System.out.println(message);
        dato = Float.parseFloat(Input.nextLine());
        if(validar && (dato==0)){
            System.out.println("El numero ingresado debe ser diferente a 0");
        }
        else{
            validar = false;
        }
    }while(validar);

    return dato;
  }
}