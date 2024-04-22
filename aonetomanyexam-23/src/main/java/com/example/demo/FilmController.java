package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class FilmController {
	@Autowired
	private FilmService1 s;
	
	
	@GetMapping("/film/{pageNo}/{pageSize}")
	
	public List<Film> getPagenated(@PathVariable int pageNo,@PathVariable int pageSize){
		return s.findPagenated(pageNo, pageSize);
	}
	@PostMapping("/film")
	public Film create(@RequestBody Film a) {
		return s.create(a);
	}
	@PutMapping("/film/{id}")
	public Film update(@RequestBody Film a) {
		return s.create(a);
	}
	@DeleteMapping("/film/{id}")
	public void delete(@PathVariable Integer id) {
		s.delete(id);
	}
	@GetMapping("/actor/{id}")
	public List<Film>getAllFilms(@RequestBody String field1){
		Sort sort=Sort.by(field1);
		return s.findAll(sort);
	}
}
