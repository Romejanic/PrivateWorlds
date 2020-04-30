package com.romejanic.pw;

import org.bukkit.plugin.java.JavaPlugin;

import com.romejanic.pw.cmd.BaseCommand;
import com.romejanic.pw.utils.Constants;

public class PrivateWorlds extends JavaPlugin {

	@Override
	public void onEnable() {
		getCommand("pw").setExecutor(new BaseCommand());
		getLogger().info("Started PrivateWorlds! Thanks for using the plugin!");
		getLogger().info("If you like this plugin, give it a star on GitHub: " + Constants.GITHUB_URL);
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Disabled PrivateWorlds! Thanks for using the plugin!");
	}
	
}