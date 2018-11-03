package com.cliente.crudrest.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "CLIENTE")
public class Cliente implements Serializable {
	
	public long getId() {
		return id;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1131233057591405468L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	
	private String nome; 
	
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
