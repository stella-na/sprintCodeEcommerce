package br.com.spring.code.ecommerce.gestaoprodutos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioProdutos {

	// Atributos
	List<Produto> listaDeProdutos;

	// Construtor
	public RepositorioProdutos() {
		// TODO Auto-generated constructor stub
		
		listaDeProdutos = new ArrayList<Produto>();
	}

	// Métodos

	// Percorre e imprime os elementos
	public void exibirTodosProdutos() {
		for (int i = 0; i < listaDeProdutos.size(); i++) {
			System.out.println(listaDeProdutos.get(i));
		}
	}

	// Procurar
	public Produto procurarProduto(Integer idProcurado) {
		
		if (idProcurado != null && !listaDeProdutos.isEmpty()) {
		
			Produto produtoProcurado = new Produto();
			
			for (int i = 0; i < listaDeProdutos.size(); i++) {
				// Se `idProcurado` = id de cada elemento da lista:
				if (listaDeProdutos.get(i).getId().equals(idProcurado)) {
					produtoProcurado = listaDeProdutos.get(i);
				}
			}
			
			return produtoProcurado;
		
		} 
		
		// ou retorne NULL
		return null;
	}
	
	// Exibir um produto especifico
	public void exibir(Integer id) {
		Produto produtoProcurado = procurarProduto(id);
		
		if (produtoProcurado != null) {
			System.out.println(produtoProcurado.toString());
			
			return;
		}
		
		System.out.println("Produto com esse ID não encontrado.");
	}
	

	// Adicionar elementos a lista:
	public void adicionar(Produto produto) {
		listaDeProdutos.add(produto);
	}

	// Remover elementos pelo ID:
	public void remover(Integer idParaRemover) {
		
		Produto procurado = procurarProduto(idParaRemover);
		
		if (procurado != null) {

			listaDeProdutos.remove(procurado);
			System.out.println("Produto removido com sucesso.");
			return;
		}
		
		System.out.println("Produto com esse ID não encontrado.");
		
	}
	
	// Atualizar a quantidade de produtos registrados
	public void atualizarQuantidade(Produto produto, Integer quantidade) {	
		
		if (produto != null) {
			
			Produto produtoParaAtualizar 
				= procurarProduto(produto.getId());
			
			if (produtoParaAtualizar != null) {
				produtoParaAtualizar.setQuantidade(quantidade);
			}
			
		}
		
	}
	
}
