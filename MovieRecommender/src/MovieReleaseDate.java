import java.util.Comparator;

public class MovieReleaseDate implements Comparator<Movie> {
    // Comparing Movie objects based on their release date
    @Override
    public int compare(Movie movie1, Movie movie2) {
        // using java compareTo function to sort the Movie objects
        return movie1.getReleaseDate().compareTo(movie2.getReleaseDate());

    }
}
