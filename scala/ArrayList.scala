import java.util
import scala.util.control.Breaks._

object MainObject { 
    // Main method
    def main(args: Array[String]) {

        val REGEX_1 = "[^0-9]"
        val REGEX_2 = "[^A-Z]"
        val REGEX_3 = "[^a-z]"


        var dato = "Juana Morales"
        var result = ""


        val arlista= new util.ArrayList[List[String]]()
        arlista.add(List("Aaro d vcfv54n","jo4se","p3dr0","3rt8ro","1w233a654a"))
        arlista.add(List("maria","Juana Morales","fernanda"))
        arlista.add(List("ariel","01 e3scd cfv 5t5653 rgrebrtb 4"))


        val regex = new util.ArrayList[String]()
        regex.add(REGEX_1)
        regex.add(REGEX_2)
        regex.add(REGEX_3)


        println("---------- SALIDA ----------")

        breakable{
            for( a <- 0 to arlista.size()-1){
            println("Entre " + a)
            if(arlista.get(a).contains(dato)){
                println("Deteneniedno ... " + a)
                result = dato.replaceAll(regex.get(a), "") 
                break
            }
        }
        }


        println(result)
        println(regex.get(0))
        println(regex.get(1))
        println(regex.get(2))



        println("---------- SALIDA ----------")

    }
}