
fun redimentos() {
    val salario = 10_000f
    var rendAna = 0f
    var renPaula = 0f
    var mes = 0
    // Acrescentando as entradas

    do {
        rendAna += (salario * 0.05f) + (salario * 0.05f) + (rendAna * 0.002f)
        renPaula += (salario * 0.05f) + (renPaula * 0.008f)
        mes ++
        // Calculando o rendimento de ambas e acrescentando a cada mês

        println("Parte de Ana $rendAna === Parte de Paula $renPaula")
        // Comparando o rendimento a cada mês

    }while(rendAna > renPaula)
    println("Ana == ${(rendAna * 0.002f)}")
    println("Paula == ${(renPaula * 0.008)}")
    println("Paula vai passar de Ana em $mes meses")
    // Repetindo toda a sequência até que Paula passe Ana
}

fun main(){
    redimentos()
    // Chamando a função pra mostrar o resultado!

}