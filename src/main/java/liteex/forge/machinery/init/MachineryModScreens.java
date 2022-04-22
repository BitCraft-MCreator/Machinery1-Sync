
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package liteex.forge.machinery.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import liteex.forge.machinery.client.gui.EnergySwordFurnaceGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MachineryModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(MachineryModMenus.ENERGY_SWORD_FURNACE_GUI, EnergySwordFurnaceGUIScreen::new);
		});
	}
}
