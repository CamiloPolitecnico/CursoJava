package Taller1;

import java.util.Scanner;

public class MasaCorporal {
    public static Scanner Input;

    public static void main(String[] args) {
        System.out.println("Ejercicio 3. Calculo de masa corporal.");
        Input = new Scanner(System.in);

        float peso = IngreseDato("Por favor ingrese el peso del usuario en kilos: ");
        float estatura = IngreseDato("Por favor ingrese la estatura del usuario en metros: ");
        double indiceMasaCorporal = peso / Math.pow(estatura, 2);
 
        System.out.println("El individuo con "+peso+" kilogramos de peso y una estatura de "+estatura+ " metros.");
        System.out.println("Tiene un indice de masa corporal de "+indiceMasaCorporal);
    }

    public static float IngreseDato(String message){
        Float dato = 0f;
    
        do{
            System.out.println(message);
            dato = Float.parseFloat(Input.nextLine());
            if(dato<=0){
                System.out.println("El numero ingresado debe ser mayor a cero");
            }
        }while(dato<=0);
    
        return dato;
      }
}
