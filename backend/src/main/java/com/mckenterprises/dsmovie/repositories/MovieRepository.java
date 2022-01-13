package com.mckenterprises.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mckenterprises.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
