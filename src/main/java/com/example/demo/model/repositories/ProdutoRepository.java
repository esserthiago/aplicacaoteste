package com.example.demo.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
