package me.Turttles;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import net.milkbowl.vault.economy.Economy;

public class Main extends JavaPlugin {
	
    public static Economy econ = null;
    public static PluginManager pm = Bukkit.getServer().getPluginManager();
	
	public void onEnable() {
		getLogger().info("[RCB] Loading dependencies...");
        if (!setupEconomy() ) {
        	getLogger().severe("No Vault Dependencies found! Disabling... ");
            getServer().getPluginManager().disablePlugin(this);
            return;
        } else {
        	getLogger().info("Successfully loaded dependencies..");
        }
		BukkitTask BountyAnnouncer = new BountyHandler(this).runTaskTimer(this, 40, 200);
		new BountyHandler(this);
		
	}
	
	
	
	public void onDisable() {
		
		
		
		
	}
	
	
    private boolean setupEconomy() {
        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            return false;
        }
        RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) {
            return false;
        }
        econ = rsp.getProvider();
        return econ != null;
    }
    
    public void setup() {
    	
    	//TODO add cfiles 
    }




}
