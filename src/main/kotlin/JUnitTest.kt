class JUnitTest {
    companion object {
        fun fibonacci(n: Int): Int {
            return if (n > 1)
                fibonacci(n - 1) + fibonacci(n - 2)
            else n
        }

        fun anioBisiesto(n: Int) = (n % 100 != 0) && (n % 4 == 0) || n % 400 == 0

        fun esPrimo(n: Int): Boolean {
            var div = 1
            val tope = n / 2
            while (++div < tope)
                if (n % div == 0)
                    return false
            return true
        }
    }
}
