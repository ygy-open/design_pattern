package 模式.singleton;

/**
 * Created by yuanopen on 2018/6/9/009.
 */
//懒汉式单例类.在第一次调用的时候实例化自己
public class Singleton {
    private Singleton() {}
    private static Singleton single=null;
    //静态工厂方法
    public static Singleton getInstance() {
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }


}