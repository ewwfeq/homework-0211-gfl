package org.example.instrument;

import org.example.instrument.model.Drum;
import org.example.instrument.model.Guitar;
import org.example.instrument.model.Instrument;
import org.example.instrument.model.Piano;

public class Main {
    public static void main(String[] args) {
         Instrument guitar = new Guitar();
         Instrument piano = new Piano();
         Instrument drum = new Drum();
         guitar.play("♩♪♫♬♬♪♩♬");
         piano.play("♫♬♩♪♩♩♬♫♬");
         drum.play("♫♬♪♫♬♪♩");
    }
}