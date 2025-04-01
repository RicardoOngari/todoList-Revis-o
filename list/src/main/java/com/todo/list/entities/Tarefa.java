package com.todo.list.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tarefa")
public class Tarefa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private String setor;
	private Prioridade prioridade;
	private LocalDate dataCadastro = LocalDate.now();
	private Status status = Status.A_FAZER;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
   
	
	
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "usario_id")
	private Usuario usuario;
	
	
	public Tarefa() {
		
	}
	
	public Tarefa(Long id, String descricao, String setor, Prioridade prioridade, LocalDate dataCadastro,
			Status status, Usuario usuario) {
		
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.prioridade = prioridade;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	
	
	

}
