import java.util.Scanner;

public class TablaCalculada {

    public static void main(String[] args) {
        // 1. pedir la dimensión
        int[][] tabla = inicializarTabla();

        // 2. generar la tabla

        // 3. imprimir la tabla

        // 4. calcular minimo

        // 5. calcular maximo

        // 6. calcular promedio

        // 7. imprimir resultados
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
    
}
