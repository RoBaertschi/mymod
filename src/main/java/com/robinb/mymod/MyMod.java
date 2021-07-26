package com.robinb.mymod;

import com.robinb.mymod.registery.ModBlocks;
import com.robinb.mymod.registery.ModItems;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class MyMod implements ModInitializer {
	
	public static final String MOD_ID = "mymod";
	
	public static final ItemGroup R_ITEM_GROUP = FabricItemGroupBuilder.build(
				new Identifier(MOD_ID, "general"),
				() -> new ItemStack(ModItems.RUBY)
				);
	
	public static final ItemGroup AD_ITEM_G = FabricItemGroupBuilder.create(new Identifier(MOD_ID, "ad_group"))
			.icon(() -> new ItemStack(Blocks.ENCHANTING_TABLE))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(ModBlocks.RUBY_BLOCK));
				stacks.add(new ItemStack(Items.APPLE));
				stacks.add(new ItemStack(ModItems.RUBY));
				stacks.add(new ItemStack(Items.GLOWSTONE_DUST));
			})
			.build();
    public void onInitialize() {
    	ModItems.registerItems();
    	ModBlocks.registerBlocks();
    }
}
