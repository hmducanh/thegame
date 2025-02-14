package mrmathami.thegame.entity.tile.tower;

import mrmathami.thegame.Config;
import mrmathami.thegame.entity.bullet.MachineBullet;
 import javax.annotation.Nonnull;

public final class MachineGunTower extends AbstractTower<MachineBullet> {
    public MachineGunTower(long createdTick, long posX, long posY) {
        super(createdTick, posX, posY, Config.MACHINE_GUN_TOWER_RANGE, Config.MACHINE_GUN_TOWER_SPEED);
    }

    @Nonnull
    @Override
    protected final MachineBullet doSpawn(long createdTick, double posX, double posY, double deltaX, double deltaY) {
        return new MachineBullet(createdTick, posX, posY, deltaX, deltaY);
    }
}

