object Prime {
  
   def isPrime(n: Int): Boolean = {
    if (n == 1) {
      return false;
    }
    for (x <- 2 to n - 1) {
      if ((n % x) == 0) {
        return false;
      }
    }
    return true;
  }

  def functionalPrime(n: Int, d: Int): Boolean = {
    if (n == 1) {
      return false;
    } else if (d == 1) {
      return true;
    } else if (n % d == 0) {
      return false;
    } else {
      functionalPrime(n, d - 1);
    }
  }
  
  
  def startFunctional(n:Int) : Boolean = {
    functionalPrime(n,n-1);
  }

  def main(args: Array[String]) {
    for (x <- 1 to 30) {
      //println(x + " is Prime " + isPrime(x));
      println(x + " is Prime " + startFunctional(x));
    }
  }

}