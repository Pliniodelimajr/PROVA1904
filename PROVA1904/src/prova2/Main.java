package prova2;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Motorista motorista = new Motorista("Plínio", "06565227551", LocalDate.of(1997, 06, 06), Genero.MASCULINO, 2500, LocalDate.of(2023, 06, 01), "1496161556");
		
		Gerente gerente = new Gerente("Lucas", "46480480597", LocalDate.of(1997, 03, 24), Genero.FEMININO, 3000, LocalDate.of(2021, 05, 01));
		
		Diretor diretor = new Diretor("Lays", "05040415658", LocalDate.of(1995, 02, 01), Genero.FEMININO, 2000, LocalDate.of(2022, 04, 04));
		
		
		System.out.println(diretor);
		System.out.println(gerente);
		System.out.println(motorista);
	}

}
