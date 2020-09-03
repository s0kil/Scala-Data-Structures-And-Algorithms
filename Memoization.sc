def calcFactorial(x: Int): Int = {
  if (x == 0 || x == 1) 1
  else {
    println("Computing Factorial")
    x * calcFactorial(x - 1)
  }
}

calcFactorial(5)

class FactorialMemoized {
  var cache: Map[Int, Int] = Map()

  def lookup(num: Int): Int =
    cache.getOrElse(num, -1)

  def calcFactorialMemoized(x: Int): Int = {
    if (x == 0 || x == 1) 1
    else if (lookup(x) > 0) {
      println("Performing Lookup")
      lookup(x)
    } else {
      println("Performing Calculation")
      val factorial = x * calcFactorialMemoized(x - 1)
      cache += x -> factorial
      factorial
    }
  }
}

val factMem = new FactorialMemoized()
factMem.calcFactorialMemoized(3)
factMem.calcFactorialMemoized(5)
factMem.calcFactorialMemoized(10)
factMem.calcFactorialMemoized(2)
factMem.calcFactorialMemoized(8)

