package br.univeritas.aula;

public class Professor extends Pessoa implements Estudante {

	// M�todo construtor
	public Professor(String nome, int idade) {
		super(nome, idade);

	}

	// M�todo implementar
	@Override
	public void estudar() {
		System.out.println("Estudando para a Aula");
	}

}
