package com.leningeek.advancedhoppers.creativetab;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

/**
 * Created by LeninGeek on 19.10.2014.
 */
public class CreativeTabsAdvancedHoppers {
    public static final net.minecraft.creativetab.CreativeTabs MAIN
                = (new net.minecraft.creativetab.CreativeTabs("advancedhoppers") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.hopper);
        }
    });
}
