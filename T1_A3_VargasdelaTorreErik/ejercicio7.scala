import scala.io.StdIn._

object ejercicio7{

    def vocales(cadena : String,con : Int,cant : Int) : Unit = {
        cadena.substring(cant,cant+1)

        if(cadena.equalsIgnoreCase("a") || cadena.equalsIgnoreCase("e")  || 
        cadena.equalsIgnoreCase("i") || cadena.equalsIgnoreCase("o") || 
        cadena.equalsIgnoreCase("u")){
            con +1
            cant+1
            vocales(cadena,con,cant)
            if(cant == cadena.length()){

            }
        }
        else{
            cant+1
            vocales(cadena,con,cant)
            if(cant == cadena.length()){
                
            }
        }
    }

    def main(args : Array[String]) : Unit = {
        println("ingresa cadena: ")
        var vocal = readLine()
        vocales(vocal,0,0)
    }
}