package psoft;

public class Lote {
	
	private String id;
	private Produto produto;
	private int quantidade;
	
	public Lote(String id, Produto produto, int quantidade) {
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return (this.produto.toString() + " " + String.valueOf(this.quantidade));
	}
	
	public boolean isValido() {
		boolean retorno = false;
		if (this.quantidade != 0) {
			retorno = true;
		}
		
		return retorno;
	}
}
