object q4_even extends App {
  def even(n :Int): Unit = {
    if(n==0) println("even")
    else if (n==1) println("odd")
    else even(n-2)
  }
  even(10)

}
