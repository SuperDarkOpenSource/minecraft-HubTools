package net.superdark.minecraft.plugins.HubTools.events;

import net.superdark.minecraft.plugins.HubTools.HubToolsPlugin;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerEvents implements Listener
{
    public PlayerEvents(HubToolsPlugin plugin)
    {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    //When the player joins we want to give them a compass
    public void onPlayerJoinEvent(PlayerJoinEvent event)
    {
        Player player = event.getPlayer();

        player.getInventory().clear();

        player.getInventory().setItem(0, new ItemStack(Material.COMPASS, 1));

        player.setGameMode(GameMode.ADVENTURE);
    }

    @EventHandler
    public void onPlayerDropItemEvent(PlayerDropItemEvent e)
    {
        e.setCancelled(true);
    }
}
