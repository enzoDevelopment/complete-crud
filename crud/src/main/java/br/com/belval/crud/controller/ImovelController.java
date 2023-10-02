package br.com.belval.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.belval.crud.model.Imovel;

@Controller
public class ImovelController {
	
	private static List<Imovel> lista = new ArrayList<>();
	private static int proxId = 0;
	
	
	@GetMapping("/imovel/novo") 
	public String novo() {
		return "imovel/novo-imovel";
	}
	
	@PostMapping("/carrossel/imoveis")
	public String addCarrossel(Imovel imovel, Model model) {
		imovel.setId(++proxId);
		lista.add(imovel);
		model.addAttribute("imoveis", lista);
		return "imovel/carrossel";
	}
	
}
