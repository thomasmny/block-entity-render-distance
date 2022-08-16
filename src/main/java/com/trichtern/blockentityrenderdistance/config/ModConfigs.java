package com.trichtern.blockentityrenderdistance.config;

import com.mojang.datafixers.util.Pair;
import com.trichtern.blockentityrenderdistance.BlockEntityRenderDistance;

public class ModConfigs {

    public static SimpleConfig config;
    private static ModConfigProvider configs;

    public static double RENDER_DISTANCE_MODIFIER;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        config = SimpleConfig.of(BlockEntityRenderDistance.MOD_ID).provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("renderdistance.modifier", 1.0), "The amount by which the default render distance is modified");
    }

    private static void assignConfigs() {
        RENDER_DISTANCE_MODIFIER = config.getOrDefault("renderdistance.modifier", 1d);

        BlockEntityRenderDistance.LOGGER.info("All " + configs.getConfigsList().size() + " have been set properly");
    }
}