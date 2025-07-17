package net.adarsh.tutorialmod.item;

import net.adarsh.tutorialmod.TutorialMod;
import net.adarsh.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
    Identifier.of(TutorialMod.MOD_ID, "pink_garnet_items"),
    FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.KEY_MUSIC_DISC))
            .displayName(Text.translatable("itemgroup.tutorialmod.key_items"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.KEY_MUSIC_DISC);
                entries.add(ModItems.DOOR_MUSIC_DISC);
                entries.add(ModItems.SUBWOOFER_MUSIC_DISC);
                entries.add(ModItems.DEATH_MUSIC_DISC);
                entries.add(ModItems.LIVING_MUSIC_DISC);
                entries.add(ModItems.MOOG_MUSIC_DISC);
                entries.add(ModItems.HAGGSTROM_MUSIC_DISC);
                entries.add(ModItems.MINECRAFT_MUSIC_DISC);
                entries.add(ModItems.OXYGENE_MUSIC_DISC);
                entries.add(ModItems.EQUINOX_MUSIC_DISC);
                entries.add(ModItems.MICE_MUSIC_DISC);
                entries.add(ModItems.DRY_MUSIC_DISC);
                entries.add(ModItems.WET_MUSIC_DISC);
                entries.add(ModItems.CLARK_MUSIC_DISC);
                entries.add(ModItems.CHRIS_MUSIC_DISC);
                entries.add(ModItems.THIRTEEN_MUSIC_DISC);
                entries.add(ModItems.EXCUSE_MUSIC_DISC);
                entries.add(ModItems.SWEDEN_MUSIC_DISC);
                entries.add(ModItems.CAT_MUSIC_DISC);
                entries.add(ModItems.DOG_MUSIC_DISC);
                entries.add(ModItems.DANNY_MUSIC_DISC);
                entries.add(ModItems.BEGINNING_MUSIC_DISC);
                entries.add(ModItems.DROOPYR_MUSIC_DISC);
                entries.add(ModItems.DROOPYY_MUSIC_DISC);

            }).build());

    /*public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
    Identifier.of(TutorialMod.MOD_ID, "pink_garnet_blocks"),
    FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
            .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_blocks"))
            .entries((displayContext, entries) -> {
                entries.add(ModBlocks.PINK_GARNET_BLOCK);
                entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

            }).build());*/




    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
