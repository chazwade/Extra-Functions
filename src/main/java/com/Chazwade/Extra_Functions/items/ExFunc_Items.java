package com.Chazwade.Extra_Functions.items;
import com.Chazwade.Extra_Functions.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ExFunc_Items {
	//Create All Items Here Using ItemConstruct
	public static ItemConstruct eyeBeholder = new ItemConstruct("eyeBeholder", 1);
	
	
	public static void register()
	{
		GameRegistry.registerItem(eyeBeholder, "eyeBeholder");
	}
	
	public static void registerRenders()
	{
		registerRender(eyeBeholder);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));;
	}

}
