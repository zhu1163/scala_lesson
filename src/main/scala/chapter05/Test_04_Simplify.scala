package chapter05
/*
  函数简化原则
 */
object Test_04_Simplify {
  def main(args: Array[String]): Unit = {

    def f0(name:String ):String = {
      return name
    }
    println(f0("alice"))
    println("==========================================")

    // 1 return可以省略，Scala会使用函数体最后一行作为返回值
    def f1(name:String ):String = {
      name
    }
    println(f1("alice"))
    println("==========================================")

    // 2 如果函数体只有一行代码，{}可以省略
    def f2(name:String):String = name
    println(f2("alice"))
    println("==========================================")

    // 3 返回值类型如果可以推断出来，返回值类型可以省略
    def f3(name:String) = name
    println(f3("alice"))
    println("==========================================")

    // 4 如果有return，则必须指定返回值，不能省略返回值

    // 5 如果返回值类型是Unit，那么即使函数体内使用关键字return也不起作用

    // 6 Scala 如果期望是无返回类型，可以省略等号

    // 7 如果函数无参，但声明了参数列表，那么调用时小括号可加可不加

    // 8 如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略


  }
}
