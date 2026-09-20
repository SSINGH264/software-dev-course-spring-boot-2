package com.example.mycollections.models;

public class Book extends LibraryItem {
    private String author;
    private int pages;

    // This is the constructor for the book
    public Book(String name, String author, int year, int pages) {
        super(name, year);
        this.author = author;
        this.pages = pages;
    }

    // Setting getters and setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return name + " by " + author;
    }
}
