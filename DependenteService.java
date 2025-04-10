package com.ex.barra.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.barra.entities.Dependente;
import com.ex.barra.repositories.DependenteRepository;

@Service
public class DependenteService {

	private DependenteRepository dependenteRepository;
	
	@Autowired
	private DependenteService(DependenteRepository dependenteRepository) {
			this.dependenteRepository = dependenteRepository;
	}
	
	public Dependente getDependenteById(Long Id) {
		return dependenteRepository.findById(Id).orElse(null);
	}
	
	public List<Dependente> getAllDependente(){
		return dependenteRepository.findAll();
		
	}
	
	public Dependente saveDependente(Dependente dependente) {
		return dependenteRepository.save(dependente);
	}
	
}
