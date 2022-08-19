package com.trichtern.blockentityrenderdistance;

import com.trichtern.blockentityrenderdistance.config.ModConfig;
import net.fabricmc.api.ModInitializer;

/**
 * @author Trichtern
 */
public class BlockEntityRenderDistance implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConfig.init();
    }
}