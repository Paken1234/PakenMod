package com.pakenplayz.pakenmod.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class MechBallItem extends Item
{
    public MechBallItem(Properties properties) { super(properties); }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand)
    {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND)
        {
            player.sendSystemMessage(Component.literal("Mech Spawned"));
            player.getCooldowns().addCooldown(this, 50);
        }

        return super.use(level, player, hand);
    }
}
