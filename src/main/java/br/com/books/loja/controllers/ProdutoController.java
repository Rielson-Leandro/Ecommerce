package br.com.books.loja.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class ProdutoController {
	@RequestMapping("/produtos")
	public String salvar(Produto produto){
		System.out.println("Cadastrando produto");
		return "produtos/ok";
	}

}
