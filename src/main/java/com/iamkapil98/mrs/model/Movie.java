package main.java.com.iamkapil98.mrs.model;

import java.util.List;

public class Movie {

    private String name;
    private Integer year;
    private List<String> genres;

    public Movie(String name, Integer year, List<String> genres) {
        this.name = name;
        this.year = year;
        this.genres = genres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
}
