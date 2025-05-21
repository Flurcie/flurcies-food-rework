package flurcie.food.mixin;

import net.minecraft.entity.player.HungerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(HungerManager.class)
public class HungerManagerMixin {

    @Shadow
    private float exhaustion;

    @Overwrite
    public void addExhaustion(float exhaustion) {
        if (exhaustion < 5.9f) {
            this.exhaustion += exhaustion;
        } else {
            this.exhaustion += exhaustion * 0.5f;
        }
    }
}