package Car;

public class Car implements AutoCloseable {
    @Override
    public void close(){
        System.out.println("������ ������� �����");

    }
    public void drive()  {
        System.out.println("������ ����� �����");

    }
}
