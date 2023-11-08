import Classes.ContaTerminal;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o numero da conta:");
        conta.numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o numero da agencia:");
        conta.agencia = sc.nextLine();
        System.out.println("Por favor, digite o saldo da conta:");
        conta.saldo = sc.nextDouble();
        sc.nextLine();
        System.out.println("Por favor, digite o nome do cliente:");
        conta.nomeDoCliente = sc.nextLine();


        System.out.println("Olá "+ conta.nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+conta.agencia+", conta "+conta.numero+" e o seu saldo de "+conta.saldo+" já está disponivel para saque.");
    }
}