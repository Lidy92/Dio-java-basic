import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite seu nome: ");
            String name = scanner.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String lastName = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int age = scanner.nextInt();

            System.out.println("Digite sua altura (em metros): ");
            double height = scanner.nextDouble();

            // Impressão dos dados:
            System.out.println("Olá, me chamo " + name + " " + lastName + ".");
            System.out.println("Tenho " + age + " anos.");
            System.out.println("Minha altura é " + height + "m.");

        } catch (InputMismatchException e) {
            System.out.println("Erro: Os campos numéricos foram inseridos de forma incorreta.");
        } finally {
            // Fechando o scanner no bloco finally para garantir que seja fechado mesmo em caso de exceção
            scanner.close();
        }
    }
}

