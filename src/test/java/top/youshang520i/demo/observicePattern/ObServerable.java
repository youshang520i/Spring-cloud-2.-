package top.youshang520i.demo.observicePattern;

import java.util.Observer;

/**
 * @actuor youshang520i
 * @create 2019-06-02 22:49
 * 声明了添加、删除、通知观察者方法
 * @desc 抽象被观察者接口
 */
public interface ObServerable {
    /**
     * 添加
     * @param o
     */
    public void registerObserver(ObServer o);

    /**
     * 删除
     * @param o
     */
    public void removeObserver(ObServer o);

    /**
     * 调用观察者方法
     */
    public void notifyObserver();
}
