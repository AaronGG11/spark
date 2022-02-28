def funcion(contenido: String) : String = {
    val REGEX_1 = "[^0-9]"
    val REGEX_2 = "[^A-Z^]"
    val REGEX_3 = "[^a-z]"

    var at1 = List("Aaron","jose","pedro","arturo")
    var at2 = List("maria","Juana","fernanda")
    var at3 = List("ariel")

    var resultado = {
        if(at1.contains(contenido)) contenido.replaceAll(REGEX_1, "") 
        else if(at2.contains(contenido)) contenido.replaceAll(REGEX_2, "") 
        else contenido.replaceAll(REGEX_3, "")
    }

    resultado
}

print(funcion("Juana"))