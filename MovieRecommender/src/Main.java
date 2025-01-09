/* Resources Used: CSC 130 Canvas Slides, https://docs.oracle.com/javase/8/docs/api/?java/util/Comparator.html, https://docs.oracle.com/javase/8/docs/api/index.html?java/time/LocalDate.html
https://www.youtube.com/watch?v=dRX6qO46l44, https://www.educative.io/answers/what-is-the-priorityqueueaddall-method-in-java */

// Summary: This program practices the use of heaps, priority queues, and generic classes in Java. In this assignment, we implemented both the Comparable interface as well as the Comparator
// interface. The program includes a Movie class, MovieReleaseDate Comparator class, MovieGenre Comparator class, and our testing occurs in Main. We are sorting recommendation priority
// from high to low in an effort to make the recommendation queue as realistic as possible. Most streaming services will provide a recommended list of shows/movies depending on the
// user's likelihood to watch the show. Our program allows the User to scan their choice of sorting the Movie objects based on recommendations, release date, or genre. Each comparator class
// in our program implements a compare function

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // initialize priority queue
        PriorityQueue<Movie> moviesQueue = null;
        int choice;
        Scanner scanner = new Scanner(System.in);

        // Movie objects
        Movie movie1 = new Movie("Shrek", "Fantasy", "PG", LocalDate.of(2001, 4, 21), 8);
        Movie movie2 = new Movie("Star Wars", "Sci Fi", "PG-13", LocalDate.of(1977, 5, 25), 5);
        Movie movie3 = new Movie("Like Mike", "Comedy", "PG", LocalDate.of(2002, 7, 3), 10);
        Movie movie4 = new Movie("Shark Tale", "Family", "PG", LocalDate.of(2004, 10, 1), 7);
        Movie movie5 = new Movie("Goodfellas", "Crime", "R", LocalDate.of(1990, 9, 19), 9);
        Movie movie6 = new Movie("Bee Movie", "Sci Fi", "PG-13", LocalDate.of(2007, 11, 2), 3);
        Movie movie7 = new Movie("Friday the 13th", "Horror", "R", LocalDate.of(1980, 5, 13), 7);
        Movie movie8 = new Movie("Twilight", "Romance", "PG-13", LocalDate.of(2008, 11, 21), 9);
        Movie movie9 = new Movie("Mission Impossible", "Action", "PG-13", LocalDate.of(1996, 5, 22), 8);
        Movie movie10 = new Movie("Casino", "Thriller", "PG-13", LocalDate.of(1995, 11, 22), 10);

        // Storing movie objects in a list
        List<Movie> movies = new ArrayList<>();
        // adding movie objects to list
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);
        movies.add(movie7);
        movies.add(movie8);
        movies.add(movie9);
        movies.add(movie10);

        // User Input
        System.out.println("Movie Sorting Options:");
        System.out.println("By Recommendation: Type '1'");
        System.out.println("By Release Date: Type '2'");
        System.out.println("By Genre: Type '3'");
        System.out.println("How would you like your movies to be sorted:");
        // using scanner to get user input
        choice = scanner.nextInt();
        //scanner.close();

        if (choice == 1) {
            // Using collections.sort to sort by Recommendation, using compareTo from Movie class
            Collections.sort(movies);
            moviesQueue = new PriorityQueue<>();
            moviesQueue.addAll(movies);

            // prints top of queue
            System.out.println("Top of your queue:\n" + moviesQueue.peek());

            // prints all contents of queue
            System.out.println("Contents of your queue by recommendation:\n" + moviesQueue);

            // deletes top of queue and displays the queue after deletion
            moviesQueue.poll();
            System.out.println("\nNEW QUEUE AFTER DELETION:\n" + moviesQueue);

        } else if (choice == 2) {
            // Using collections.sort to sort by Movie Release Date, using compareTo from Movie class
            Collections.sort(movies, new MovieReleaseDate());
            moviesQueue = new PriorityQueue<>(new MovieReleaseDate());
            moviesQueue.addAll(movies);

            // prints top of queue
            System.out.println("Top of your queue:\n" + moviesQueue.peek());

            // prints all contents of queue
            System.out.println("Contents of your queue by movie release date:\n" + moviesQueue);

            // deletes top of queue and displays the queue after deletion
            moviesQueue.poll();
            System.out.println("\nNEW QUEUE AFTER DELETION:\n" + moviesQueue);

        } else if (choice == 3) {
            // Using collections.sort to sort by Movie Genre, using compareTo from Movie class
            Collections.sort(movies, new MovieGenre());
            moviesQueue = new PriorityQueue<>(new MovieGenre());
            moviesQueue.addAll(movies);

            // prints top of queue
            System.out.println("Top of your queue:\n" + moviesQueue.peek());

            // prints all contents of queue
            System.out.println("Contents of your queue by movie genre:\n" + moviesQueue);

            // deletes top of queue and displays the queue after deletion
            moviesQueue.poll();
            System.out.println("\nNEW QUEUE AFTER DELETION:\n" + moviesQueue);

        }

        // Extra Credit
        // You can enhance the program by adding a loop where the user will be given the options to insert, peek, print, delete movie from the created queue or exit
        int choiceEC;
        // utilizing while loop until user exits program
        while (true) {
            // Additional options for user to pick from according to assignment instructions
            System.out.println("Additional Options:");
            System.out.println("Insert: Type '1'");
            System.out.println("Peek: Type '2'");
            System.out.println("Print: Type '3'");
            System.out.println("Delete: Type '4'");
            System.out.println("Exit: Type '5'");
            System.out.println("What Option Would You Like to Pick?:");
            choiceEC = scanner.nextInt();
            // inserting new Movie object into the queue
            // asking user input for various Movie attributes
            if (choiceEC == 1) {
                //String test;
                String titleNew;
                String genreNew;
                String ratingNew;
                int year;
                int month;
                int day;
                int recommendationNew;
                System.out.println("---------");
                scanner.nextLine();
                // scanning user input
                System.out.println("Please Enter Movie Title: ");
                titleNew = scanner.nextLine();
                System.out.println("Please Enter Movie Genre: ");
                genreNew = scanner.nextLine();
                System.out.println("Please Enter Movie Rating: ");
                ratingNew = scanner.nextLine();
                System.out.println("Please Enter Movie Release Year: ");
                year = scanner.nextInt();
                System.out.println("Please Enter Movie Release Month: ");
                month = scanner.nextInt();
                System.out.println("Please Enter Movie Release Day: ");
                day = scanner.nextInt();
                System.out.println("Please Enter Movie Recommendation: ");
                recommendationNew = scanner.nextInt();
                // Creating new Movie object with user inputted data
                Movie newMovie = new Movie(titleNew, genreNew, ratingNew, LocalDate.of(year, month, day), recommendationNew);
                //adding newly created Movie object into queue
                moviesQueue.add(newMovie);

            } else if (choiceEC == 2) {
                // prints top of queue
                System.out.println("Top of your queue:\n" + moviesQueue.peek());

            } else if (choiceEC == 3) {
                // prints all contents of queue
                System.out.println("Contents of your queue by movie genre:\n" + moviesQueue);

            } else if (choiceEC == 4) {
                // deletes top of queue and displays the queue after deletion
                moviesQueue.poll();
                System.out.println("\nNEW QUEUE AFTER DELETION:\n" + moviesQueue);

            } else if (choiceEC == 5) {
                // exit program
                System.out.println("\nExiting Program");
                break;

            } else {
                //invalid user choice, reprint options
                System.out.println("Invalid Choice");
            }
        } scanner.close();
    }
}