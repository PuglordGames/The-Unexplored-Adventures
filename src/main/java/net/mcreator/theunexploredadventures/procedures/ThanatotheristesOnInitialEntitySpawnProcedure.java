package net.mcreator.theunexploredadventures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.theunexploredadventures.entity.ThanatotheristesEntity;

public class ThanatotheristesOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("plains"))) {
			if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
				if (entity instanceof ThanatotheristesEntity animatable)
					animatable.setTexture("thanatotheristes2");
			} else {
				if (entity instanceof ThanatotheristesEntity animatable)
					animatable.setTexture("thanatotheristes3");
			}
		}
	}
}
