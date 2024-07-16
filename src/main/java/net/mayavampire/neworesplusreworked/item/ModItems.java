package net.mayavampire.neworesplusreworked.item;

import net.mayavampire.neworesplusreworked.NewOresPlusReworked;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SAPPHIRE = registerItem("sapphire", new Item (new Item.Settings ()));
    public static final Item RAW_SAPPHIRE = registerItem("raw_sapphire", new Item (new Item.Settings ()));
    public static final Item RAW_TIN = registerItem("raw_tin", new Item (new Item.Settings ()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item (new Item.Settings ()));

    public static final Item SAPPHIRE_PICKAXE = registerItem ( "sapphire_pickaxe", new PickaxeItem (ModToolMaterial.SAPPHIRE, new Item.Settings()));
    public static final Item SAPPHIRE_AXE = registerItem ( "sapphire_axe", new AxeItem (ModToolMaterial.SAPPHIRE, new Item.Settings()));
    public static final Item SAPPHIRE_SHOVEL = registerItem ( "sapphire_shovel", new ShovelItem(ModToolMaterial.SAPPHIRE, new Item.Settings()));
    public static final Item SAPPHIRE_HOE = registerItem ( "sapphire_hoe", new HoeItem(ModToolMaterial.SAPPHIRE, new Item.Settings()));
    public static final Item SAPPHIRE_SWORD = registerItem ( "sapphire_sword", new SwordItem (ModToolMaterial.SAPPHIRE, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of (NewOresPlusReworked.MOD_ID, name), item);
    }
    public static void initialize() {
    }
}