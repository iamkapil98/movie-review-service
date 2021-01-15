package main.java.com.iamkapil98.mrs.service;

import main.java.com.iamkapil98.mrs.model.Movie;
import main.java.com.iamkapil98.mrs.model.Review;
import main.java.com.iamkapil98.mrs.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieReviewService {

    private static final Integer currentYear = 2021;
    private List<User> users;
    private List<Movie> movies;
    private List<Review> reviews;

    public MovieReviewService() {
        this.users = new ArrayList<>();
        this.movies = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void addUser(String name) {
        User user = new User(name);
        users.add(user);
    }

    public void addMovie(String movieName, Integer year, String... genres) {
        Movie movie = new Movie(movieName, year, Arrays.asList(genres));
        movies.add(movie);
    }

    public boolean isUserValid(String userName) {
        for(User user : users) {
            if(user.getName().equalsIgnoreCase(userName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isMovieValid(String movieName) {
        for(Movie movie : movies) {
            if(movie.getName().equalsIgnoreCase(movieName) && movie.getYear() <= currentYear) {
                return true;
            }
        }
        return false;
    }

    public boolean isReviewExist(String userName, String movieName) {
        for(Review review : reviews) {
            if(review.getUserName().equalsIgnoreCase(userName) && review.getMovieName().equalsIgnoreCase(movieName)) {
                return true;
            }
        }
        return false;
    }

    public void addReviews(String userName, String movieName, int reviewScore) {
        try {
            if (isUserValid(userName) && isMovieValid(movieName)) {
                if (isReviewExist(userName, movieName)) {
                    throw new Exception(String.format("%s, %s - multiple review not allowed!", userName, movieName));
                } else {
                    Review review = new Review(userName, movieName, reviewScore);
                    reviews.add(review);
                }
            } else {
                throw new Exception(String.format("%s, %s - Either user or movie doesn't exist or valid!", userName, movieName));
            }
        }
        catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

}
