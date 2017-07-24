/**
* 类的注释：定义包、定义函数
* @作者： LeeSefung
*/

/******************** 定义包 ********************/
package com.ls.www//包的声明：包内引用

class Function {
    
    /******************** 定义函数 ********************/
    //带两个int参数、返回int的函数：加法
    fun sum(x: Int, y: Int): Int {
        return x + y
    }
    //将表达式作为函数体、返回值类型自动判断的函数：减法
    fun subtraction(x:Int,y:Int) = x - y
    //返回值无意义
    fun printSum(x: Int,y: Int): Unit{
        println("$x 加上 $y 的和是：${x + y}")
    }
    //Unit返回值类型可以去掉
    fun printSub(x: Int,y: Int){
        println("$x 减去 $y 的差值是：${x - y}")
    }

    /******************** 定义局部变量 ********************/
    fun localVariable() {

        //一次赋值（只读）的局部变量 -- 常量
        val a: Int = 1  //立即赋值
        val b = 2       //自动判断出 Int 类型
        val c: Int      //如果没有初始值，那么类型不能省略
        c = 3           //明确复制

        println(a + b + c)

        //可变变量
        var x = 5       //可自动判断出 Int 类型
        x += 1
    }

    /******************** 使用字符串模板 ********************/
    fun stringFunction(){

        var a = 1
        //模板中的简单名称
        val s1 = "a is $a"
        println("s1 = $s1")

        a = 2
        //模板中的任意表达式
        val  s2 = "${s1.replace("is","was")},but now is $a"
        println("s2 = $s2")
    }

    /******************** 使用条件表达式 ********************/
    fun maxOf(a: Int, b: Int): Int {

        if (a > b) {
            return a
        }else {
            return b
        }
    }
    //使用if作为表达式
    fun littleOf(a: Int, b: Int) = if (a < b) a else b

    /******************** 使⽤可空值及 null 检测 ********************/
    // 判断 str 的内容不是数字
    fun isNumeric(str: String): Boolean {
        for (i in 0..str.length - 1) {
            if (!Character.isDigit(str[i])) {
                return false
            }
        }
        return true
    }
    // 当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引⽤可为空。
    // 如果 str 的内容不是数字返回 null：
    fun parseInt(str: String): Int? {
        if (this.isNumeric(str)){
            return Integer.parseInt(str)
        }
        return null
    }
    //使⽤返回可空值的函数:
    fun printProduct(arg1: String, arg2: String) {
        println("$arg1 + $arg2")
        val x = parseInt(arg1)
        val y = parseInt(arg2)
        println("$x + $y")
        // 直接使⽤ `x * y` 可能会报错，因为他们可能为 null
        if (x != null && y != null) {
         // 在空检测后，x 和 y 会⾃动转换为⾮空值（non-nullable）
            println(x * y)
        }else {
            println("either '$arg1' or '$arg2' is not a number")
        }
    }

    /******************** 使⽤类型检测及⾃动类型转换 ********************/
    //is 运算符检测⼀个表达式是否某类型的⼀个实例。
    //如果⼀个不可变的局部变量或属性已经判断出为某类型，那么检测后的分⽀中可以直接当作该类型使⽤,⽆需显式转换：
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // `obj` 在该条件分⽀内⾃动转换成 `String`
            return obj.length
        }
        // 在离开类型检测分⽀后，`obj` 仍然是 `Any` 类型
        return null
    }
}