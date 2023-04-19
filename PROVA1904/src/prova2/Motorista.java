package prova2;

import java.time.LocalDate;

public class Motorista extends Funcionario{
	
	private String carteiraDeHabilitacao;



	public Motorista(String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase,
			LocalDate dataAdmissao, String carteiraDeHabilitacao) {
		super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao);
		this.carteiraDeHabilitacao = carteiraDeHabilitacao;
	}


	public String getCarteiraDeHabilitacao() {
		return carteiraDeHabilitacao;
	}


	public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
		this.carteiraDeHabilitacao = carteiraDeHabilitacao;
	}


	@Override
	public double getSalarioFinal() {
		return salarioBase;
	}
	
	@Override
	public String toString() {
		
		return "MOTORISTA" + 
				"\nNome: " + super.nome + 
				"\nCpf: " + super.cpf +
				"\nData de Nascimento: " + Util.formatarData(dataNascimento) +
				"\nGenêro: " + super.genero.texto +
				"\nSalário Base: " + Util.formatarBrl(salarioBase) +
				"\nData de Admissão: " + Util.formatarData(dataAdmissao) +
				"\nCarteira de Habilitação: " + this.carteiraDeHabilitacao +
				"\nSalário Final: " + Util.formatarBrl(getSalarioFinal()) +
				"\n\n";
	}



}
