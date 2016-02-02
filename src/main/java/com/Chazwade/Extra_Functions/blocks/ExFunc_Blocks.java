package com.Chazwade.Extra_Functions.blocks;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;

import com.Chazwade.Extra_Functions.Reference;

import net.minecraft.block.Block;
public class ExFunc_Blocks {
//Variables
	
	//Create All Blocks Here Using BlockConstruct[]
	
public static BlockConstruct[] constructionBlock = new BlockConstruct[16];
public static BlockConstruct[] colouredDirt = new BlockConstruct[16];


public static void register(){ //Combined Block and Render Registry Occurs through for loops
	for(int c = 0; c < 16; c++) //The same For Loop can be used for multiple block types with 16 variants
	{   //Construction Blocks
		String unlocalisedName0 = ("constructionBlock" + c);
	    constructionBlock[c] = new BlockConstruct(Material.rock, unlocalisedName0);
	    GameRegistry.registerBlock(constructionBlock[c], unlocalisedName0);
	//Coloured Dirt
	String unlocalisedName1 = ("colouredDirt" + c);
	colouredDirt[c] = new BlockConstruct(Material.sand, unlocalisedName1);
	GameRegistry.registerBlock(colouredDirt[c], unlocalisedName1);
	}
}
public static void registerRenders()
{
	for(int c = 0; c < 16; c++){
	registerRender(constructionBlock[c]);
	registerRender(colouredDirt[c]);
	}
}

public static void registerRender(Block block){
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));;
}
}

