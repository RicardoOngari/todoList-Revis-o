package com.todo.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.list.entities.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long>{

}
