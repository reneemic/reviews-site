package org.wecancodeit.reviewssite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ReviewRepositoryTest {
	
	ReviewRepository underTest;
	
	private long firstReviewId = 1L;
    private Review firstReview = new Review(firstReviewId, "review name" , "review category", "review content", "review image");

	private long secondReviewId = 2L;
	private Review secondReview = new Review(secondReviewId, "review name", "review category", "review content", "review image url");
	
    @Test
	public void shouldFindAReview() {
       underTest = new ReviewRepository(firstReview);
       Review result = underTest.findOne(firstReviewId);
       assertThat(result, is(firstReview));
     }
     
     @Test
     public void shouldFindSecondReview() {
     underTest = new ReviewRepository(secondReview);
    	 Review result = underTest.findOne(secondReviewId);
    	 assertThat(result, is(secondReview));
     }
     
     @Test
     public void shouldFindAllReviews() {
    	underTest = new ReviewRepository(firstReview, secondReview);
    	Collection<Review> result = underTest.findAll();
    	assertThat(result, containsInAnyOrder(firstReview, secondReview));
     }
     
     
	
}