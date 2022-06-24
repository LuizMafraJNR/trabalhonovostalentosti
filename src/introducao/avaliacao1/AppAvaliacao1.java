package introducao.avaliacao1;

public class AppAvaliacao1 {

	public static void main(String[] args) {
		/**
		 * Criação da Obra
		 */
		// Criando a obra 1.
		Obra obra1 = new Obra();
		
		/** 
		 * FASE 1
		 */
		
		// Criando fase 1 da obra.
		FaseDaObra fase1 = new FaseDaObra();
		fase1.setNome("Fundação");
		obra1.getListaFases().add(fase1); // Adicionando a fase1 da obra para a obra1.
		
		// Criando eng2 da fase da obra 1
		Engenheiro eng2 = new Engenheiro();
		eng2.setFormacao("Engenheiro Civil");
		eng2.setNome("Emmet Brown");
		eng2.setNumero(4321);
		eng2.setSalario(15000);
		// Setando o eng2 como encarregado da fase1
		fase1.setEncarregado(eng2);
		
		// Criando o cons1 da fase de obra 1
		Construtor cons1 = new Construtor();
		cons1.setNome("Zezinho");
		cons1.setNumero(3333);
		cons1.setSalario(3000);
		cons1.setTerceirizado(false);
		// Adicionando o cons1 da fase de obra 1
		fase1.getListaConstrutores().add(cons1);
		
		// Criando o material 3 da fase de obras 1
		MaterialDeConstrucao mat3 = new MaterialDeConstrucao();
		mat3.setNome("Vergalhão de aço");
		mat3.setPreco(50);

		// Criando material 2 da construção que vai nas fases 1 e 2
		MaterialDeConstrucao mat2 = new MaterialDeConstrucao();
		mat2.setNome("Saco de cimento");
		mat2.setPreco(80);
		
		// Criando item3 da construção a fase de obras 1		
		ItemDeConstrucao item3 = new ItemDeConstrucao();
		item3.setQuantidade(900);
		// Setando item3 da fase de obras 1 com o mat 2
		item3.setProduto(mat2);
		// Adicionando o item3 a lista de itens da fase de obras 1
		fase1.getListaItens().add(item3);
		
		// Criando item 4 da construção a fase de obras 1
		ItemDeConstrucao item4 = new ItemDeConstrucao();
		item4.setQuantidade(1000);
		// Setando item4 da fase de obras 1 com o mat 3
		item4.setProduto(mat3);
		// Adicionando o item4 a lista de itens da fase de obras 1
		fase1.getListaItens().add(item4);
		
		
		/**
		 * FASE 2
		 */
		
		
		// Criando fase 2 da obra.
		FaseDaObra fase2 = new FaseDaObra();
		fase2.setNome("PrimeiroAndar");
		obra1.getListaFases().add(fase2); // Adicionando a fase2 da obra para a obra1.
		
		// Criando eng1 da fase de obra 2
		Engenheiro eng1 = new Engenheiro();
		eng1.setFormacao("Egenheiro Civil");
		eng1.setNome("Rich Sanchez");
		eng1.setNumero(1234);
		eng1.setSalario(10000);
		// Setando o eng1 como encarregado da fase2
		fase2.setEncarregado(eng1);
		
		// Setando o cons1 como um dos construtores da fase2 e criando cons1 da fase da obra 2
		fase2.getListaConstrutores().add(cons1 = new Construtor());
		cons1.setTerceirizado(false);
		cons1.setNome("Huguinho");
		cons1.setNumero(1111);
		cons1.setSalario(3000);
		
		// Criando cons2
		Construtor cons2 = new Construtor();
		cons2.setTerceirizado(true);
		cons2.setNome("Luizinho");
		cons2.setNumero(4321);
		cons2.setSalario(2500);
		// Setando o cons 2 como um dos construtores da fase2
		fase2.getListaConstrutores().add(cons2);
		
		// Adicionando Material da construção fase2
		MaterialDeConstrucao mat1 = new MaterialDeConstrucao();
		mat1.setNome("Viga de madeira");
		mat1.setPreco(20);
		
		// Criando item1 da construção da fase2
		ItemDeConstrucao item1 = new ItemDeConstrucao();
		item1.setQuantidade(500);
		// Setando item1 em relação ao mat1
		item1.setProduto(mat1);
		// Setando a [1] da lista de itens com o ITEM1
		fase2.getListaItens().add(item1);
		
		// Criando item2 da construção da fase2
		ItemDeConstrucao item2 = new ItemDeConstrucao();
		item2.setQuantidade(800);
		// Setando item2 em relação ao mat2
		item2.setProduto(mat2);
		// Setando a [2] da lista de itens com o ITEM2
		fase2.getListaItens().add(item2);
		
		
		
		System.out.println(obra1.listarDadosDaObra());
		
		float valortotaldaobra = 0;
		valortotaldaobra = obra1.calcularValorTotalDaObra();
		System.out.println("Valor total da obra é de RS "+ valortotaldaobra+ " reais");
		
		
	}

}
