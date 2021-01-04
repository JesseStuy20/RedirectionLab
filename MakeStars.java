import java.util.Scanner ;
public class MakeStars {

  public static void main(String[] args) {

      Scanner in = new Scanner(System.in) ;
      while (in.hasNextLine()) {
        Scanner n = new Scanner(in.nextLine()) ;
        while (n.hasNext()) {
          String temp = n.next() ;
          for (int i=0; i<temp.length(); i++) {
            System.out.print("*") ;
          }
          System.out.print(" ") ;
        }
        System.out.println() ;
      }
    }

}
