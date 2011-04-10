public class Fib
{

 public static int tally = 0;
/**
*   Tib is a tallied Fibonacci
**/
 public static long tib(int number)
 {
  tally++;
  if (number <= 1)
  {
    return number;
  }
  else 
  {
    return (tib(number-1) + tib(number-2));
  }
 }

 public static long fib(int number)
 {
  if (number <= 1)
  {
   return number;
  }
  else
  {
    return (fib(number-1) + fib(number-2));
  }
 }

 public static void main(String[] args)
 {
    System.out.println(Fib.fib(10));
    System.out.println(Fib.fib(15));

    System.out.println(tib(15) + " " + Fib.tally);
 }

}

