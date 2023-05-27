package net.jahcraft.jahnnouncer.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static boolean sendAnnouncements = true;

	@Override
	public void onEnable() {
		
		try {
			
			Bukkit.getScheduler().runTaskAsynchronously(this, new AnnouncementThread()).getTaskId();

			
		} catch (Exception e) {
			
			Bukkit.getLogger().warning("Failed to load Jahnnouncer!");
			e.printStackTrace();
		}
	}
	
	@Override 
	public void onDisable() {
		
		sendAnnouncements = false;
		Bukkit.getLogger().info("Jahnnouncer Unloaded and Disabled!");
		
	}

}
