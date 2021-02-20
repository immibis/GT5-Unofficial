package gregtech.api.interfaces.metatileentity;

import net.minecraft.tileentity.TileEntity;

import java.util.HashSet;

public interface IMetaTileEntityCable extends IMetaTileEntity {
	// immibis: was ArrayList before. Hopefully this doesn't break compat with any mods.
    public long transferElectricity(byte aSide, long aVoltage, long aAmperage, HashSet<TileEntity> aAlreadyPassedTileEntityList);
}