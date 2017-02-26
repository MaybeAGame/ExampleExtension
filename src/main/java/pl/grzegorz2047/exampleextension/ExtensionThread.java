package pl.grzegorz2047.exampleextension;

import com.badlogic.gdx.Gdx;
import pl.grzegorz2047.maybeagame.GameRoot;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Plik stworzony przez grzegorz2047 11.02.2017.
 */
public class ExtensionThread extends Thread {

    @Override
    public void run() {
        while (true){
            Logger.getLogger(GameRoot.class.getName()).log(Level.SEVERE,"xd");
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
