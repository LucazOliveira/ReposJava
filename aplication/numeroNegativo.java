package aplication;
import java.util.Scanner;
public class numeroNegativo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de elementos do vetor: ");
        int n =sc.nextInt();
        if(n>10){
            System.out.println("O numero máximo de elementos deve ser 10");
        }
        else{
        int [] vetor = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("digite o numero: ");
            vetor[i] = sc.nextInt();
            }

            System.out.println("Os numeros negativos são: ");
            for(int i=0; i<n; i++){
                if(vetor[i]<0){
                    System.out.println(vetor[i]);
                }
            }
        
        
        }

            sc.close();
        }


        
        
        
        
        
        

    }

   