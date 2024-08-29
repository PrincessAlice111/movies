package com.example.movies;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    private List<Movie> movies = new ArrayList<>();

    public MovieController() {
        // Initialise the list of movies with some data.
        movies.add(new Movie(
                1,
                "Movie One",
                2000,
                "Director One",
                "action",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        movies.add(new Movie(
                2,
                "Movie Two",
                2000,
                "Director Two",
                "comedy",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        movies.add(new Movie(
                3,
                "Movie Three",
                2000,
                "Director Three",
                "horror",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        movies.add(new Movie(
                4,
                "Movie Four",
                2000,
                "Director Four",
                "romance",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        movies.add(new Movie(
                5,
                "Movie Five",
                2000,
                "Director Five",
                "science fiction",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
    }

    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movies;
    }

    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
        return null;
    }
}
