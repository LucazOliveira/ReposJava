package entities;
import java.util.Scanner;

public class Stockcontrol{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto novoproduto = new Produto();
        System.out.print("Entrada de dados");
        System.out.print("Nome: ");
        novoproduto.nome =sc.nextLine();
        System.out.print("Preço: ");
        novoproduto.preco =sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        novoproduto.quantidadeemestoque = sc.nextInt();
    


        
        
        
        
        sc.close();

    }
}