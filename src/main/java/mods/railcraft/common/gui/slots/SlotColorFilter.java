/*------------------------------------------------------------------------------
 Copyright (c) CovertJaguar, 2011-2017
 http://railcraft.info

 This code is the property of CovertJaguar
 and may only be used with explicit written
 permission unless otherwise specified on the
 license page at http://railcraft.info/wiki/info:license.
 -----------------------------------------------------------------------------*/
package mods.railcraft.common.gui.slots;

import mods.railcraft.common.util.inventory.InvTools;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class SlotColorFilter extends SlotRailcraft {

    public SlotColorFilter(IInventory iinventory, int slotIndex, int posX, int posY) {
        super(iinventory, slotIndex, posX, posY);
        setPhantom();
        setStackLimit(1);
    }

    @Override
    public boolean isItemValid(@Nullable ItemStack stack) {
        if (InvTools.isEmpty(stack))
            return false;
        if (InvTools.isStackEqualToBlock(stack, Blocks.WOOL))
            return true;
        return stack.getItem() == Items.DYE;
    }

}
