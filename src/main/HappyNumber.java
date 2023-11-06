public class HappyNumber {
//    public static boolean isHappy (int i, int base) {
//
//    }

    public static int sumDigits (int i, int base) {
        int upperPower = (int) Math.floor(Math.log(i)/Math.log(base));

        int sum = 0;

        for (int power = upperPower; power >= 0; power--) {
            int powerOfBase = (int) Math.pow(base, power);
            int digitValue = (int) Math.floor((double) i /powerOfBase);
            i -= digitValue * powerOfBase;
            sum += digitValue;
        }

        return sum;
    }
}
