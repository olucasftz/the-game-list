package com.devsuperior.thegamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.thegamelist.dto.GameDTO;
import com.devsuperior.thegamelist.dto.GameMinDTO;
import com.devsuperior.thegamelist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;	

	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> gameMinDTO = gameService.findAll();
		return gameMinDTO;
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO gameDto = gameService.findById(id);
		return gameDto;
	}
}