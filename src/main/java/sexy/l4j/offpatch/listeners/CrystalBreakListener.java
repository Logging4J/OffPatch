package sexy.l4j.offpatch.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import sexy.l4j.offpatch.Offpatch;

public class CrystalBreakListener implements Listener {

    @EventHandler
    public void onBreakCrystal(EntityDamageByEntityEvent e){
        if(!(e.getDamager() instanceof Player)){return;}
        Player p = (Player) e.getDamager();
        if(Offpatch.cl(p.getInventory().getItemInMainHand().getType(), p.getInventory().getItemInOffHand().getType())){
            e.setCancelled(true);
        }
    }
}
