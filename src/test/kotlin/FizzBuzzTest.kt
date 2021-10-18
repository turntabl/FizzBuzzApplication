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
    @Test
    fun testNegativeIntegerReturnBuzz() {
        val results = testFizzBuzz.getFizzBuzz(-10)
        val expected = "buzz"
        assertEquals(expected, results)
    }

    @Test
    fun testPostiveIntegerReturnFizzBuzz() {
        val results = testFizzBuzz.getFizzBuzz(15)
        val expected = "fizzbuzz"
        assertEquals(expected, results)
    }

    @Test
    fun testNegativeIntegerReturnFizzBuzz() {
        val results = testFizzBuzz.getFizzBuzz(-15)
        val expected = "fizzbuzz"
        assertEquals(expected, results)
    }

    @Test
    fun testIntegerNotDivisibleBy3AND5() {
        val results = testFizzBuzz.getFizzBuzz(4)
        val expected = "4"
        assertEquals(expected, results)
    }
}