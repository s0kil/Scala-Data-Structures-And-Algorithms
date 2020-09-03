def decimalToBinaryConverter(x: Int): String = {
  val seqOfDivByTwo = Iterator.iterate(x)(a => a / 2)
  val binList = seqOfDivByTwo.takeWhile(a => a > 0).map(a => a % 2)
  binList.mkString.reverse
}

decimalToBinaryConverter(5)
decimalToBinaryConverter(8)
