package ed;

import java.util.Scanner;

public class EDfunciones {

    Scanner entrada = new Scanner(System.in);

    private int filal = 0, columnal = 0, opc = 0;

    private int filal2 = 0, filal3 = 0, columnal2 = 0, columnal3 = 0;

    int matriz[][] = new int[filal][columnal];

    EDfunciones(int fila, int columna) {

        this.filal = fila;
        this.columnal = columna;
    }

    public void Ejercicio1() {

        int matriz1[][] = new int[filal][columnal];

        System.out.println("Vamos a darle los valores a la primera Matriz");

        for (int i = 0; i < filal; i++) {

            for (int j = 0; j < columnal; j++) {

                System.out.println("Ingrese el valor correspondiente en la posición [ " + i + " ] [ " + j + " ]");
                matriz1[i][j] = entrada.nextInt();

            }

            System.out.println("");

        }
        System.out.println("_______________");
        System.out.println("Primera Matriz");
        System.out.println("_______________");

        for (int i = 0; i < filal; i++) {

            for (int j = 0; j < columnal; j++) {

                System.out.print("[" + matriz1[i][j] + "]");

            }

            System.out.println("");

        }
        System.out.println("_______________");
        System.out.println("");

        int matriz2[][] = new int[filal][columnal];

        System.out.println("///////////////////////////////////////////////////////////////////////");
        System.out.println("NOTA: Para sumar una matriz con otra, ambas deben poseer el mismo orden");
        System.out.println("///////////////////////////////////////////////////////////////////////");
        System.out.println("");

        System.out.println("Ingrese el número de filas de la segunda matriz");
        filal2 = entrada.nextInt();

        System.out.println("Ingrese el número de columnas de la segunda matriz");
        columnal2 = entrada.nextInt();
        System.out.println("");

        System.out.println("Vamos a darle los valores a la segunda Matriz");

        for (int i = 0; i < filal2; i++) {

            for (int j = 0; j < columnal2; j++) {

                System.out.println("Ingrese el valor correspondiente en la posición [ " + i + " ] [ " + j + " ]");
                matriz2[i][j] = entrada.nextInt();

            }

            System.out.println("");

        }
        System.out.println("_______________");
        System.out.println("Segunda Matriz");
        System.out.println("_______________");

        for (int i = 0; i < filal2; i++) {

            for (int j = 0; j < columnal2; j++) {

                System.out.print("[" + matriz2[i][j] + "]");

            }

            System.out.println("");

        }
        System.out.println("_______________");
        System.out.println("");

        if (filal == filal2 && columnal == columnal2) {

            System.out.println("Procedemos a hacer la suma de la Matriz primera más la segunda");
            System.out.println("");
            System.out.println("Sumando Matrices...");
            System.out.println("Sumando...");
            System.out.println("LISTO");
            System.out.println("");

            int matriz3[][] = new int[filal][columnal];

            for (int i = 0; i < filal; i++) {

                for (int j = 0; j < columnal; j++) {

                    System.out.println("El valor correspondiente en la posición [ " + i + " ] [ " + j + " ]");
                    matriz3[i][j] = matriz1[i][j] + matriz2[i][j];

                    System.out.println("El resultado de la suma es: " + matriz3[i][j]);

                }

                System.out.println("");

            }

            for (int i = 0; i < filal; i++) {

                for (int j = 0; j < columnal; j++) {

                    System.out.print("[" + matriz3[i][j] + "]");

                }

                System.out.println("");

            }

            System.out.println("_______________");
            System.out.println("");
            System.out.println("Continuamos a darle valores a la ultima matriz que vamos a multiplicar");
            System.out.println("");

            System.out.println("_____________________________________________________________________________________________");
            System.out.println("NOTA: Para multiplicar las matrices el número de filas de la matriz resultante de la suma");
            System.out.println("debe ser ese número el mismo que el de las columnas de la nueva para poder multiplicar");
            System.out.println("lo mismo sucede con las columnas");
            System.out.println("______________________________________________________________________________________________");

            System.out.println("Ingrese el número de filas de la tercera matriz");
            filal3 = entrada.nextInt();

            System.out.println("Ingrese el número de columnas de la tercera matriz");
            columnal3 = entrada.nextInt();
            System.out.println("");

            if (filal == columnal3 && columnal == filal3) {

                int matriz4[][] = new int[filal3][columnal3];

                for (int i = 0; i < filal3; i++) {

                    for (int j = 0; j < columnal3; j++) {

                        System.out.println("Ingrese el valor correspondiente en la posición [ " + i + " ] [ " + j + " ]");
                        matriz4[i][j] = entrada.nextInt();

                    }

                    System.out.println("");

                }

                System.out.println("_______________");
                System.out.println("Tercera Matriz");
                System.out.println("_______________");

                for (int i = 0; i < filal3; i++) {

                    for (int j = 0; j < columnal3; j++) {

                        System.out.print("[" + matriz4[i][j] + "]");

                    }

                    System.out.println("");

                }
                System.out.println("_______________");

                System.out.println("A continuaciòn vamos a multiplicar la nueva matriz por la matriz resultante de la suma");
                System.out.println("");

                int matrizresultante[][] = new int[filal][columnal3];

                for (int i = 0; i < filal; i++) {

                    for (int j = 0; j < columnal3; j++) {

                        for (int z = 0; z < filal; z++) {

                            matrizresultante[i][j] = matriz3[i][z] * matriz4[z][j];

                        }

                    }

                }

                System.out.println("");
                System.out.println("El resultado de la operaciòn es: ");
                System.out.println("");

                for (int i = 0; i < filal; i++) {

                    for (int j = 0; j < columnal3; j++) {

                        System.out.print("[" + matrizresultante[i][j] + "]");

                    }
                    System.out.println("");

                }
                
                System.out.println("TERMINADO");

            } else {

                System.out.println("El nùmero de filas de la primera matriz es distinta al nùmero de columnas");
                System.out.println("de la matriz a multiplicar");
                System.out.println("___________________________");
                System.out.println("TERMINADO");

            }

        } else {
            System.out.println("No se puede realizar la suma porque tienen diferente orden");
            System.out.println("TERMINADO");
        }

    }

    public void Ejercicio2() {

        double matrizR[][] = new double[filal][columnal];

        for (int i = 0; i < filal; i++) {
            for (int j = 0; j < columnal; j++) {

                double base = 0;
                double base2 = 0;
                System.out.print("Ingrese el valor de x: ");
                base = entrada.nextDouble();
                System.out.print("Ingrese el valor de y: ");
                base2 = entrada.nextDouble();
                System.out.println("");

                double exponente = 4;
                double exponente2 = 3;
                double num3 = 3;

                double res1 = Math.pow(base, exponente);
                double res2 = Math.pow(base2, exponente2);

                double fin = 23 * res1;
                double fin2 = 20 * res2;

                double op = fin + fin2;

                double resultado = op - num3;

                matrizR[i][j] = resultado;

                //matriz[i][j]; //Aquí vamos a colocar el resultado de la matriz
            }

        } //23x4+20y3-3

        System.out.println("Desea imprimir el resultado en pantalla ");
        System.out.println("1- SI");
        System.out.println("2- NO");
        System.out.println("_________________________________________");
        System.out.print("Respuesta: ");
        opc = entrada.nextInt();
        System.out.println("");

        if (opc == 1) {

            for (int i = 0; i < filal; i++) {
                for (int j = 0; j < columnal; j++) {

                    System.out.print("[" + matrizR[i][j] + "] ");

                }
                System.out.println("");

            }

        }
        if (opc == 2) {
            System.out.println("No se imprimió el resultado");
            System.out.println("TERMINADO");

        } else {
            System.out.println("");

        }

    }

    public void Ejercicio3() {

        System.out.println("//////////////////////////");
        System.out.println("///  MATRIZ IDENTIDAD  ///");
        System.out.println("//////////////////////////");
        System.out.println("");

        int matriz[][] = new int[filal][columnal];

        if (filal == columnal) {

            for (int i = 0; i < filal; i++) {

                for (int j = 0; j < columnal; j++) {

                    matriz[i][j] = (int) (Math.random() * 2);

                }

            }

            for (int i = 0; i < filal; i++) {
                for (int j = 0; j < columnal; j++) {

                    System.out.print("[" + matriz[i][j] + "]");

                }

                System.out.println("");
            }

            int constante = 1;

            for (int contador = 0; contador < columnal; contador++) { //Cuando no es

                if (matriz[contador][contador] == constante) {

                    contador++;

                    System.out.println("");

                } else {
                    System.out.println("No es una matriz identidad");
                    System.out.println("- no se cumplio la condición");

                }

            }

        } else {

            System.out.println("AVISO__________________________________________________");
            System.out.println("No cumple con la condición de ser una matriz identidad");
            System.out.println("ya que una matriz identidad es una matriz cuadratica.");
            System.out.println("_______________________________________________________");
        }

    }

    public void Ejercicio4() {

        System.out.println("//////////////////////////");
        System.out.println("///  MATRIZ TRIANGULAR  ///");
        System.out.println("//////////////////////////");
        System.out.println("");
        
        int varb=0;

        int matrizN[][] = new int[filal][columnal];

        if (filal == columnal) {

            System.out.println("Llenando Matriz...");
            System.out.println("Llenando...");
            System.out.println("LLenando...");
            for (int i = 0; i < filal; i++) {
                for (int j = 0; j < columnal; j++) {
                    if (i <= j) {

                        System.out.println("columna [" + (i + 1) + "] [" + (j + 1) + "]");
                        matrizN[i][j] = j + 1;

                    }
                }
            }
            System.out.println("");
            System.out.println("Llenado finalizado.");
            System.out.println("");
            

            for (int i = 0; i < filal; i++) { //Impresión
                for (int j = 0; j < columnal; j++) {

                    // sum += matriz[i][j];
                    System.out.print("[" + matrizN[i][j] + "]");
                    varb++;

                }
                System.out.println("");
            }

           if (varb!=1){
               System.out.println("____________________________________");
               System.out.println("Es una matriz triangular superior");
               
           }else{ System.out.println("No es una matriz triangular superior");
               System.out.println("Presione cualquier tecla para salir.");
               
           }

        } else {
            System.out.println("AVISO_________________________");
            System.out.println("No se cumple la condición, es necesario una matriz cuadratica");
            System.out.println("filas y columnas iguales");

        }

    } // Por terminar

}
