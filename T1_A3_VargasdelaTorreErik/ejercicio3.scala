import scala.io.StdIn._

object ejercicio3 {

    def factorial(numero : Int) : Int = {
        if(numero == 1){
            numero
        }
        else {
            numero * factorial(numero-1)
        }
    }

    def main(args : Array[String]) : Unit = {
        println("ingresa el numero: ")
        var fac = readInt()
        println(factorial(fac))
    }
}