package me.elmopog.lightning.Util

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextDecoration
import net.kyori.adventure.text.minimessage.MiniMessage

object format {

    private val mm = MiniMessage.miniMessage()

    public fun format(s:String): Component {
        return Component.empty().decoration(TextDecoration.ITALIC, false).append(mm.deserialize(s))
    }

    public fun sformat(s:String): Component { MiniMessage.miniMessage()
        return Component.empty().decoration(TextDecoration.ITALIC, false).append(mm.deserialize("<red><b>Elmo <dark_gray>| <reset><white>$s"))
    }

}