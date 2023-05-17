package com.devsuperior.thegamelist.dto;

import com.devsuperior.thegamelist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;

	public GameListDTO(GameList entity) { // using entity of GameList, no longer needs the use (this.)
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}