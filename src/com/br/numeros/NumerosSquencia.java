package com.br.numeros;

import java.util.Scanner;

public class NumerosSquencia {
	public static void main(String[] args) {
		int inicio = 0;
		int termino = 0;
		String tipo = "";
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero para iniciarmos a sequencia.");
		inicio = scan.nextInt();

		System.out.println("Digite o ultimo numero");
		termino = scan.nextInt();

		if (inicio < termino) {
			for (int i = inicio; i <= termino; i++) {
				if (i < termino) {
					tipo += i + ",";
				} else {
					tipo += i;
				}

			}
		} else {

			for (int i = inicio; i >= termino; i--) {
				if (i > termino) {
					tipo += i + ",";
				} else {
					tipo += i;
				}

			}

		}
		System.out.println(tipo);
		
		scan.close();
	}

}
