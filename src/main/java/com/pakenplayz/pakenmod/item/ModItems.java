package com.pakenplayz.pakenmod.item;

import com.pakenplayz.pakenmod.PakenMod;
import com.pakenplayz.pakenmod.item.custom.MechBallItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PakenMod.MOD_ID);

    public static final RegistryObject<Item> PAKAENIUM_INGOT = ITEMS.register("pakaenium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PAKEN_TAB)));

    public static final RegistryObject<Item> MECH_BALL = ITEMS.register("mech_ball",
            () -> new MechBallItem(new Item.Properties().tab(ModCreativeModeTab.PAKEN_TAB)));

    public static void  register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
