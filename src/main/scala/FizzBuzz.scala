object FizzBuzz {
  def generate(number: Int): String = {
    if ((number % 3) == 0 && (number % 15) == 0) {
      return "FizzBuzz"
    } else if ((number % 3) == 0) {
      return "Fizz"
    }
    return ""
  }





}

