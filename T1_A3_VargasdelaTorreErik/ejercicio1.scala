import scala.io.StdIn._

object ejercicio1 {

    def limites(limiteSup : Int , limiteInf : Int) : Int = {
        if(limiteInf <= limiteSup){
            limiteInf + limites(limiteSup,limiteInf+1)
        }
        else{
            0
        }
    }

    def main(args : Array[String]) : Unit = {
        var limS : Int = 0
        var limI : Int = 0


        println("ingresa el limite final: ")
        limS = readInt
        println("ingresa el limite inicial: ")
        limI = readInt
        
        println("el resultado de la sumatoria: "+limites(limS,limI))
    }
}