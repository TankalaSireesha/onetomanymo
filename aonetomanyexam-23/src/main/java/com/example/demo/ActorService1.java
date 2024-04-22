package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ActorService1 {
		@Autowired
		private ActorRepository ar;
		public List<Actor>findPagenated(int pageNo,int pageSize){
			PageRequest paging=PageRequest.of(pageNo, pageSize);
			Page<Actor>paging1=ar.findAll(paging);
			return paging1.toList();
					}
		public List<Actor> findAll(Sort sort) {
			
			return ar.findAll();
		}

	
		public Actor create(Actor a) {
			return ar.save(a);
		}
		public Actor update(Actor a) {
			return ar.save(a);
		}
		public void delete(Integer id) {
			ar.deleteById(id);
		}

		
		
}
