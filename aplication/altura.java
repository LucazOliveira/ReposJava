package aplication;
import java.util.Scanner;
public abstract class altura {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de pessoas a serem consideradas: ");
        int n  = sc.nextInt();
        String [] nome = new String[n];
        int [] idade = new int[n];
        double [] altura = new double[n];
        for(int i=0;i<=n; i++){
            System.out.println("Dados da " +(i+1) + " pessoa:");
                System.out.print("Nome: ");
                nome[i] = sc.next();
                System.out.print("Idade: ");
                idade[i] = sc.nextInt();
            System.out.print("altura: ");
                altura[i] = sc.nextDouble();

            }

           sc.close(); 
        
            }




        
            


        

    }

