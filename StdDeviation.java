import java.util.Arrays;
public class StdDeviation {

    public static Double stdDev(Double[] arg){
        
        //calculate mean

        Double y = 0.0;

        Double z = 0.0;

        for(Double x : arg) {
            
            y = y + x;

            z++;
            
        }

        Double mean = y / z;

        double temp = 0.0;

        for(Double x : arg){

            temp = temp + ((x - mean) * (x - mean));

        }

        temp = temp / (arg.length - 1);

        temp = Math.sqrt(temp);

        return temp;

    }
    
    public static void main(String[] args){

        String[] temp = args[0].split(", ");

        Double[] doubArr = new Double[args[0].split(", ").length];

        for (int x = 0; x < temp.length; x++){

            doubArr[x] = Double.parseDouble(temp[x]);

        }

        System.out.println(stdDev(doubArr));

    }
}
