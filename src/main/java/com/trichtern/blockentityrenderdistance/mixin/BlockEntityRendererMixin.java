package com.trichtern.blockentityrenderdistance.mixin;

import com.trichtern.blockentityrenderdistance.config.ModConfig;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * @author Trichtern
 */
@Mixin(BlockEntityRenderer.class)
public interface BlockEntityRendererMixin {

    @Inject(method = "getRenderDistance", at = @At("RETURN"), cancellable = true)
    default void modifyRenderDistance(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(ModConfig.INSTANCE.renderDistance);
    }
}