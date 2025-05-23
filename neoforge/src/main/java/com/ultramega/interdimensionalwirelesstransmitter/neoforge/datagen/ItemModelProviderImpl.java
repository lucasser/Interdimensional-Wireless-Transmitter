package com.ultramega.interdimensionalwirelesstransmitter.neoforge.datagen;

import com.ultramega.interdimensionalwirelesstransmitter.common.interdimensionalwirelesstransmitter.InterdimensionalWirelessTransmitterBlock;
import com.ultramega.interdimensionalwirelesstransmitter.common.registry.Blocks;

import com.refinedmods.refinedstorage.common.content.ColorMap;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.ultramega.interdimensionalwirelesstransmitter.common.InterdimensionalIdentifierUtil.MOD_ID;
import static com.ultramega.interdimensionalwirelesstransmitter.common.InterdimensionalIdentifierUtil.createInterdimensionalIdentifier;

public class ItemModelProviderImpl extends ItemModelProvider {
    private static final String CUTOUT_TEXTURE_KEY = "cutout";

    public ItemModelProviderImpl(final PackOutput output, final ExistingFileHelper existingFileHelper) {
        super(output, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        final ResourceLocation base = createInterdimensionalIdentifier("block/interdimensional_wireless_transmitter/inactive");
        final ColorMap<InterdimensionalWirelessTransmitterBlock> blocks = Blocks.INSTANCE.getInterdimensionalWirelessTransmitter();
        blocks.forEach((color, id, block) -> singleTexture(
            id.getPath(),
            base,
            CUTOUT_TEXTURE_KEY,
            createInterdimensionalIdentifier("block/interdimensional_wireless_transmitter/cutouts/" + color.getName())
        ));
    }
}
