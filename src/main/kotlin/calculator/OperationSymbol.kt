package calculator

import calculator.exception.NoSymbolException

enum class OperationSymbol(val symbol: Char) {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/');

    fun execute(result: Int, operand: Int) = when (this) {
        ADD -> result + operand
        SUBTRACT -> result - operand
        MULTIPLY -> result * operand
        DIVIDE -> {
            if (operand == 0) throw ArithmeticException("0으로 나눌 수 없습니다.")
            result / operand
        }
    }

    companion object {
        fun bySymbol(symbol: String): OperationSymbol {
            if (symbol.length != 1) throw NoSymbolException("허용되지 않는 연산 기호입니다.")

            return OperationSymbol.values().firstOrNull { it.symbol == symbol.first() }
                ?: throw NoSymbolException("허용되지 않는 연산 기호입니다.")
        }
    }
}