package `fun`.eternalblue.api

import org.bukkit.Bukkit

object underNameAPI
{
    val instance : ConditionAPIHandler?
        get() = Bukkit.getServicesManager().getRegistration(ConditionAPIHandler::class.java)?.provider
}