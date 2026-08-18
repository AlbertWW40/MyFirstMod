package ru.albertww4.myfirstmod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.albertww4.myfirstmod.blocks.ModBlocks;
import ru.albertww4.myfirstmod.item.ModItems;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyFirstMod.MODID);

    public static final Supplier<CreativeModeTab> RYBI_TAB = CREATIVE_MODE_TAB.register("rybi_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Rybi.get()))
                    .title(Component.translatable("creativetab.myfirstmod.rybi_items"))
                    .displayItems((ItemDisplayParameters, output) -> {
                        output.accept(ModBlocks.Rybi_block);
                        output.accept(ModItems.Palka);
                        output.accept(ModItems.Rybi);
                        output.accept(ModBlocks.Rybi_Ore_block);
                        output.accept(ModBlocks.MAGIC_BLOCK);
                        output.accept(ModItems.RYBISH);
                        output.accept(ModItems.Rybi_fuel);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
