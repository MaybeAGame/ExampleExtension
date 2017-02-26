package pl.grzegorz2047.exampleextension;

import pl.grzegorz2047.maybeagame.extension.Extension;
import pl.grzegorz2047.maybeagame.extension.event.EventManager;
import pl.grzegorz2047.maybeagame.extension.event.PlayerMoveEvent;

/**
 * Plik stworzony przez grzegorz2047 11.02.2017.
 */
public class ExampleExtension implements Extension {

    private ExtensionThread et = new ExtensionThread();

    @Override
    public void onEnable() {
        System.out.print("Plugin zostal uruchomiony");
        EventManager.registerListener(new PlayerMoveListener(), PlayerMoveEvent.class.getName());
        //et.start();
    }

    @Override
    public void onDisable() {
        //et.stop();
    }

    @Override
    public String getName() {
        return "MyPlugin";
    }
}
