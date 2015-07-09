package com.daan1024.ExtraGenerators.Client.gui;


import com.daan1024.ExtraGenerators.Handeler.configurationhandeler;
import com.daan1024.ExtraGenerators.reference.reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(configurationhandeler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(configurationhandeler.configuration.toString()));
    }
}
