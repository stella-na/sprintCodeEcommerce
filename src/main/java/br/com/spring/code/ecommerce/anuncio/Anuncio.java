package br.com.spring.code.ecommerce.anuncio;

import java.util.Date;

import br.com.spring.code.ecommerce.duvidas.Duvidas;
import br.com.spring.code.ecommerce.geolocalizacao.GeoLocalizacao;
import br.com.spring.code.ecommerce.gestaopessoas.Pessoa;
import br.com.spring.code.ecommerce.gestaoprodutos.Produto;

public class Anuncio {
	private int IdAnuncio;
	private Pessoa pessoa;
	private Produto produto;
	private Date dataAnuncio;
	private Duvidas duvidas;
	private double valor;
	private GeoLocalizacao localizacao;
	private double taxaEnvio;	
	
	public Anuncio(Pessoa pessoa, Produto produto, Date dataAnuncio, 
			Duvidas duvidas, double valor, GeoLocalizacao localizacao) {
		super();
		this.pessoa = pessoa;
		this.produto = produto;
		this.dataAnuncio = dataAnuncio;
		this.duvidas = duvidas;
		this.valor = valor;
		this.localizacao = localizacao;
	}


	public int getIdAnuncio() {
		return IdAnuncio;
	}


	public void setIdAnuncio(int idAnuncio) {
		IdAnuncio = idAnuncio;
	}


	public Pessoa getPessoa() {
		return pessoa;
	}


	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public Date getDataAnuncio() {
		return dataAnuncio;
	}


	public void setDataAnuncio(Date dataAnuncio) {
		this.dataAnuncio = dataAnuncio;
	}


	public Duvidas getDuvidas() {
		return duvidas;
	}


	public void setDuvidas(Duvidas duvidas) {
		this.duvidas = duvidas;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public GeoLocalizacao getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(GeoLocalizacao localizacao) {
		this.localizacao = localizacao;
	}
	
	public void calcularTaxaEnvio(GeoLocalizacao localização) {
		
	}

}
