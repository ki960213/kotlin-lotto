package domain

class RandomNumberGenerator : NumberGenerator {
    override fun generate(): List<Int> =
        (MINIMUM_NUMBER..MAXIMUM_NUMBER).shuffled().take(6).sorted()

    companion object {
        private const val MINIMUM_NUMBER = 1
        private const val MAXIMUM_NUMBER = 45
    }
}
