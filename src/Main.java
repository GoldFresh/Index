public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(180, 80);
        System.out.println(index);
    }
}