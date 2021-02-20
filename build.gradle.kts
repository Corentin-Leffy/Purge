plugins {
    base
    kotlin("jvm") version Plugins.Kotlin.version apply false
    id(Plugins.Detekt.id) version Plugins.Detekt.version
}

subprojects {
    group = Purge.groupe
    version = Purge.version

    repositories {
        mavenCentral()
        jcenter()
    }

    apply(plugin = "kotlin")
    apply(plugin = Plugins.Detekt.id)

    val implementation by configurations
    val testImplementation by configurations

    dependencies {
        Plugins.Kotlin().forEach { implementation(kotlin(it)) }
        Dependances.Kotest().forEach { testImplementation(it) }
        detektPlugins(Plugins.Detekt.formatting)
    }

    tasks.withType(Test::useJUnitPlatform)
}
