package com.devsuperior.thegamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.thegamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}