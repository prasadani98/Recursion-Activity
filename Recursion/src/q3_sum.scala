object q3_sum extends App {
  def add(n: Int): Int = {
    if (n == 1) {
      n
    }
    else {
      n + add(n - 1)
    }
  }

  println(add(20))
}
