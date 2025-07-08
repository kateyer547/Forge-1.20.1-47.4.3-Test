package net.kateyer.tutorialmod.item;

import net.kateyer.tutorialmod.TutorialMod;
import net.minecraft.client.gui.components.toasts.TutorialToast;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModsTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MODDED_TAB = CREATIVE_MODE_TABS.register("modded_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.DRAGONITE.get()))
                    .title(Component.translatable("creativetab.modded_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.AURALITE.get());
                        output.accept(ModItems.DRAGONITE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
