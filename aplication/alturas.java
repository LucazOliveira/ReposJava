package aplication;
import java.util.Locale;
import java.util.Scanner;

public class alturas{
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Locale.setDefault(Locale.US);

int n, menores;
double alturaTotal, alturaMedia, percentualMenores;

System.out.println("Quantas pessoas serão digitadas?");
n = sc.nextInt();

String[] nomes = new String[n];
int [] idades = new int[n];
double [] alturas =new double[n];

for(int i=0; i<n; i++){
    System.out.printf("Dados da: " + (i+1) +"a pessoa:");
    System.out.print("Nome: ");
    nomes[i] = sc.next();
    System.out.print("Idade: ");
    idades[i] = sc.nextInt();
    System.out.print("Altura: ");
    alturas[i] = sc.nextDouble();
}
    
    menores = 0;  
    alturaTotal = 0;

for(int i=0; i<n;i++){
    if(idades[i]<16){
        menores = menores + 1;
    }
    alturaTotal = alturaTotal + alturas[i];
    }
    
    
    alturaMedia = alturaTotal / n;
    percentualMenores = (menores/(double)n)*100.0; 

    System.out.printf("O percentual de menores de 16 anos é %.2f%%\n: " , percentualMenores);
    System.out.printf("A altura média das pessoas são %.2f\n", alturaMedia);

    sc.close();

}

}



    
    
    
    
    

    

