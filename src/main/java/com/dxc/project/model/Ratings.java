package com.dxc.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="review")
public class Ratings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reviewId;
	private int hotelId;
	private int userId;
	private float rating;
	private String comment;
	private String date;
	
	
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Ratings(int reviewId, int hotelId, int userId, float rating, String comment, String date) {
		super();
		this.reviewId = reviewId;
		this.hotelId = hotelId;
		this.userId = userId;
		this.rating = rating;
		this.comment = comment;
		this.date = date;
	}
	public Ratings() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ratings [reviewId=" + reviewId + ", hotelId=" + hotelId + ", userId=" + userId + ", rating=" + rating
				+ ", comment=" + comment + ", date=" + date + "]";
	}
	
	
}
