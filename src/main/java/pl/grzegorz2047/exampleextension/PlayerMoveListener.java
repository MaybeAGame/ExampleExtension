package pl.grzegorz2047.exampleextension;

import pl.grzegorz2047.maybeagame.extension.event.Event;
import pl.grzegorz2047.maybeagame.extension.event.Listener;
import pl.grzegorz2047.maybeagame.extension.event.PlayerMoveEvent;

/**
 * Plik stworzony przez grzegorz2047 12.02.2017.
 */
public class PlayerMoveListener implements Listener {

    @Override
    public void notify(Event event) {
        System.out.println("Otrzymalem notyfikacje!");
        PlayerMoveEvent e = (PlayerMoveEvent) event;
        System.out.println(e.getLocation().toVector().toString());
    }
}
