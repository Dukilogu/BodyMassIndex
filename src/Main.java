public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 98;//Вес в кг (входной параметр: weight типа double)
        int height = 183;//Рост в см (входной параметр: height типа int)
        String myBodyMassIndex = String.valueOf(service.calculate(weight, height));
        System.out.println(myBodyMassIndex);
    }
}