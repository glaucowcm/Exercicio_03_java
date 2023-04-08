import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int soma;
        int numero1;
        int numero2;

        try (Scanner teclado = new Scanner(System.in)) {
            {

                System.out.println("Digite um número:");

                numero1 = teclado.nextInt();

                System.out.println("Digite outro número:");

                numero2 = teclado.nextInt();

                soma = numero1 + numero2;

                System.out.println("A soma dos números é:" + soma);

            }
        }
    }
}