package com.explorateur.eireen.world;
import com.explorateur.eireen.common.init.EBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import static net.minecraft.world.gen.placement.Placement.RANGE;

public class OreGeneration {
    public static void generateOres(final BiomeLoadingEvent event){
        if(!(event.getCategory().equals(Biome.Category.NETHER)  &&  event.getCategory().equals(Biome.Category.THEEND))){
            generateOres(event.getGeneration(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    EBlocks.ELECTRIC_ORE.get().getBlock().defaultBlockState();


        }
    }
    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount){
        BiomeGenerationSettings.Builder builder;
        builder = settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize))
                        .place(RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .square().func_242731_b(amount));
    }
    
}
