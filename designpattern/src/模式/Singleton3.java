package 模式;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yuanopen on 2018/6/10/010.
 */
//类似Spring里面的方法，将类名注册，下次从里面直接获取。
public class Singleton3 {
    private static Map<String, Singleton3> map = new HashMap<String, Singleton3>();
    static{
        Singleton3 single = new Singleton3();
        map.put(single.getClass().getName(), single);
    }
    //保护的默认构造子
    protected Singleton3(){}
    //静态工厂方法,返还此类惟一的实例
    public static Singleton3 getInstance(String name) {
        if(name == null) {
            name = Singleton3.class.getName();
            System.out.println("name == null"+"--->name="+name);
        }
        if(map.get(name) == null) {
            try {
                map.put(name, (Singleton3) Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }
    //一个示意性的商业方法
    public String about() {
        return "Hello, I am RegSingleton.";
    }
    public static void main(String[] args) {
        Singleton3 single= Singleton3.getInstance(null);
        System.out.println(single.about());
        Singleton3 single3 = Singleton3.getInstance("模式.Singleton3");
        System.out.println(single3.about());

        Singleton3 single4 = Singleton3.getInstance("模式.Singleton4");
        System.out.println(single4.about());


    }
}