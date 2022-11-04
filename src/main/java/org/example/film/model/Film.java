package org.example.film.model;

public class Film {
    private String name;
    private FilmType filmType;

    {
        filmType = FilmType.NEW_FILM;
    }

    public Film(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FilmType getFilmType() {
        return filmType;
    }

    public void setFilmType(FilmType filmType) {
        this.filmType = filmType;
    }

    public int getPrice(int days) {
        return days * filmType.getPrice();
    }

    public int getBonus(int days) {
        return days * filmType.getBonus();
    }

    @Override
    public String toString() {
        return "Film: \u001B[32m" + name +
                "\u001B[0m | Type: \u001B[32m" + filmType +
                "\u001B[0m | Bonus for 1 day: \u001B[32m" + filmType.getBonus() +
                "\u001B[0m | Price for 1 day: \u001B[32m" + filmType.getPrice() + "$\u001B[0m";
    }
}
