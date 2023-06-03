package Aprendendo_Kotlin

fun main(){
    //exrc1()
    //exrc1()
    //exrc3()
    //exc4()
    exerc5(5)
}

fun exrc1(){
    for(i in 10..50){
        print("$i ")
    }
}

fun exrc2(){
    for(i in 50 downTo 10){
        print("$i ")
    }
}

fun exrc3(){
    for(i in 10..50){
        if(i % 5 == 0 ){
            continue
        }
        print("$i ")

        // Outras Forma de resolver a questão

        /*if(i % 5 != 0 ){
        print("$i ")
        }*/
    }
}

fun exc4(){
    var soma = 0
    for(i in 1..500){
        soma += i
    }
    println(soma)
}

fun exerc5(n: Int){
    for(i in 1..n){
        println("#")
    }
}