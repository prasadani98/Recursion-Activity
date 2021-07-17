object q6_fibonachi extends App {
  def fib(n : Int): Int={
    if(n==1 || n==0) n
    else fib(n - 1) + fib(n - 2)

  }

  def fibseq( n :Int): Unit ={
    if (n>0) fibseq(n-1)
    print(fib(n)+", ")
  }

  fibseq(4)
}
