package com.guilinares.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.guilinares.ecommerce.domain.Categoria;
import com.guilinares.ecommerce.repositories.CategoriaRepository;
import com.guilinares.ecommerce.services.exceptions.DataIntegrityException;
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
	
	public void deleteById(Integer id) {
		findById(id);
		try {
			repository.deleteById(id);			
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma categoria que possui produtos");
		}
	}
	
	public List<Categoria> findAll() {
		return repository.findAll();
	}
}
