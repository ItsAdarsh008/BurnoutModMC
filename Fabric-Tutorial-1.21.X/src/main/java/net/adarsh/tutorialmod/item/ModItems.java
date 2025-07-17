package net.adarsh.tutorialmod.item;

import net.adarsh.tutorialmod.TutorialMod;
import net.adarsh.tutorialmod.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

//Discs begin

    public static final Item KEY_MUSIC_DISC = registerItem("key_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.KEY_KEY).maxCount(1)));

    public static final Item DOOR_MUSIC_DISC = registerItem("door_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.DOOR_KEY).maxCount(1)));

    public static final Item SUBWOOFER_MUSIC_DISC = registerItem("subwoofer_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.SUBWOOFER_KEY).maxCount(1)));

    public static final Item DEATH_MUSIC_DISC = registerItem("death_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.DEATH_KEY).maxCount(1)));

    public static final Item LIVING_MUSIC_DISC = registerItem("living_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.LIVING_KEY).maxCount(1)));

    public static final Item MOOG_MUSIC_DISC = registerItem("moog_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MOOG_KEY).maxCount(1)));

    public static final Item HAGGSTROM_MUSIC_DISC = registerItem("haggstrom_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.HAGGSTROM_KEY).maxCount(1)));

    public static final Item MINECRAFT_MUSIC_DISC = registerItem("minecraft_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.MINECRAFT_KEY).maxCount(1)));

    public static final Item OXYGENE_MUSIC_DISC = registerItem("oxygene_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.OXYGENE_KEY).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(KEY_MUSIC_DISC);
            entries.add(DOOR_MUSIC_DISC);
            entries.add(SUBWOOFER_MUSIC_DISC);
            entries.add(DEATH_MUSIC_DISC);
            entries.add(LIVING_MUSIC_DISC);
            entries.add(MOOG_MUSIC_DISC);
            entries.add(HAGGSTROM_MUSIC_DISC);
            entries.add(MINECRAFT_MUSIC_DISC);
            entries.add(OXYGENE_MUSIC_DISC);

        });
    }
}