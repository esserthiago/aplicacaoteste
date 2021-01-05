package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.entities.Produto;
import com.example.demo.model.repositories.ProdutoRepository;

@RestController
@RequestMapping(path="/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping
	public @ResponseBody Produto novoProduto(@Valid Produto produto){
		
		produtoRepository.save(produto);
		//teste
		return produto;
	}
}
