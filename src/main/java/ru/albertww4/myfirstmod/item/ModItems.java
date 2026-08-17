package ru.albertww4.myfirstmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.albertww4.myfirstmod.MyFirstMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MyFirstMod.MODID);

    public static final DeferredItem<Item> Rybi = ITEMS.register("rybi", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> Palka = ITEMS.register("palka", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
