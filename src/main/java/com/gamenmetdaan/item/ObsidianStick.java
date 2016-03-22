package com.gamenmetdaan.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ObsidianStick {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
		
	}
	
	public static Item oStick;
	
	public static void initializeItem(){
		oStick = new Item().setUnlocalizedName("oStick").setCreativeTab(CreativeTabs.tabMisc);
		
	}
	
	public static void registerItem(){
		GameRegistry.registerItem(oStick, oStick.getUnlocalizedName());
	}
}
