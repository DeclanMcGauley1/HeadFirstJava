
public class WordBank {

  public static void main(String[] args) {
    String[] wordsOne = {"Hello", "hauifdha", "gjrsabgnkj", "fmkewaslgfa"};
    String[] wordsTwo = {"fsfa", "egagG", "GFEWAGAW", "efwagwqgq"};
    String[] wordsThree = {"Geasershger", "gdshgwgsag", "reshtrshs", "egwqgreahg"};

    int wordOneValue = (int)(Math.random() * wordsOne.length);
    int wordTwoValue = (int)(Math.random() * wordsTwo.length);
    int wordThreeValue = (int)(Math.random() * wordsThree.length);

    System.out.println("we need a " + wordsOne[wordOneValue] + " and a " + wordsTwo[wordTwoValue] + " and " + wordsThree[wordThreeValue]);

    int x = (int) 27.45;
    System.out.println(x);
  }

}
