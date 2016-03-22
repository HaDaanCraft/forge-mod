package com.gamenmetdaan.creativetabs;

import com.gamenmetdaan.blocks.MBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBlock extends CreativeTabs {

	public CreativeTabBlock(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(MBlocks.ComStone);
	}

}
