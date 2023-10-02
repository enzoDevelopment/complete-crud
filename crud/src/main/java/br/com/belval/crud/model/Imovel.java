package br.com.belval.crud.model;

public class Imovel {
	private int id;
	private float preco;
	private byte qtdQuarto;
	private byte qtdBanheiro;
	private byte qtdVaga;
	private String foto;
	
	public Imovel() {
		
	}
	
	public Imovel (int id, float preco, byte qtdQuarto, byte qtdBanheiro, byte qtdVaga) {
		this.id = id;
		this.preco = preco;
		this.qtdQuarto = qtdQuarto;
		this.qtdBanheiro = qtdBanheiro;
		this.qtdVaga = qtdVaga;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public float getPreco() {
		return preco;
	}

	public byte getQtdQuarto() {
		return qtdQuarto;
	}

	public void setQtdQuarto(byte qtdQuarto) {
		this.qtdQuarto = qtdQuarto;
	}

	public byte getQtdBanheiro() {
		return qtdBanheiro;
	}

	public void setQtdBanheiro(byte qtdBanheiro) {
		this.qtdBanheiro = qtdBanheiro;
	}

	public byte getQtdVaga() {
		return qtdVaga;
	}

	public void setQtdVaga(byte qtdVaga) {
		this.qtdVaga = qtdVaga;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
}
