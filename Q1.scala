package prac03_22001816

object Q1 {
  def main(args: Array[String]): Unit = {
    println("Enter a string")
    var string = scala.io.StdIn.readLine()
    println("Original String: "+string)
    var reversed_string = reverse(string)
    println("Reversed String: "+reversed_string)
  }

  def reverse(string:String):String={
    if(string.isEmpty){
      ""
    }
    else{
      reverse(string.tail)+string.head
    }
  }
}
