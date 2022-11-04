package org.example.film;

import org.example.film.model.Film;
import org.example.film.model.FilmType;

public class Main {
    public static void main(String[] args) {
        Film film = new Film("Harry Potter and the Philosopher's Stone");
        System.out.println(film);

        // Bonus and price for a NEW FILM for 5 days
        System.out.println(film.getBonus(5) + " " + film.getPrice(5));

        film.setFilmType(FilmType.REGULAR);
        // Bonus and price for a REGULAR FILM for 5 days
        System.out.println(film + "\n" + film.getBonus(5) + " " + film.getPrice(5));
    }
}
