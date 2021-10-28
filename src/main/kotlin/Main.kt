import kotlin.math.pow

fun main(args: Array<String>) {


    println("Entre com a operação: ")
    println(adicao(1, 8))
    println(subtracao(4,2 ))
    println(multiplicacao(13, 7))
    println(divisao(5, 2).toDouble())
    println(potencia(2.0,2.0))

}

fun adicao (num1: Int,num2: Int): Int{
    return num1 + num2
}
fun subtracao (num1: Int,num2: Int): Int{
    return num1 - num2
}
fun multiplicacao (num1: Int,num2: Int): Int{
    return num1 * num2
}
fun divisao (num1: Int,num2: Int): Int{
    return num1 / num2
}
fun potencia (num1: Double,num2: Double){
    var result = num1.pow(num2)
    println(num1.pow(num2))

}