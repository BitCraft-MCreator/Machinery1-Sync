
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package liteex.forge.machinery.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import liteex.forge.machinery.item.MeterItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MachineryModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item SOLAR_PANEL = register(MachineryModBlocks.SOLAR_PANEL, MachineryModTabs.TAB_MACHINERY);
	public static final Item METER = register(new MeterItem());
	public static final Item ENERGY_SWORD_FURNACE = register(MachineryModBlocks.ENERGY_SWORD_FURNACE, MachineryModTabs.TAB_MACHINERY);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
