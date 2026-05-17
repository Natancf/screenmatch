package com.github.natancf.screenmatch.models;

public class Movie extends Content {
    private String director;
    
    public Movie(String title, int releaseYear, String director) {
        super(title, releaseYear);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}