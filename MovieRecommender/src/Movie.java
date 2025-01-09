import java.time.LocalDate;

public class Movie implements Comparable<Movie>{
    // Variable Declarations
    String title;
    String genre;
    String rating;
    LocalDate releaseDate;
    int recommendation;

    // Constructor for Movie
    Movie(String title, String genre, String rating, LocalDate releaseDate, int recommendation) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.recommendation = recommendation;
    }
    // Default Constructor if no arguments are passed
    Movie() {
        this.title = "";
        this.genre = "";
        this.rating = "";
        this.recommendation = 0;
        this.releaseDate = LocalDate.now();
    }
    // toString method to display all information about the movie.
    public String toString() {
        return "Title: " + title + "\nGenre: " + genre
                + "\nRating: " + rating + "\nRelease Date: "
                + releaseDate + "\nRecommendation: " + recommendation + "\n";
    }
    // Getters for Movie
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public int getRecommendation() {
        return recommendation;
    }

    // Setters for Movie
    public void setTitle(String title){
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setReleaseDate(int year, int month, int day) {
        this.releaseDate = LocalDate.of(year, month, day);
    }

    public void setRecommendation(int recommendation) {
        this.recommendation = recommendation;
    }
    // Comparable compareTo Implementation
    // Orders recommendation from highest to lowest
    public int compareTo(Movie other){
        if(other.recommendation > this.recommendation)
            return 1;
        else if (other.recommendation < this.recommendation)
            return -1;
        else
            return 0;
    }
}

