object Dependances {
    object Kotest {
        operator fun invoke(): List<String> = listOf(runner, assertions)

        private const val version = "4.4.0"
        private const val runner = "io.kotest:kotest-runner-junit5-jvm:$version"
        private const val assertions = "io.kotest:kotest-assertions-core-jvm:$version"
    }
}
