package 模式.factory;

/**
 * Created by yuanopen on 2018/6/10/010.
 */
public class BroomFactory implements VehicleFactory {

    @Override
    public Product create() {
        return new Broom();
    }
}
