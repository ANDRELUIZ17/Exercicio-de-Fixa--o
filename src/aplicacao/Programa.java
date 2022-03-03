package aplicacao;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Entre com o numero da conta: ");
        int numero = sc.nextInt();
        System.out.println("Entre com o nome do titular: ");
        sc.nextLine(); // para haver quebra de linha
        String titular = sc.nextLine();
        System.out.println("Tem deposito inicial (s/n)? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.println("Entre com o valor inicial: ");
            double depositoInicial = sc.nextDouble();//conta com deposito
            conta = new Conta(numero, titular, depositoInicial);
        }
        else {
            conta = new Conta(numero, titular); // aqui so para  abrir a conta
            //sem ter um deposito
        }
        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.println("Entre com o valor do deposito: ");
        double depositoValor = sc.nextDouble();
        conta.deposito(depositoValor); // depositar valor
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Entre com o valor para saque: ");
        double saqueValor = sc.nextDouble();
        conta.sacar(saqueValor); // sacar valor
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        sc.close();
    }
}
