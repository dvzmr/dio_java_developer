import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeDoCliente;
        double saldo;

        System.out.println("Por favor, digite o numero da conta:");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o numero da agencia:");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o saldo da conta:");
        saldo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Por favor, digite o nome do cliente:");
        nomeDoCliente = sc.nextLine();


        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o seu saldo de " + saldo + " já está disponivel para saque.");
    }
}