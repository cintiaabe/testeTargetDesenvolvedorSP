package testeTargetDesenvolvedorSP.pergunta5;

import java.util.Scanner;

public class ProgramaPergunta5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		StringBuffer palavraInvertida = new StringBuffer();
		System.out.print("Entre com uma palavra:");
		String palavra = sc.nextLine();
		
		for (int i=palavra.length()-1; i>=0; i--) {
			palavraInvertida.append(palavra.substring(i,i+1));
		}
		System.out.println("Palavra invertida:" + palavraInvertida);
	}

}
