package prova2;

import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario{
	
	protected Bonificacao bonificacao;


	public CargoDeConfianca(String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase,
			LocalDate dataAdmissao, Bonificacao bonificacao) {
		super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao);
		this.bonificacao = bonificacao;
	}

	public Bonificacao getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Bonificacao bonificacao) {
		this.bonificacao = bonificacao;
	}
	
	

}
