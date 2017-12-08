package model;

public class ItemVenda {

	private Integer codigo;
	private Venda venda;
	private Produto produto;
	private int quantidade;
	public ItemVenda(){
		
	}
	public ItemVenda(Integer codigo, Venda venda, Produto produto, int quantidade) {
		super();
		this.codigo = codigo;
		this.venda = venda;
		this.produto = produto;
		this.quantidade = quantidade;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
