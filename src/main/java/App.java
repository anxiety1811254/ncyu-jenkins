/**
 * I don't know.
 *
 */
public class App {
  /**
   * I don't know.
   *
   * @param args I don't know
   *
   */
  public static void main(String[] args) {
    GradeConverter converter = new GradeConverter();

    for (int i = 0; i < 105; i++) {
      System.out.println(i + ";" + converter.convert(i));
    }
  }
}
