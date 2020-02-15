import scala.io.StdIn._

object ejercicio4 {

    def cociente(num1 : Int,num2 : Int) : Int = {
        if(num1 < num2){
            0
        }
        else{
            1 + cociente(num1 - num2,num2)
        }
    }

    def main(args : Array[String]) : Unit = {

        println("ingresa el dividendo: ")
        var n1 = readInt()
        println("ingresa el divisor: ")
        var n2 = readInt()

        print(cociente(n1,n2))
    }
}