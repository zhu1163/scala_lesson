package chapter02

object Test_04_String {
  def main(args: Array[String]): Unit = {
    val age: Int = 10
    val name: String = "alice"
    // 用 + 拼接
    println(age + "岁的" + name)

    // printf：字符串，使用%传递
    printf("%d岁的%s", age, name)
    println()

    // 字符串模板（插值字符串）：通过$获取变量值
    println(s"${age}岁的${name}")

    val num: Float = 2.3456f
    println(f"the num is ${num}%2.2f") //格式化模板字符串


    //三引号表示字符串，保持多行字符串的原格式输出
    val sql =
      s"""
         |select *
         |from
         |  student
         |where
         |  name = ${name}



       |  age > ${age}

       |""".stripMargin
    println(sql)
  }
}
