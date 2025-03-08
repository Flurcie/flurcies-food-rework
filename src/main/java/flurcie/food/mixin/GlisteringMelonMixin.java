package flurcie.food.mixin;

import flurcie.food.foodrework.CustomConsumableComponents;
import flurcie.food.foodrework.CustomFoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Items.class)
public abstract class GlisteringMelonMixin {

    // Redirect for GLISTERING_MELON_SLICE
    @Redirect(method = "<clinit>",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/item/Items;register(Ljava/lang/String;)Lnet/minecraft/item/Item;"))
    private static Item redirectGlisteringMelon(String id) {
        if ("glistering_melon_slice".equals(id)) {
            return Items.register(id, new Item.Settings()
                    .food(CustomFoodComponents.GLISTERING_MELON_SLICE, CustomConsumableComponents.GLISTERING_MELON_SLICE)
                    .maxCount(16));
        }
        return Items.register(id);
    }
}