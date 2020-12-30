public class DogTestDrive {

  public static void main(String[] args) {
    Dog d = new Dog();
    d.bark();

    Dog[] pets;
    pets = new Dog[7];

    for (int i = 0; i < 7; i++) {
      pets[i] = new Dog();
    }

    pets[0].bark();
  }
}
