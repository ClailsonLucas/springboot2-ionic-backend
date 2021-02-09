package com.nelioalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaService repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.buscar(id);
		return obj;
	}
	
}
