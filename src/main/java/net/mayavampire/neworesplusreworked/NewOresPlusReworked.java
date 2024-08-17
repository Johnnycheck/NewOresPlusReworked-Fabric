package net.mayavampire.neworesplusreworked;

import net.fabricmc.api.ModInitializer;
import net.mayavampire.neworesplusreworked.block.ModBlocks;
import net.mayavampire.neworesplusreworked.item.ModItemGroups;
import net.mayavampire.neworesplusreworked.item.ModItems;
import net.mayavampire.neworesplusreworked.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class NewOresPlusReworked implements ModInitializer {
	public static final String MOD_ID = "neworesplusreworked";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItems.initialize ();
		ModItemGroups.registerItemGroups ();
		ModBlocks.registerModBlocks ();
		ModWorldGeneration.generateModWorldGen();

    }
}