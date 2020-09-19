package br.com.digitalhouse.exercicio10.exercicio2

fun main() {
    val coca1 = Coca(2, 4.00)
    val coca2 = Coca(2, 5.00)
    println(coca1.equals(coca2))
    println(coca1.tamanho.equals(coca2.tamanho))
}