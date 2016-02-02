package com.Chazwade.Extra_Functions.blocks;
import com.Chazwade.Extra_Functions.Extra_FunctionsMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockConstruct extends Block {

	public BlockConstruct(Material materialIn, String name) {
		super(materialIn);
this.setHardness(0.5F);
this.setResistance(30F);
this.setUnlocalizedName(name);
this.setCreativeTab(Extra_FunctionsMod.tabExFunc);
	}
	
}



