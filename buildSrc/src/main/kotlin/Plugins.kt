object Plugins {

    object Detekt {
        const val version = "1.16.0-RC1"
        const val id = "io.gitlab.arturbosch.detekt"
        const val formatting = "$id:detekt-formatting:$version"
    }

    object Kotlin {
        operator fun invoke(): List<String> = listOf("stdlib")

        const val version = "1.4.30"
    }
}