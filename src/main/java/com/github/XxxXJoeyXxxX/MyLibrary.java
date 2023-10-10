package com.github.XxxXJoeyXxxX;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class MyLibrary extends JavaPlugin {

    private static JavaPlugin plugin;
    public static String getPlayerName(Player p){
        return p.getDisplayName();
    }
    // For other classes in our library
    public static JavaPlugin getPlugin() {
        return plugin;
    }

    // This method must not be used any where in the library!
    public static void setPlugin(final JavaPlugin plugin) {
        MyLibrary.plugin = plugin;
        plugin.getLogger().log(Level.INFO, plugin.getClass().getName());
    }
    public static JavaPlugin getPlugin(JavaPlugin plug){
        return plugin;
    }
}
