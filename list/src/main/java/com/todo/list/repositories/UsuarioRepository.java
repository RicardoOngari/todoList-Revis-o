package com.todo.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todo.list.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
