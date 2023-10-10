package org.diamond.reee.handlers;

import org.bukkit.ChatColor;

public class item {
    /**
     * Translate normal text to colored text
     * @param msg String of text to translate using the & sign
     * @return String
     */
    public static String test(String msg){
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
