package br.usjt.aula8.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clima implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double minima;
	private Double maxima;
	private Double umidade;
	private String desc;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getMinima() {
		return minima;
	}
	public void setMinima(Double minima) {
		this.minima = minima;
	}
	public Double getMaxima() {
		return maxima;
	}
	public void setMaxima(Double maxima) {
		this.maxima = maxima;
	}
	public Double getUmidade() {
		return umidade;
	}
	public void setUmidade(Double umidade) {
		this.umidade = umidade;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
