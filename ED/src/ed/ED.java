package ed;

import java.util.Scanner;

public class ED {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        int fila = 0, columna = 0;

        int matriz[][] = new int[fila][columna];

        System.out.println("///////////////////////////////");
        System.out.println("///        BIENVENIDO       ///");
        System.out.println("///////////////////////////////");
        System.out.println("");

        System.out.println("__________________________________________");
        System.out.print("Ingrese por favor el número de filas: ");
        fila = entrada.nextInt();
        System.out.println("");
        System.out.print("Ingrese por favor el número de columnas: ");
        columna = entrada.nextInt();
        System.out.println("__________________________________________");

        System.out.println("");
        System.out.println("1- Multiplicación de matrices basada en el ejercicio Mresultado=(M_1*M_2)*M_3");
        System.out.println("2- Función que rellena todos los datos de una matriz, bajo la función ");
        System.out.println("Matriz[X][Y] 23X^4+20Y^3-3");
        System.out.println("3- Crear una función que permita validar si una matriz es identidad");
        System.out.println("4- Crear una función que determina si una matriz es triangular superior");
        System.out.println("Seleccione que opción desea");
        System.out.println("____________________________________________");
        System.out.print("Respuesta: ");
        opc = entrada.nextInt();
        System.out.println("");
        EDfunciones mensajero = new EDfunciones(fila,columna);

        switch (opc) {

            case 1:
               
                
                mensajero.Ejercicio1();

                break;

            case 2:

                mensajero.Ejercicio2();
                break;

            case 3:
           
                mensajero.Ejercicio3();
                break;

            case 4:
              
                mensajero.Ejercicio4();
                break;

            default:
                System.out.println("Opción incorrecta");

        }

    }

}
