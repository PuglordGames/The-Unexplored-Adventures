
package net.mcreator.theunexploredadventures.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.theunexploredadventures.init.TheUnexploredAdventuresModItems;

public class ThanatotheristesSwordItem extends PickaxeItem {
	public ThanatotheristesSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 350;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 4.6f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheUnexploredAdventuresModItems.THANATOTHERISTES_TOOTH.get()));
			}
		}, 1, -3f, new Item.Properties());
	}
}
