package com.guilinares.ecommerce.dto;

import java.io.Serializable;

import com.guilinares.ecommerce.domain.Categoria;

public class CategoriaDTO implements Serializable{
	private static final long serialVersionUID = -3536265313553932780L;

	private Integer id;
	private String nome;
	
	public CategoriaDTO() {
	}
	
	public CategoriaDTO(Categoria cat) {
		id = cat.getId();
		nome = cat.getNome();
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
	
	
}
