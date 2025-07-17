package net.adarsh.tutorialmod.sound;

import net.adarsh.tutorialmod.TutorialMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
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

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(TutorialMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        TutorialMod.LOGGER.info("Registering sounds for "+ TutorialMod.MOD_ID);
    }
}
