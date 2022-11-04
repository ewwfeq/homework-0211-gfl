package org.example.instrument.model;

public class Drum extends Instrument {
    @Override
    protected void playNote(char note) {
        System.out.printf("Drum | Note: \u001B[32m%c\u001B[0m\n", note);
    }
}
