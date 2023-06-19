package com.dxc.project.service;

import com.dxc.project.model.Ratings;

public interface RatingsService {
	
	public Ratings addRating(Ratings ratings);
	public Ratings editRating(int reviewId, Ratings ratings);
	public void deleteRating(int reviewId);

}
