public class MovieTestDriver {
  public static void main (String[] args) {

    Movie movie1 = new Movie();
    movie1.genre = "Action";
    movie1.title = "Fast and the Furious";
    movie1.rating = 7;

    movie1.playMovie();
  }
}
