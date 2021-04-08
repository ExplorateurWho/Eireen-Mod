package com.explorateur.eireen;

import com.explorateur.eireen.client.init.EntityRenderRegistry;
import com.explorateur.eireen.common.init.EEntities;
import com.explorateur.eireen.registry.EireenRegistry;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(EireenMod.MODID)
public class EireenMod {
    public static EireenMod INSTANCE;

    public static final String MODID = "eireenmod";
    public static final Logger LOGGER = LogManager.getLogger();

    public EireenMod() {
        INSTANCE = this;

        EireenRegistry.register();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        EntityRenderRegistry.registryEntityRenders();
    }


    @SubscribeEvent
    public void onServerStarting(EntityAttributeCreationEvent event) {
        event.put(EEntities.MUTANIC.get(), ZombieEntity.createAttributes().build());
    }
}
