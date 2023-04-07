# 1.8.9 Forge Kotlin Template

Architectury Loom based template for 1.8.9 kotlin forge mods
including [OneConfig](https://github.com/Polyfrost/OneConfig/)

## Getting Started

Use this repo as a template using the button "Use this template" on the top right of the page.

Once you've cloned this repository, make sure to set the proper JDK version in IntelliJ.

- Gradle JVM (set this to version
  17): `Ctrl + Alt + S` -> `Build, Execution, Deployment` -> `Build Tools` -> `Gradle` -> `Gradle JVM`
- Project SDK (set this to version 1.8): `Ctrl + Alt + Shift + S` -> `Project` -> `Project SDK`

## Writing Your Mod

Make sure to replace the package names with your own package across all files, and you can start writing your mod.

If you don't want mixins (which allow for modifying vanilla code), then you can remove the references to mixins from
the `build.gradle.kts`, delete the `mixins.examplemod.json` and the `dev.spaghett.mixin` package.

Note that Mixins should be kept in their own package, and should exclusively be written in Java, since older versions of
Mixin don't play well with Kotlin.

## Building Your Mod

To export your project, run the `gradle build` task, and give other people the
file `build/libs/<modid>-<version>-all.jar`

## Including Dependencies

If your mod has any dependencies that need to be included in the final JAR file, simply use the `shadowImpl`
configuration in the `build.gradle.kts` file.

## Credit

This template is slightly adapted from [GitHub/romangraef](https://github.com/romangraef/Forge1.8.9Template/)'s
template.
The changes I've made simply include the following:

- Don't shade the Kotlin standard library into the final JAR
- Don't shade the Mixins library into the final JAR
- Added OneConfig as a dependency

If you don't want to use OneConfig, you might consider using their template instead, as it offers both a Kotlin and Java
template (Java also for version 1.12).

---

This template is licensed under the Unlicense (license copy present in this repository), or alternatively
under [Creative Commons 1.0 Universal (CC0 1.0)](https://creativecommons.org/publicdomain/zero/1.0/), and all
contributions and PR to this template are expected to follow this. This means your mod, based on this template can be
licensed whatever way you want, and does not need to reference back to this template in any way.
