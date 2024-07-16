package net.mayavampire.neworesplusreworked.block;

import net.mayavampire.neworesplusreworked.NewOresPlusReworked;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static net.minecraft.block.Blocks.*;


public class ModBlocks {

    public static final Block SAPPHIRE_BLOCK = registerBlock ("sapphire_block",
            new Block ( AbstractBlock.Settings.copy( IRON_BLOCK).sounds ( BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block ( AbstractBlock.Settings.copy( IRON_BLOCK)));
    public static Block SAPPHIRE_ORE = registerBlock ( "sapphire_ore",
            new ExperienceDroppingBlock( UniformIntProvider.create(3, 6), AbstractBlock.Settings.create().requiresTool().strength(2.0F, 2.0F)));
    public static Block DEEPSLATE_SAPPHIRE_ORE = registerBlock ( "deepslate_sapphire_ore",
            new ExperienceDroppingBlock( UniformIntProvider.create(3, 6), AbstractBlock.Settings.copy ( DEEPSLATE).requiresTool().strength(4.5F, 3.0F)));
    public static Block ENDSTONE_SAPPHIRE_ORE = registerBlock ( "endstone_sapphire_ore",
            new ExperienceDroppingBlock( UniformIntProvider.create(3, 6), AbstractBlock.Settings.copy ( END_STONE).requiresTool().strength(4.0F, 4.0F)));
    public static Block NETHER_SAPPHIRE_ORE = registerBlock ( "nether_sapphire_ore",
            new ExperienceDroppingBlock( UniformIntProvider.create(3, 6), AbstractBlock.Settings.copy( NETHERRACK).requiresTool().strength(1.5F, 1.5f)));
    public static Block TIN_ORE = registerBlock ( "tin_ore",
            new ExperienceDroppingBlock( UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy ( IRON_ORE).requiresTool().strength(3.0F, 3.0F)));






    public static final Block RAW_SAPPHIRE_BLOCK = registerBlock ( "raw_sapphire_block",
            new Block ( AbstractBlock.Settings.copy( IRON_BLOCK)));
    public static final Block RAW_TIN_BLOCK = registerBlock ( "raw_tin_block",
            new Block ( AbstractBlock.Settings.copy( IRON_BLOCK)));


    private static Block registerBlock(String name, Block block) {
            registerBlockItem (name, block);
            return Registry.register ( Registries.BLOCK, Identifier.of(NewOresPlusReworked.MOD_ID, name), block);
        }


        private static Item registerBlockItem(String name, Block block) {
            return Registry.register ( Registries.ITEM , Identifier.of ( NewOresPlusReworked.MOD_ID , name ) ,
                    new BlockItem ( block , new Item.Settings () ) );
        }

    public static void registerModBlocks() {
        NewOresPlusReworked.LOGGER.info("Registering ModBlocks for " + NewOresPlusReworked.MOD_ID);
    }
}
