package chapter01

class Student(name:String,age:Int) {
  def printinfo(): Unit = {
    println(name+" "+age+" "+Student.school)
  }
}

object Student{
  val school:String = "atguigu"

  def main(args: Array[String]): Unit = {
    val alice = new Student("alice", 20)
    val bob = new Student("bob", 21)

    alice.printinfo()
    bob.printinfo()
  }
}
