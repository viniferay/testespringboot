package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Prato;
import com.example.demo.repositories.PratoRepository;

@Service
public class PratoService {
	
	@Autowired
	private PratoRepository repo;
	
	public Prato find(Integer id) {
		Optional<Prato> obj = repo.findById(id);
		return obj.orElse(null);
		}
	public Prato insert(Prato obj) {
		obj.setId(null);
		return repo.save(obj);
	}
}
