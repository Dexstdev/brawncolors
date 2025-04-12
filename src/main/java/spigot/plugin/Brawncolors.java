package spigot.plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Brawncolors extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§aBrawncolors plugin has enbled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§cBrawncolors plugin has disabled!");
    }

}
