/**
* @author Djonker
* @version 1.0
* Code for the quadratic formula
*/
import java.lang.Math;
import java.util.Arrays;
public class QuadraticFormula{

    public static double[] quadraticFormula(double a, double b, double c){

        double[] arr = new double[2]; //makes array for roots

        double discriminant = (b * b) - (4.0 * a * c); //calculates discriminant

        if (discriminant > 0){

            //if roots are real and distinct, assign them accordingly

            arr[0] = (-b + Math.sqrt(discriminant)) / (2.0*a);
            arr[1] = (-b - Math.sqrt(discriminant)) / (2.0*a);

            return arr;

        } else if (discriminant == 0){

            //if roots are real and the same, assign them accordingly

            arr[0] = arr[1] = -b / (2.0 * a);

            return arr;

        } else {

            //if roots are complex, quit while you're ahead

            System.out.println("Roots are complex numbers.");

            return arr;

        }

    }

    public static void main(String[] args){

        System.out.print(Arrays.toString(quadraticFormula(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]))));

    }

}