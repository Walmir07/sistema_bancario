package br.com.bancario.model;

public class ContaBancaria {

    protected String numeroConta;
    protected String  titular;
    protected double saldo;

    public ContaBancaria(String numeroConta, double saldo, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }

    public void sacar(double valorSaque){
        if(saldo >= valorSaque){
            this.saldo -= valorSaque;
            System.out.println("saque de R$ " + valorSaque + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setNumeroConta(String novaConta){
        this.numeroConta = novaConta;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String novoTitular){
        this.numeroConta = novoTitular;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double novoSaldo){
        this.saldo = novoSaldo;
    }

}
