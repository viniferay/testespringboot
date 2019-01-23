package com.example.demo.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prato implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String tipodcozinha;
	private String ingredientes;
	private double tempodpreparo;
	
	public Prato() {
		
	}

	public Prato(Integer id, String nome, String tipodcozinha, String ingredientes, double tempodpreparo) {
		
		this.id = id;
		this.nome = nome;
		this.tipodcozinha = tipodcozinha;
		this.ingredientes = ingredientes;
		this.tempodpreparo = tempodpreparo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipodcozinha() {
		return tipodcozinha;
	}

	public void setTipodcozinha(String tipodcozinha) {
		this.tipodcozinha = tipodcozinha;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public double getTempodpreparo() {
		return tempodpreparo;
	}

	public void setTempodpreparo(double tempodpreparo) {
		this.tempodpreparo = tempodpreparo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prato other = (Prato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
