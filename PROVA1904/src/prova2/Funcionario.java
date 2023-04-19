package prova2;

import java.time.LocalDate;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected LocalDate dataNascimento;
	protected Genero genero;
	protected double salarioBase;
	protected LocalDate dataAdmissao;
	
	public Funcionario(String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase,
			LocalDate dataAdmissao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.salarioBase = salarioBase;
		this.dataAdmissao = dataAdmissao;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public LocalDate getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public Genero getGenero() {
		return genero;
	}



	public void setGenero(Genero genero) {
		this.genero = genero;
	}



	public double getSalarioBase() {
		return salarioBase;
	}



	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}



	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}



	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}



	public abstract double getSalarioFinal();
	

}
