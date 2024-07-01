package prac03_22001816

object Q3 {
  def main(args: Array[String]): Unit = {
    println("Enter two integers")
    val num1 = scala.io.StdIn.readInt()
    val num2 = scala.io.StdIn.readInt()
    val average = AverageOfInt(num1,num2)
    println(f"Average = $average%.2f")
  }

  def AverageOfInt(num1:Int,num2:Int): Double = {
    val sum = num1 + num2
    val ave = sum/2.0
    val rounded_average = BigDecimal(ave).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    rounded_average
  }


}
