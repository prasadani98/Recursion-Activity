object q2_primeseq extends App {
  def prime( n :Int,x:Int=0,y:Int=0):Boolean ={
    if(x==0&&y==0) prime(n,n)
    else if(x==0 && y>2) false
    else if(x==0 && y<=2) true
    else if(n%x==0) prime(n,x-1,y+1)
    else if(n%x!=0 && y>2) false
    else if(n%x!=0 && y<=2) prime(n,x-1,y)
    else if(x<=2 && y<=2) true
    else false
  }

  def primeseq(n:Int,x:Int=2): Unit ={
    if(n>x){
      if(prime(x)) print(x +", ")
      primeseq(n,x+1)
    }
  }

  primeseq(3)

}
