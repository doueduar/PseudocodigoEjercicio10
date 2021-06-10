import java.util.Scanner;

/**
 * Ejercicio10
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int suma, sum, multiplos;
        Scanner scanner = new Scanner(System.in);
        multiplos = 0; sum = 0; suma = 0;
        do {
            System.out.println("ingrese un numero");
            int N = scanner.nextInt();
            int multi = N % 5;
            if (multi == 0) {
                multiplos++;
            }
            if ((1<=N) && (1<=N) && (N<=10)) {
                sum += N;
            }
            suma += N;
           System.out.println("total acumulado "+suma+" cantidad de multiplos de  son: "+multiplos+" 5 suma de los numeros con restricción son: "+sum);
        } while (suma<=1000);
    }
}