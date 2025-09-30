package net.caffeinemc.mods.lithium.common.world;

import net.minecraft.core.BlockPos;

public class WorldHelper {
    public static boolean areNeighborsWithinSameChunk(BlockPos pos) {
        int localX = pos.getX() & 15;
        int localZ = pos.getZ() & 15;

        return localX > 0 && localZ > 0 && localX < 15 && localZ < 15;
    }
}
