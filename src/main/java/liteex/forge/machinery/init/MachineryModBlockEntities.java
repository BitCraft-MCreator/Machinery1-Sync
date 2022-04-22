
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package liteex.forge.machinery.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import liteex.forge.machinery.block.entity.SolarPanelBlockEntity;
import liteex.forge.machinery.block.entity.EnergySwordFurnaceBlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MachineryModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> SOLAR_PANEL = register("machinery:solar_panel", MachineryModBlocks.SOLAR_PANEL,
			SolarPanelBlockEntity::new);
	public static final BlockEntityType<?> ENERGY_SWORD_FURNACE = register("machinery:energy_sword_furnace", MachineryModBlocks.ENERGY_SWORD_FURNACE,
			EnergySwordFurnaceBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
