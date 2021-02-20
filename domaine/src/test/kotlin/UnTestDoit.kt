import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class UnTestDoit : StringSpec({
    "être vrai" {
        true shouldBe true
    }
})
