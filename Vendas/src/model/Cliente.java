package model;

public class Cliente {

	private Integer codigo;
	private String nome;
	private String cpf;
	private Endereco enderecoCobranca;
	private String email;
	private String senha;
	public Cliente() {
		super();
	}
	public Cliente(Integer codigo, String nome, String cpf, Endereco enderecoCobranca, String email, String senha) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.enderecoCobranca = enderecoCobranca;
		this.email = email;
		this.senha = senha;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEnderecoCobranca() {
		return enderecoCobranca;
	}
	public void setEnderecoCobranca(Endereco enderecoCobranca) {
		this.enderecoCobranca = enderecoCobranca;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
