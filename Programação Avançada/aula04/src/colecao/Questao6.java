package colecao;

import java.util.ArrayList;

public class Questao6 {

	public static void main(String[] args) {
		// Utilizar um ArrayList e inserir nele os n�meros pares 0 a 100.

		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for (int i = 0; i <= 100; i++){
			if (i % 2 == 0) {
				lista.add(i);
			}
			}

			// imprima
			System.out.println("N�meros pares");
			for (Integer aux : lista) {
				System.out.println(aux);
			}
		}

	}


