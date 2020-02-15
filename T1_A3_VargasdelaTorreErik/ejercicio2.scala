import scala.io.StdIn._

object ejercicio2 {

    def divisores(num : Int, cont : Int) : Unit = {
        if(cont <= num){
            if(num % cont == 0){
                println("contadores "+cont)
            }
            cont + divisores(num,cont+1)
        }
        else{
            0
        }
    }

    def main(args : Array[String]) : Unit = {
        println("ingresa el numero: ")
        var c = readInt()
        divisores(c,1)
    }

}