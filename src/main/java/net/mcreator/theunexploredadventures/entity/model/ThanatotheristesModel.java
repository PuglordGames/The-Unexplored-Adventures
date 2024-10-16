package net.mcreator.theunexploredadventures.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.theunexploredadventures.entity.ThanatotheristesEntity;

public class ThanatotheristesModel extends GeoModel<ThanatotheristesEntity> {
	@Override
	public ResourceLocation getAnimationResource(ThanatotheristesEntity entity) {
		return new ResourceLocation("the_unexplored_adventures", "animations/thanatotheristes.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ThanatotheristesEntity entity) {
		return new ResourceLocation("the_unexplored_adventures", "geo/thanatotheristes.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ThanatotheristesEntity entity) {
		return new ResourceLocation("the_unexplored_adventures", "textures/entities/" + entity.getTexture() + ".png");
	}

}
