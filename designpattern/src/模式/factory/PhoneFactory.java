package 模式.factory;

/**
 * Created by yuanopen on 2018/6/10/010.
 */
public class PhoneFactory implements VehicleFactory {
    @Override
    public Product create() {
        return new Phone();
    }
}
