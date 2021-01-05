import java.util.Scanner ;
public class PigLatin {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in) ;
    while (in.hasNextLine()) {
      Scanner n = new Scanner(in.nextLine()) ;
      while (n.hasNext()) {
        // System.out.print(pigLatinSimple(n.next()).toLowerCase()) ;
        //System.out.print(pigLatin(n.next().toLowerCase())) ;
        System.out.print(pigLatinBest(n.next().toLowerCase())+" ") ;
      }
      System.out.println() ;
    }
  }

  public static String pigLatinSimple(String s) {
      String returnValue = s ;
      String[] vowels = {"a","e","i","o","u"};
      boolean vowelCheck = false ;
      for (int i=0; i<5; i++) {
        if (vowels[i].equals(s.charAt(0)+"")) {
          vowelCheck = true ;
        }
      }
      if (vowelCheck) {
        returnValue = returnValue + "hay" ;
      }
      else {
        returnValue = "" ;
        for (int i=1; i<s.length(); i++) {
          returnValue = returnValue + s.charAt(i) ;
        }
        returnValue = returnValue + s.charAt(0) ;
        returnValue = returnValue + "ay" ;
      }
      return returnValue ;
    }

  public static String pigLatin(String s) {
      String returnValue = s ;
      String[] vowels = {"a","e","i","o","u"} ;
      boolean vowelCheck = false ;
      for (int i=0; i<5; i++) {
        if (vowels[i].equals(s.charAt(0)+"")) {
          vowelCheck = true ;
        }
      }
      String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr",
      "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl",
      "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp",
      "st", "sw", "th", "tr", "tw", "wh", "wr"} ;
      boolean digraphCheck = false ;
      for (int i=0; i<31; i++) {
        if (s.length()>1 && digraphs[i].equals(s.substring(0,2))) {
          digraphCheck = true ;
        }
      }
      if (vowelCheck) {
        returnValue = returnValue + "hay" ;
      }
      if (digraphCheck) {
        returnValue = "" ;
        for (int i=2; i<s.length(); i++) {
          returnValue = returnValue + s.charAt(i) ;
        }
        returnValue = returnValue + s.substring(0,2) ;
        returnValue = returnValue + "ay" ;
      }
      if (!(vowelCheck) && !(digraphCheck)) {
        returnValue = "" ;
        for (int i=1; i<s.length(); i++) {
          returnValue = returnValue + s.charAt(i) ;
        }
        returnValue = returnValue + s.charAt(0) ;
        returnValue = returnValue + "ay" ;
      }
      return returnValue ;
    }

    public static String pigLatinBest(String s) {
      boolean letCheck = false ;
      String lets[] = {"a","b","c","d","e","f","g","h","i","j","k",
    "l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",} ;
      for (int i=0; i<26; i++) {
        if ((s.charAt(0)+"").equals(lets[i])) {
          letCheck = true ;
        }
      }
      if (!(letCheck)) {
        return s ;
      }
      else {
        String punct = "" ;
        boolean charScan = false ;
        int lastNum = (s.length()-1) ;
        for(int i=0; i<26; i++) {
          if ((s.charAt(lastNum)+"").equals(lets[i])) {
            charScan = true ;
          }
        }
        String returnValue = s ;
        if (!(charScan)) {
          punct = (s.charAt(lastNum)+"") ;
          returnValue = s.substring(0,lastNum) ;
        }
        returnValue = pigLatin(returnValue)+punct ;
        return returnValue ;
      }
    }

}
