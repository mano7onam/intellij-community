import java.util.ArrayList;

public class Main8 {

  void m() {
    String value = getOptional().orElse(null);
  }

  java.util.Optional<String> getOptional() {
    return new ArrayList<String>().stream().map(x -> x + x).filter(String::isEmpty).findFirst();
  }
}