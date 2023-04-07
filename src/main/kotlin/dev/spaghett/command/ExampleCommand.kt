package dev.spaghett.command

import cc.polyfrost.oneconfig.utils.commands.annotations.Command
import cc.polyfrost.oneconfig.utils.commands.annotations.Main
import dev.spaghett.ExampleMod
import dev.spaghett.config.ExampleConfig

/**
 * Example OneConfig command.
 * See [the OneConfig docs](https://docs.polyfrost.cc/oneconfig/commands/commands) for more information.
 */
@Command(
    value = ExampleMod.MODID,
    description = "Example command"
)
object ExampleCommand {

    @Main
    private fun handle() {
        // Your command code goes here
        ExampleConfig.openGui()
    }

}