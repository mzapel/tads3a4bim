package br.univel.jms;

import java.io.Serializable;

public class Aluno implements Serializable {

	private Long matricula;
	private String nome;
	
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
