import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestsFibonacci {

    @Test
    fun testFibonacciCasoBase0() {
        assertEquals(0,JUnitTest.fibonacci(0))
    }

    @Test
    fun testFibonacciCasoBase1() {
        assertEquals(1,JUnitTest.fibonacci(1))
    }

    @Test
    fun testFibonacci34() {
        assertEquals(34,JUnitTest.fibonacci(9))
    }

    @Test
    fun testFibonacci8() {
        assertEquals(8,JUnitTest.fibonacci(6))
    }

    @Test
    fun testFibonacci233() {
        assertEquals(233,JUnitTest.fibonacci(13))
    }
}