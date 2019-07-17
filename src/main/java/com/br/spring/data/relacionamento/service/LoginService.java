package com.br.spring.data.relacionamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.spring.data.relacionamento.Models.Login;
import com.br.spring.data.relacionamento.Models.Usuario;
import com.br.spring.data.relacionamento.interfaces.LoginRepository;
import com.br.spring.data.relacionamento.interfaces.UsuarioRepositories;


@Service
public class LoginService {

	@Autowired
	private UsuarioRepositories usuarioRepositories;
	@Autowired 
	private LoginRepository loginRepository;

	public String cadastrarLogin(Usuario user, Login login) {
		login.setUsuario(user);
		loginRepository.save(login);
		return"Login cadastrado";
	}
}



