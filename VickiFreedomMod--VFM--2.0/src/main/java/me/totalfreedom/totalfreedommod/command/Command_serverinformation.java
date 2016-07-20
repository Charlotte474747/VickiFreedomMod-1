package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.TotalFreedomMod;
import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;





@CommandPermissions(level = Rank.OP, source = SourceType.BOTH)


@CommandParameters(description = "Shows information about VickiFreedom", usage = "/<command>", aliases = "si")


public class Command_serverinformation extends FreedomCommand


{


    @Override


    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole) 


    {
    sender.sendMessage("Welcome to VickiFreedom, " + sender.getName() + " we hope you enjoy your stay here at VickiFreedom!" + ChatColor.RED);


     try {


    Thread.sleep(2000);                 //1000 milliseconds is one second.


} catch(InterruptedException ex) {


    Thread.currentThread().interrupt();


}


   sender.sendMessage("Here is some information about what we are running, " + sender.getName() + "!" + ChatColor.RED);


    try {


    Thread.sleep(1000);                 //1000 milliseconds is one second.


} catch(InterruptedException ex) {


    Thread.currentThread().interrupt();


}


    sender.sendMessage("We are running VickiFreedomMod version " + TotalFreedomMod.pluginVersion + " with Minecraft version 1.10!" + ChatColor.RED);


        try {


    Thread.sleep(1000);                 //1000 milliseconds is one second.


} catch(InterruptedException ex) {


    Thread.currentThread().interrupt();


}


    sender.sendMessage("Check out our forums at http://www.vickifreedom.boards.net" + ChatColor.RED);


        try {


    Thread.sleep(1000);                 //1000 milliseconds is one second.


} catch(InterruptedException ex) {


    Thread.currentThread().interrupt();


}


        sender.sendMessage("If you have any questions, ask one of our administrators! /list -a" + ChatColor.RED);
        
                try {


    Thread.sleep(1000);                 //1000 milliseconds is one second.


} catch(InterruptedException ex) {


    Thread.currentThread().interrupt();


}
                sender.sendMessage("The current owners are, Vicki411, NotAnOperator, and Charlotte474747");


        return true;


    


    }


}
