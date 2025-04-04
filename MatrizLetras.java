import java.util.Scanner;
/*
 * Programa que llena una matriz de 4x5 con letras ingresadas por el usuario y
 */
public class MatrizLetras {
    public static void main(String[] args) {
        // Declaramos una matriz de 4 filas y 5 columnas
        char matriz[][] = new char[4][5];
        Scanner sc = new Scanner(System.in);

        // Mensaje para el usuario
        System.out.println("Por favor, ingresa 20 letras para llenar la matriz:");

        // Recorremos la matriz para llenarla con los valores ingresados por el usuario
        for (int i = 0; i < 4; i++) { // Recorremos las filas
            for (int j = 0; j < 5; j++) { // Recorremos las columnas
                System.out.println("Ingresa la letra para la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.next().charAt(0); // Leemos un carácter ingresado por el usuario
            }
        }

        // Imprimimos la matriz en formato de tabla
        System.out.println("\nMatriz llena con las letras ingresadas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Hacemos un salto de línea al final de cada fila
        }

        // Cerramos el Scanner
        sc.close();
    }
}