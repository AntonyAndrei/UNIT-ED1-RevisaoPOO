package Entities;

import subclasses.Disco;
import subclasses.Filme;

public class Locadora {
	
	private int indiceD;
	private int indiceF;
	
	private Disco[] listaDisco = new Disco[2];
	private Filme[] listaFilme = new Filme[2];
	
	public Locadora() {
		super();
		this.indiceD = 0;
		this.indiceF = 0;
	}
	
	
	
	public void novoDisco(Disco disco) {
		this.listaDisco[this.indiceD] = disco;
		this.indiceD++;
	}
	
	public void novoFilme(Filme filme) {
		this.listaFilme[this.indiceF] = filme;
		this.indiceF++;
		
	}
	
	public void listarDiscos() {
		for (int i = 0; i < listaDisco.length; i++) {
			System.out.println("informações do Disco #" + (i + 1));
			System.out.println("---------------------------------");
			this.listaDisco[i].ListaInformacoes();
			System.out.println("--------------------------------- \n");
		}

	}

	public void listarFilmes() {
		for (int i = 0; i < listaFilme.length; i++) {
			System.out.println("informações do Filme #" + (i + 1));
			System.out.println("---------------------------------");
			this.listaFilme[i].ListaInformacoes();
			System.out.println("--------------------------------- \n");
		}

	}
	
	
}
