package net.dan.thlor__food_mod.item;

import net.dan.thlor__food_mod.THLOR_FoodMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class foodItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, THLOR_FoodMod.MOD_ID);


    public static final RegistryObject<Item> TACO = ITEMS.register("taco",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
