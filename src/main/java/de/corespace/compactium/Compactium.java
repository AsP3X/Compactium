package de.corespace.compactium;

import de.corespace.compactium.block.ModBlocks;
import de.corespace.compactium.item.ModItemGroups;
import de.corespace.compactium.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Compactium implements ModInitializer {
	public static final String MOD_ID = "compactium";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}