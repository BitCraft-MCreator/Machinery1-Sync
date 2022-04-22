
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package liteex.forge.machinery.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MachineryModTabs {
	public static CreativeModeTab TAB_MACHINERY;

	public static void load() {
		TAB_MACHINERY = new CreativeModeTab("tabmachinery") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.IRON_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
