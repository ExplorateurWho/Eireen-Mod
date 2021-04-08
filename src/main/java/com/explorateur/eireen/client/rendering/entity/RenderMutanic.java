package com.explorateur.eireen.client.rendering.entity;

import com.explorateur.eireen.EireenMod;
import com.explorateur.eireen.common.entity.EntityMutanic;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.util.ResourceLocation;

public class RenderMutanic extends ZombieRenderer {

    public RenderMutanic(EntityRendererManager p_i46127_1_) {
        super(p_i46127_1_);
    }

    @Override
    public ResourceLocation getTextureLocation(ZombieEntity p_110775_1_) {
        return EntityMutanic.TYPE_LIST.get(p_110775_1_.getEntityData().get(EntityMutanic.TYPE));
    }
}
