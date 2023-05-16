package com.devsuperior.thegamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.thegamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
