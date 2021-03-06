package main.java.com.iamkapil98.mrs.model;

import main.java.com.iamkapil98.mrs.enums.UserRoles;

public class User {

    private String name;
    private String role;
    private int reviews;

    public User(String name) {
        this.name = name;
        this.role = UserRoles.VIEWER.name();
        this.reviews = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(UserRoles role) {
        this.role = role.name();
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }
}
