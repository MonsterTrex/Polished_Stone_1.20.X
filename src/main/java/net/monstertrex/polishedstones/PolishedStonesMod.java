package net.monstertrex.polishedstones;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PolishedStonesMod implements ModInitializer {
	public static final String MOD_ID = "polishedstones";
    public static final Logger LOGGER = LoggerFactory.getLogger("polishedstones");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}