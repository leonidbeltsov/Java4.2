public class BodyMassIndex {
    public int calculate(int mass, int height) {
        int bodyMassIndex = 85*10_000/(height*height);
        return bodyMassIndex;
    }
}