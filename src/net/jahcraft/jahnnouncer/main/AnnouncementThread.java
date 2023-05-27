package net.jahcraft.jahnnouncer.main;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class AnnouncementThread implements Runnable {

	@Override
	public void run() {

		int i = 0;
		
		while(Main.sendAnnouncements) {
			
			try {
				
				sendMessage(i);
				i++;
				if (i > 4) i = 0;
				Thread.sleep(600000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	private void sendMessage(int i) {
		
		if (i == 0) sendDiscordMessage();
		if (i == 1) sendBTSMessage();
		if (i == 2) sendVoteMessage();
		if (i == 3) sendReportMessage();
		if (i == 4) sendDonateMessage();
		
	}

	private void sendDonateMessage() {

		for (Player p : Bukkit.getServer().getOnlinePlayers()) {
		
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				""));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"                       " + ChatColor.of("#49B3FF") + "&l« " + ChatColor.of("#FFD700") + "&lFeeling Generous? " + ChatColor.of("#49B3FF") + "&l»"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"        " + ChatColor.of("#779AD8") + " Check out our donation store! Get exclusive monthly"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"        " + ChatColor.of("#779AD8") + "perks with the " + ChatColor.of("#FFD700") + "&lJah+" + ChatColor.of("#779AD8") + " rank or buy some custom items!"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"                " + ChatColor.of("#00E8FF") + "Donate today at " + ChatColor.of("#FFD700") + "&nstore.jahcraft.net" + ChatColor.of("#00E8FF") + "!"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				""));
		
		}
		
	}

	private void sendReportMessage() {
		
		for (Player p : Bukkit.getServer().getOnlinePlayers()) {
		
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				""));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"                " + ChatColor.of("#ff1919") + "&l« " + ChatColor.of("#FFD700") + "&lNeed to report something? " + ChatColor.of("#ff1919") + "&l»"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"      &cHave you found any bugs or glitches? Have you seen"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"        &cplayers hacking or otherwise breaking the rules?"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"             " + ChatColor.of("#ff1919") + "Open a ticket using " + ChatColor.of("#FFD700") + "&n/ticket create <info>" + ChatColor.of("#ff1919") + "!"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				""));
		
		}
		
	}

	private void sendVoteMessage() {

		for (Player p : Bukkit.getServer().getOnlinePlayers()) {
			
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
					""));
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
					"                    &d&l« " + ChatColor.of("#FFD700") + "&lHave you voted today? &d&l»"));
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
					"       " + ChatColor.of("#ff94db") + "Voting earns you special crate keys, and the chance"));
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
					"      " + ChatColor.of("#ff94db") + "to win the super special monthly prizes listed in spawn!"));
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
					"                           &dVote now using " + ChatColor.of("#FFD700") + "&n/vote&d!"));
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
					""));
		}
	}

	private void sendDiscordMessage() {
		
		for (Player p : Bukkit.getServer().getOnlinePlayers()) {
		
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				""));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"                       " + ChatColor.of("#7543ab") + "&l« &7&lJoin the Discord! " + ChatColor.of("#7543ab") + "&l»"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"          " + ChatColor.of("#c187ff") + "Join the JahCraft discord to experience the"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"       " + ChatColor.of("#c187ff") + "greater community and get the latest server news!"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"           " + ChatColor.of("#7543ab") + "Join the discord on &7&ndiscord.gg/WfmYbH9knT&r"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				""));
		
		}
		
	}

	private void sendBTSMessage() {

		for (Player p : Bukkit.getServer().getOnlinePlayers()) {
		
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				""));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"                 &a&l« " + ChatColor.of("#FFD700") + "&lLooking to buy something? &a&l»"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"             " + ChatColor.of("#b5ff9c") + "Check out the BalTopShop! The shop owned"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"             " + ChatColor.of("#b5ff9c") + "by the richest player from the last month!"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				"                 &aTravel there with " + ChatColor.of("#FFD700") + "&n/warp baltopshop&a!"));
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', 
				""));
		
		}
		
	}

}
