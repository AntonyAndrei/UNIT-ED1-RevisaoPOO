package Application;

import Entities.Locadora;
import Enums.Generos;
import subclasses.Disco;
import subclasses.Filme;

public class Main {

	public static void main(String[] args) {

		Disco disco = new Disco("Meteora", 2002, "Segundo CD da Banda", "Linkin Park", 20);
		Disco disco2 = new Disco("hybryd Teora", 1998, "Primeiro CD da banda", "Linkin Park", 15);
		
		
		Filme filme = new Filme("Transformers", 2009, "Meu filme preferido", "Michael Bay", 120, Generos.valueOf("acao"));
		Filme filme2 = new Filme("Sword Art Online", 2012, "Meu anime preferido", "Reki Kawahara", 90, Generos.valueOf("animacao"));
		
		System.out.println();
		
		Locadora locadora = new Locadora();
		
		locadora.novoDisco(disco);
		locadora.novoDisco(disco2);
		
		locadora.novoFilme(filme);
		locadora.novoFilme(filme2);
		
		locadora.listarDiscos();
		locadora.listarFilmes();
		
	}

}
