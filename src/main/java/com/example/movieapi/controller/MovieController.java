package com.example.movieapi.controller;

import com.example.movieapi.model.Movie;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final List<Movie> movies = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    // Add a new movie
    @PostMapping
    public ResponseEntity<Movie> addMovie(@Valid @RequestBody Movie movie) {
        movie.setId(idCounter.getAndIncrement());
        movies.add(movie);
        return ResponseEntity.ok(movie);
    }

    // Get a movie by ID
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
