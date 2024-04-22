package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class FilmService1 {
	@Autowired
	private FilmRepository ar;
	public List<Film>findPagenated(int pageNo,int pageSize){
		PageRequest paging=PageRequest.of(pageNo, pageSize);
		Page<Film>paging1=ar.findAll(paging);
		return paging1.toList();
				}
	public List<Film> findAll(Sort sort) {
		
		return ar.findAll();
	}


	public Film create(Film a) {
		return ar.save(a);
	}
	public Film update(Film a) {
		return ar.save(a);
	}
	public void delete(Integer id) {
		ar.deleteById(id);
	}
}
