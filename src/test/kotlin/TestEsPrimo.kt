import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TestEsPrimo {

    @Test
    fun esPrimoConPrimo7(){
        assertTrue(JUnitTest.esPrimo(10))
    }

    @Test
    fun esPrimoConPrimo43(){
        assertTrue(JUnitTest.esPrimo(43))
    }

    @Test
    fun esPrimoConNoPrimo50(){
        assertFalse(JUnitTest.esPrimo(50))
    }

    @Test
    fun esPrimoConNoPrimo96(){
        assertFalse(JUnitTest.esPrimo(96))
    }
}
