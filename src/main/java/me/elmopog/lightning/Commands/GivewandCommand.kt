package me.elmopog.lightning.Commands

import me.elmopog.lightning.Util.format
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.ItemMeta

object GiveWandCommand : CommandExecutor{
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if(args.isEmpty()){
            sender.sendMessage(format.format("<red>Error: <white>No Player given!"))
            return true
        }
        val player:Player? = Bukkit.getPlayerExact(args[0])

        if(player == null){
            sender.sendMessage(format.sformat("<red>Error: <white>${args[0]} <red>is not a Player!"))
            return true
        }

        val item: ItemStack = ItemStack(Material.BLAZE_ROD)
        val meta: ItemMeta = item.itemMeta

        meta.displayName(format.format("<reset><yellow><b>Lightning Wand"))

        item.itemMeta = meta

        player.inventory.addItem(item)
        player.sendMessage(format.sformat("You were given a <yellow><b>Lightning Stick<white>!"))
        return true
    }
}