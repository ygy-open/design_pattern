package 模式.factory;

/**
 * Created by yuanopen on 2018/6/10/010.
 */
public class TMain {
    public static void main(String[] args) {
        VehicleFactory factory=new BroomFactory();
        Product broom=factory.create();
        broom.run();

         factory=new PhoneFactory();
        Product phone=factory.create();
        phone.run();
    }
}
