package aplication;
import java.util.Scanner;
import entities.Conta;


public class contaBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;
        
        System.out.println("Nome do  titular da conta: ");
        String nome = sc.nextLine();
        System.out.println("Número da conta: ");
        int contaNumero = sc.nextInt();
        System.out.print("Há um valor inicial para deposito? ");
        char resposta = sc.next().charAt(0);
        if(resposta == 's'){
            System.out.print("digite o valor do deposito inicial");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(nome, depositoInicial, contaNumero);

        }

        else{
            conta = new Conta(nome, contaNumero);
        }
         

                
        System.out.println();
        System.out.print(conta);
        System.out.println();

        System.out.println(" \nQual operação gostaria de realizar:\n   1 - Deposito\n   2 - Saque ");
        int escolha =  sc.nextInt();
        if(escolha == 1){
        System.out.println("Digite o valor : ");
        double valor = sc.nextDouble();    
        conta.deposito(valor);
        System.out.println("Dados atualizados: " + conta);
            
        }
        else{
            System.out.println("Valor do saque: ");
            double valor = sc.nextDouble();
            conta.sacar(valor);
            System.out.println("Dados atualizados: " + conta);

        }

        


        




        sc.close();

    }
}
