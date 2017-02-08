package com.teamacronymcoders.base.registry.pieces.models;

import com.teamacronymcoders.base.client.ItemMeshDefinitions;
import com.teamacronymcoders.base.items.IHasItemMeshDefinition;
import com.teamacronymcoders.base.registry.Registry;
import com.teamacronymcoders.base.registry.pieces.RegistryPiece;
import com.teamacronymcoders.base.registry.pieces.RegistryPieceBase;
import com.teamacronymcoders.base.registry.pieces.RegistrySide;
import net.minecraft.util.ResourceLocation;

import static net.minecraftforge.fml.common.eventhandler.EventPriority.LOW;

@RegistryPiece(value = RegistrySide.CLIENT, priority = LOW)
public class ItemMeshDefinitioniRegistryPiece extends RegistryPieceBase<IHasItemMeshDefinition> {
    public ItemMeshDefinitioniRegistryPiece() {
        super(IHasItemMeshDefinition.class);
    }

    @Override
    public boolean acceptsRegistry(Registry registry) {
        return "ITEM".equalsIgnoreCase(registry.getName());
    }

    @Override
    public void preInit(ResourceLocation name, IHasItemMeshDefinition entry) {
        ItemMeshDefinitions.registerItemMeshDefinitions(entry);
    }
}
