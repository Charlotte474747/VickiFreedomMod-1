package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import static sun.audio.AudioPlayer.player;

@CommandPermissions(level = Rank.SENIOR_ADMIN, source = SourceType.BOTH, blockHostConsole = true)
@CommandParameters(description="Kicks administrators", usage="/<command> <playername> [reason]")
public class Command_rkick
  extends FreedomCommand
{
  public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
  {
    String warnReason = org.apache.commons.lang.StringUtils.join(org.apache.commons.lang.ArrayUtils.subarray(args, 1, args.length), " ");
    FUtil.adminAction(sender.getName(), " Kicking "  + player.getName() + warnReason, ChatColor.AQUA, true);
    if (args.length != 1) {
      return false;
    }
    
    if (args.length >= 3)
    {
        return true;
    }
    String reason = null;
        if (args.length >= 2)
        {
            reason = StringUtils.join(ArrayUtils.subarray(args, 1, args.length), " ");
        }
    final Player player = getPlayer(args[0]);
    if (player == null)
    {
      sender.sendMessage(ChatColor.RED + "Player not found");
      return true;
    }
    
    player.setWhitelisted(false);
    player.setOp(false);
    player.setGameMode(GameMode.SURVIVAL);
    player.closeInventory();
    player.getInventory().clear();
    player.kickPlayer(ChatColor.RED + reason);
    
     return true;
  }
}