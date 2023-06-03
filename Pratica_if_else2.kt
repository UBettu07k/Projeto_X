package Aprendendo_Kotlin

fun main(){
    val bons = bonus("Gerente", 1)
    println(bons)

}

fun bonus(cargo: String, anos: Int): Float{
    var bonus = 0f
    if(cargo == "Gerente"){
        if(anos <= 2){
            print("Os Gerentes vão receber $")
            bonus = 2000f
        }else{
            bonus = 3000f
        }

    }else if(cargo == "Coordenador"){
        if(anos <= 1){
            bonus = 1500f
        }else{
            bonus = 1800f
        }

    }else if(cargo == "Engenheiro de software"){
        bonus = 1000f

    }else if(cargo == "Estagiário"){
        bonus = 500f
    }


    return bonus
}