package me.marksplays.lobby.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PremiumChat implements Listener {
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		
//\\		Das müsst ihr auf den Namen euren Weltnamen ändern!
		if(p.getWorld().getName().equalsIgnoreCase("world")) {
//\\		Das müsst ihr auf den Namen euren Weltnamen ändern!
			
			if(p.hasPermission("lobby.premium")) {
				e.setCancelled(false);
				e.setMessage("§7[§6Premium§7] §6" + p.getDisplayName() + " §7» " + e.getMessage());
			} else {
				e.setCancelled(true);
				p.sendMessage("§7Du benötigst einen §6Rang §7um in der Lobby schreiben zu können!");
			}
		}
	}

}
