val myNum = 10
var myNextNum = 11

import java.util.Calendar

lazy val lazyTime =
  Calendar.getInstance.getTime

val eagerTime =
  Calendar.getInstance.getTime

println(lazyTime)
println(eagerTime)

def myMethod(myArg: () => Int): Unit =
  println(myArg())

myMethod(() => 5)
