package br.com.bancario.app;

import br.com.bancario.model.ContaCorrente;
import br.com.bancario.model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("15638-X", "Pedro Fernandes", 500, 150);

        System.out.println("\n----- Dados da conta corrente -----\n");

        System.out.println("Número da conta: " + contaCorrente.getNumeroConta());
        System.out.println("Nome do titular: " + contaCorrente.getTitular());
        System.out.println("Saldo inicial: " + contaCorrente.getSaldo());

        System.out.println("\n----- Operações da conta corrente -----\n");

        contaCorrente.depositar(200);
        System.out.println("Saldo após o deposito: " + contaCorrente.getSaldo());
        contaCorrente.sacar(710);
        System.out.println("Saldo após o saque: " + contaCorrente.getSaldo());

        System.out.println("\n----------------------------------\n");

        ContaPoupanca contaPoupanca = new ContaPoupanca("25893-X", "Fernanda da Silva", 700, 5);

        System.out.println("----- Dados da conta popança -----\n");

        System.out.println("Número da conta: " + contaPoupanca.getNumeroConta());
        System.out.println("Nome do titular: " + contaPoupanca.getTitular());
        System.out.println("Saldo inicial: " + contaPoupanca.getSaldo());

        System.out.println("\n----- Operações da conta poupança -----\n");

        contaPoupanca.depositar(200);
        System.out.println("Saldo após o deposito: " + contaPoupanca.getSaldo());
        contaPoupanca.sacar(710);
        System.out.println("Saldo após o saque: " + contaPoupanca.getSaldo());

    }
}