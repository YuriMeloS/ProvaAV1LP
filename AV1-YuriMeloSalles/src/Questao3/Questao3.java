package Questao3;
import java.util.Scanner;


public class Questao3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char c, i, p, e, j;
		String frase;
		int vogal = 0, palavra = 0 , consoante = 0, numFrase = 0, opcao;
		
		
		System.out.println("Insira uma frase");
		frase = ler.nextLine();
		
		frase = frase.toLowerCase();
		
		for(i=0;i<frase.length(); i++) {
			c = frase.charAt(i);
			p = frase.charAt(i);
			e = frase.charAt(i);
			if(c == 97 | c ==101 | c == 105 | c == 111 | c == 117) {
				vogal++;
			}else if( p == 35 | p == 46 | p == 63) {
				numFrase++;
			}else if(e == 32) {
				palavra++;
			}
			else {
				consoante++;
			}
			
		}
		do {
		System.out.println("(1) Número de Frase\n(2) Número de Palavras\n(3) Número de Vogais\n(4) Número de Consoantes\n(5) Sair");
		opcao = ler.nextInt();
			switch (opcao) {
				case 1:
					System.out.println(numFrase);
					break;
				case 2:
					System.out.println(palavra);
					break;
				case 3:
					System.out.println(vogal);
					break;
				case 4:
					System.out.println(consoante);
					break;
			
			}
		}while(opcao == 1 | opcao == 2 | opcao == 3  | opcao == 4);
		
		}
			
	}

