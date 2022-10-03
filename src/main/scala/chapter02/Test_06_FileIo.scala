package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

object Test_06_FileIo {
  def main(args: Array[String]): Unit = {

    // 从文件读取数据
    Source.fromFile("D:\\scala_lesson\\test.txt").foreach(print)


    // 将数据写入文件
    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("hello scala from java")
    writer.close()




  }
}
