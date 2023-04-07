package dev.spaghett

import cc.polyfrost.oneconfig.utils.commands.CommandManager
import dev.spaghett.command.ExampleCommand
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
class ExampleMod {

    companion object {
        const val MODID = "examplemod"
        const val NAME = "Example Mod"
        const val VERSION = "1.0.0"
    }

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        // Your init code goes here
        CommandManager.register(ExampleCommand)
    }

}