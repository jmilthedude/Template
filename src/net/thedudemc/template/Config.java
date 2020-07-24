package net.thedudemc.template;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {

	public Config() {
	}

	public void initConfig() {

		FileConfiguration config = Template.INSTANCE.getConfig();

		Template.INSTANCE.saveDefaultConfig();
		config.addDefault("placeholder", true);

		config.options().copyDefaults(true);
		Template.INSTANCE.saveConfig();
	}
}
