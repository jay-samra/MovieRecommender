import java.util.Comparator;

public class MovieGenre implements Comparator<Movie>{
    // Comparing Movie objects based on their genre
    @Override
    public int compare(Movie movie1, Movie movie2) {
        // using java compareTo function to sort the Movie objects
        return movie1.getGenre().compareTo(movie2.getGenre());
    }
}
