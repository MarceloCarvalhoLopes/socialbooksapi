package com.algaworks.socialbooks.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivrosResources {

	//@GetMapping(value = "/livros")
	@RequestMapping(value = "/livros", method = RequestMethod.GET)
	public String listar() {

		return "Rest Aplicaco, Git passso-a-passo";
	}
}
