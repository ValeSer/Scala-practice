object FizzBuzz {
//  def generateOne(number: Int): String = {
//    if ((number % 3) == 0 && (number % 5) == 0) {
//      return "FizzBuzz"
//    } else if ((number % 3) == 0) {
//      return "Fizz"
//    } else if ((number % 5) == 0) {
//      return "Buzz"
//    } else return number.toString
//    return ""
//  }
//
//  def generate(number: Int): String = {
//    val s = 1 to number
//    return s.map(generateOne).mkString(", ")
//  }

//  def generate(number:Int): String = {
//    var s = ""
//    if(number <= 100) {
//      (number%3, number%5) match {
//        case(0,0) => s += "FizzBuzz"
//        case(0,_) => s += "Fizz"
//        case(_,0) => s += "Buzz"
//        case _ => s += number.toString
//      }
//      return s += generate(number)
//
//    }
//    return s
//  }

  def generateOne(number: Int): String = (number % 3, number % 5) match {
    case (0, 0) => "FizzBuzz"
    case (0, _) => "Fizz"
    case (_, 0) => "Buzz"
    case _ => number.toString
  }

  def generate(number: Int): String = number match {
    case 0 => ""
    case 1 => generateOne(1)
    case _ => generate(number - 1) + ", " + generateOne(number)
  }

}

