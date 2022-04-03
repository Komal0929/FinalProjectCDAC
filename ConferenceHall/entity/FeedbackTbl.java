package com.ConferenceHall.entity;
// Generated 27 Mar, 2022 8:29:19 PM by Hibernate Tools 5.1.7.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * FeedbackTbl generated by hbm2java
 */
@Entity
@Table(name = "feedback_tbl")
public class FeedbackTbl implements java.io.Serializable {

	private int feedbackId;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="booking_id")
	private BookingTbl bookingTbl;
	//bi-directional many-to-one association to UserInfoTbl
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserInfoTbl userInfoTbl;
	private int feedbackRating;
	private String feedbackComment;
	private Date feedbackDate;








	public FeedbackTbl() {
	}

	public FeedbackTbl(int feedbackId, BookingTbl bookingTbl, UserInfoTbl userInfoTbl, int feedbackRating,
			Date feedbackDate) {
		this.feedbackId = feedbackId;
		this.bookingTbl = bookingTbl;
		this.userInfoTbl = userInfoTbl;
		this.feedbackRating = feedbackRating;
		this.feedbackDate = feedbackDate;
	}

	public FeedbackTbl(int feedbackId, BookingTbl bookingTbl, UserInfoTbl userInfoTbl, int feedbackRating,
			String feedbackComment, Date feedbackDate) {
		this.feedbackId = feedbackId;
		this.bookingTbl = bookingTbl;
		this.userInfoTbl = userInfoTbl;
		this.feedbackRating = feedbackRating;
		this.feedbackComment = feedbackComment;
		this.feedbackDate = feedbackDate;
	}

	@Id

	@Column(name = "feedback_id", unique = true, nullable = false)
	public int getFeedbackId() {
		return this.feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "booking_id", nullable = false)
	public BookingTbl getBookingTbl() {
		return this.bookingTbl;
	}

	public void setBookingTbl(BookingTbl bookingTbl) {
		this.bookingTbl = bookingTbl;
	}

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public UserInfoTbl getUserInfoTbl() {
		return this.userInfoTbl;
	}

	public void setUserInfoTbl(UserInfoTbl userInfoTbl) {
		this.userInfoTbl = userInfoTbl;
	}

	@Column(name = "feedback_rating", nullable = false)
	public int getFeedbackRating() {
		return this.feedbackRating;
	}

	public void setFeedbackRating(int feedbackRating) {
		this.feedbackRating = feedbackRating;
	}

	@Column(name = "feedback_comment")
	public String getFeedbackComment() {
		return this.feedbackComment;
	}

	public void setFeedbackComment(String feedbackComment) {
		this.feedbackComment = feedbackComment;
	}

	
	@Column(name = "feedback_date", nullable = false, length = 10)
	public Date getFeedbackDate() {
		return this.feedbackDate;
	}

	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}

}
