package com.daan1024.ExtraGenerators.init;

import com.daan1024.ExtraGenerators.Item.ItemEG;
import com.daan1024.ExtraGenerators.Item.SmallBlade;
import com.daan1024.ExtraGenerators.Item.SmallBladeClothless;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItem
{
    public static final ItemEG SmallBladeClothless = new SmallBladeClothless();
    public static final ItemEG SmallBlade = new SmallBlade();

    public static void init()
    {
        GameRegistry.registerItem(SmallBladeClothless, "SmallBladeClothless");
        GameRegistry.registerItem(SmallBlade, "SmallBlade");
    }

}
