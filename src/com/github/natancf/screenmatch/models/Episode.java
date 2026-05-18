package com.github.natancf.screenmatch.models;

public class Episode {
    private int number;
    private String name;
    private Serie serie;
    private int durationInMinutes;

    public Episode(int number, String name, Serie serie, int durationInMinutes) {
        this.number = number;
        this.name = name;
        this.serie = serie;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Serie getSerie() {
        return serie;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}
