package sexy.l4j.offpatch;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import sexy.l4j.offpatch.listeners.CrystalBreakListener;
import sexy.l4j.offpatch.listeners.CrystalPlaceListener;

public final class Offpatch extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Ty for using OffPatch By Logging4J...");
        getServer().getPluginManager().registerEvents(new CrystalBreakListener(), this);
        getServer().getPluginManager().registerEvents(new CrystalPlaceListener(), this);

    }

    @Override
    public void onDisable() {}

    public static boolean cl(Material mainHand, Material offHand) {
        Material ga =Material.GOLDEN_APPLE;
        Material ec =Material.END_CRYSTAL;
        return (mainHand == ga && offHand == ec);
    }
}
