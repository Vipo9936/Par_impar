import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Ingresa un número Impar: ");
        int dato = cin.nextInt();
        int fa = 1;
        if (dato % 2 == 1) {
            for (int i = 1; i <= dato; i++) {
                fa *= i;
            }
            System.out.println("El factorial de " + dato + " es " + fa);
        } else {
            System.out.println("Error: El número ingresado no es impar.");
        }

        cin.close();
    }
}