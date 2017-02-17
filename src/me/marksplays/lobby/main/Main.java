package me.marksplays.lobby.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.marksplays.lobby.events.JoinListener;
import me.marksplays.lobby.events.PremiumChat;
import me.marksplays.lobby.events.QuitListener;

public class Main extends JavaPlugin {
	
	public static String prefix = "§aLobby §7» §r";
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§9[]=============================[]");
		Bukkit.getConsoleSender().sendMessage("      §4Plugin by MarksPlays");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("    §6§lLobby §7- §2§lAktiviert ");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("      §4Plugin by MarksPlays");
		Bukkit.getConsoleSender().sendMessage("§9[]=============================[]");
		
		register();
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§9[]=============================[]");
		Bukkit.getConsoleSender().sendMessage("      §2Plugin by MarksPlays");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("   §6§lLobby §7- §4§lDesktiviert ");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("");
		Bukkit.getConsoleSender().sendMessage("      §2Plugin by MarksPlays");
		Bukkit.getConsoleSender().sendMessage("§9[]=============================[]");
	}

	public void register() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new JoinListener(), this);
		pm.registerEvents(new QuitListener(), this);
		pm.registerEvents(new PremiumChat(), this);
	}
	
}
