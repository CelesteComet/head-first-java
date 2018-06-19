public class BeerSong {
  public static void main(String[] args) {
    int bottlesOfBeer = 100;
    while (bottlesOfBeer > 0) {
      System.out.println(bottlesOfBeer + " bottles of beer on the wall.");
      System.out.println(bottlesOfBeer + " bottles of beer on the wall.");
      System.out.println("Take one down pass it around");
      bottlesOfBeer = bottlesOfBeer - 1;
      if (bottlesOfBeer == 0) {
        System.out.println("NO MORE BOTTLES OF BEER ON THE WALL!");
        return;
      }
      if (bottlesOfBeer == 1) {
        System.out.println(bottlesOfBeer + " bottle of beer on the wall.");
      } else {
        System.out.println(bottlesOfBeer + " bottles of beer on the wall.");
      }
    }
  }
}
