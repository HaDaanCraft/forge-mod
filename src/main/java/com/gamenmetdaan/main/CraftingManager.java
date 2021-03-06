package com.gamenmetdaan.main;

import com.gamenmetdaan.blocks.MBlocks;
import com.gamenmetdaan.item.MItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
	public static void mainRegistry(){
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
		//Shaped
		GameRegistry.addRecipe(new ItemStack(MBlocks.ComStone, 1), new Object[]{"XXX","XXX","XXX", 'X', Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(MItems.oStick, 1), new Object[]{" X "," X ", 'X', Blocks.obsidian});
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(Blocks.coal_block, new ItemStack(Blocks.obsidian, 1), 20.0f);
	}
}
