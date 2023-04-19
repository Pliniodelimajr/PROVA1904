package prova2;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{

	public Gerente(String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase,
			LocalDate dataAdmissao) {
		super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao, Bonificacao.GERENTE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalarioFinal() {
		
		double salarioFinal = salarioBase +((salarioBase * Bonificacao.GERENTE.valor));
		
		return salarioFinal;
	}

	@Override
	public String toString() {
		
		return "GERENTE\n" +
			"\nNome: " + super.nome +
			"\nCpf: " + super.cpf + 
			"\nGenêro: " + super.genero.texto + 
			"\nData de Nascimento: " + Util.formatarData(dataNascimento) +
			"\nSalário Base: " + Util.formatarBrl(salarioBase) +
			"\nData de Admissão: " + Util.formatarData(dataAdmissao) + 
			"\nSalário Final: " + Util.formatarBrl(getSalarioFinal()) +
			"\n\n";
	}

}
