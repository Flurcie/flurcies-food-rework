package flurcie.food.mixin;

import flurcie.food.foodrework.CustomConsumableComponents;
import flurcie.food.foodrework.CustomFoodComponents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.function.Function;

@Mixin(Items.class)
public abstract class VeggieMixin {

    @Redirect(method = "<clinit>",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/item/Items;register(Ljava/lang/String;Ljava/util/function/Function;Lnet/minecraft/item/Item$Settings;)Lnet/minecraft/item/Item;"))
    private static Item redirectVeggies(String id, Function<Item.Settings, Item> factory, Item.Settings vanillaSettings) {
        if ("carrot".equals(id)) {
            return Items.register(id,
                    settings -> new BlockItem(Blocks.CARROTS, settings
                            .food(CustomFoodComponents.CARROT, CustomConsumableComponents.CARROT)
                            .maxCount(16)),
                    vanillaSettings);
        } else if ("potato".equals(id)) {
            return Items.register(id,
                    settings -> new BlockItem(Blocks.POTATOES, settings
                            .food(CustomFoodComponents.POTATO, CustomConsumableComponents.POTATO)
                            .maxCount(16)),
                    vanillaSettings);
        }
        // Fallback for all other items
        return Items.register(id, factory, vanillaSettings);
    }
}