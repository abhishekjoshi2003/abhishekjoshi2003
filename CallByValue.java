public class CallByValue
{
 public static void main (String[] args)
 {
  int a = 34 ;
  int b = 12 ;
  swap(a,b) ;
  System.out.println(a+ "  "+b);
 }
 static void swap(int c , int d)
 {
  int temp = c ;
  c = d ; 
  d = temp ;
 }
}