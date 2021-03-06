package br.com.spring.code.ecommerce.gestaopessoas;

import java.util.ArrayList;
import java.util.List;

public class RepositorioPessoas {

	List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();

	public RepositorioPessoas(List<Pessoa> listaDePessoas) {
		this.listaDePessoas = listaDePessoas;
	}

	public void exibirTodasPessoas() {

		for (int i = 0; i < listaDePessoas.size(); i++) {

			System.out.println(listaDePessoas.get(i));

		}

	}

	public Pessoa procurarPessoa(Integer idProcurado) {

		if (idProcurado != null && !listaDePessoas.isEmpty()) {

			Pessoa pessoaProcurada = new Pessoa();

			for (int i = 0; i < listaDePessoas.size(); i++) {

				if (listaDePessoas.get(i).getId().equals(idProcurado)) {

					pessoaProcurada = listaDePessoas.get(i);

				}

			}

			return pessoaProcurada;

		}

		return null;

	}

	public void exibir(Integer id) {

		Pessoa pessoaProcurada = procurarPessoa(id);
		if (pessoaProcurada != null) {

			System.out.println(pessoaProcurada.toString());
			return;

		}

		System.out.println("Pessoa com esse ID não encontrada.");

	}

	public void adicionar(Pessoa pessoa) {

		listaDePessoas.add(pessoa);

	}

	public void remover(Integer idParaRemover) {

		Pessoa procurada = procurarPessoa(idParaRemover);
		if (procurada != null) {

			listaDePessoas.remove(procurada);
			System.out.println("Pessoa removida com sucesso.");
			return;

		}

		System.out.println("Pessoa com esse ID não encontrada.");

	}

}