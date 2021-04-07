package com.explorateur.eireen.common.init;

import com.explorateur.eireen.common.items.EItemTier;
import com.explorateur.eireen.registry.EireenRegistry;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;

public class EItems {

    public static RegistryObject<Item> AMETHYST = register(new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)), "amethyst");
    public static RegistryObject<Item> ELECTRIC = register(new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)), "electric");

    public static RegistryObject<Item> ELECTRIC_SWORD = register(new SwordItem(EItemTier.ELECTRIC, 2, 1.5f, new Item.Properties().tab(ItemGroup.TAB_TOOLS)), "electric_sword");
    public static RegistryObject<Item> ELECTRIC_SHOVEL = register(new ShovelItem(EItemTier.ELECTRIC, 1, 1, new Item.Properties().tab(ItemGroup.TAB_TOOLS)), "electric_shovel");
    public static RegistryObject<Item> ELECTRIC_PICKAXE = register(new PickaxeItem(EItemTier.ELECTRIC, 1,1, new Item.Properties().tab(ItemGroup.TAB_TOOLS)), "electric_pickaxe");
    public static RegistryObject<Item> ELECTRIC_HOE = register(new HoeItem(EItemTier.ELECTRIC, 1, 1, new Item.Properties().tab(ItemGroup.TAB_TOOLS)), "electric_hoe");

    public static <T extends Item> RegistryObject<T> register(T item, String name) {
        return EireenRegistry.ITEMS.register(name, () -> item);
    }

}
