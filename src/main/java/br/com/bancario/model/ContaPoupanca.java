package br.com.bancario.model;

public class ContaPoupanca extends ContaBancaria {
    
    private double taxa;

    public ContaPoupanca(String numeroConta, String titular, double saldo, double taxa){
        super(numeroConta, saldo, titular);
        this.taxa = taxa;
    }

    public void renderJuros(){
        double juros = saldo * this.taxa;
        saldo += juros;
        System.out.println("Juros de R$" + juros + " adicionados. Novo saldo: R$" + saldo);
    }

    @Override
    public void sacar(double valorSaque){
        if (valorSaque > 0 && valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("Saque de R$" + valorSaque + " realizado da Conta Poupança. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente na Conta Poupança.");
        }
    }

}
