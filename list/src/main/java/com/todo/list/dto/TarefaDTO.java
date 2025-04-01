package com.todo.list.dto;

import java.time.LocalDate;

import com.todo.list.entities.Prioridade;
import com.todo.list.entities.Status;
import com.todo.list.entities.Tarefa;

public class TarefaDTO {
	
	private Long id;
	private String descricao;
	private String setor;
	private Prioridade prioridade;
	private LocalDate dataCadastro = LocalDate.now();
	private Status status;
	public Long idUsuario;
	
	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public TarefaDTO() {
		
	}

	public TarefaDTO(Long id, String descricao, String setor, Prioridade prioridade, LocalDate dataCadastro,
			Status status, Long idUsuario) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.setor = setor;
		this.prioridade = prioridade;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.idUsuario = idUsuario;
	}
	
	public TarefaDTO(Tarefa entity) {
		super();
		this.id = entity.getId();
		this.descricao = entity.getDescricao();
		this.setor = entity.getSetor();
		this.prioridade = entity.getPrioridade();
		this.dataCadastro = entity.getDataCadastro();
		this.status = entity.getStatus();
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
