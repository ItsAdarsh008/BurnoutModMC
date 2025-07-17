package net.adarsh.tutorialmod.sound;

import net.adarsh.tutorialmod.TutorialMod;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent GARNET_BLOCK_BREAK = registerSoundEvent("garnet_block_break");
    public static final SoundEvent GARNET_BLOCK_STEP = registerSoundEvent("garnet_block_step");
    public static final SoundEvent GARNET_BLOCK_PLACE = registerSoundEvent("garnet_block_place");
    public static final SoundEvent GARNET_BLOCK_HIT = registerSoundEvent("garnet_block_hit");
    public static final SoundEvent GARNET_BLOCK_FALL = registerSoundEvent("garnet_block_fall");

    public static final BlockSoundGroup GARNET_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            GARNET_BLOCK_BREAK,GARNET_BLOCK_STEP,GARNET_BLOCK_PLACE,GARNET_BLOCK_HIT,GARNET_BLOCK_FALL);

    public static final SoundEvent KEY = registerSoundEvent("key");
    public static final RegistryKey<JukeboxSong> KEY_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "key"));


    public static final SoundEvent DOOR = registerSoundEvent("door");
    public static final RegistryKey<JukeboxSong> DOOR_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "door"));

    public static final SoundEvent SUBWOOFER = registerSoundEvent("subwoofer");
    public static final RegistryKey<JukeboxSong> SUBWOOFER_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "subwoofer"));

    public static final SoundEvent DEATH = registerSoundEvent("death");
    public static final RegistryKey<JukeboxSong> DEATH_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "death"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(TutorialMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        TutorialMod.LOGGER.info("Registering sounds for "+ TutorialMod.MOD_ID);
    }
}
