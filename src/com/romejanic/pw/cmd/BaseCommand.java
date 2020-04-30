package com.romejanic.pw.cmd;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.romejanic.pw.utils.Utils;

public class BaseCommand implements CommandExecutor {

	private final String[] SUB_COMMANDS = { "help", "new", "tp" };
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(args.length == 0 || args[0].equalsIgnoreCase(SUB_COMMANDS[0])) {
			sender.sendMessage(ChatColor.RED + "Usage: /" + label + " <" + Utils.join(SUB_COMMANDS, "|") + ">");
		} else {
			sender.sendMessage(Utils.join(args, " "));
		}
		return true;
	}
	
}