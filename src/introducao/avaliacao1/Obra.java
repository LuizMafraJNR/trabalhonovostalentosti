package introducao.avaliacao1;

import java.util.ArrayList;

public class Obra {
	
	private ArrayList<FaseDaObra> listaFases = new ArrayList<FaseDaObra>();

	public String listarDadosDaObra() {
		StringBuilder montadorStringBuilder = new StringBuilder();
		for (int i = 0; i < listaFases.size(); i++) {
			// Nome da fase da obra
			montadorStringBuilder.append("\nNome da fase da obra " +(i+1)+" : ");
			montadorStringBuilder.append(listaFases.get(i).getNome());
			// Valor da fase da obra
			montadorStringBuilder.append("\nValor da fase da obra " +(i+1)+" : ");
			// Dados engenheiro
			montadorStringBuilder.append(listaFases.get(i).calcularValorDaFaseDaIbra());
			montadorStringBuilder.append("\nNome do engenheiro da obra: ");
			montadorStringBuilder.append(listaFases.get(i).getEncarregado().getNome());
			montadorStringBuilder.append("\nFormacao do engenheiro da obra: ");
			montadorStringBuilder.append(listaFases.get(i).getEncarregado().getFormacao());
			montadorStringBuilder.append("\nNumero do engenheiro da obra: ");
			montadorStringBuilder.append(listaFases.get(i).getEncarregado().getNumero());
			montadorStringBuilder.append("\nSalario do engenheiro da obra: ");
			montadorStringBuilder.append(listaFases.get(i).getEncarregado().getSalario());
			// Dados Construtor
			if(listaFases.get(i).getListaConstrutores().size() > 1) {
				for (int j = 0; j < listaFases.get(i).getListaConstrutores().size(); j++) {
					montadorStringBuilder.append("\nNome do Construtor "+(i+1)+" : ");
					montadorStringBuilder.append(listaFases.get(j).getListaConstrutores().get(j).getNome());
					montadorStringBuilder.append("\nNumero do Construtor "+(j+1)+" : ");
					montadorStringBuilder.append(listaFases.get(j).getListaConstrutores().get(j).getNumero());
					montadorStringBuilder.append("\nSalario do Construtor "+(j+1)+" : ");
					montadorStringBuilder.append(listaFases.get(j).getListaConstrutores().get(j).getSalario());
					montadorStringBuilder.append("\nConstrutor terceirizado? ");
					if(listaFases.get(j).getListaConstrutores().get(j).isTerceirizado()) {
						montadorStringBuilder.append("Sim");
					} else {
						montadorStringBuilder.append("Não");
					}
				}
			} else {
				montadorStringBuilder.append("\nNome do Construtor "+(i+1)+" : ");
				montadorStringBuilder.append(listaFases.get(i).getListaConstrutores().get(i).getNome());
				montadorStringBuilder.append("\nNumero do Construtor "+(i+1)+" : ");
				montadorStringBuilder.append(listaFases.get(i).getListaConstrutores().get(i).getNumero());
				montadorStringBuilder.append("\nSalario do Construtor "+(i+1)+" : ");
				montadorStringBuilder.append(listaFases.get(i).getListaConstrutores().get(i).getSalario());
				montadorStringBuilder.append("\nConstrutor terceirizado? ");
				if(listaFases.get(i).getListaConstrutores().get(i).isTerceirizado()) {
					montadorStringBuilder.append("Sim");
				} else {
					montadorStringBuilder.append("Não");
				}
			}
			
			// Lista de Itens
			montadorStringBuilder.append("\n");
			montadorStringBuilder.append("\nLista de itens: ");
			for (int j = 0; j < listaFases.get(i).getListaItens().size(); j++) {
				montadorStringBuilder.append("\n"+(j+1)+" - "+"Nome do produto: " );
				montadorStringBuilder.append(listaFases.get(i).getListaItens().get(j).getProduto().getNome());
				montadorStringBuilder.append("\n"+(j+1)+" - "+"Preco do produto: " );
				montadorStringBuilder.append(listaFases.get(i).getListaItens().get(j).getProduto().getPreco());
				montadorStringBuilder.append("\n"+(j+1)+" - "+"Quantidade do produto: " );
				montadorStringBuilder.append(listaFases.get(i).getListaItens().get(j).getQuantidade());
			}
			montadorStringBuilder.append("\n\n");
			
		}
		
		return montadorStringBuilder.toString();
		
	}
	// Bloco de codigo que calcula o valor total
	public Float calcularValorTotalDaObra() {
		float valorTotalDaObra = 0;
		for (int i = 0; i < listaFases.size(); i++) {
			valorTotalDaObra = valorTotalDaObra + listaFases.get(i).calcularValorDaFaseDaIbra();
			}
		
		return valorTotalDaObra;
		}

	public ArrayList<FaseDaObra> getListaFases() {
		return listaFases;
	}

	public void setListaFases(ArrayList<FaseDaObra> listaFases) {
		this.listaFases = listaFases;
	}
	
	
}
