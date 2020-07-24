package net.thedudemc.template;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {

	public Commands() {
	}

	public void initCommands() {
		Template.INSTANCE.getCommand("dude").setExecutor(this);

	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			if (args.length == 0)
				sender.sendMessage(ChatColor.GREEN + "Dude!");
		}
		return true;
	}

}
