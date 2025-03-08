package flurcie.food.mixin;

import flurcie.food.foodrework.CustomConsumableComponents;
import flurcie.food.foodrework.CustomFoodComponents;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.OminousBottleAmplifierComponent;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Rarity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Items.class)
public abstract class FoodItemsMixin {

  //TODO: Potatoes and Carrots are bugged. Need own mixin? Redirect seems to not work. Troubleshoot.


  @Redirect(method = "<clinit>",
          at = @At(value = "INVOKE",
                  target = "Lnet/minecraft/item/Items;register(Ljava/lang/String;Lnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/Item;"))
  private static Item modifyFoodItems(String id, Item.Settings settings) {
    if ("apple".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.APPLE, CustomConsumableComponents.APPLE)
              .maxCount(16));
    }
    if ("bread".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.BREAD, CustomConsumableComponents.BREAD)
              .maxCount(16));
    }
    if ("porkchop".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.PORKCHOP, CustomConsumableComponents.PORKCHOP)
              .maxCount(16));
    }
    if ("cooked_porkchop".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.COOKED_PORKCHOP, CustomConsumableComponents.COOKED_PORKCHOP)
              .maxCount(16));
    }
    if ("golden_apple".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.GOLDEN_APPLE, CustomConsumableComponents.GOLDEN_APPLE)
              .maxCount(16));
    }
    if ("enchanted_golden_apple".equals(id)) {
      return Items.register(id, new Item.Settings()
              .rarity(Rarity.RARE)
              .food(CustomFoodComponents.ENCHANTED_GOLDEN_APPLE, CustomConsumableComponents.ENCHANTED_GOLDEN_APPLE)
              .component(DataComponentTypes.ENCHANTMENT_GLINT_OVERRIDE, true)
              .maxCount(16));
    }
    if ("mushroom_stew".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.MUSHROOM_STEW, CustomConsumableComponents.MUSHROOM_STEW)
              .useRemainder(Items.BOWL)
              .maxCount(8));
    }
    if ("cod".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.COD, CustomConsumableComponents.COD)
              .maxCount(16));
    }
    if ("salmon".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.SALMON, CustomConsumableComponents.SALMON)
              .maxCount(16));
    }
    if ("tropical_fish".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.TROPICAL_FISH, CustomConsumableComponents.TROPICAL_FISH)
              .maxCount(64));
    }
    if ("pufferfish".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.PUFFERFISH, CustomConsumableComponents.PUFFERFISH)
              .maxCount(64));
    }
    if ("cooked_cod".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.COOKED_COD, CustomConsumableComponents.COOKED_COD)
              .maxCount(16));
    }
    if ("cooked_salmon".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.COOKED_SALMON, CustomConsumableComponents.COOKED_SALMON)
              .maxCount(16));
    }
    if ("cookie".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.COOKIE, CustomConsumableComponents.COOKIE)
              .maxCount(16));
    }
    if ("melon_slice".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.MELON_SLICE, CustomConsumableComponents.MELON_SLICE)
              .maxCount(16));
    }
    if ("dried_kelp".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.DRIED_KELP, CustomConsumableComponents.DRIED_KELP)
              .maxCount(64));
    }
    if ("beef".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.BEEF, CustomConsumableComponents.BEEF)
              .maxCount(16));
    }
    if ("cooked_beef".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.COOKED_BEEF, CustomConsumableComponents.COOKED_BEEF)
              .maxCount(16));
    }
    if ("chicken".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.CHICKEN, CustomConsumableComponents.CHICKEN)
              .maxCount(16));
    }
    if ("cooked_chicken".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.COOKED_CHICKEN, CustomConsumableComponents.COOKED_CHICKEN)
              .maxCount(16));
    }
    if ("rotten_flesh".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.ROTTEN_FLESH, CustomConsumableComponents.ROTTEN_FLESH)
              .maxCount(16));
    }
    if ("spider_eye".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.SPIDER_EYE, CustomConsumableComponents.SPIDER_EYE)
              .maxCount(64));
    }
    if ("baked_potato".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.BAKED_POTATO, CustomConsumableComponents.BAKED_POTATO)
              .maxCount(16));
    }
    if ("poisonous_potato".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.POISONOUS_POTATO, CustomConsumableComponents.POISONOUS_POTATO)
              .maxCount(64));
    }
    if ("golden_carrot".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.GOLDEN_CARROT, CustomConsumableComponents.GOLDEN_CARROT)
              .maxCount(16));
    }
    if ("pumpkin_pie".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.PUMPKIN_PIE, CustomConsumableComponents.PUMPKIN_PIE)
              .maxCount(16));
    }
    if ("rabbit".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.RABBIT, CustomConsumableComponents.RABBIT)
              .maxCount(16));
    }
    if ("cooked_rabbit".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.COOKED_RABBIT, CustomConsumableComponents.COOKED_RABBIT)
              .maxCount(16));
    }
    if ("rabbit_stew".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.RABBIT_STEW, CustomConsumableComponents.RABBIT_STEW)
              .useRemainder(Items.BOWL)
              .maxCount(8));
    }
    if ("mutton".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.MUTTON, CustomConsumableComponents.MUTTON)
              .maxCount(16));
    }
    if ("cooked_mutton".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.COOKED_MUTTON, CustomConsumableComponents.COOKED_MUTTON)
              .maxCount(16));
    }
    if ("chorus_fruit".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.CHORUS_FRUIT, CustomConsumableComponents.CHORUS_FRUIT)
              .useCooldown(1.0F)
              .maxCount(16));
    }
    if ("beetroot".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.BEETROOT, CustomConsumableComponents.BEETROOT)
              .maxCount(16));
    }
    if ("beetroot_soup".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.BEETROOT_SOUP, CustomConsumableComponents.BEETROOT_SOUP)
              .useRemainder(Items.BOWL)
              .maxCount(8));
    }
    if ("sweet_berries".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.SWEET_BERRIES, CustomConsumableComponents.SWEET_BERRIES)
              .maxCount(16));
    }
    if ("glow_berries".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.GLOW_BERRIES, CustomConsumableComponents.GLOW_BERRIES)
              .maxCount(16));
    }
    if ("suspicious_stew".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.SUSPICIOUS_STEW, CustomConsumableComponents.SUSPICIOUS_STEW)
              .component(DataComponentTypes.SUSPICIOUS_STEW_EFFECTS, SuspiciousStewEffectsComponent.DEFAULT)
              .useRemainder(Items.BOWL)
              .maxCount(8));
    }
    if ("milk_bucket".equals(id)) {
      return Items.register(id, new Item.Settings()
              .component(DataComponentTypes.CONSUMABLE, ConsumableComponents.MILK_BUCKET)
              .recipeRemainder(Items.BUCKET)
              .useRemainder(Items.BUCKET)
              .maxCount(1));
    }
    if ("ominous_bottle".equals(id)) {
      return Items.register(id, new Item.Settings()
              .rarity(Rarity.UNCOMMON)
              .component(DataComponentTypes.CONSUMABLE, ConsumableComponents.OMINOUS_BOTTLE)
              .component(DataComponentTypes.OMINOUS_BOTTLE_AMPLIFIER, new OminousBottleAmplifierComponent(0))
              .maxCount(4));
    }
    if ("honey_bottle".equals(id)) {
      return Items.register(id, new Item.Settings()
              .food(CustomFoodComponents.HONEY_BOTTLE, ConsumableComponents.HONEY_BOTTLE)
              .recipeRemainder(Items.GLASS_BOTTLE)
              .useRemainder(Items.GLASS_BOTTLE)
              .maxCount(4));
    }
    return Items.register(id, settings);
  }
}