package com.daan1024.ExtraGenerators;

import com.daan1024.ExtraGenerators.Handeler.configurationhandeler;
import com.daan1024.ExtraGenerators.init.ModItem;
import com.daan1024.ExtraGenerators.proxy.Iproxy;
import com.daan1024.ExtraGenerators.reference.reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = reference.MOD_ID ,name = reference.MOD_NAME,version = reference.VERSION, guiFactory = reference.GUI_FACTORY_CLASS)
public class ExtraGererators {

    @Mod.Instance(reference.MOD_ID)
    public static ExtraGererators instance;

    @SidedProxy(clientSide = reference.CLIENT_PROXY_CLASS ,serverSide = reference.SERVER_PROXY_CLASS)
    public static Iproxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        configurationhandeler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new configurationhandeler());

        ModItem.init();
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
