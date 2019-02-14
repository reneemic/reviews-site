package org.wecancodeit.reviewssite;

import java.util.Collection;

public class Review {

 private long id;
 private String name;
 private String category;
 private String content;
 private String image;

public Review(long id, String name, String category, String content, String image) {
	 this.id = id;
	 this.name = name;
	 this.category = category;
	 this.content = content;
	 this.image = image;
	 
}

public Long getId() {
	return id;
}

public String getName() {
	return name;
}

public String getCategory() {
	return category;
}

public String getContent() {
	return content;
	
}

public String getImage() {
	return image;
}

}
	   
	
	

