/**
 * A method that gives you the last digit of a number
 * @author Liana Bazzarella
 */
public class Main {

  // method that gives you last digit of number
  public static double lastDigit(double integer){
    double answer = ( integer % 10);
    if(integer < 0){
      answer = ( -integer % 10);
    }
    System.out.println(answer);
    return answer;
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // number used for finding last digit
    lastDigit(1459);
  }
}
