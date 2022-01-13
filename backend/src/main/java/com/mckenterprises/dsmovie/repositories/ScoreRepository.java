package com.mckenterprises.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mckenterprises.dsmovie.entities.Score;
import com.mckenterprises.dsmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
	

}
