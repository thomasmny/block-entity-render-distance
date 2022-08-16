package com.trichtern.blockentityrenderdistance;

import com.trichtern.blockentityrenderdistance.config.ModConfigs;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Trichtern
 */
public class BlockEntityRenderDistance implements ModInitializer {

    public static final String MOD_ID = "blockentityrenderdistance";
    public static final Logger LOGGER = LoggerFactory.getLogger("BlockEntityRenderDistance");

    @Override
    public void onInitialize() {
        ModConfigs.registerConfigs();
    }
}