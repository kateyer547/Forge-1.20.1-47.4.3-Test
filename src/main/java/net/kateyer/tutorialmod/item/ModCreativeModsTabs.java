package net.kateyer.tutorialmod.item;

import net.kateyer.tutorialmod.TutorialMod;
import net.kateyer.tutorialmod.block.ModBlocks;
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

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AURALITE.get()))
                    .title(Component.translatable("creativetab.modded_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.AURALITE.get());
                        pOutput.accept(ModItems.DRAGONITE.get());

                        pOutput.accept(ModBlocks.AURALITE_BLOCK.get());
                        pOutput.accept(ModBlocks.DRAGONITE_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
