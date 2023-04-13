package dev.ender.armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

public class Registry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Item.class, Armor.MOD_ID);

    public static final RegistryObject<Item> CN_ARMOR = ITEMS.register("cn_armor", () ->
            new ArmorItem(ModArmorMaterial.CLOTHES, EquipmentSlotType.CHEST, new Item.Properties())
    );


}
