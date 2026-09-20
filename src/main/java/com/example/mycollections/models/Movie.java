package com.example.mycollections.models;

public class Movie extends LibraryItem {
    private String director;
    private int length;

    // This is the constructor for the movie.
    public Movie(String name, String director, int year, int length) {
        super(name, year);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {return director;}

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return name + " by " + director;
    }
}
