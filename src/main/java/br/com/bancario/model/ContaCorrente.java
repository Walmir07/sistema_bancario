package br.com.bancario.model;

public class ContaCorrente extends ContaBancaria {

    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String titular, double saldo, double limiteChequeEspecial){
        super(numeroConta, saldo, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial(){
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double novoLimiteChequeEspecial){
        this.limiteChequeEspecial = novoLimiteChequeEspecial;
    }

    @Override
    public void sacar(double valorSaque) {
    if (valorSaque > 0 && valorSaque <= (this.saldo + this.limiteChequeEspecial)) {
        this.saldo -= valorSaque;
        System.out.println("Saque de R$" + valorSaque + " realizado da conta corrente.");
        System.out.println("Novo saldo: R$" + this.saldo);
    } else {
        System.out.println("Limite de saque excedido. Operação não realizada.");
    }
}

}
