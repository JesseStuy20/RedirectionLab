import java.util.Scanner ;
public class PigLatin {

  public static void main(String[] args) {

      Scanner in = new Scanner(System.in) ;
      while (in.hasNextLine()) {
        Scanner n = new Scanner(in.nextLine()) ;
        while (n.hasNext()) {
          String temp = n.next() ;
          String returnValue = temp ;
          if (!(((temp.charAt(0)+"").equals("a")) || ((temp.charAt(0)+"").equals("e")) || ((temp.charAt(0)+"").equals("i"))
          || ((temp.charAt(0)+"").equals("o")) || ((temp.charAt(0)+"").equals("u")))) {
            returnValue = "" ;
            for (int i=1; i<temp.length(); i++) {
              returnValue = returnValue + temp.charAt(i) ;
            }
            returnValue = returnValue + temp.charAt(0) ;
            returnValue = returnValue + "ay" ;
          }
          System.out.print(returnValue) ;
          System.out.print(" ") ;
        }
        System.out.println() ;
      }
    }

}
