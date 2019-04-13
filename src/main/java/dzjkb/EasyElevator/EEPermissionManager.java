package dzjkb.EasyElevator;

import org.bukkit.entity.Player;

public class EEPermissionManager
{
    Player player;
    public static String admin = "easyelevator.admin";

    public EEPermissionManager(Player p)
    {
        this.player = p;
    }

    public boolean has(String permission)
    {
        if (isAdmin()) {
            return true;
        }
        return this.player.hasPermission(permission);
    }

    private boolean isAdmin()
    {
        if (this.player.isOp()) {
            return true;
        }
        return this.player.hasPermission(admin);
    }
}
