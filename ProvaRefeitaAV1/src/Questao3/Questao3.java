package Questao3;
import java.util.Scanner;


public class Questao3 {

	public static void main(String[] args) {
		String frase, referencia = "aeiouAEIOU", referenciaFrase=".!?";
        Scanner ler = new Scanner(System.in);
		int vogal = 0, consoante = 0, numFrase = 0, opcao;
		
		System.out.println("Insira uma frase");
		frase = ler.nextLine();
		
		String[] palavras = frase.split("\\s+");
		
        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') || (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z')) {
                if (referencia.indexOf(frase.charAt(i)) != -1) {
                    vogal++;
                }
                else
                    consoante++;
            }
            if ((frase.charAt(i) == '!') || (frase.charAt(i) == '.')|| (frase.charAt(i) == '?'))
                numFrase++;
        }
		
		
		do {
		System.out.println("(1) Número de Frase\n(2) Número de Palavras\n(3) Número de Vogais\n(4) Número de Consoantes\n(5) Sair");
		opcao = ler.nextInt();
			switch (opcao) {
				case 1:
					System.out.println(numFrase);
					break;
				case 2:
					System.out.println(palavras.length);
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

