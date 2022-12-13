public class BmiService {
    public String calculate(double weight, int height) {
        String myBodyMassIndex;
        double bodyMassIndexDouble = 10_000 * (weight / Math.pow(height, 2));
        bodyMassIndexDouble = (double) ((int) (bodyMassIndexDouble * 10)) / 10;
        myBodyMassIndex = String.valueOf(bodyMassIndexDouble);
        return myBodyMassIndex;
    }
}