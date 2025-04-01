package com.todo.list.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.list.dto.UsuarioDTO;
import com.todo.list.services.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@PostMapping(value= "/criar")
	public ResponseEntity<UsuarioDTO> criarUsuario(@Valid  @RequestBody UsuarioDTO dto){
		dto = usuarioService.criarUsuario(dto);
		return ResponseEntity.ok(dto);
	}

}
