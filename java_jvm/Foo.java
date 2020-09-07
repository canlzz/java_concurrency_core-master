/**
 * @ProjectName: java_concurrency_core-master
 * @Package: PACKAGE_NAME
 * @ClassName: Foo
 * @Author: lzz
 * @Description:
 * @Date: 2020/4/15 10:48
 * @Version: 1.0
 */
public class Foo {
   static boolean boolValue;

    public static void main(String[] args) {
        boolValue = true;
        if(boolValue) System.out.println("Hello,java!");
        if(boolValue==true) System.out.println("Hello,java");
    }
}
