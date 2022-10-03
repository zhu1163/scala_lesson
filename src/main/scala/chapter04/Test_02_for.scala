package chapter04

object Test_02_for {
  def main(args: Array[String]): Unit = {


    // Java for循环用法：for(i = 0; i < 10; i++){System.out.println("hello")}

    // scala for
    // 1. 范围遍历

    for (i <- 1 to 10){// 只有一个参数，1.to()省略写法
      println(i + " hello")
    }

    for( i <- 1.to(10)){
      println(i + " hello")
    }

    // 1-10不包括10，Range(self,end,step)
    for(i<- Range(1,10)){
      println("     hello")
    }

    for(i <- 1.until(10)){
      println("   hello")
    }



    // 2. 集合遍历
    for(i <- Array(12,45,749)){
      println(i)
    }


    // 3. 循环守卫

    for(i <- 1 to 10 if i != 5){
      println(i)
    }

    // 4. 循环步长

    for(i <- 1 to 10 by 2){// by 加入步长
      println(i)
    }
    for(i <- 1.to(10).by(2)){
      println(i)
    }

    for(i <- 1 to 10 reverse){
      println(i)
    }
    for(i <- 10 to 1 by -1){
      println(i)
    }




    // 循环嵌套
    for(i <- 1 to 3; j <- 1 to 3){
      println("i= "+ i + "j= "+j)
    }
  }
}
//  for循环默认返回unit

