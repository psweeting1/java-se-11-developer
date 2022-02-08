package garden.vegetable;

/*
Create an class in a package. You can right click on the src directory and create a package via creating a class.
e.g. name your new class you're creating garden.vegetable.VineVegetable <<< The last part "VineVegetable"
will be you're created class inside your package layout.
 */

/*
Terminal Command: java -cp out/production/packages-imports garden.vegetable.VineVegetable (Out file was created by
intelli).

This executes the FQCN (Fully Qualified Class Name).
*/

/*
javac -d build src/garden/vegetable/VineVegetable.java

javac -d build allows you to specifies where you would like the build directory to go and what you would like to build.
 */

public class VineVegetable {

  // Main Method simply outputs some data
  public static void main(String[] args) {
    System.out.println("I am a vegetable that grows on a vine.");
  }
}
