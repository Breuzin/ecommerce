package com.guilinares.ecommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilinares.ecommerce.domain.Categoria;
import com.guilinares.ecommerce.repositories.CategoriaRepository;
import com.guilinares.ecommerce.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + 
					", Tipo: " + Categoria.class.getName()));
	}
	
	public Categoria insert(Categoria cat) {
		cat.setId(null);
		return repository.save(cat);
	}
	
	public Categoria update(Categoria cat) {
		findById(cat.getId());
		return repository.save(cat);
	}
}
