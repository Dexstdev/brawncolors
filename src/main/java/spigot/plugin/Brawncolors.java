package spigot.plugin;

/*
 *
 *  ,--.           Project: Brawncolors
 *  |  |-.  ,---.  author: Dexst
 *  | .-. '| .--'  License: GPL-3.0
 *  | `-' |\ `--. 
 *   `---'  `---' 
 *              
 */
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Brawncolors extends JavaPlugin {

    public static String Prefix = "&8[&6Brawncolors&8] &7";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&aBrawncolors &7has been enabled!"));
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBrawncolors &7has been disabled!"));
    }
}
