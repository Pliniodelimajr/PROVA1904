package prova2;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca{
	
	private final double PREMIO = 0.2;


	public Diretor(String nome, String cpf, LocalDate dataNascimento, Genero genero, double salarioBase,
			LocalDate dataAdmissao) {
		super(nome, cpf, dataNascimento, genero, salarioBase, dataAdmissao, Bonificacao.DIRETOR);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double getSalarioFinal() {
		
		double salarioFinal = salarioBase +((salarioBase * Bonificacao.DIRETOR.valor) + (salarioBase * PREMIO));
		
		return salarioFinal;
	}

	
	@Override
	public String toString() {
		
		return "DIRETOR\n" +
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

