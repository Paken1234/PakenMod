package com.pakenplayz.pakenmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab PAKEN_TAB = new CreativeModeTab("pakentab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PAKAENIUM_INGOT.get());
        }
    };
}
