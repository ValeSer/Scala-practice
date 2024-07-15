import org.scalatest.funsuite.AnyFunSuite
class FizzBuzzTest extends AnyFunSuite {

  test("prints FizzBuzz if divisible by 3 and 5") {
    assert(FizzBuzz.generate(15) === "FizzBuzz")
  }
}

