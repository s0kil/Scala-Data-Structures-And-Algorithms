val myNumbers = Array(0, 2, 4, 6, 8, 10)
myNumbers(5)

val numMult2 =
  myNumbers.map(_ * 2)

numMult2(5)

// Imperative Version Of Above
def multBy2(myArray: Array[Int]): Array[Int] = {
  val size = myArray.length
  val myTempArray = new Array[Int](size)
  var i = 0
  while(i < size) {
    myTempArray(i) = myArray(i) * 2
    i += 1
  }
  myTempArray
}

val myNumbersImp = Array(0, 2, 4, 6, 8, 10)
multBy2(myNumbersImp).foreach(println)

myNumbers.reverse

val array1 = Array(1, 2, 3, 4, 5)
val array2 = Array(6, 7, 8, 9, 10)
array1 ++ array2

val fruits =
  Array("banana", "apple", "orange")

fruits.sorted
fruits.contains("banana")

val myNums = Array(1, 2, 2, 3, 4, 3, 6)
myNums.filter(x => x == 2)
myNums.filter(x => x % 2 == 0)

myNums.find(x => x % 2 == 0).get

val counts = Array(
  "900,google.com",
  "60,mail.yahoo.com",
  "10,mobile.sports.yahoo.com",
  "40,sports.yahoo.com",
  "10,stackoverflow.com",
  "2,en.wikipedia.org",
  "1,es.wikipedia.org",
  "1,mobile.sports"
)

val countsMap =
  counts
    .map(_.split(","))
    .map { case Array(s1, s2) => (s1, s2)}

val comCounts =
  countsMap.map {
    case (x, y) if y.endsWith(".com") => x.toInt
    case _ => 0
  }.sum
