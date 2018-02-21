package com.algaworks.socialbooks.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private Date nascimento;
	private String nacionalizacao;

	@OneToMany(mappedBy = "autor")
	@JsonIgnore
	private List<Livro> livro;
	
	public Autor() {
	}
	
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
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getNacionalizacao() {
		return nacionalizacao;
	}
	public void setNacionalizacao(String nacionalizacao) {
		this.nacionalizacao = nacionalizacao;
	}
	public List<Livro> getLivro() {
		return livro;
	}
	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}
	
	
}
