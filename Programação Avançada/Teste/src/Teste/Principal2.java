package Teste;

import java.util.Scanner;

public class Principal2 {
	public static void main(String[] args) {
		// vari�veis
		int num[] = new int[4];
		Scanner in = new Scanner(System.in);
		// l�
		for (int i = 0; i <= 4; i++) {
			System.out.println("Digite um n�mero");
			num[i] = in.nextInt();
		}

		try {
			comando(s);
		} catch (FileNotFoundException f) {
			comando(s);
		} catch (Exception e) {
			comando(s);
		}

		// imprime
		// for(auxiliar: lista)
		for (int aux : num) {
			System.out.println(aux * aux);
		}
		in.close();
	}

}