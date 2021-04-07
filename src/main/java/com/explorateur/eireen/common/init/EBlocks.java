package com.explorateur.eireen.common.init;

import com.explorateur.eireen.registry.EireenRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class EBlocks {

    public static final RegistryObject<Block> AMETHYST_ORE = register(new Block(AbstractBlock.Properties.of(Material.STONE).strength(4)), "amethyst_ore", ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> AMETHYST_BLOCK = register(new Block(AbstractBlock.Properties.of(Material.STONE).strength(4)), "amethyst_block", ItemGroup.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ELECTRIC_ORE = register(new Block(AbstractBlock.Properties.of(Material.STONE).strength(4)), "electric_ore", ItemGroup.TAB_BUILDING_BLOCKS);

    public static <T extends Block> RegistryObject<T> register(T block, String name, ItemGroup group) {
        EireenRegistry.ITEMS.register(name, () -> new BlockItem(block, new Item.Properties().tab(group)));
        return EireenRegistry.BLOCKS.register(name, () -> block);
    }
}


