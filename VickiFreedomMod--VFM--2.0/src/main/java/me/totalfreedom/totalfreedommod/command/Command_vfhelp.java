package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = Rank.OP, source = SourceType.BOTH)
@CommandParameters(description = "How to apply for admin", usage = "/<command>", aliases = "ai")
public class Command_vfhelp extends FreedomCommand
{
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        sender.sendMessage(ChatColor.AQUA + "Welcome to our Server, VickiFreedom.");
        sender.sendMessage(ChatColor.RED + "First of all, there are a few things to note.");
        sender.sendMessage(ChatColor.BLUE + "Vicki411 is the Founder of The Server.");
        sender.sendMessage(ChatColor.DARK_PURPLE + "The Owners are, Charlotte474747,NotAnOperator,Fionn,FunkyMunky.");
        sender.sendMessage(ChatColor.GOLD + "After you've gained knowledge of most of the players and commands,");
        sender.sendMessage(ChatColor.DARK_GRAY + "you can apply if you have followed all the requirements for super admin. more information /ai");
        sender.sendMessage(ChatColor.YELLOW + "Forum Link: http://vickifreedom.boards.net.");         
        return true;
    }
}
