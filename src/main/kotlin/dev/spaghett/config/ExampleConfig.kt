package dev.spaghett.config

import cc.polyfrost.oneconfig.config.Config
import cc.polyfrost.oneconfig.config.annotations.Dropdown
import cc.polyfrost.oneconfig.config.annotations.Slider
import cc.polyfrost.oneconfig.config.annotations.Switch
import cc.polyfrost.oneconfig.config.data.Mod
import cc.polyfrost.oneconfig.config.data.ModType
import dev.spaghett.ExampleMod

/**
 * Example OneConfig config.
 * See [the OneConfig docs](https://docs.polyfrost.cc/oneconfig/config/creating-a-config) for more information.
 * This file will be placed in ~/.minecraft/OneConfig/config/$MODID.json
 */
object ExampleConfig : Config(Mod(ExampleMod.NAME, ModType.HYPIXEL), ExampleMod.MODID + ".json") {

    @Switch(
        name = "Example Switch",
        description = "This is an example switch",
    )
    var exampleSwitch = false

    @Slider(
        name = "Example Slider",
        description = "This is an example slider",
        min = 0f,
        max = 100f,
        step = 10
    )
    var exampleSlider = 50 // this can be a float too

    @Dropdown(
        name = "Example Dropdown",
        description = "This is an example dropdown",
        options = ["Option 1", "Option 2", "Option 3"]
    )
    var exampleDropdown = 0

    init {
        initialize()
    }

}