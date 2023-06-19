package com.dxc.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.project.model.Ratings;
import com.dxc.project.repo.ReviewRepo;

@Service
public class RatingsServiceImpl implements RatingsService {

	@Autowired
	ReviewRepo repo;
	
	
	@Override
	public Ratings addRating(Ratings ratings) {
		// TODO Auto-generated method stub
		return repo.save(ratings);
	}

	@Override
	public Ratings editRating(int reviewId, Ratings ratings) {
		// TODO Auto-generated method stub
		Ratings r = repo.findById(reviewId).get();
		
		if(ratings.getRating()!=0) {
			r.setRating(ratings.getRating());
		}
		if((ratings.getComment()!=null) && (!"".equalsIgnoreCase(ratings.getComment()))){
			r.setComment(ratings.getComment());
		}
		return repo.save(r);
	}

	@Override
	public void deleteRating(int reviewId) {
		// TODO Auto-generated method stub
		repo.delete(read(reviewId));
	}
	public Ratings read(int reviewId) {
		Ratings result = null;
		Optional<Ratings> temp = repo.findById(reviewId);
		if(temp.isPresent()) {
			result = repo.findById(reviewId).get();
		}
		return result;
	}

}
