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
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorController {
			@Autowired
			private ActorService1 s;
			
			
			@GetMapping("/actor/{pageNo}/{pageSize}")
			
			public List<Actor> getPagenated(@PathVariable int pageNo,@PathVariable int pageSize){
				return s.findPagenated(pageNo, pageSize);
			}
			@PostMapping("/actor")
			public Actor create(@RequestBody Actor a) {
				return s.create(a);
			}
			@PutMapping("/actor/{id}")
			public Actor update(@RequestBody Actor a) {
				return s.create(a);
			}
			@DeleteMapping("/actor/{id}")
			public void delete(@PathVariable Integer id) {
				s.delete(id);
			}
			@GetMapping("/actor")
			public List<Actor>getAllActors(@RequestBody String field1){
				Sort sort=Sort.by(field1);
				return s.findAll(sort);
			}
}
