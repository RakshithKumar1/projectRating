package com.dxc.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.project.model.Ratings;

public interface ReviewRepo extends JpaRepository<Ratings, Integer> {

}
