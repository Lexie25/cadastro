package com.br.spring.data.relacionamento.controller;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.br.spring.data.relacionamento.Models.Login;
import com.br.spring.data.relacionamento.Models.Usuario;
import com.br.spring.data.relacionamento.service.LoginService;



@Controller
public class CadastroController {

	@Autowired
	private LoginService loginService;

	@GetMapping("/cadastro/login")
	public ModelAndView exibirFormulario() {
		ModelAndView modelAndView = new ModelAndView("cadastro.html");
		return modelAndView;
	}

	@PostMapping("/cadastro/login")
	public ModelAndView cadastrarLogin(@Valid Usuario user,
			BindingResult bindingUser,@Valid Login login, BindingResult bindingLogin) {

		ModelAndView modelView = new ModelAndView("cadastro.html");
		if(bindingUser.hasErrors()|| bindingLogin.hasErrors()) {
			List<String> msgs = new ArrayList<String>();

			for (ObjectError objerro : bindingUser.getAllErrors()) {
				msgs.add(objerro.getDefaultMessage());
			}
			for (ObjectError objerro : bindingLogin.getAllErrors()) {
				msgs.add(objerro.getDefaultMessage());
			}
			modelView.addObject("msgs",msgs);
		}else {
			modelView.addObject("msgs", loginService.cadastrarLogin(user,login));
		}
		return modelView;

	}



}









