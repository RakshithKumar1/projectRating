package com.dxc.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.project.model.Ratings;
import com.dxc.project.service.RatingsService;

@RestController
@RequestMapping("/user/reviews")
public class Controller {
	
	@Autowired
	RatingsService service;
	
	
	@PostMapping("comment")
	public Ratings addReview(@RequestBody Ratings ratings) {
		return service.addRating(ratings);
	}
	
	@PutMapping("editRatings/{reviewId}")
	public Ratings editReview(@PathVariable("reviewId") int reviewId, @RequestBody Ratings ratings) {
		return service.editRating(reviewId, ratings);
		
	}
	
	@DeleteMapping("remove/{reviewId}")
	public void deleteReview(@PathVariable int reviewId) {
		service.deleteRating(reviewId);
	}
}
