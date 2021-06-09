import java.util.regex.*;

public class RegexValidatePinCode {


  public static boolean validatePin(String pin) {
    String regex = "[0-9]+";
    
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(pin);
    
    if (((pin.length() == 4) || (pin.length() == 6)) && (m.matches())) {
    // return true;
    System.out.println("true");
  } else {
    // return false;
    System.out.println("false");
  }
  }

public static void main(String[] args) {
    validatePin("012345");

}
  }

  //Add void and delete boolean in validatePin function for a print out when code is run.

  