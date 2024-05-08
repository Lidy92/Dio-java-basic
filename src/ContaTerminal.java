import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numConta = solicitarNumeroConta(scanner);
        String agencia = solicitarAgencia(scanner);
        String nomeCliente = solicitarNomeCliente(scanner);
        double saldoInicial = solicitarSaldoInicial(scanner);

        // Como deverá ficar
        System.out.println("Número da conta: " + numConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo inicial: " + saldoInicial);

        scanner.close(); // Fechar o Scanner após usar
    }

    public static int solicitarNumeroConta(Scanner scanner) {
        System.out.println("Digite o número da conta: ");
        return scanner.nextInt();
    }

    public static String solicitarAgencia(Scanner scanner) {
        scanner.nextLine(); // Limpar o buffer
        System.out.println("Digite o número da agência: ");
        return scanner.nextLine();
    }

    public static String solicitarNomeCliente(Scanner scanner) {
        System.out.println("Digite o nome do cliente: ");
        return scanner.nextLine();
    }

    public static double solicitarSaldoInicial(Scanner scanner) {
        System.out.println("Digite o saldo inicial: ");
        return scanner.nextDouble();
    }
}
