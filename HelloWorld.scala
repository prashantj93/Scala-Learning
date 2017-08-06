object Hello{
def main(args:Array[String]){
		val name:String = args(0)
		println("Hello" + name +"!!")
	}
}

import java.util.{Date,Locale}
import java.text.DateFormat
import java.text.DateFormat._
//comments
object PrintDate{
	def main(args:Array[String]){
	val now = new Date
	val df = getDateInstance(Long,locale.ITALIAN)
	println(df.format(now))
		}
}