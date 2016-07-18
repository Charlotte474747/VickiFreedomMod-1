package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.TotalFreedomMod;
import me.totalfreedom.totalfreedommod.admin.Admin;
import me.totalfreedom.totalfreedommod.banning.Ban;
import me.totalfreedom.totalfreedommod.banning.BanManager;
import me.totalfreedom.totalfreedommod.command.CommandParameters;
import me.totalfreedom.totalfreedommod.command.CommandPermissions;
import me.totalfreedom.totalfreedommod.command.FreedomCommand;
import me.totalfreedom.totalfreedommod.command.SourceType;
import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import net.pravian.aero.plugin.AeroPlugin;
import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LightningStrike;
import org.bukkit.entity.Player;

@CommandPermissions(level=Rank.EXECUTIVE, source=SourceType.BOTH)
@CommandParameters(description="Adds players to a seperate permban list", usage="/<command> <player> [reason]", aliases = "apb")
public class Command_addpermban
extends FreedomCommand {
    @Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole) {
        if (args.length < 1) {
            return false;
        }
        Player player = this.getPlayer(args[0]);
        if (player == null) {
            this.msg(FreedomCommand.PLAYER_NOT_FOUND, ChatColor.RED);
            return true;
        }
        String reason = args.length > 1 ? StringUtils.join((Object[])args, (String)" ", (int)1, (int)args.length) : "You have been added to the server permban list!";
        Location targetPos = player.getLocation();
        for (int x = -1; x <= 1; ++x) {
            for (int z = -1; z <= 1; ++z) {
                Location strike_pos = new Location(targetPos.getWorld(), (double)(targetPos.getBlockX() + x), (double)targetPos.getBlockY(), (double)(targetPos.getBlockZ() + z));
                targetPos.getWorld().strikeLightning(strike_pos);
            }
        }
        // Remove from superadmin list
       Admin admin = getAdmin(player);
        if (admin != null)
        {
            FUtil.adminAction(sender.getName(), "Removing " + player.getName() + " from the superadmin list", true);
            plugin.al.removeAdmin(admin);
        }
        
        
        FUtil.adminAction(sender.getName(), " Adding " + player.getName() + " to the permban list.", true);
        ((TotalFreedomMod)this.plugin).bm.addBan(Ban.forPlayer(player, sender, FUtil.parseDateOffset("535353y"), reason));
        player.kickPlayer((Object)ChatColor.GREEN + "You have been added to the servers permban list. If you think this was a mistake, appeal at http://www.vickifreedom.boards.net");
        return true;
    }
}



