package chapter05

object Test_01_FunctionParameter {
  def main(args: Array[String]): Unit = {

    // 1 可变参数
    def f1(str:String*):Unit = {
      println(str)
    }
    f1("alice")
    f1("aaa","bbb")

    println("===================================================")

    // 2 如果参数列表存在多个参数，那么可变参数一般放在最后
    def f2(str:String,str2:String*):Unit = {
      println("str: "+ str + ",str2: "+str2)
    }
    f2("alice")
    f2("alice","aaa","bbb","ccc")

    println("===================================================")

    // 3 参数默认值，一般将默认参数放置在最后
    def f3(name:String = "alice"):Unit = {
      println("我的名字叫做"+name)
    }
    f3()
    f3("bob")

    println("===================================================")

    // 4 带名参数
    def f4(name:String = "alice",age:Int):Unit = {
      println(s"${name}今年${age}岁了")
    }
    f4("alice",18)
    f4("bob",49)
    f4(age = 45)

  }
}
