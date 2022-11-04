package org.example.instrument.model;

public class Guitar extends Instrument {
    @Override
    protected void playNote(char note) {
        System.out.printf("Guitar | Note: \u001B[34m%c\u001B[0m\n", note);
    }
}
