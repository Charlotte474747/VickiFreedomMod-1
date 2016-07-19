
package me.totalfreedom.totalfreedommod.command;


import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



@CommandPermissions(level = Rank.SUPER_ADMIN, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "WHAT IS UP DRAMAALERT NATION", usage = "/<command>")
public class Command_dramaalert extends FreedomCommand
{

    @Override
       public boolean run(final CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
 {
        FUtil.bcastMsg(ChatColor.translateAlternateColorCodes('&', "&aPREPARE FOR SPAM!!!!!!"));
         try {
    Thread.sleep(5000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        FUtil.bcastMsg(ChatColor.translateAlternateColorCodes('&', "&aWHAT IS UPP DRAMAALERT NATIONNNN"));
                 try {
    Thread.sleep(2000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        FUtil.bcastMsg(ChatColor.translateAlternateColorCodes('&', "&aI'M YOUR HOST, " + sender.getName() + "!!!!!"));
         try {
    Thread.sleep(1000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        FUtil.bcastMsg(ChatColor.translateAlternateColorCodes('&', "&aLET'S GET RIIIIIIIGGGHHTTT INTO THE NEWS!"));
  
    return true;
    
    }
    }
}
         
