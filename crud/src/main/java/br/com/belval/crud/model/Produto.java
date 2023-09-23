package br.com.belval.crud.model;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private float preco;
	
	public Produto () {
	}
	
	public Produto (int id, String nome, String descricao, float preco) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public void setPreco (float preco) {
		this.preco = preco;
	}
	
	public float getPreco () {
		return preco;
	}
	
	@Override
	public String toString () {
		return "Produto [id=" +id +", nome=" + nome + ", descricao=" +
	descricao + ", preco =" + preco + "]";
	}
}
