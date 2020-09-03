val myNumbers = (1 to 9).toList

/*
  sliding(arg1, arg2)
  where {
    arg1 = size of each window
    EX: if 3, then will partition as (1, 2, 3), (3, 4, 5), (4, 5, 6), etc
    arg2 = step of each window,
    EX: if step is 2, then will step from (1), (3), (5), (7), (9), etc
  }
*/

myNumbers.sliding(2, 1).toList
myNumbers.sliding(3, 1).toList
myNumbers.sliding(2, 4).toList
myNumbers.sliding(1, 2).toList
myNumbers.sliding(5, 1).toList
