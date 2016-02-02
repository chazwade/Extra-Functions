package com.Chazwade.Extra_Functions.proxy;

import com.Chazwade.Extra_Functions.blocks.ExFunc_Blocks;
import com.Chazwade.Extra_Functions.items.ExFunc_Items;

public class ClientProxy extends CommonProxy{
@Override
public void registerRenders(){
	ExFunc_Items.registerRenders();
	ExFunc_Blocks.registerRenders();
}
}
