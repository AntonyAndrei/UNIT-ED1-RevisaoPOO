package subclasses;

import Entities.Item;
import Enums.Generos;

public class Filme extends Item{

	private String nomeDoProdutor;
	private int duracao;
	private Generos genero;
	
	public Filme() {
		
	}

	public Filme(String titulo, int anoLancamento, String comentario, String nomeDoProdutor, int duracao,
			Generos genero) {
		super(titulo, anoLancamento, comentario);
		this.nomeDoProdutor = nomeDoProdutor;
		this.duracao = duracao;
		this.genero = genero;
	}

	public String getNomeDoProdutor() {
		return nomeDoProdutor;
	}

	public void setNomeDoProdutor(String nomeDoProdutor) {
		this.nomeDoProdutor = nomeDoProdutor;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}

	public void ListaInformacoes() {
		System.out.println(
				"Titulo: " + super.getTitulo() + "\n" +
				"Ano de Lançamento: " + super.getAnoLancamento() + "\n" +
				"Comentario: " + super.getComentario() + "\n" +
				"Produtor: " + this.nomeDoProdutor  + "\n" +
				"Duração (min): " + this.duracao  + "\n" +
				"Genero: " + this.genero);
	}
	
	
}
