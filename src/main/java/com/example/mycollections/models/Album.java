package com.example.mycollections.models;

public class Album extends LibraryItem {
    private String artist;
    private double duration;

// this is the constructor for the album
    public Album(String name, String artist, int year, double duration) {
        super(name, year);
        this.artist = artist;
        this.duration = duration;
    }

// setting up getters and setters

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + " by " + artist;
    }
}
