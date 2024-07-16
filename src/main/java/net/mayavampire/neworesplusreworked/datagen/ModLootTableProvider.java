package net.mayavampire.neworesplusreworked.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mayavampire.neworesplusreworked.block.ModBlocks;

import net.mayavampire.neworesplusreworked.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output,registriesFuture);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.RAW_SAPPHIRE_BLOCK);

        addDrop(ModBlocks.SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.RAW_SAPPHIRE));
        addDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.RAW_SAPPHIRE));
        addDrop(ModBlocks.NETHER_SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.NETHER_SAPPHIRE_ORE, ModItems.RAW_SAPPHIRE));
        addDrop(ModBlocks.ENDSTONE_SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.ENDSTONE_SAPPHIRE_ORE, ModItems.RAW_SAPPHIRE));





    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        final var builder = BlockLootTableGenerator.dropsNothing ();
        return builder;
    }
}
