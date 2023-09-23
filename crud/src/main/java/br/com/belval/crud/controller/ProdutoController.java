package br.com.belval.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.belval.crud.model.Produto;

@Controller
public class ProdutoController {
	
	@GetMapping("/produto/novo")
	public String novo() {
		return "produto/produto-novo";
	}
	
	@PostMapping("/produto/novo")
	public ModelAndView novo (Produto produto) {
		ModelAndView model = new ModelAndView("produto/novo-produto-criado");
		// Inserindo no banco de dados..
		model.addObject("produto", produto);
		return model;
	}
	
	
}
