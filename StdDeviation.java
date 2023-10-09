/**
* @author Djonker
* @version 1.0
* Code for calculating the standard deviation of an array
*/
import java.util.Arrays;
import java.lang.Math;

public class StandardDeviation {

    public static Double stdDev(Double[] arr){
        
        //calculate mean

        Double y = 0.0;

        Double z = 0.0;

        for (Double x : arr) {
            
            y = y + x;

            z++;
            
        }

        Double mean = y / z;

        Double result = 0.0;

        //square each number in array after subtracting the mean from it
        //add all that up in a result variable

        for(Double x : arr){

            result = result + ((x - mean) * (x - mean));

        }

        //divide the result by the amount of numbers in the array minus one
        //the take the square root

        result = Math.sqrt(result / (arr.length - 1));

        return temp;

    }
    
    public static void main(String[] args){

        //gather and transform input

        String[] temp = args[0].split(", ");

        Double[] doubArr = new Double[args[0].split(", ").length];

        for (int x = 0; x < temp.length; x++){

            doubArr[x] = Double.parseDouble(temp[x]);

        }

        System.out.println(stdDev(doubArr));

    }
}
