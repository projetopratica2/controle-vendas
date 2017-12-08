package model;

import java.time.LocalDate;
import java.util.List;
/**
 * PP02 - Projeto Vendas
 * @author fnascimento
 * 
 */
public class Venda {

	private Integer codigo;
	private Cliente cliente;
	private double totalVenda;
	private LocalDate dataPedido;
	private SituacaoVenda situacao;
	private List<ItemVenda> itensVendidos;
	private Endereco enderecoEntrega;
	private TipoPagamento tipoPagamento;
	
	public Venda() {
		super();
	}

	public Venda(Integer codigo, Cliente cliente, double totalVenda, LocalDate dataPedido, SituacaoVenda situacao,
			List<ItemVenda> itensVendidos, Endereco enderecoEntrega, TipoPagamento tipoPagamento) {
		super();
		this.codigo = codigo;
		this.cliente = cliente;
		this.totalVenda = totalVenda;
		this.dataPedido = dataPedido;
		this.situacao = situacao;
		this.itensVendidos = itensVendidos;
		this.enderecoEntrega = enderecoEntrega;
		this.tipoPagamento = tipoPagamento;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	public void setTotalVenda(double totalVenda) {
		this.totalVenda = totalVenda;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public SituacaoVenda getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoVenda situacao) {
		this.situacao = situacao;
	}

	public List<ItemVenda> getItensVendidos() {
		return itensVendidos;
	}

	public void setItensVendidos(List<ItemVenda> itensVendidos) {
		this.itensVendidos = itensVendidos;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	
	
}
