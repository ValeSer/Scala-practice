import org.scalatest.funsuite.AnyFunSuite
class FizzBuzzTest extends AnyFunSuite {

  test("prints FizzBuzz if divisible by 3 and 5") {
    assert(FizzBuzz.generate(15) === "FizzBuzz")
  }
  test("prints Fizz if divisible by 3") {
    assert(FizzBuzz.generate(3) === "Fizz")
  }
  test("prints Buzz if divisible by 5") {
    assert(FizzBuzz.generate(5) === "Buzz")
  }
  test("prints the number if not divisible by 3, 5, or both") {
    assert(FizzBuzz.generate(4) === "4")
  }
}

