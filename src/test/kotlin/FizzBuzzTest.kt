import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FizzBuzzTest{
    private val testFizzBuzz: FizzBuzz = FizzBuzz()

    @Test
    fun testPositiveIntegerReturnFizz() {
        val results = testFizzBuzz.getFizzBuzz(3)
        val expected = "fizz"
        assertEquals(expected, results)
    }
    @Test
    fun testNegativeIntegerReturnFizz(){
        val results = testFizzBuzz.getFizzBuzz(-3)
        val expected = "fizz"
        assertEquals(expected, results)
    }
    @Test
    fun testPostiveIntegerReturnBuzz() {
        val results = testFizzBuzz.getFizzBuzz(10)
        val expected = "buzz"
        assertEquals(expected, results)
    }
}