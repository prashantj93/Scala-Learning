object Calculator1{
def add(x:Int,y:Int){
println(x+y)
}
def minus(x:Int,y:Int){
println(x-y)
}
def times(x:Int,y:Int){
println(x*y)
}
def quotient(x:Int,y:Int){
println(x/y)
}
def main(args:Array[String]){
val x=10
val y=5
println(add(x,y))
println(minus(x,y))
println(times(x,y))
println(quotient(x,y))
}
}