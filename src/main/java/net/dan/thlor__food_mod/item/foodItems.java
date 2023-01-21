package net.dan.thlor__food_mod.item;

import net.dan.thlor__food_mod.THLOR_FoodMod;
import net.minecraft.world.food.FoodProperties;
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


    public static final RegistryObject<Item> STUFFED_TACO = ITEMS.register("stuffed_taco",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(Foods.STUFFED_TACO_EAT)));
    public static final RegistryObject<Item> tortilla = ITEMS.register("tortilla",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> raw_taco = ITEMS.register("raw_taco",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));


    public static class Foods
    {
        public static final FoodProperties STUFFED_TACO_EAT = new FoodProperties.Builder()
                .nutrition(10)
                .alwaysEat()
                .build();
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
