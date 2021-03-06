package com.teamacronymcoders.base.materialsystem.parttype;

import com.google.common.collect.Lists;
import com.teamacronymcoders.base.materialsystem.MaterialUser;
import com.teamacronymcoders.base.materialsystem.materialparts.MaterialPart;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;
import java.util.List;

public class PartType {
    private String name;
    private List<PartDataPiece> data;

    public PartType(@Nonnull String name) {
        this(name, Lists.newArrayList());
    }

    public PartType(@Nonnull String name, List<PartDataPiece> data) {
        this.name = name;
        this.data = data;
    }

    @Nonnull
    public String getName() {
        return this.name;
    }

    public List<PartDataPiece> getData() {
        return this.data;
    }

    public void setData(List<PartDataPiece> partDataPieces) {
        this.data = partDataPieces;
    }

    public void setup(@Nonnull MaterialPart materialPart, @Nonnull MaterialUser materialUser) {
    }

    public ItemStack getItemStack(MaterialPart materialPart) {
        return ItemStack.EMPTY;
    }
}
