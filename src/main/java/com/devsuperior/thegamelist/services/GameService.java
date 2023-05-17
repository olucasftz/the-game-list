package com.devsuperior.thegamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.devsuperior.thegamelist.dto.GameDTO;
import com.devsuperior.thegamelist.dto.GameMinDTO;
import com.devsuperior.thegamelist.entities.Game;
import com.devsuperior.thegamelist.projections.GameMinProjection;
import com.devsuperior.thegamelist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true) // transactional with readOnly = transaction will not perform write or change operations on the data in the database.
	public GameDTO findById(@PathVariable Long listId) {
		Game game = gameRepository.findById(listId).get();
		return new GameDTO(game);
	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> game = gameRepository.findAll();
		return game.stream().map(GameMinDTO::new).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByGameList(Long listId) {
		List<GameMinProjection> games = gameRepository.searchByList(listId);
		return games.stream().map(GameMinDTO::new).toList();
	}
}
