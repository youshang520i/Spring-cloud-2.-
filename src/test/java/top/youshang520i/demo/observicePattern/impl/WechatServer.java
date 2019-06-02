package top.youshang520i.demo.observicePattern.impl;

import top.youshang520i.demo.observicePattern.ObServer;
import top.youshang520i.demo.observicePattern.ObServerable;

import java.util.ArrayList;
import java.util.List;

/**
 * @actuor youshang520i
 * @create 2019-06-02 22:51
 * @desc 被观察者
 */
public class WechatServer implements ObServerable{

    //注意到这个List集合的泛型参数为ObServer接口，设计原则：面向接口编程而不是面向实现编程
    private List<ObServer> list;
    private String message;

    //调用对象的时候初始化List集合
    public WechatServer(){
        list = new ArrayList<ObServer>();
    }

    @Override
    public void registerObserver(ObServer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(ObServer o) {
        if (!list.isEmpty()){
            list.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i =0;i<list.size();i++){
            ObServer obServer = list.get(i);
            obServer.update(message);
        }
    }

    /**
     * 消息更新提醒观察者
     * @param s
     */
    public void setInfoomation(String s){
        this.message = s;
        System.out.println("message数据已经更新:"+s);
        //消息更新提醒观察者
        notifyObserver();
    }
}
