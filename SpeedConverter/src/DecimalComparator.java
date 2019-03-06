import java.text.DecimalFormat;

public class DecimalComparator {

    private static DecimalFormat df2 = new DecimalFormat(".###");

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        if(num1 == 0.0 && num2 == 0.0){
            System.out.println(df2.format(num1) + " == " + df2.format(num2));
            return true;
        } else {
            if(df2.format(num1) == df2.format(num2)) {
                return true;
            } else {
                System.out.println(df2.format(num1) + " == " + df2.format(num2));
                return false;
            }
        }
    }
}
