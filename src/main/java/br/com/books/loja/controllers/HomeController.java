package br.com.books.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	public String index(){
		//vamos carregar os produtos aqui
		System.out.println("Carregando os produtos");
		return "Hollo Word.jsp";
		
	}

}
