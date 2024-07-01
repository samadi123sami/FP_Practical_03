package prac03_22001816

object Q4 {
  def main(args: Array[String]): Unit = {
    println("Enter number of Integers:")
    val num = scala.io.StdIn.readInt()
    println("\nEnter Integers:")

    import scala.io.StdIn.readInt
    var i = 0
    val IntList: List[Int] = List.fill(num)(readInt())

    //print entered Integers
    println("\nAll Integers given by user:")
    println(IntList)

    var evenList: List[Int] = IntList.filter(_%2==0)
    println("\nSum of even numbers: ")
    println(evenList.sum)

  }

}
