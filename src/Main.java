import java.util.Scanner;

public class Main {
	// Método principal, onde a aplicação toda vai rodar
	public static void main(String[] args) {
		
		/*
		 * 
		 * Parte 1:
		 * Apresentação de métodos de leitura,
		 * exibição e declaração de variáveis
		 * 
		 * */
		
		////////////////////////////////////
		//								  //
	    // Métodos de exibição no console //
		//								  //
		////////////////////////////////////
		
		System.out.printf("Vamos testar\n");
		System.out.println("Qualquer coisa aqui!");
		System.out.println("Qualquer coisa " + "aqui!");
		
		int idade = 20;
		String nome = "Ana";
		boolean casada = false;
		double altura = 1.61;
		
		///////////////////////////////////////////////
		//											 //
		// Exibindo valores das variáveis no console //
		//											 //
		///////////////////////////////////////////////
		
		System.out.println(idade);
		System.out.println(nome);
		System.out.println("A idade de " + nome + " é " + idade);
		System.out.println(nome + idade);

		/*
		 * Parte 2:
		 * A ordem dos fatores ALTERA SIM o produto
		 * 
		 * */
		
		//////////////////////////////////////////////////////
		//													//
		//  Solicitação de um valor do teclado, leitura		//		
		//	e atribuição desse valor dentro de uma variável //
		//													//
		//////////////////////////////////////////////////////
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu nome!");
		nome = leitor.nextLine();
		
		/*
		 * Parte 3:
		 * Estrutura condicional (if/else/else if)
		 * */
		
		/*
		 * Exibe valores diferentes no console, de acordo
		 * com o valor da variável 'numero'
		 * 
		 * 1. Se for par, exibe: {numero} é par!
		 * 2. Senão, se for divisível por 3, exibe: {numero} não é par, mas é divisível por 3!
		 * 3. Senão (se não for nenhum desses casos: {numero} é ímpar!
		 * */
		
		int numero = 7;
		// Se o número for par
		if(numero % 2 == 0) {
			System.out.println(numero + " é par!");
		
		// Não é par, mas é divisível por 3
		} else if (numero % 3 == 0) {
			System.out.println(numero + " não é par, mas é divisível por 3!");
		// Não é nem par, nem múltiplo de 3
		} else {
			System.out.println(numero + " é ímpar!");
		}
		
	}
}
