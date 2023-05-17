package com.devsuperior.thegamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.thegamelist.dto.GameListDTO;
import com.devsuperior.thegamelist.dto.GameMinDTO;
import com.devsuperior.thegamelist.services.GameListService;
import com.devsuperior.thegamelist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;	
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> gameListDto = gameListService.findAll();
		return gameListDto;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findGames(@PathVariable Long listId) {
		List<GameMinDTO> gameMinDto = gameService.findByGameList(listId);
		return gameMinDto;
	}
}