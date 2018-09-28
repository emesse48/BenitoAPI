package com.benito.benito_api.controller;

import com.benito.benito_api.BenitoApiApplication;
import com.benito.benito_api.repositories.BenitoRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class BenitoApiController {

	@Autowired
	private BenitoRepository repository;

	// GET METHOD
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<BenitoApiApplication> getAllValues() {			
		return repository.findAll();
	}
	
	// GET BY ID METHOD
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public BenitoApiApplication getValueById(@PathVariable("id") ObjectId id) {
		System.out.println("getValueById" + id);
		return repository.findBy_id(id);
	}

	// PUT METHOD
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void modifyValueById(@PathVariable("id") ObjectId id, @Valid @RequestBody BenitoApiApplication value) {
		System.out.println("modifyValueById" + id);
		value.set_id(id);
		repository.save(value);
	}

	// POST METHOD
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public BenitoApiApplication createValue(@Valid @RequestBody BenitoApiApplication value) {
		value.set_id(ObjectId.get());
		repository.save(value);
		return value;
	}

	// DELETE BY ID METHOD
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteValue(@PathVariable ObjectId id) {
		System.out.println("deleteValue" + id);
		repository.delete(repository.findBy_id(id));
	}
}
