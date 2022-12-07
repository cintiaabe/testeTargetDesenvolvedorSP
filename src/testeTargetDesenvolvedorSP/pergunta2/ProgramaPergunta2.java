package testeTargetDesenvolvedorSP.pergunta2;

import java.util.Scanner;

public class ProgramaPergunta2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe um número:");
		int num = sc.nextInt();
		int num1=0;
		int num2=1;
		int soma=0;
		boolean fibonacci=false;
		
		for (int i=0;i<=48;i++) {
			soma = num1 + num2;
			num1 = num2;
			num2 = soma;
			if (soma==num) {
				fibonacci = true;
				break;
			} else if (soma > num) {
				break;
			}
		}
		
		if (fibonacci) {
			System.out.println("Pertence a sequencia Fibonacci");
		} else {
			System.out.println("Não pertende a sequencia Fibonacci");
		}
	}
}
