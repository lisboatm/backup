package br.univeritas.aula;

public class Aluno extends Pessoa implements Estudante {

	// M�todo construtor
	public Aluno(String nome, int idade) {
		super(nome, idade);

	}

	// M�todo implementar
	@Override
	public void estudar() {
		System.out.println("Estudando para a Prova");
	}

}
