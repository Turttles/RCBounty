package me.Turttles;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public class BountyHandler extends BukkitRunnable {
	
	private final JavaPlugin plugin;
	
	public BountyHandler(JavaPlugin plugin) {
		this.plugin = plugin;
	}

	@Override
	public void run() {
		// TODO add configurable millis 
		// TODO iterate over top balances > add to arraylist > get top 3 > 
		
	}
}
