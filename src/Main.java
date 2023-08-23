import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String opciones[] = {"Ejercicio 1", "Ejercicio 2"};

        int eleccion = 0;

        eleccion = JOptionPane.showOptionDialog(null, "Seleccione un ejercicio", "Ejercicios de Excepción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, 0);


        if (eleccion == 0) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce un texto");

            String lectTeclado = scanner.nextLine();

            try {
                char caracter = CaracterEn.caracterEn(lectTeclado, 7);

                System.out.println("El caracter en la posición 7 es: " + caracter);
            } catch (Exception e) {

                System.out.println("Esta posición no existe en la cadena de texto");


            }

        } else if (eleccion == 1) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce un número");

            int numero = scanner.nextInt();

              try{

                  if (numero<0){
                      throw new NumeroNegativoExcepcion();
                  }else {

                      double raiz = Math.sqrt(numero);

                      System.out.println("La raíz cuadrada de " + numero + " es igual a " + raiz);

                  }
              }catch (Exception e){

                  System.out.println(e.getMessage());
              }

        }


    }
}