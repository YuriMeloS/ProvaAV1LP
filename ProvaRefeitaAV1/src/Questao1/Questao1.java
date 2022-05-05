package Questao1;
import java.util.Scanner;


public class Questao1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String [] cor = new String[10];
        String chave;
        int contAzul=0,contVermelha=0,contVerde=0;
        
        for (int i=0;i< cor.length;i++){
            System.out.println("Escreva a cor da chave: ");
            chave= ler.nextLine();
            chave=chave.toUpperCase();
            cor[i]=chave;
            if(chave.equals("AZUL")){
                contAzul+=1;
                System.out.println("ir para a porta Azul");

            } else if (chave.equals("VERMELHA")||chave.equals("VERMELHO")) {
                contVermelha+=1;
                System.out.println("ir para a porta Vermelha");

            } else if (chave.equals("VERDE")) {
                contVerde+=1;
                System.out.println("ir para a porta Verde");

            }else{
                System.out.println("Procure novamente");
            }
        }
        System.out.println("Quantidade de pessoas com a chave azul: "+contAzul);
        System.out.println("Quantidade de pessoas com a chave vermelha: "+contVermelha);
        System.out.println("Quantidade de pessoas com a chave verde: "+contVerde);
			
		}
		
	}