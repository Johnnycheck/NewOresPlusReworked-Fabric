package net.mayavampire.neworesplusreworked.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mayavampire.neworesplusreworked.block.ModBlocks;
import net.mayavampire.neworesplusreworked.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE,
            ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModBlocks.NETHER_SAPPHIRE_ORE, ModBlocks.ENDSTONE_SAPPHIRE_ORE);

    public ModRecipeProvider(FabricDataOutput output , CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super ( output , registriesFuture );
    }


    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, ModRecipeProvider.SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE,
                0.7f, 200, "sapphire");
        offerBlasting(exporter, ModRecipeProvider.SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE,
                0.7f, 100, "sapphire");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.SAPPHIRE, RecipeCategory.DECORATIONS,
                ModBlocks.SAPPHIRE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_SAPPHIRE, 1)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('R', ModItems.RAW_SAPPHIRE)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.RAW_SAPPHIRE), conditionsFromItem(ModItems.RAW_SAPPHIRE))
                .offerTo(exporter, Identifier.of(getRecipeName(ModItems.RAW_SAPPHIRE)));
    }
}
