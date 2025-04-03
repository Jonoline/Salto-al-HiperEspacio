import java.util.Scanner;

public class ImperialInventoryApp {
    /**
     * Método principal que inicia la aplicación.
     */
    private static Scanner sc = new Scanner(System.in);

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
        int opcion;
        do {
            mostrarOpciones();
            opcion = obtenerOpcion(0);
            if (opcion != -1) { // Solo ejecuta la opción si es válida
                ejecutarOpcion(opcion);
            }
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
    public static int obtenerOpcion(int opcion) {
        try {
            opcion = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un numero valido");
            return -1; // Devolver un valor inválido para que no ejecute ninguna opción
        }
        return opcion;
    }

    /**
     * Ejecutar la opción elegida por el usuario.
     */
    public static void ejecutarOpcion(int opcion) {
        // TODO: Implementar la lógica correspondiente a cada opción.
        switch (opcion) {
            case 1 -> operacionSuma();
            case 2 -> System.out.println("2 ");
            case 3 -> System.out.println("3 ");
            case 4 -> System.out.println("4 ");
            case 5 -> System.out.println("5 ");
            case 6 -> System.out.println("  Hasta luego...");
            default -> System.out.println(" Opcion invalida...");
        }
    }


    /**
     * Realiza la operación de suma de dos matrices 2x2.
     * TODO: Leer dos matrices 2x2, sumar elemento a elemento e imprimir el resultado.
     */
    public static void operacionSuma() {
        // TODO: Invocar leerMatriz para ambas matrices, sumar y llamar a imprimirMatriz.
        double[][] matrizA = leerMatriz();
        double[][] matrizB = leerMatriz();
        double[][] resultado = new double[2][2];

        // Sumar elemento a elemento
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        imprimirMatriz(resultado);
    }

    /**
     * Realiza la operación de resta de dos matrices 2x2.
     * TODO: Leer dos matrices 2x2, restar elemento a elemento e imprimir el resultado.
     */
    public static void operacionResta(Scanner sc) {
        // TODO: Invocar leerMatriz para ambas matrices, restar y llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de multiplicación de dos matrices 2x2.
     * TODO: Leer dos matrices 2x2, multiplicarlas utilizando la suma de productos y mostrar el resultado.
     */
    public static void operacionMultiplicacion(Scanner sc) {
        // TODO: Invocar leerMatriz para ambas matrices, multiplicar y llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de cálculo de la inversa de una matriz 2x2.
     * TODO: Leer una matriz 2x2, calcular su determinante, verificar invertibilidad y mostrar la inversa.
     */
    public static void operacionInversa(Scanner sc) {
        // TODO: Invocar leerMatriz, calcular determinante, verificar y calcular la inversa, luego llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de división de matrices resolviendo A * X = B.
     * TODO: Leer la matriz A, verificar que sea invertible, calcular su inversa, leer la matriz B y mostrar el resultado de A^-1 * B.
     */
    public static void operacionDivision(Scanner sc) {
        // TODO: Invocar leerMatriz para A y B, calcular inversa de A, multiplicar por B y llamar a imprimirMatriz.
    }

    /**
     * Lee una matriz 2x2 desde la entrada estándar.
     * TODO: Solicitar al usuario cada elemento de la matriz especificada y retornar la matriz.
     */
    public static double[][] leerMatriz() {
        double[][] matriz = new double[2][2];
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }
        sc.nextLine();
        return matriz;
    }

    /**
     * Imprime una matriz 2x2 en formato sencillo.
     * TODO: Recorrer la matriz y mostrar cada uno de sus elementos.
     */
    public static void imprimirMatriz(double[][] resultado) {
        // TODO: Implementar impresión de cada elemento de la matriz.
        // Imprimir el resultado
        System.out.println("\nMatriz Resultante ");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Calcula el determinante de una matriz 2x2.
     * TODO: Calcular y retornar el determinante utilizando la fórmula: ad - bc.
     */
    public static double determinante(double[][] matriz) {
        // TODO: Implementar el cálculo del determinante.
        return 0;
    }
}
