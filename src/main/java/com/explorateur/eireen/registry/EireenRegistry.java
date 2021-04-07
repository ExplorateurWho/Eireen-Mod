package com.explorateur.eireen.registry;

import com.example.examplemod.EireenMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EireenRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, EireenMod.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, EireenMod.MODID);

    public static boolean initialized = false;

    public static void register() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        if(!initialized) {


            BLOCKS.register(bus);
            ITEMS.register(bus);

            initialized = true;
        }

    }
}
