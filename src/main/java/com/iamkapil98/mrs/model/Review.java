package main.java.com.iamkapil98.mrs.model;

public class Review {

    private String userName;
    private String movieName;
    private int reviewScore;

    public Review(String userName, String movieName, int reviewScore) {
        this.userName = userName;
        this.movieName = movieName;
        this.reviewScore = reviewScore;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }
}
