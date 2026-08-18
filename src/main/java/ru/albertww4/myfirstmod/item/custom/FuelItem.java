package ru.albertww4.myfirstmod.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;
import java.util.List;

public class FuelItem extends Item {
    private int burnTime = 10;

    public FuelItem(Properties properties, int burnTime) {
        super(properties);
        this.burnTime = burnTime;
    }

    // Добавление описания к предмету и его изменение через SHIFT
    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag){
        if(Screen.hasShiftDown()){
            tooltipComponents.add(Component.translatable("tooltip.myfirstmod.fuelitem.shift_down"));
        }else{
            tooltipComponents.add(Component.translatable("tooltip.myfirstmod.fuelitem"));
        }
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType){
        return this.burnTime;
    }
}
