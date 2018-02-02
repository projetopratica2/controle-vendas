package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Cliente;
import model.Endereco;
import model.ItemVenda;
import model.Produto;
import model.SituacaoVenda;
import model.TipoPagamento;
import model.Venda;

public class ControleVendas {
	
	private double DESCONTO_DEBITO = 0.09;
	private double DESCONTO_BOLETO = 0.15;
	private double JUROS_CREDIARIO = 0.08;
	private double JUROS_CREDITO = 0.02;
	private double JUROS_MAIS10X = 0.12;

	public Venda iniciarVenda(Cliente cliente){
		Venda venda = new Venda();
		venda.setCliente(cliente);
		venda.setSituacao(SituacaoVenda.EM_PROCESSAMENTO);
		return venda;
	}
	
	public void adicionarProduto(Venda venda, Produto produto, int quantidade) 
		throws Exception{
		if (venda.getSituacao() != SituacaoVenda.EM_PROCESSAMENTO) {
			throw new Exception("Venda finalizada! Não é possível adicionar novos produtos!");
		}
		if (venda.getItensVendidos() == null){
			venda.setItensVendidos(new ArrayList<>());
		}
		ItemVenda iv = new ItemVenda(1, venda, produto, quantidade);
		venda.getItensVendidos().add(iv);
	}
	
	public int obterQuantidadeItensVendidos(Venda venda){
		int quantidade = 0;
		if (venda.getItensVendidos() == null) {
			quantidade = 0;
		} else {
			quantidade = venda.getItensVendidos().size();
		}
		return quantidade;
	}
	
	public void finalizarVenda(Venda venda, Endereco entrega, TipoPagamento tipo){
		venda.setDataPedido(LocalDate.now());
		double valorVenda = 0;
		for (ItemVenda iv : venda.getItensVendidos()) {
			valorVenda += iv.getProduto().getPreco() * iv.getQuantidade();
		}
		if (tipo == TipoPagamento.BOLETO){
			valorVenda *= (1 - DESCONTO_BOLETO);
		} else if (tipo == TipoPagamento.DEBITO) {
			valorVenda *= (1 - DESCONTO_DEBITO);
		} else {
			valorVenda *= (1 + JUROS_CREDITO);
		}
		venda.setTotalVenda(valorVenda);
		venda.setSituacao(SituacaoVenda.FINALIZADA);
		venda.setEnderecoEntrega(entrega);
		venda.setTipoPagamento(tipo);
	}
}
