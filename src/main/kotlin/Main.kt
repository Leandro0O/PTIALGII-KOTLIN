import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    println("Quantos valores deseja armazenar:")
    var n : Int = scanner.nextInt()
    var v = IntArray(n)
    for (i in 0 until n){
        println("Informe o ${i + 1 }° valor:")
        v[i] = scanner.nextInt()
    }
    for (i in v){
        println(i)
    }
    maiorDif(v)
    ordemCres(v)
}
fun maiorDif(v : IntArray) : Unit{
    var maior = v.max()
    var menor = v.min()
    var dif = maior - menor
    println("A maior diferença é: ${dif}")
}
fun ordemCres(v: IntArray) : Unit{
    var cres = false
    for (i in 1 until v.size){
        cres = if (v[i] > v[i - 1]) true else false
    }
    println("O vetor é crescente: ${if (cres == true) "Sim" else "Não"}")
}