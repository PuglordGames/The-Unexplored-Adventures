
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunexploredadventures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.theunexploredadventures.item.ThanatotheristesToothItem;
import net.mcreator.theunexploredadventures.item.ThanatotheristesSwordItem;
import net.mcreator.theunexploredadventures.TheUnexploredAdventuresMod;

public class TheUnexploredAdventuresModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheUnexploredAdventuresMod.MODID);
	public static final RegistryObject<Item> THANATOTHERISTES_SPAWN_EGG = REGISTRY.register("thanatotheristes_spawn_egg", () -> new ForgeSpawnEggItem(TheUnexploredAdventuresModEntities.THANATOTHERISTES, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> THANATOTHERISTES_TOOTH = REGISTRY.register("thanatotheristes_tooth", () -> new ThanatotheristesToothItem());
	public static final RegistryObject<Item> THANATOTHERISTES_SWORD = REGISTRY.register("thanatotheristes_sword", () -> new ThanatotheristesSwordItem());
	// Start of user code block custom items
	// End of user code block custom items
}
