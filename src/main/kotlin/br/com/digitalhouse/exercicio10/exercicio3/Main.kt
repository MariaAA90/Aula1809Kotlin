package br.com.digitalhouse.exercicio10.exercicio3

fun main() {
    val listaAluno = listOf(Aluno("João", 1), Aluno("Pedro", 2), Aluno("Carlos", 3), Aluno("Maria", 4))
    val aluno = Aluno("Gustavo", 1)
    println(listaAluno.contains(aluno))
}