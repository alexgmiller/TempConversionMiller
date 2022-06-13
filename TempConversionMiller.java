/*
 1. Alex Miller
 2. June 12, 2022
 3. This program converts the first 45 values of centigrade into values of farinheit and displays them in two separate columns. A description is provided at the top of the program. 
 4. I believe I should recieve a 100 for this assignment as the output is correctly displayed and all the necessary loops/methods/class constant variables are used.
*/
public class TempConversionMiller {
  public static final double x = (9.0 / 5); // class constant variable

  public static void main(String[] args) { // this method main calls the decription method and the farToCenti method.
    description();
    farToCenti();
  }

  /*
   * converts centigrade values 0-45 into farinheit values and displays them in
   * two separate columns.
   */
  public static void farToCenti() {
    System.out.println("Centigrade               Farinheit");
    // loops through and prints out centigrade/farinheit outputs until centigrade is
    // equal to 9 since 10 adds spacing in the columns
    for (int i = 0; i <= 9; i++) {
      int fahrinheit;
      fahrinheit = (int) ((x) * i) + 32;
      System.out.println(i + "                        " + fahrinheit);
    }
    for (int i = 10; i <= 45; i++) { // loops and prints the remaining numbers for centigrade and farinheit
      int fahrinheit;
      fahrinheit = (int) ((x) * i) + 32;
      System.out.println(i + "                       " + fahrinheit);
    }
  }

  /* prints out and provides description of what the program does at the header */
  public static void description() {
    for (int i = 0; i <= 1; i++) {
      stars();
      System.out.println(" ");
    }
    System.out.println(" ");
    System.out.println("Welcome to the Temp Converter app!");
    System.out.println("This app provides the temperatures in both centigrade and Fahrinheit.");
    System.out.println(" ");
    for (int i = 0; i <= 1; i++) {
      stars(); // calls the stars method
      System.out.println(" ");
    }
    System.out.println(" ");
  }

  /* creates a line of 75 "*" */
  public static void stars() {
    for (int i = 0; i <= 75; i++) {
      System.out.print("*");
    }
  }
}
