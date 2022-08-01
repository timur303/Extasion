package Car;

public class Main {
    public static void main(String[] args) {

        try (Car car1 = new Car()) {
            car1.drive();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            finally {
            System.out.println("It's Okay!");
        }

    }
}

