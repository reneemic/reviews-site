package org.wecancodeit.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	

	public Review findOne(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

	public ReviewRepository() {
	Review theClevelander = new Review(1L, "1. The Clevelander is enjoyed by concert goer.", "Bar and Grill",  "Was in town for a concert with a group of friends. We stopped in for lunch an ended up spending the majority of our day there before the concert. The girls made us feel welcome and at home from the moment we walked in, we felt like regulars.  Bottles of beer were only $2.50. Awesome wings and huge plate of nachos! Will definitely be back the next time I make it to Cleveland."
				, "images/wingsandnachos.jpg");
		reviewList.put(1L, theClevelander);
		Review pjMcIntyres = new Review(2L, "2. PJ McIntyre's gets rave reviews from hotel guests.", "Irish", "Recommended by hotel and we are so glad to have accepted the recommendation.  Huge fish and chips done perfectly.  Wife had best damn shepards pie...she shared with me. The pretzel appetizer is huge and perfect. Great service Ashley is tremendous and attentive.",
				"images/pretzel.jpg");
		reviewList.put(2L, pjMcIntyres);
		Review redLantern = new Review(3L, "3. Red Lantern has a good Sunday Brunch.", "American", "I was impressed with the interior and bar at Red Lantern. The plaza that it's in is nice, but older so I wasn't expecting the restaurant to be so updated. Brunch was very tasty and well displayed. Their Bloody Mary needs minor work, but still worth trying. I'll definitely be returning to this establishment!", "images/bloodymary.jpg");
		reviewList.put(3L, redLantern);
		Review happyDog = new Review(4L, "4. Happy Dog: a ton of Fun with Social Conciousness.", "Hot Dog Bar", "Happy Dog is a ton of fun (although fruit loops on a hot dog is a little too  much for me). The make-your-own dog approach is novel, but what I enjoy most are the speakers and events they've hosted over the years. The underdog is a fun tucked-away venue and they truly do have an underlying social consciousness that I value.",
				"images/happydog.jpg");
		Review humbleWineBar = new Review(5L, "5. Humble Wine Bar: Affordable Wine, nice patio.", "Wine Bar", "Spacious patio and very affordable happy hour menu full of $5 items. The interior is clean and charming with a stone pizza oven as its centerpiece. Loved our build-your-own cheese plate. Our server was attentive and informative, too. When the wine I ordered was unavailable, she came prepared with a sample of her suggested substitute",
				"images/wine.jpg");
		reviewList.put(5L, humbleWineBar);
		
		
		reviewList.put(theClevelander.getId(), theClevelander);
		reviewList.put(pjMcIntyres.getId(), pjMcIntyres);
		reviewList.put(happyDog.getId(), happyDog);
		reviewList.put(redLantern.getId(), redLantern);
		reviewList.put (humbleWineBar.getId(), humbleWineBar);
	}
	
	//Created for Test Purposes
		public ReviewRepository(Review... reviews) {
			for(Review review: reviews) {
			reviewList.put(review.getId(), review);
			}
	}     
}
