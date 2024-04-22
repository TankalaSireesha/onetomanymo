package com.example.demo;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Actor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer id;
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="film_id")
	
	private List<Film>film;

	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actor(Integer id, String name, List<Film> film) {
		super();
		this.id = id;
		this.name = name;
		this.film = film;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Film> getFilm() {
		return film;
	}

	public void setFilm(List<Film> film) {
		this.film = film;
	}
	
	
}
