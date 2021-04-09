package com.explorateur.eireen.client.rendering.entity;

import com.explorateur.eireen.EireenMod;
import com.explorateur.eireen.client.models.ModelMutanic;
import com.explorateur.eireen.common.entity.EntityMutanic;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.ZombieRenderer;
import net.minecraft.client.renderer.model.ModelHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

public class RenderMutanic extends LivingRenderer<EntityMutanic, ModelMutanic> {

    public RenderMutanic(EntityRendererManager p_i50965_1_) {
        super(p_i50965_1_, new ModelMutanic(), 1);
    }

    @Override
    public void render(EntityMutanic p_225623_1_, float p_225623_2_, float p_225623_3_, MatrixStack p_225623_4_, IRenderTypeBuffer p_225623_5_, int p_225623_6_) {
        super.render(p_225623_1_, p_225623_2_, p_225623_3_, p_225623_4_, p_225623_5_, p_225623_6_);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityMutanic p_110775_1_) {
        return EntityMutanic.TYPE_LIST.get(p_110775_1_.getEntityData().get(EntityMutanic.TYPE));
    }
}
