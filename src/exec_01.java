// verificar se os n�meros foram digitados na ordem crescente ou decrescente
// se for n�meros iguais, sai do programa

import java.util.Scanner;

public class exec_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		while (x != y) {
			if (x < y) {
				System.out.println("Crescente");
			} else {
				System.out.println("Decrescente");
			}

			x = sc.nextInt();
			y = sc.nextInt();
		}

		sc.close();

	}

}

// exemplos
// Entrada: 5 4 | Sa�da: Decrescente
// Entrada: 7 2 | Sa�da: Decrescente
// Entrada: 3 8 | Sa�da: Crescente
// Entrada: 2 2 | Sa�da: 