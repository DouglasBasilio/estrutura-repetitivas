// ler uma idade, calcular a média, mas não calcular a idade com valor negativo
// se entrar um valor negativo na primeira vez, mostrar 'impossivel calcular'

import java.util.Scanner;

public class exec_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int soma = 0;
		int cont = 0;

		while (idade >= 0) {
			soma += idade;
			cont++;
			idade = sc.nextInt();
		}

		if (cont > 0) {
			double media = (double) soma / cont;
			System.out.printf("%.2f%n", media);
		} else {
			System.out.println("Impossivel calcular");
		}

		sc.close();

	}

}

// Exemplos
// entrada: 31 27 46 -5 | saida: 34.67
// entrada: -10 | saida: impossivel calcular
