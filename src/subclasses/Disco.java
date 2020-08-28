package subclasses;

import Entities.Item;

public class Disco extends Item {

	private String nomeArtista;
	private int numeroDeFaixas;
	
	public Disco() {
		
	}

	public Disco(String titulo, int anoLancamento, String comentario, String nomeArtista, int numeroDeFaixas) {
		super(titulo, anoLancamento, comentario);
		this.nomeArtista = nomeArtista;
		this.numeroDeFaixas = numeroDeFaixas;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public int getNumeroDeFaixas() {
		return numeroDeFaixas;
	}

	public void setNumeroDeFaixas(int numeroDeFaixas) {
		this.numeroDeFaixas = numeroDeFaixas;
	}
	
	@Override
	public void ListaInformacoes() {
		System.out.println(
				"Titulo: " + super.getTitulo() + "\n" +
				"Ano de Lançamento: " + super.getAnoLancamento() + "\n" +
				"Comentario: " + super.getComentario() + "\n" +
				"Artista: " + this.nomeArtista + "\n" +
				"Quantidade de Faixas: " + this.numeroDeFaixas);
	}

	
}
