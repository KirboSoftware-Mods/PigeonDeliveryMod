package com.piginmail;

import com.piginmail.entity.ModEntities;
import com.piginmail.entity.custom.PigeonEntity;
import com.piginmail.item.PDitems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pigindelivery implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("pigin_mail");
	public static final String MOD_ID = "pigin_mail";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		PDitems.init();
		FabricDefaultAttributeRegistry.register(ModEntities.PIGEON, PigeonEntity.createPigeonAttributes());


		LOGGER.info("Pigeons Be flapping!");


	}
}