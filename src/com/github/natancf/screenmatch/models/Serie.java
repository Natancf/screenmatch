package com.github.natancf.screenmatch.models;

public class Serie extends Content {
    private int seasons;
    private int episodesPerSeason;
    private boolean active;
    private String genre;
    private String description;

    public Serie(String title, int releaseYear, int seasons, int episodesPerSeason) {
        super(title, releaseYear);
        this.seasons = seasons;
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }
    
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
}
