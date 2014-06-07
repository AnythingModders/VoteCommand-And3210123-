package com.bwfcwalshy.main.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Vote implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player){
			Player player = (Player) sender;
		
			if(cmd.getName().equalsIgnoreCase("vote")){
				   player.sendMessage(ChatColor.BLUE + "Vote here:");
				   player.sendMessage(ChatColor.GOLD + "http://bit.ly/1oE07PH");
				   player.sendMessage(ChatColor.GOLD + "http://bit.ly/1namd8G");
				   player.sendMessage(ChatColor.GOLD + "http://bit.ly/1hVjJqV");
				   player.sendMessage(ChatColor.GOLD + "http://bit.ly/1oE07PH");
				   player.sendMessage(ChatColor.GRAY + "Made by: bwfcwalshy");
			}
		}
		return false;
	}
}
