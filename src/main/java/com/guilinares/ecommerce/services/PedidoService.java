package com.guilinares.ecommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilinares.ecommerce.domain.Pedido;
import com.guilinares.ecommerce.repositories.PedidoRepository;
import com.guilinares.ecommerce.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;
	
	public Pedido findById(Integer id) {
		Optional<Pedido> obj = repository.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id + 
					", Tipo: " + Pedido.class.getName()));
	}
}
