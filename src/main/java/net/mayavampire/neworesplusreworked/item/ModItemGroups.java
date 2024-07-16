package net.mayavampire.neworesplusreworked.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.mayavampire.neworesplusreworked.NewOresPlusReworked;
import net.mayavampire.neworesplusreworked.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;



public class ModItemGroups {
    public static final ItemGroup SAPPHIRE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NewOresPlusReworked.MOD_ID, "sapphire"),
            FabricItemGroup.builder().displayName ( Text.translatable ("itemgroup.sapphire"))
                    .icon(() -> new ItemStack ( ModItems.SAPPHIRE)).entries ((displayContext , entries) -> {
                        entries.add ( ModItems.SAPPHIRE );
                        entries.add ( ModItems.RAW_SAPPHIRE );
                        entries.add ( ModBlocks.SAPPHIRE_BLOCK );
                        entries.add (ModBlocks.RAW_SAPPHIRE_BLOCK );
                        entries.add ( ModBlocks.SAPPHIRE_ORE );
                        entries.add ( ModBlocks.DEEPSLATE_SAPPHIRE_ORE );
                        entries.add(ModBlocks.ENDSTONE_SAPPHIRE_ORE);
                        entries.add ( ModBlocks.NETHER_SAPPHIRE_ORE );
                        entries.add ( ModItems.SAPPHIRE_PICKAXE );
                        entries.add ( ModItems.SAPPHIRE_AXE );
                        entries.add ( ModItems.SAPPHIRE_SHOVEL );
                        entries.add ( ModItems.SAPPHIRE_HOE );
                        entries.add ( ModItems.SAPPHIRE_SWORD );





                        entries.add ( ModItems.RAW_TIN );
                        entries.add ( ModItems.TIN_INGOT );
                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add ( ModBlocks.RAW_TIN_BLOCK );
                        entries.add ( ModBlocks.TIN_ORE );

                    }).build ());


    public static void registerItemGroups() {
        NewOresPlusReworked.LOGGER.info("Thank you for playing NewOresPlusReworked!");
    }

}
