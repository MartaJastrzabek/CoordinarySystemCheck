public class PointTest {
    public static void main(String[] args) {
        CheckPoint check = new CheckPoint();
        Point point = check.getUserInput();
        System.out.println(check.getInfo(point));
    }
}
