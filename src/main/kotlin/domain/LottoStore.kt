package domain

class LottoStore {

    fun sell(amount: Int): List<Lotto> {
        require(amount in MINIMUM_AMOUNT..MAXIMUM_AMOUNT) { ERROR_CREATE_COUNT.format(amount) }
        val lottoFactory = LottoFactory(RandomNumberGenerator())
        return lottoFactory.create(getCount(amount))
    }

    private fun getCount(amount: Int) = amount / LOTTO_PRICE

    companion object {
        private const val MINIMUM_AMOUNT = 1000
        private const val MAXIMUM_AMOUNT = 100000
        const val LOTTO_PRICE = 1000
        private const val ERROR_CREATE_COUNT =
            "구매 할 수 있는 금액은 ${MINIMUM_AMOUNT}원 이상 ${MAXIMUM_AMOUNT}원 이하입니다.\n잘못된 값: %d"
    }
}
