package top.youshang520i.demo.observicePattern;

/**
 * @actuor youshang520i
 * @create 2019-06-02 22:50
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 * @desc 观察者抽象接口
 */
public interface ObServer {
    public void update(String message);
}
