package com.leningeek.advancedhoppers.blocks;

import com.leningeek.advancedhoppers.creativetab.CreativeTabsAdvancedHoppers;
import com.leningeek.advancedhoppers.references.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

/**
 * Created by LeninGeek on 19.10.2014.
 */
public abstract class BlockBase extends BlockContainer {
    protected BlockBase(Material material, String unlocalizedName) {
        super(material);

        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(References.MODID + "_" + unlocalizedName);
        this.setCreativeTab(CreativeTabsAdvancedHoppers.MAIN);
    }
}
