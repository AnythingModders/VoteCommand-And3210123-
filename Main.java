package com.bwfcwalshy.main;

import org.bukkit.plugin.java.JavaPlugin;

import com.bwfcwalshy.main.commands.Vote;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Plugin enabled");
		super.onEnable();
		
		getCommand("vote").setExecutor(new Vote());
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Plugin Disabled");
		super.onDisable();
	}
}
