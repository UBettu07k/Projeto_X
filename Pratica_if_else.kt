package Aprendendo_Kotlin

fun main(){

    gerentes(2_000f, 1)
    println()
    coordenadores(1_500f, 2)
    println()
    eng_softw(1000f)
    println()
    estagiarios(500f)

}

fun gerentes(bonus: Float, anos: Int){

    val anos = anos
    println("Os gerentes receberam ")
    if(anos < 2){
        println("Bónus de $${bonus} ")
    }else{
        println("Bónus de $${bonus + 1_000f}")
    }

}

fun coordenadores(bonus: Float, anos: Int){
    println("Os coordenadores receberam de bonus")
    if(anos < 1){
        println("$${bonus}")
    }else{
        println("$${bonus + 300}")
    }
}

fun eng_softw(bonus: Float){
    println("Os engenheiros de software receberam $${bonus}")

}

fun estagiarios(bonus: Float){
    println("Os estagiarios receberam $${bonus}")

}