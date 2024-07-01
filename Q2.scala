package prac03_22001816

object Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter number of strings:")
    val num = scala.io.StdIn.readInt()
    println("\nEnter strings that you want:")

    import scala.io.StdIn.readLine
    val stringList:List[String] = List.fill(num)(readLine())

    //print entered strings
    println("\nAll strings given by user:")
    println(stringList)

    val L_stringList = stringList.filter(_.length>5)
    //Print strings that have a length greater than 5
    println("\nStrings that have a length greater than 5:")
    println(L_stringList)

  }
}
