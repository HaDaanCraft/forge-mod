package com.gamenmetdaan.item;

import com.gamenmetdaan.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MItems {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
		
	}
	
	public static Item oStick;
	
	public static void initializeItem(){
		oStick = new Item().setUnlocalizedName("oStick").setCreativeTab(CreativeTabs.tabMisc).setTextureName(RefStrings.MODID + ":OStick");
		
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(oStick, oStick.getUnlocalizedName());
	}
}
