package chapter04

import scala.io.StdIn

object Test_01_if {
  def main(args: Array[String]): Unit = {
    print("请输入年龄：")
    val age = StdIn.readInt()

    // 分支语句的返回值，返回代码块中的最后一句
    val result:String = if(age <18){
      println("青少年")
      "青少年"
    }else if(age>18||age<35){
      println("青年")
      "青年"
    }else{
      println("老年")
      "老年"
    }
    println("reslut:"+ result)

    val res = if(age>=18) "成年" else "未成年"
    println(res)
  }


  // Java中的三目运算符   a?b:c

}
