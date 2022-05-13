/**
 * I don't know.
 *
 */
public class GradeConverter {
  /**
   * I don't know.
   *
   * @param score I don't know
   * @return A B C D E Invalid
   */
  public String convert(int score) {
    if (score <= 100 && score >= 90) {
      return "A";
    } else if (score <= 89 && score > 80) {
      return "B";
    } else if (score <= 79 && score > 70) {
      return "c";
    } else if (score <= 69 && score > 60) {
      return "D";
    } else if (score <= 59 && score > 0) {
      return "E";
    } else {
      return "Invalid";
    }
  }
}
