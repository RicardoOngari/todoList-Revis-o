package com.todo.list.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.list.dto.UsuarioDTO;
import com.todo.list.entities.Usuario;
import com.todo.list.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository  usuarioRepository;
	
	
	
	public UsuarioDTO criarUsuario(UsuarioDTO dto) {
		Usuario us = new Usuario();
		us.setEmail(dto.getEmail());
		us.setNome(dto.getNome());
		
		us = usuarioRepository.save(us);	
		return new UsuarioDTO(us);
		
	}

}
