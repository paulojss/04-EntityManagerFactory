package br.com.senai.entidade;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")
@SecondaryTable(name="departamento",pkJoinColumns={@PrimaryKeyJoinColumn(name="departamento_id")})
public class Pessoa {

	@Id
	@GeneratedValue
	@Column (name="pessoa_id")
	private int id;
	
	@Column(name="pessoa_nome")
	private String nome;
	
	@Column(table="departamento",name="departamento_nome")
	private String nome_departamento;

	@OneToOne(cascade=CascadeType.ALL)
	private Notebook notebook;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome_departamento() {
		return nome_departamento;
	}

	public void setNome_departamento(String nome_departamento) {
		this.nome_departamento = nome_departamento;
	}
	
}
