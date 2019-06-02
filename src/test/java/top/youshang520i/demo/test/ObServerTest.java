package top.youshang520i.demo.test;

import org.junit.Test;
import top.youshang520i.demo.observicePattern.ObServer;
import top.youshang520i.demo.observicePattern.impl.WechatServer;
import top.youshang520i.demo.pojo.User;

/**
 * @actuor youshang520i
 * @create 2019-06-02 23:10
 * @desc 测试观察者模式
 */
public class ObServerTest {

    @Test
    public void name() throws Exception {
        WechatServer wechatServer = new WechatServer();
        ObServer zhangsan = new User("张三");
        ObServer lisi = new User("李四");
        ObServer wanwu = new User("王五");

        wechatServer.registerObserver(zhangsan);
        wechatServer.registerObserver(lisi);
        wechatServer.registerObserver(wanwu);
        wechatServer.setInfoomation("java是最好的语言");

        System.out.println("------------------------------");

        wechatServer.removeObserver(zhangsan);
        wechatServer.setInfoomation("php是最好的语言");
    }
}
