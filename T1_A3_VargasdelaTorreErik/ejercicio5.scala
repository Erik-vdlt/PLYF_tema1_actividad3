import scala.io.StdIn._

object ejercicio5 {


    def divisores(num1 : Int) : Int = {
        var n = num1
        if(num1 == 1){
            0
        }
        else {
            var l = (n / divisores(num1-1))
            if(l == 0){
                n
            }  
        }
    }

    

    def main(args : Array[String]) : Unit = {
        println("divisor 1: ")
        var d1 = readInt()
        println("divisor 2: ")
        var d2 = readInt()

        print(divisores(d1))

    }

}