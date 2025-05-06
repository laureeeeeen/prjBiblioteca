package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Livro;
import com.example.demo.repositories.LivroRepositorie;
@Service

public class LivroService {

	private final LivroRepositorie  livroRepository;

	

	@Autowired

	public LivroService(LivroRepositorie livroRepository) {

		this.livroRepository = livroRepository;

		

	}

	

	public Livro saveLivro(Livro livro) {

		return livroRepository.save(livro);

	}

	

	public 	Livro getLivroById(Long id) {

		return livroRepository.findById(id).orElse(null);

	}



	public List<Livro> getAllLivros(){

		return livroRepository.findAll();

	}



}