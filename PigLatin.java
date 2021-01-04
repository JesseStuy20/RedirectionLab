import java.util.Scanner ;
public class PigLatin {

  public static void main(String[] args) {

      Scanner in = new Scanner(System.in) ;
      while (in.hasNextLine()) {
        Scanner n = new Scanner(in.nextLine()) ;
        while (n.hasNext()) {
          String temp = n.next() ;
          System.out.print(temp + "ay") ;
          System.out.print(" ") ;
        }
        System.out.println() ;
      }
    }

}
