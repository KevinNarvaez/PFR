//val cedula = "1108765328"
//cedula ="1105761694"// no se puede
//************************************************
//val cedula = "1108765321"
//cedula = "1108765320"// no se puede 
var cedula = "1108765320"
cedula = "1108765323"// el var nos ppermite modificar
//*****************************************************
(x:Double)=> -Math.pow(x,2)+8*x-12
val f1=(x:Double)=> -Math.pow(x,2)+8*x-12
f1(12)
((x:Double)=> -Math.pow(x,2)+8*x-12)(12)
f1(12)*9/8+3
((x:Double)=> -Math.pow(x,2)+8*x-12)(12)*9/8+3
//***********************************************************************************
//def integracion(a:Int,b:Int,f:Double=>Double)={}
//****************************************
def integracion(a:Int,b:Int,f:Double=>Double)={
val intermedio=((a+b)/2.0)
//val intermedio1=((a+b)/2).toDouble// 
val fa =f(a)
val fi=f(intermedio)
val fb= f(b)
(b-a)*(fa+4*fi+fb)/6
}
//**************************************************************************************************
def select(option: Char):(Int,Int)=>Double={
option match{
    case '+' =>(a: Int , b: Int)=>a+b
    case '-' =>(a: Int , b: Int)=>a-b
    case '*' =>(a: Int , b: Int)=>a*b
    case '/' =>(a: Int , b: Int)=>a/b.toDouble
    case _ =>(a: Int , b: Int)=>0/(a+b)
    }
    }
select('+')(2,1)
val operacion=select('+')
operacion(2,1)
//*************************************************************************************************************

val nums = List[Int](3, 6, 7, 8, 9)
val isEven=(k:Int)=>if(k % 2==0) 1 else 0
def isEvenn(k:Int): Int = (k % 2)match{
case 0 =>0
case _ =>0
}
//List(1,2,3).sum
List(1,2,3).map(x=>x*x+100*x)
def func1(x:Int):Int=x*x+100*x
List(1,2,3).map(func1)
List(1,2,3)map func1
nums.map(isEven).sum
def isEven(k: Int)= nums.map(isEven).sum
 

nums.map(isEven)
nums.map(x=>isEven)
nums.map(isEven(_))


