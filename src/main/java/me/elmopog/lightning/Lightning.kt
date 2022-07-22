package me.elmopog.lightning

import me.elmopog.lightning.Commands.GiveWandCommand
import org.bukkit.plugin.java.JavaPlugin

class Lightning : JavaPlugin() {
    override fun onEnable() {
        getCommand("givewand")?.setExecutor(GiveWandCommand)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}