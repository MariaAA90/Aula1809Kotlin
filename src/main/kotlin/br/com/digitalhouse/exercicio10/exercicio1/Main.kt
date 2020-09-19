package br.com.digitalhouse.exercicio10.exercicio1

fun main(){
    val pessoa1 = Pessoa("Renata", 554433244)
    val pessoa2 = Pessoa("Paulo", 554433244)
    println(pessoa1.equals(pessoa2))
    println(pessoa1.rg.equals(pessoa2.rg))
}