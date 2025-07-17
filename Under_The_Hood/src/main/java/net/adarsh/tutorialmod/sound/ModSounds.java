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

    public static final SoundEvent LIVING = registerSoundEvent("living");
    public static final RegistryKey<JukeboxSong> LIVING_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "living"));

    public static final SoundEvent MOOG = registerSoundEvent("moog");
    public static final RegistryKey<JukeboxSong> MOOG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "moog"));

    public static final SoundEvent HAGGSTROM = registerSoundEvent("haggstrom");
    public static final RegistryKey<JukeboxSong> HAGGSTROM_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "haggstrom"));

    public static final SoundEvent MINECRAFT = registerSoundEvent("minecraft");
    public static final RegistryKey<JukeboxSong> MINECRAFT_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "minecraft"));

    public static final SoundEvent OXYGENE = registerSoundEvent("oxygene");
    public static final RegistryKey<JukeboxSong> OXYGENE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "oxygene"));

    static final SoundEvent EQUINOX = registerSoundEvent("equinox");
    public static final RegistryKey<JukeboxSong> EQUINOX_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "equinox"));

    static final SoundEvent MICE = registerSoundEvent("mice");
    public static final RegistryKey<JukeboxSong> MICE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "mice"));

    static final SoundEvent DRY = registerSoundEvent("dry");
    public static final RegistryKey<JukeboxSong> DRY_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "dry"));

    static final SoundEvent WET = registerSoundEvent("wet");
    public static final RegistryKey<JukeboxSong> WET_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "wet"));

    static final SoundEvent CLARK = registerSoundEvent("clark");
    public static final RegistryKey<JukeboxSong> CLARK_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "clark"));

    static final SoundEvent CHRIS = registerSoundEvent("chris");
    public static final RegistryKey<JukeboxSong> CHRIS_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "chris"));

    static final SoundEvent THIRTEEN = registerSoundEvent("thirteen");
    public static final RegistryKey<JukeboxSong> THIRTEEN_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "thirteen"));

    static final SoundEvent EXCUSE = registerSoundEvent("excuse");
    public static final RegistryKey<JukeboxSong> EXCUSE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "excuse"));

    static final SoundEvent SWEDEN = registerSoundEvent("sweden");
    public static final RegistryKey<JukeboxSong> SWEDEN_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "sweden"));

    static final SoundEvent CAT = registerSoundEvent("cat");
    public static final RegistryKey<JukeboxSong> CAT_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "cat"));

    static final SoundEvent DOG = registerSoundEvent("dog");
    public static final RegistryKey<JukeboxSong> DOG_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "dog"));

    static final SoundEvent DANNY = registerSoundEvent("danny");
    public static final RegistryKey<JukeboxSong> DANNY_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "danny"));

    static final SoundEvent BEGINNING = registerSoundEvent("beginning");
    public static final RegistryKey<JukeboxSong> BEGINNING_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "beginning"));

    static final SoundEvent DROOPYR = registerSoundEvent("droopyr");
    public static final RegistryKey<JukeboxSong> DROOPYR_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "droopyr"));

    static final SoundEvent DROOPYY = registerSoundEvent("droopyy");
    public static final RegistryKey<JukeboxSong> DROOPYY_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(TutorialMod.MOD_ID, "droopyy"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(TutorialMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        TutorialMod.LOGGER.info("Registering sounds for "+ TutorialMod.MOD_ID);
    }
}
