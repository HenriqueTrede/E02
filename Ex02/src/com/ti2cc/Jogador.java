package com.ti2cc;


public class Jogador {
	private int id;
	private String nome;
	private String time;
	private char sexo;
	
	public Jogador() {
		this.id = -1;
		this.nome = "";
		this.time = "";
		this.sexo = '*';
	}
	
	public Jogador(int id, String nome, String time, char sexo) {
		this.id = id;
		this.nome = nome;
		this.time = time;
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Jogador [id=" + id + ", nome=" + nome + ", time=" + time + ", sexo=" + sexo + "]";
	}
	
}
