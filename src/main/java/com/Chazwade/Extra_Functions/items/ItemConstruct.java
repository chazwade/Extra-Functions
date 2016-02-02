package com.Chazwade.Extra_Functions.items;

import com.Chazwade.Extra_Functions.Extra_FunctionsMod;
import net.minecraft.item.Item;
import net.minecraft.world.World;

//ItemConstruct sets the baseline for any basic items. Making item registering easier.
public class ItemConstruct extends Item {
	
	public ItemConstruct(String name, int stackSize){
		this.setUnlocalizedName(name);
		this.setMaxStackSize(stackSize);
		this.setCreativeTab(Extra_FunctionsMod.tabExFunc);
	
		
		}
	}


