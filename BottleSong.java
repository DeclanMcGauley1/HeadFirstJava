public class BottleSong {

    public static void main(String[] args) {
        int bottles = 99;
        while (bottles > 0) {
          System.out.println(bottles + " bottles of beer on the wall");
          System.out.println(bottles + " bottles of beer");
          bottles -= 1;
          System.out.println("take one down pass it around, " + bottles + " bottles of beer on the wall");
        }
    }
}
