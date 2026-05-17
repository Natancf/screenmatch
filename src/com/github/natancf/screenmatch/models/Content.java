package com.github.natancf.screenmatch.models;

public class Content {
    private Long id;  
    private String title;
    private int releaseYear; //
    private String genre;
    private int durationInMinutes; 
    private String description;
    private double sumOfRatings = 0;
    private int totalRatings = 0;

    // Construtor
    public Content(String title, int releaseYear, String director) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    // BEHAVIORS

    public void evaluate(double rating) {
        sumOfRatings += rating;
        totalRatings++;
    }

    public double getAverageRating() {
        if (totalRatings == 0) {
            return 0;
        }
        return sumOfRatings / totalRatings;
    }

    // GETTERS
    public String getTitle() { return title; }
    public int getReleaseYear() { return releaseYear; }
    public String getGenre() { return genre; }
    public int getDurationInMinutes() { return durationInMinutes; }
    public String getDescription() { return description; }
    public int getTotalRatings() { return totalRatings; }

    // SETTERS
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
