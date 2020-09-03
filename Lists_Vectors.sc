val myFruits =
  List("grape", "banana", "apple", "mango")

myFruits(3)

val yourFruits =
  Vector("cucumber", "tomato")

val bothFruits =
  myFruits ++ yourFruits

List(1, 2) ++ Vector(3, 4)
Vector(1, 2) ++ List(3, 4)

val notQuiteFruits =
  bothFruits.filter(x => x == "tomato")

val myWords =
  List("dog", "cat", "rat", "goat", "horse")

myWords groupBy(_.length)
