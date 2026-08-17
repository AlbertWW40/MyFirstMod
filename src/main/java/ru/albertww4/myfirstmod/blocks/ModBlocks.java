package ru.albertww4.myfirstmod.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.albertww4.myfirstmod.MyFirstMod;
import ru.albertww4.myfirstmod.item.ModItems;

import java.util.concurrent.BlockingDeque;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MyFirstMod.MODID);

    public static final DeferredBlock<Block> Rybi_block = registerBlock("rybi_block", () -> new Block(BlockBehaviour.Properties.of().strength(0.3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> Rybi_Ore_block = registerBlock("rybi_ore_block", () -> new Block(BlockBehaviour.Properties.of().strength(0.3f).requiresCorrectToolForDrops().sound((SoundType.STONE))));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventbus){
        BLOCKS.register(eventbus);
    }
}
