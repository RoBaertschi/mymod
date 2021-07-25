package com.robinb.mymod.registery;

import com.robinb.mymod.MyMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	
	public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	
	public static void regiserItems() {
		Registry.register(Registry.ITEM, new Identifier(MyMod.MOD_ID, "ruby"), RUBY);
	}
	
}
