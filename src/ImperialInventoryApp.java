import java.util.InputMismatchException;
import java.util.Scanner;

public class ImperialInventoryApp {
    /**
     * Método principal que inicia la aplicación.
     */
    private static Scanner sc = new Scanner(System.in);
    private static double[][] matrizA = new double[2][2];
    private static double[][] matrizB = new double[2][2];

    public static void main(String[] args) {
        // TODO: Implementar la lógica inicial y llamada a los métodos necesarios.
        menu();


        sc.close();
        System.out.println("Terminado ");
    }

    /**
     * Menú principal con un do-while para manejar las opciones del usuario.
     */
    public static void menu() {
        // TODO: Incluir el ciclo do-while y las llamadas a mostrarOpciones, obtenerOpcion y ejecutarOpcion.
        int opcion;
        do {
            mostrarOpciones();
            opcion = obtenerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 6);
    }

    /**
     * Mostrar las opciones disponibles al usuario.
     */
    public static void mostrarOpciones() {
        // TODO: Incluir los println con las opciones para el menú por consola.
        System.out.println("\n=============================");
        System.out.println("            IMPERIO            ");
        System.out.println("      Calculadora Espacial    ");
        System.out.println("============================= ");
        System.out.println("    [1] Suma de Matriz 2x2       ");
        System.out.println("    [2] Resta de Matriz 2x2      ");
        System.out.println("    [3] Multiplicacion de Matriz 2x2       ");
        System.out.println("    [4] Calculo de inversa de Matriz 2x2        ");
        System.out.println("    [5] Division de Matriz 2x2                 ");
        System.out.println("    [6] Salir                 ");

        System.out.println("============================= ");
        System.out.print("      Opcion: ");
    }

    /**
     * Obtener la opción elegida por el usuario.
     */
    public static int obtenerOpcion() {
        // TODO: Leer la entrada por consola y retornar la opción seleccionada.
        return Integer.parseInt(sc.nextLine());
    }

    /**
     * Ejecutar la opción elegida por el usuario.
     */
    public static void ejecutarOpcion(int opcion) {
        // TODO: Implementar la lógica correspondiente a cada opción.
        switch (opcion) {
            case 1 -> sumarMatrices();
            case 2 -> System.out.println("2 ");
            case 3 -> System.out.println("3 ");
            case 4 -> System.out.println("4 ");
            case 5 -> System.out.println("5 ");
            case 6 -> System.out.println("  Hasta luego...");
            default -> System.out.println(" Opcion invalida...");
        }
    }


    public static double[][][] guardarMatrices() {
        System.out.println("Introduce los valores de la matriz A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Valor para [" + i + "][" + j + "]: ");
                matrizA[i][j] = sc.nextDouble();
                System.out.print(matrizA[i][j] + " ");
            }
        }

        System.out.println("Introduce los valores de la matriz B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Valor para [" + i + "][" + j + "]: ");
                matrizB[i][j] = sc.nextDouble();
            }
        }

        return new double[][][]{matrizA, matrizB};  // Devolver ambas matrices
    }
            /**
             * Realizar la suma de dos matrices.
             */

    public static double[][] sumarMatrices(){
            // TODO: Implementar la operación suma elemento a elemento.
        guardarMatrices();
        return new double[0][];
    }

    /**
     * Realizar la resta de dos matrices.
     */
    public static double[][] restarMatrices(double[][] matrizA, double[][] matrizB) {
        // TODO: Implementar la operación resta elemento a elemento.
        return new double[0][];
    }

    /**
     * Realizar la multiplicación de dos matrices.
     */
    public static double[][] multiplicarMatrices(double[][] matrizA, double[][] matrizB) {
        // TODO: Implementar la operación de multiplicación mediante sumas producto.
        return new double[0][];
    }

    /**
     * Calcula la matriz inversa.
     */
    public static double[][] inversaMatriz(double[][] matriz) {
        // TODO: Implementar la lógica de cálculo de la inversa usando la fórmula 1/(ad - bc).
        return new double[0][];
    }

    /**
     * Efectuar la operación de «división» de matrices usando la inversa.
     */
    public static double[][] dividirMatrices(double[][] matrizA, double[][] matrizB) {
        // TODO: Resolver A * X = B multiplicando B por la inversa de A.
        return new double[0][];
    }
}

