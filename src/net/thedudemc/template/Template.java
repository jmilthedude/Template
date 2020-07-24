package net.thedudemc.template;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Template extends JavaPlugin {

	public static Template INSTANCE;

	public Commands commands = new Commands();
	public Config config = new Config();

	@Override
	public void onEnable() {
		commands.initCommands();
		config.initConfig();

		getServer().getPluginManager().registerEvents(new EventTemplate(), this);
	}

	@Override
	public void onDisable() {

	}

	public static void logInfo(String msg) {
		StringBuilder sb = new StringBuilder();
		sb.append(ChatColor.AQUA);
		sb.append("[PluginName] ");
		sb.append(ChatColor.RESET);
		sb.append(msg);
		Bukkit.getLogger().info(sb.toString());
	}

	public static void logError(String msg) {
		StringBuilder sb = new StringBuilder();
		sb.append(ChatColor.AQUA);
		sb.append("[PluginName] ");
		sb.append(ChatColor.RED);
		sb.append(msg);
		Bukkit.getLogger().info(sb.toString());
	}

}
