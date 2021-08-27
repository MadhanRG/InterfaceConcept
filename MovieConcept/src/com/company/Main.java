package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Movie> movieList=new ArrayList<>();

        Movie movie1=new Movie();
        movie1.setMovieName("Master");
        movie1.setActor("vijay");
        movie1.setReleasedYear(2021);

        Movie movie2=new Movie();
        movie2.setMovieName("Viswasam");
        movie2.setActor("Ajith");
        movie2.setReleasedYear(2019);

        Movie movie3=new Movie();
        movie3.setMovieName("Peta");
        movie3.setActor("Rajinikanth");
        movie3.setReleasedYear(2019);

        Movie movie4=new Movie();
        movie4.setMovieName("Vikram");
        movie4.setActor("kamalhashan");
        movie4.setReleasedYear(2021);

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);


        //findMovieNameByReleasedYear(movieList);
        //findMovieNameByActor(movieList);

        getMovieName(movieList,movie -> movie.getReleasedYear()==2021);
        getMovieName(movieList,movie -> movie.getActor().equalsIgnoreCase("kamalhashan"));

    }

    /*public static void findMovieNameByReleasedYear(List<Movie> movieList){
        for (Movie movie: movieList ){
            if (movie.getReleasedYear()==2021){
                System.out.println(movie.getMovieName());
            }
        }
    }

    public static void  findMovieNameByActor(List<Movie> movieList){
        for (Movie movie: movieList){
            if (movie.getActor().equalsIgnoreCase("Rajinikanth")){
                System.out.println(movie.getMovieName());
            }
        }
    }*/

    public static void getMovieName(List<Movie> movieList, Predicate<Movie> moviePredicate){
        for (Movie movie:movieList){
            if (moviePredicate.test(movie)){
                System.out.println(movie.getMovieName());
            }
        }
    }




}
