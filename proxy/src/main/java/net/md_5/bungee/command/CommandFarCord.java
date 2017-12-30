package net.md_5.bungee.command;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Command;

public class CommandFarCord extends Command
{

    public CommandFarCord()
    {
        super( "farcord" );
    }

    @Override
    public void execute(CommandSender sender, String[] args)
    {
        sender.sendMessage( ChatColor.BLUE + "Ce serveur est propulsé par FarCord " + ProxyServer.getInstance().getVersion() );
    }
}
