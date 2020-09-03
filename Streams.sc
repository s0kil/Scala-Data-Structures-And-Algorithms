val myStream = LazyList("message1", "message2", "message3")
myStream(1)
myStream

val myNums = (0 to 1000).to(LazyList)
myNums(3)
myNums

val lazyChars =
  'a' #:: 'b' #:: 'c' #:: 'd' #:: LazyList.empty

val myTestStream =
  LazyList.cons('a', LazyList.empty)

def createInfiniteStream(x: Int): LazyList[Int] = {
  println("Processing...")
  LazyList.cons(x, createInfiniteStream(x + 1))
}

val myInfiniteStream =
  createInfiniteStream(0)

myInfiniteStream(0)
myInfiniteStream(1)
myInfiniteStream(2)
myInfiniteStream

var testImmInfStr =
  createInfiniteStream(5)
testImmInfStr(4)
testImmInfStr(6)
testImmInfStr(5)
testImmInfStr(0)
testImmInfStr(3)
testImmInfStr

testImmInfStr.take(10).toList

def createFibSeries(a: Int, b: Int): LazyList[Int] = {
  LazyList.cons(a, createFibSeries(b, a + b))
}

val myFibSeries = createFibSeries(0, 1)
myFibSeries.take(7).foreach(println)
