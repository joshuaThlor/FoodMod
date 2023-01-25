package net.dan.thlor__food_mod.item;

import net.dan.thlor__food_mod.THLOR_FoodMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
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
    public static final RegistryObject<Item> TORTILLA = ITEMS.register("tortilla",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> RAW_TACO_SHELL = ITEMS.register("raw_taco_shell",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> TACO_SHELL = ITEMS.register("taco_shell",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(Foods.TACO_SHELL)));

    public static final RegistryObject<Item> SUNFLOWER_OIL = ITEMS.register("sunflower_oil",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).food(Foods.CHEESE).craftRemainder(foodItems.KNIFE.get()).tab(CreativeModeTab.TAB_MISC)));

    public static final RegistryObject<Item> CHEESE_SLICE = ITEMS.register("cheese_slice",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(Foods.CHEESE)));
    public static final RegistryObject<Item> IDAN_STICK = ITEMS.register("idan_stick",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static class Foods
    {
        public static final FoodProperties STUFFED_TACO_EAT = new FoodProperties.Builder()
                .nutrition(8)
                .saturationMod(0.7f)
                .build();
        public static final FoodProperties TACO_SHELL = new FoodProperties.Builder()
                .nutrition(3)
                .saturationMod(0.5f)
                .build();
        public static final FoodProperties CHEESE = new FoodProperties.Builder()
                .nutrition(1)
                .saturationMod(0.3f)
                .build();
    }

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
