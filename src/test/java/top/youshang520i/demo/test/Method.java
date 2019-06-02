package top.youshang520i.demo.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @actuor youshang520i
 * @create 2019-05-27 16:04
 * @desc 测试方法付
 */
public class Method {
    @Test
    public void name() throws Exception {
        getArr2(9);
    }

    /**
     * 方案一  行不通，需要一个迭代器
     *
     * @param sun
     */
    public void getArr(int sun) {
        List<Integer> sum = new ArrayList<>();
        for (int i = sun; i > 0; i = i - 2) {
            sum.add(i);
        }
        if (null != sum && sum.size() > 1) {
            int b[] = new int[sum.size()];
            int wSize = sum.size();
            while (wSize > 1) {
                int size = sum.size() - 1;
                for (int i = 0; i < size; i++) {
                    int a = sum.get(i) + sum.get(i + 1);
                    b[i] = a;
                    System.out.println(a);
                }
                wSize = b.length;
            }
        } else {
            System.out.println(sum.get(0));
        }
    }

    /**
     * 方案2
     *
     * @param sun
     */
    public void getArr2(int sun) {
        int sum[] = new int[sun];
        int j = 0;
        for (int i = sun; i > 0; i = i - 2) {
            sum[j] = i;
            if (i == 0){
                --j;
            }else{
                ++j;
            }
        }
        for (int i = 0; i<sum.length;i++){
            System.out.println(sum[i]);
        }
        getIterator(sum, j);
    }

    /**
     * 迭代器
     */
    public void getIterator(int sum[], int j) {
        if (null != sum && j > 1) {
            int b[] = new int[j];
            int size = j - 1;
            int l = 0;
            for (int i = 0; i < size; i++) {
                int a = sum[i] + sum[i + 1];
                b[l] = a;
                if (a != 0) {
                    l++;
                }
            }
            if (b.length-1  > 1) {
                for (int i = 0; i<l;i++){
                    System.out.println(b[i]);
                }
                getIterator(b, l);
            }else{
                System.out.println(b[0]);
            }
        }
    }


    @Test
    public void name2() throws Exception {
        getXingXing2(13);

    }

    public void getXingXing(int n){
        int i, x;
        for (i=1; i <=n; i+=2){ //外层循环指定每次循环后增加的个数为2；
            for(int j=n-i;j>=0;j--){//j--控制空格的数量
                System.out.print(" ");
            }
            for (x=1; x<=i; x++) { //内层循环每次输出一个符号，输出个数受外层i的制约；
                System.out.print("* ");
            }
            System.out.print("\n"); //换行外层循环里，内尾循环每执行完后换行一次；
        }
    }
    public void getXingXing2(int n){
        for (int i = 0;i<n;i=i+2){
            for (int l = n-i;l>0;l--){
                System.out.print(" ");
            }
            for (int j =0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    @Test
    public void getXingXing3(){
        int n = 15;
        for (int i = 0;i<n;i=i+2){
            for (int k =n-i;k>0;k--){
                System.out.print(" ");
            }
            for (int j =0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Test
    public void name3() throws Exception {
        for(int i =0;i<19;i+=2){
            for (int a = 19-i;a>0;a--){
                System.out.print(" ");
            }
            for (int j =0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    @Test
    public void name4() throws Exception {
        int n = 15;
        for (int i = 0;i < n;i=i+2){

            for (int k = n; k > i;k--){
                System.out.print(" ");
            }
            for (int j =0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
