package entities;

public class Conta {
    
    private String nome;
    private double saldo;
    private int contaNumero;
    
    


    public Conta(String nome, double depositoInicial, int contaNumero) {
        this.nome = nome;
        deposito(depositoInicial);
        this.contaNumero = contaNumero;


    }


    


    public Conta(String nome, int contaNumero) {
        this.nome = nome;
        this.contaNumero = contaNumero;
    }





    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    
    public double  getContaNumero() {
        return contaNumero;
    }

  
    public void sacar(double valor){
        this.saldo -= valor + 5;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }


    public String toString() {
        return "Conta{" +
                "nome ='" + nome + '\'' +
                ", saldo =" + saldo +
                ", contaNumero =" + contaNumero +
                '}';
    }
    


}
