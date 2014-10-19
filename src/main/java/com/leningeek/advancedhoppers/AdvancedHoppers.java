package com.leningeek.advancedhoppers;

import com.leningeek.advancedhoppers.proxy.CommonProxy;
import com.leningeek.advancedhoppers.references.References;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Created by LeninGeek on 19.10.2014.
 */

@Mod(name = "Advanced Hoppers", modid = "advancedhoppers", version = "1.7.10-a0.1", canBeDeactivated = true)
public class AdvancedHoppers {
    public static AdvancedHoppers modInstance = new AdvancedHoppers();

    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    void postInit(FMLPostInitializationEvent event) {

    }
}
