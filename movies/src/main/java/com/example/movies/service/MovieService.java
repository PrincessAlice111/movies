package com.example.movies.service;

import java.util.List;
import java.util.Optional;
import com.example.movies.model.Movie;

public interface MovieService {
    List<Movie> getAllMovies();

    Optional<Movie> getMovieById(Long id);

    Movie createMovie(Movie movie);

    Movie updateMovie(Long id, Movie movie);

    void deleteMovie(Long id);
}
