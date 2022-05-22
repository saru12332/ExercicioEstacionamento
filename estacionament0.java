package JavaProjectAvaliacao;

import java.util.Scanner;

public class estacionament0 {

	public static void main(String[] args) {
		
		// Comando para receber e guardar informacoes do usuario
		Scanner ler = new Scanner(System.in);
		// Variavel de inteiros para receber uma unidade
		int n1;
		// Dar ao usuario alternativas de escolhas e pedir que selecione digitando um numero
		System.out.printf("Digite se voce for: Idoso 1, Gestante, 2 e Cadeirante 3!\nCaso nao seja, digite qualquer outro numero: ");
		// Guardar o numero digitado pelo usuario na variavel
		n1 = ler.nextInt();
		
		// Comando de decisao para determinar se o valor for verdadeiro
		if (n1 >= 1 && n1 <= 3) {
			// Mostrar a frase referente a decisao correta
			System.out.print("Voce pode estacionar!");
		// Comando de decisao caso o valor for falso
		} else {
			// Mostrar a frase referente a decisao incorreta
			System.out.print("Voce nao pode estacionar!");

		}

	}
}
