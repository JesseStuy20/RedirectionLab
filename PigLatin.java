import java.util.Scanner ;
public class PigLatin {

  public static void main(String[] args) {

      Scanner in = new Scanner(System.in) ;
      while (in.hasNextLine()) {
        Scanner n = new Scanner(in.nextLine()) ;
        while (n.hasNext()) {
          String temp = n.next().toLowerCase() ;
          String returnValue = temp ;
          String[] vowels = {"a","e","i","o","u"};
          boolean vowelCheck = false ;
          for (int i=0; i<5; i++) {
            if (vowels[i].equals(temp.charAt(0)+"")) {
              vowelCheck = true ;
            }
          }
          if (vowelCheck) {
            returnValue = returnValue + "hay" ;
          }
          else {
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
