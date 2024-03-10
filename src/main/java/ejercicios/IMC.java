package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {

    public static String evaluar(int peso, double estatura, int edad) {
        double total = peso / Math.pow(estatura, 2);
        if (edad < 45 && edad > 0) {
            if (total < 22 && total > 0) {
                return "bajo";
            } else if (total >= 22 && total > 0) {
                return "medio";
            } else if (total < 0){
                return "Error";
            }
        } else if (edad >= 45) {
            if (total < 22) {
                return "medio";

            } else if (total >= 22) {
                return "alto";
            } else if (total <0){
                return "Error";
            }

        } else {
            return "Error";
        }
        return null;
    }
    

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();

        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
