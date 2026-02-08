package com.example.movieapi.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class Movie {

    private Long id;

    @NotBlank(message = "Movie name is required")
    private String name;

    @NotBlank(message = "Description is required")
    private String description;

    @NotBlank(message = "Genre is required")
    private String genre;

    @Min(value = 1900, message = "Release year must be valid")
    private int releaseYear;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
