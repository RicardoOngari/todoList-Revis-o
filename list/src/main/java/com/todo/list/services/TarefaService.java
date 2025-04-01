package com.todo.list.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.list.dto.TarefaDTO;
import com.todo.list.entities.Prioridade;
import com.todo.list.entities.Status;
import com.todo.list.entities.Tarefa;
import com.todo.list.entities.Usuario;
import com.todo.list.repositories.TarefaRepository;
import com.todo.list.repositories.UsuarioRepository;

@Service

public class TarefaService {
	
	@Autowired
	TarefaRepository tarefaRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public TarefaDTO criarTarefa(TarefaDTO dto) {
		Tarefa tarefa = new Tarefa();
	
		tarefa.setDescricao(dto.getDescricao());
		tarefa.setSetor(dto.getSetor());
		tarefa.setPrioridade(Prioridade.BAIXA);
		tarefa.setDataCadastro(LocalDate.now());
		tarefa.setStatus(Status.A_FAZER);
		
		Usuario usuario = usuarioRepository.getReferenceById(dto.getIdUsuario());
		tarefa.setUsuario(usuario);
		
		tarefa = tarefaRepository.save(tarefa);
		return new TarefaDTO(tarefa);
	}
	
	public List<TarefaDTO> mostrarTarefas() {
		List<Tarefa> lista = tarefaRepository.findAll();
		
		return null;
		
	}

}
