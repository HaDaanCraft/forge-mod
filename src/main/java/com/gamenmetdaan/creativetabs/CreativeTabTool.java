package com.gamenmetdaan.creativetabs;

import com.gamenmetdaan.item.MItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTool extends CreativeTabs {

	public CreativeTabTool(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MItems.oStick;
	}

}
