package Entities;

public abstract class Item {

	private String titulo;
	private int anoLancamento;
	private String comentario;
	
	public Item() {
		
	}
	
	public Item(String titulo, int anoLancamento, String comentario) {
		this.titulo = titulo;
		this.anoLancamento = anoLancamento;
		this.comentario = comentario;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
	public abstract void ListaInformacoes();
	
}
