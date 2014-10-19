package com.leningeek.advancedhoppers.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

/**
 * Created by LeninGeek on 19.10.2014.
 */
public class CreativeTabHoppers {
    public static final CreativeTabs TAB = (new CreativeTabs("advancedhoppers") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(Blocks.hopper);
        }
    });
}
