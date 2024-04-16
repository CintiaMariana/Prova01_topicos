package br.edu.univas.CintiaMarianaOliveira.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.edu.univas.si7.topicos.product.dtos.ProductDTO;
import br.edu.univas.si7.topicos.product.entities.ProductEntity;
import br.edu.univas.si7.topicos.product.reposioties.ProductRepository;
import br.edu.univas.si7.topicos.product.support.ObjectNotFoundException;
import br.edu.univas.si7.topicos.product.support.ProductException;
import br.edu.univas.si7.topicos.product.util.ProductEntityConverter;

@Service
public class SupplierService {
	
	private SupplierRepository repo;
	
	@Autowired
	private SupplierEntityConverter converter;

	@Autowired
	public SupplierService(SupplierRepository repo) {
		this.repo = repo;
	}
}
