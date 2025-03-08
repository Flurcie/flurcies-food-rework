package flurcie.food.foodrework;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.consume.TeleportRandomlyConsumeEffect;
import net.minecraft.item.consume.UseAction;
import net.minecraft.sound.SoundEvents;
import net.minecraft.component.type.ConsumableComponent;
import java.util.List;

public class CustomConsumableComponents {
    public static final ConsumableComponent APPLE = ConsumableComponent.builder()
            .consumeSeconds(1.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent BREAD = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent PORKCHOP = ConsumableComponent.builder()
            .consumeSeconds(2.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent COOKED_PORKCHOP = ConsumableComponent.builder()
            .consumeSeconds(2.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent GOLDEN_APPLE = ConsumableComponent.builder()
            .consumeSeconds(1.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            List.of(
                                    new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1),
                                    new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0)
                            )
                    )
            )
            .build();
    public static final ConsumableComponent ENCHANTED_GOLDEN_APPLE = ConsumableComponent.builder()
            .consumeSeconds(1.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            List.of(
                                    new StatusEffectInstance(StatusEffects.REGENERATION, 400, 1),
                                    new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 0),
                                    new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 6000, 0),
                                    new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3)
                            )
                    )
            )
            .build();
    public static final ConsumableComponent MUSHROOM_STEW = ConsumableComponent.builder()
            .consumeSeconds(2.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent COD = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent SALMON = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent TROPICAL_FISH = ConsumableComponent.builder()
            .consumeSeconds(0.8F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent PUFFERFISH = ConsumableComponent.builder()
            .consumeSeconds(1.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            List.of(
                                    new StatusEffectInstance(StatusEffects.POISON, 1200, 1),
                                    new StatusEffectInstance(StatusEffects.HUNGER, 300, 2),
                                    new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0)
                            )
                    )
            )
            .build();
    public static final ConsumableComponent COOKED_COD = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent COOKED_SALMON = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent COOKIE = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent MELON_SLICE = ConsumableComponent.builder()
            .consumeSeconds(1.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent DRIED_KELP = ConsumableComponent.builder()
            .consumeSeconds(0.8F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent BEEF = ConsumableComponent.builder()
            .consumeSeconds(2.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent COOKED_BEEF = ConsumableComponent.builder()
            .consumeSeconds(2.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent CHICKEN = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.3F))
            .build();
    public static final ConsumableComponent COOKED_CHICKEN = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent ROTTEN_FLESH = ConsumableComponent.builder()
            .consumeSeconds(1.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 600, 0), 0.8F))
            .build();
    public static final ConsumableComponent SPIDER_EYE = ConsumableComponent.builder()
            .consumeSeconds(1.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0)))
            .build();
    public static final ConsumableComponent CARROT = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent POTATO = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent BAKED_POTATO = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent POISONOUS_POTATO = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 0), 0.6F))
            .build();
    public static final ConsumableComponent GOLDEN_CARROT = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent PUMPKIN_PIE = ConsumableComponent.builder()
            .consumeSeconds(2.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent RABBIT = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent COOKED_RABBIT = ConsumableComponent.builder()
            .consumeSeconds(2.4F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent RABBIT_STEW = ConsumableComponent.builder()
            .consumeSeconds(2.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent MUTTON = ConsumableComponent.builder()
            .consumeSeconds(2.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent COOKED_MUTTON = ConsumableComponent.builder()
            .consumeSeconds(2.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent CHORUS_FRUIT = ConsumableComponent.builder()
            .consumeSeconds(1.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .consumeEffect(new TeleportRandomlyConsumeEffect())
            .build();
    public static final ConsumableComponent BEETROOT = ConsumableComponent.builder()
            .consumeSeconds(1.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent BEETROOT_SOUP = ConsumableComponent.builder()
            .consumeSeconds(2.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent SWEET_BERRIES = ConsumableComponent.builder()
            .consumeSeconds(0.8F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent GLOW_BERRIES = ConsumableComponent.builder()
            .consumeSeconds(0.8F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent SUSPICIOUS_STEW = ConsumableComponent.builder()
            .consumeSeconds(2.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .build();
    public static final ConsumableComponent GLISTERING_MELON_SLICE = ConsumableComponent.builder()
            .consumeSeconds(1.6F)
            .useAction(UseAction.EAT)
            .sound(SoundEvents.ENTITY_GENERIC_EAT)
            .consumeParticles(true)
            .consumeEffect(
                    new ApplyEffectsConsumeEffect(
                            List.of(
                                    new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1),
                                    new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0)
                            )
                    )
            )
            .build();
}