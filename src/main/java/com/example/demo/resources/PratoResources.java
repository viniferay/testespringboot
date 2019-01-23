package com.example.demo.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.domain.Prato;
import com.example.demo.services.PratoService;

@RestController
@RequestMapping(value="/pratos")
public class PratoResources {
		
		@Autowired
		private PratoService service;
	
		@RequestMapping(value="/{id}",method=RequestMethod.GET)
		public ResponseEntity<?> find(@PathVariable Integer id) {
			Prato obj = service.find(id);
			return ResponseEntity.ok().body(obj);
			
		}
		@RequestMapping(value="/{id}",method=RequestMethod.POST)
		public ResponseEntity<Void> insert(@RequestBody Prato obj){
			obj = service.insert(obj);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
			return ResponseEntity.created(uri).build();
		}
	
}
