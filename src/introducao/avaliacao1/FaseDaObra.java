package introducao.avaliacao1;

import java.util.ArrayList;

public class FaseDaObra {
	private String nome;
	/*
	 * Setinha saindo da Fase de obra e Indo para respectivos locais
	 * - ItemDeConstrucao 1 para *
	 * - Construtor 1 para *
	 * - Engenheiro * para 1
	 */
	private ArrayList<ItemDeConstrucao> listaItens = new ArrayList<ItemDeConstrucao>();
	private ArrayList<Construtor> listaConstrutores =  new ArrayList<Construtor>();
	private Engenheiro encarregado;
	
	public Engenheiro getEncarregado() {
		return encarregado;
	}


	public void setEncarregado(Engenheiro encarregado) {
		this.encarregado = encarregado;
	}


	
	public ArrayList<ItemDeConstrucao> getListaItens() {
		return listaItens;
	}


	public void setListaItens(ArrayList<ItemDeConstrucao> listaItens) {
		this.listaItens = listaItens;
	}


	public ArrayList<Construtor> getListaConstrutores() {
		return listaConstrutores;
	}


	public void setListaConstrutores(ArrayList<Construtor> listaConstrutores) {
		this.listaConstrutores = listaConstrutores;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Float calcularValorDaFaseDaIbra() {
		// Variaveis
		float valorPrevio = 0;
		float valorPrevioConstrutor = 0;
		float valorPrevioEncarregado = 0;
		float valorTotal = 0;
		// Bloco de codigo que realiza o calculo dos itens
		for (int i = 0; i < listaItens.size(); i++) {
			valorPrevio = valorPrevio + (listaItens.get(i).getProduto().getPreco() * listaItens.get(i).getQuantidade());
		}
		// Bloco de docidog que realiza o calculo dos consttrutores envolvidos
		for (int i = 0; i < listaConstrutores.size(); i++) {
			if (listaConstrutores.get(i).isTerceirizado()) {
				
			} else {
				valorPrevioConstrutor = valorPrevioConstrutor + (listaConstrutores.get(i).getSalario());				
			}
		}
		// Bloco do codigo que calcula o salario do encarregado ao total.
		valorPrevioEncarregado = valorPrevioEncarregado + encarregado.getSalario();
		
		// Bloco de codigo que soma tudo.
		valorTotal = valorPrevio + valorPrevioConstrutor + valorPrevioEncarregado;
		
		return valorTotal;
	}
}
