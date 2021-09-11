/*Teclas de Atalhos:
Sysout+Ctrl+Espa�o � Vira System.out.println()
Ctrl+Shift+O � Importa bibliotecas
Ctrl+Shift+F � Indenta o c�digo*/

package com.univeritas.exemplo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int n1, n2; //O int � um tipo primitivo (iguais do C), n�o � um objeto. Tipo
		 * de refer�ncia Integer. n1 = 10; n2 = 20; Integer n3 = new Integer (30); n3.
		 */

		Pessoa p1 = new Pessoa("Thiago", 33);
		Pessoa p2 = new Pessoa("Taiane", 30);
		p1.setIdade(10);
		System.out.println(p1);

		Aluno a1 = new Aluno("Taiane", 30);
		System.out.println(a1);

		Pessoa a2 = new Aluno("Taiane", 30); // O que vale � o new
		a2.avaliar();

		if (a1.nome == a2.nome) {
			System.out.println("Iguais");
		}

		//== compara tipos primitivos e objetos (compara se � o mesmo objeto na mem�ria)
		if (a1 == a2) {
			System.out.println("Iguais");
		}

		String str = new String("M");
		String str2 = new String("M");
		
		//Equals compara Strings
		if (str.equals(str2)) {
			System.out.println("Stringers iguais");
		}

		/*
		 * System.out.println("Digite um nome: "); // System.out - Joga no console
		 * Scanner in = new Scanner(System.in); //Scanner in - L� do console (Essa lina
		 * est� dizendo que voc� recebeu um param�tro do teclado) String str =
		 * in.nextLine();//Leia uma linha do teclado e armazene no str
		 * System.out.println(str); String[] lista = str.split(" ");
		 * System.out.println(lista[1]+","+lista[0]);
		 */

	}

}
