package org.example.instrument.model;

public class Piano extends Instrument {
    @Override
    protected void playNote(char note) {
        System.out.printf("Piano | Note: \u001B[31m%c\u001B[0m\n", note);
    }
}
