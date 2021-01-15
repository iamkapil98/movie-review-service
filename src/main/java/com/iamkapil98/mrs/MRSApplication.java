package main.java.com.iamkapil98.mrs;

import main.java.com.iamkapil98.mrs.service.MovieReviewService;

public class MRSApplication {

    public static void main(String []args) {

        MovieReviewService mrs = new MovieReviewService();

        //add moview
        mrs.addMovie("Don", 2006, "Action", "Comedy");
        mrs.addMovie("Tiger", 2021, "Drama");
        mrs.addMovie("Padmaavat", 2022, "Comedy");

        //Add users
        mrs.addUser("SRK");
        mrs.addUser("Salman");
        mrs.addUser("Deepika");

        //Add review
        mrs.addReviews("SRK", "Don", 2);
        mrs.addReviews("SRK", "Padmavaat", 8);
        mrs.addReviews("Salman", "Don", 5);
        mrs.addReviews("Deepika", "Don", 9);
        mrs.addReviews("SRK", "Tiger", 5);
        mrs.addReviews("SRK", "Tiger", 5);

    }
}
