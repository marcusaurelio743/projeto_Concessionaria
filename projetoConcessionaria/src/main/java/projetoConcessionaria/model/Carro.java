package projetoConcessionaria.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Carro implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String tipo;
	private String cor;
	private String modelo;
	private LocalDate data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Carro() {
		super();
	}

	public Carro(Long id, String tipo, String cor, String modelo, LocalDate data) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.cor = cor;
		this.modelo = modelo;
		this.data = data;
	}

}
