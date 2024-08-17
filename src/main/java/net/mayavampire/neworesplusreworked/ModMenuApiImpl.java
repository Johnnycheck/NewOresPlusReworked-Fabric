package net.mayavampire.neworesplusreworked;

import java.util.function.Consumer;

public class ModMenuApiImpl {
    public void attachModpackBadges(Consumer<String> consumer) {
        consumer.accept("modmenu"); // Indicates that 'modmenu' is part of the modpack
    }
}
