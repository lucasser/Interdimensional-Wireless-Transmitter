package com.ultramega.interdimensionalwirelesstransmitter.neoforge.datagen;

import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.ultramega.interdimensionalwirelesstransmitter.common.InterdimensionalIdentifierUtil.MOD_ID;

public class BlockTagsProvider extends TagsProvider<Block> {
    public BlockTagsProvider(final PackOutput packOutput,
                             final CompletableFuture<HolderLookup.Provider> providerCompletableFuture,
                             final @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, Registries.BLOCK, providerCompletableFuture, MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(final HolderLookup.Provider provider) {
        // this class is needed, since the ItemTagGenerator needs a TagsProvider<Block> to create it
    }
}
