fun main() {
  println("Hello world!")
  sandwich()
  println(math(10, 20))
  println(math(25, 0))
  println("the result of your division is: " + divisor(100, 0))
}
fun sandwich(){
  println("Let's make a sandwich!")
  println("input 3 ingredients you want to make in your sandwich")
  println("ingredient 1:")
  var one = readLine()
  while (one!!.length < 1) {
    println("You can't just enter a blank space!")
    one = readLine()
  }
  println("ingredient 2:")
  var two = readLine()
  while (two!!.length < 1) {
    println("You can't just enter a blank space!")
    two = readLine()
  }
  println("ingredient 3:")
  var three = readLine()
  while (three!!.length < 1) {
    println("You can't just enter a blank space!")
    three = readLine()
  }
  val arr = arrayOf(one, two, three)
  println("This sandwich is made from ${arr[0]} and ${arr[1]} and ${arr[2]}")
}
fun math(a: Int, b: Int):Int {
  if (a > b){
    return a + b + 100
  } else {
    return b - a + 33
  }
}

fun divisor(a: Int, b: Int): Int {
  return a / b
}