package sexy.l4j.offpatch.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import sexy.l4j.offpatch.Offpatch;

public class CrystalPlaceListener implements Listener {

    @EventHandler
    public void onCrystalPlace(PlayerInteractEvent e){
        if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
            Player p = e.getPlayer();
            if (e.getMaterial() == Material.END_CRYSTAL && Offpatch.check(p.getInventory().getItemInMainHand().getType(), p.getInventory().getItemInOffHand().getType())) {
                e.setCancelled(true);
            }
        }
    }
}
