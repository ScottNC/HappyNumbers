import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static boolean isHappy (int i, int base) {
        List<Integer> allSums = new ArrayList<>();

        int newNumber = i;

        while (true) {
            Integer sum = sumSquareDigits(newNumber, base);

            if (sum == 1)
                return true;
            if (allSums.contains(sum))
                return false;

            allSums.add(sum);

            newNumber = sum;
        }
    }

    public static Integer sumSquareDigits (int i, int base) {
        int upperPower = (int) Math.floor(Math.log(i)/Math.log(base));

        int sum = 0;

        for (int power = upperPower; power >= 0; power--) {
            int powerOfBase = (int) Math.pow(base, power);
            int digitValue = (int) Math.floor((double) i /powerOfBase);
            i -= digitValue * powerOfBase;
            sum += (int) Math.pow(digitValue, 2);
        }

        return sum;
    }
}
