import java.util.Random;
import java.util.Scanner;

public class TablaCalculada {

    public static void main(String[] args) {
        // 1. pedir la dimensión
        int[][] tabla = inicializarTabla();

        // 2. generar la tabla
        generarTabla(tabla);        

        // 3. calcular minimo
        minimo(tabla);
        imprimir(tabla);
        // 4. calcular maximo

        // 5. calcular promedio

        // 6. imprimir resultados
    }

    public static int[][] inicializarTabla(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la tabla: ");
        int n = scan.nextInt();
        scan.close();

        int[][] tabla = new int[n][n + 3];
        return tabla;
    }

    public static void imprimir(int tabla[][]) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void generarTabla(int[][] tabla) {
        Random rnd = new Random();

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                tabla[i][j] = rnd.nextInt(100);
            }
        }
    }

    public static void minimo(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            int min = tabla[i][0];
            for (int j = 0; j < tabla.length; j++) {
                if (tabla[i][j] < min) {
                    min = tabla[i][j];
                }
            }
            tabla[i][tabla.length] = min;
        }        
    }
    
}
