import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestAnioBisiesto {

    @Test
    fun anioBiestoConBisiesto2000(){
        Assertions.assertTrue(JUnitTest.anioBisiesto(2000))
    }

    @Test
    fun anioBiestoConBisiesto1600(){
        Assertions.assertTrue(JUnitTest.anioBisiesto(1600))
    }

    @Test
    fun anioBiestoConNoBisiesto2001(){
        Assertions.assertFalse(JUnitTest.anioBisiesto(2001))
    }

    @Test
    fun anioBiestoConNoBisiesto2002(){
        Assertions.assertFalse(JUnitTest.anioBisiesto(2002))
    }
}