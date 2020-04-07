package br.com.spring.code.ecommerce.financeiro;

public class Financeiro {
	private static final double COMISSAO = 0.03;
	private Pagamento formaPagamento;
	private double valorTotal;
	
	public Financeiro(final Pagamento formaPagamento, final double valorTotal) {
		super();
		this.formaPagamento = formaPagamento;
		this.valorTotal = valorTotal;
	}

	public Pagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(final Pagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(final double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public double cobrarComissao() {
		return getValorTotal()*COMISSAO;
	}
		
}
