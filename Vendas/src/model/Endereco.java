package model;

public class Endereco {

	private String rua;
	private String numero;
	private String cidade;
	private UF uf;
	public Endereco() {
		super();
	}
	public Endereco(String rua, String numero, String cidade, UF uf) {
		super();
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.uf = uf;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public UF getUf() {
		return uf;
	}
	public void setUf(UF uf) {
		this.uf = uf;
	}
	
	
}
