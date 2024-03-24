package `fun`.eternalblue.api

import org.bukkit.entity.Player

interface ConditionAPIHandler
{
    fun handleCondition(player: Player, condition: String)
}