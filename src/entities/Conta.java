package entities;

public class Conta {
    private int numeroConta;
    private String titular;
    private double saldo;

    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public Conta(int numeroConta, String titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        deposito(depositoInicial); // proteger o meu construtor no futuro caso tenha mudança
        //é encapsulado com a classe deposito
    }

    public int getNumeroConta() {
        return numeroConta; // o número da conta não pode ser alterada
    }

    public String getTitular() {
        return titular;
    }

    public Conta setTitular(String titular) {
        this.titular = titular;
        return this;
    }

    public double getSaldo() {
        return saldo; //o saldo da conta so pode ser alterados por meios de saques e deposito
    }
    // aqui começa deposito em conta
    public void deposito (double valor) { // aqui so mudar um valor futuramente
        saldo += valor;
    }
    // aqui é o saque da conta
    public void sacar (double valor) {
        saldo -= valor + 5.0;
    }
    @Override
    public String toString () { //concatenação das informaçoes
        return " Conta "
        + numeroConta
        + ", Titular: "
        + titular
        + ", Saldo: R$ "
        + String.format("%.2f", saldo);
    }
}







