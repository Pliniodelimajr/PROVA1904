package prova2;

public enum Bonificacao {

	GERENTE (0.3),
	DIRETOR (0.4);
	
	protected double valor;

	private Bonificacao(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}


	
}
