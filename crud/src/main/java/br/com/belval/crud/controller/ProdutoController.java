package br.com.belval.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.belval.crud.model.Produto;

@Controller
public class ProdutoController {
	
	private static List<Produto> lista = new ArrayList<>();
	private static int proxId = 1;
	
	@GetMapping("/produto/novo")
	public String novo() {
		return "produto/produto-novo";
	}
	
	@PostMapping("/produto/novo")
	public ModelAndView novo (Produto produto) {
		ModelAndView model = new ModelAndView("produto/novo-produto-criado");
		// Inserindo no banco de dados..
		produto.setId(proxId++);
		lista.add(produto);
		
		model.addObject("produto", produto);
		return model;
	}
	
	@GetMapping("/produto/lista")
	public ModelAndView lista() {
		ModelAndView model = new ModelAndView("produto/lista-produtos");
		model.addObject("produtos", lista);
		return model;
	}
	
	
}
