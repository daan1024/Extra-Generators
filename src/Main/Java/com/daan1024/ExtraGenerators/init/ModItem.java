package com.daan1024.ExtraGenerators.init;

import com.daan1024.ExtraGenerators.Item.ItemEG;
import com.daan1024.ExtraGenerators.Item.Wind_Turbine_Blade;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItem
{
    public static final ItemEG WindTurbineBlade = new Wind_Turbine_Blade();

    public static void init()
    {
        GameRegistry.registerItem(WindTurbineBlade, "WindTurbineBlade");
    }

}
