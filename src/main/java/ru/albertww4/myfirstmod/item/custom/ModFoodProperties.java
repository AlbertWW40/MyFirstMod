package ru.albertww4.myfirstmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    // nutrition - сколько еды востановит (nutrition(2) это 1 еда),
    // saturationModifier - определяет, как быстро игрок снова проголодается после съедения
    // так же можно добавить .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST,
    //              тики (в 1 сек 20 тиков), вероятность наложения эффекта (0.35f - 35%)))
    public static final FoodProperties RYBISH = new FoodProperties.Builder().nutrition(2).saturationModifier(0.25f).build();
}
