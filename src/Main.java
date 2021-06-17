public class Main {
    public static void main(String[] args) {
        BodyMassIndex service = new BodyMassIndex();
        int mass = 85;
        int height = 180;
        int bodyMassIndex = service.calculate(mass, height);
        System.out.println(bodyMassIndex);
    }
}