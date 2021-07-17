object q5_sumeven extends App{
  def sumeven(n :Int):Int={
    if(n==0) n
    else if(n==1) 0
    else if(n%2==0) n-2 + sumeven(n-2)
    else n-1+ sumeven(n-2)

  }

  println(sumeven(9))

}
