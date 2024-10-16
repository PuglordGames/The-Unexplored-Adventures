
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunexploredadventures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.theunexploredadventures.TheUnexploredAdventuresMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheUnexploredAdventuresModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheUnexploredAdventuresMod.MODID);
	public static final RegistryObject<CreativeModeTab> THE_UNEXPLORED_ADVENTURES = REGISTRY.register("the_unexplored_adventures", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.the_unexplored_adventures.the_unexplored_adventures")).icon(() -> new ItemStack(TheUnexploredAdventuresModItems.THANATOTHERISTES_TOOTH.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheUnexploredAdventuresModItems.THANATOTHERISTES_SPAWN_EGG.get());
				tabData.accept(TheUnexploredAdventuresModItems.THANATOTHERISTES_TOOTH.get());
			})

			.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TheUnexploredAdventuresModItems.THANATOTHERISTES_SWORD.get());
		}
	}
}
