package introducao.avaliacao1;

public class ItemDeConstrucao {
	private int quantidade;
	/*
	 * Ligando a setinha saindo de Item de construcao para
	 * Material de Cosntrutor - * para 1 (produto)
	 * 
	 */
	private MaterialDeConstrucao produto;
	

	public MaterialDeConstrucao getProduto() {
		return produto;
	}

	public void setProduto(MaterialDeConstrucao produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
