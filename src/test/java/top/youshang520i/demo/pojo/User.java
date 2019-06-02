package top.youshang520i.demo.pojo;

import top.youshang520i.demo.observicePattern.ObServer;

/**
 * @actuor youshang520i
 * @create 2019-06-02 23:06
 * @desc 用户对象
 */
public class User implements ObServer{
    private String name;
    private String message;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read(){
        System.out.println(name+"收到推送消息："+message);
    }
}
