package com.robinb.mymod;

import com.robinb.mymod.registery.ModItems;

import net.fabricmc.api.ModInitializer;

public class MyMod implements ModInitializer {
	
	public static final String MOD_ID = "mymod";
	
    @Override
    public void onInitialize() {
    	ModItems.regiserItems();
    }
}
