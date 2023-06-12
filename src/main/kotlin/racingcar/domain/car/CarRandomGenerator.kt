package racingcar.domain.car

import kotlin.random.Random

object CarRandomGenerator {
    private const val MIN_RANGE = 0
    private const val MAX_RANGE = 9
    private const val STANDARD_VALUE = 4

    fun canGo(
        minRange: Int = MIN_RANGE,
        maxRange: Int = MAX_RANGE,
        standardValue: Int = STANDARD_VALUE
    ) = Random.nextInt(MIN_RANGE, MAX_RANGE) >= STANDARD_VALUE
}