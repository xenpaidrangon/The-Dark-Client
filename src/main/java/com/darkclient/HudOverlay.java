package com.darkclient;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;

public class HudOverlay {
    public static void register() {
        HudRenderCallback.EVENT.register((drawContext, tickDelta) -> {
            MinecraftClient client = MinecraftClient.getInstance();
            if (client.player == null) return;

            int fps = client.getCurrentFps();
            String text = "The Dark Client | FPS: " + fps;

            drawContext.drawTextWithShadow(
                client.textRenderer,
                text,
                10, 10,
                0xFFFFFF
            );
        });
    }
}
