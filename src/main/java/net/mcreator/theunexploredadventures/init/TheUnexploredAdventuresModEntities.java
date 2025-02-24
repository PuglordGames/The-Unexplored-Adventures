
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theunexploredadventures.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.theunexploredadventures.entity.ThanatotheristesEntity;
import net.mcreator.theunexploredadventures.TheUnexploredAdventuresMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheUnexploredAdventuresModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TheUnexploredAdventuresMod.MODID);
	public static final RegistryObject<EntityType<ThanatotheristesEntity>> THANATOTHERISTES = register("thanatotheristes",
			EntityType.Builder.<ThanatotheristesEntity>of(ThanatotheristesEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(50).setUpdateInterval(3).setCustomClientFactory(ThanatotheristesEntity::new)

					.sized(3f, 3f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ThanatotheristesEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(THANATOTHERISTES.get(), ThanatotheristesEntity.createAttributes().build());
	}
}
