package net.adarsh.tutorialmod;

import net.adarsh.tutorialmod.block.ModBlocks;
import net.adarsh.tutorialmod.item.ModItemGroups;
import net.adarsh.tutorialmod.item.ModItems;
import net.adarsh.tutorialmod.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerSounds();
	}
}