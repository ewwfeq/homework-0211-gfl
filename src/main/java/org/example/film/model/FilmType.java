package org.example.film.model;

public enum FilmType {
    NEW_FILM(100, 15), CHILDREN(75, 10), REGULAR(50, 5);
    private final int price;
    private final int bonus;
    FilmType(int price, int bonus) {
        this.price = price;
        this.bonus = bonus;
    }

    public int getPrice() {
        return price;
    }

    public int getBonus() {
        return bonus;
    }
}
