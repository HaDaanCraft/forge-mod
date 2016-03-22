package com.gamenmetdaan.blocks;

import com.gamenmetdaan.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MBlocks {

	public static void mainRegistry(){
		initializeBlock();
		registerItem();
		
	}
	
	public static Block ComStone;
	
	public static void initializeBlock(){
		ComStone = new ComStone(Material.ground).setBlockName("ComStone").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":ComStone");
	}
	
	public static void registerItem(){
		GameRegistry.registerBlock(ComStone, ComStone.getUnlocalizedName());
	}
}
