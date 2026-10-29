package basic;
import java.math.*;

public class Transacao{
	// Atributos privados
	private int id;
	private BigDecimal valor;
	private String data;
	private String categoria;
	private String tipo;
	
	// Construtor da classe
	public Transacao(int id, BigDecimal valor, String data, String categoria, String tipo) {
		this.id = id;
		this.valor = valor;
		this.data = data;
		this.categoria = categoria;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public String getData() {
		return data;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public String getTipo() {
		return tipo;
	}
}
