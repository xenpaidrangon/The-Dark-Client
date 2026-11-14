package com.darkclient;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DarkClient implements ClientModInitializer {
    public static final String MOD_ID = "darkclient";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("The Dark Client Loaded - Welcome Dark!");
    }
}
