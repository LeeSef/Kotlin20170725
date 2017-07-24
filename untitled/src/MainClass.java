/**
* 类的注释：主函数
* @作者： LeeSefung
*/
import com.ls.www.Function;//包的声明：包外引用

public class MainClass {

    public static void main(String[] arg) {//快捷键psvm
        System.out.println("Hello World");//快捷键sout

        //函数
        Function function = new Function();
        function.sum(32,2);
        function.subtraction(55,21);
        function.printSum(31,4);
        function.printSub(43,45);

        //定义局部变量
        function.localVariable();

        //字符串模板
        function.stringFunction();

        //使用条件表达式
        int max = function.maxOf(23,33);
        System.out.println("较大的数值："+ max);
        int little = function.littleOf(23,33);
        System.out.println("较小的数是："+ little);

        //使用空值及null检测
        function.printProduct("35","21");

        //使⽤类型检测及⾃动类型转换
        System.out.println(function.getStringLength(3));
        System.out.println(function.getStringLength("efe"));
    }
}
