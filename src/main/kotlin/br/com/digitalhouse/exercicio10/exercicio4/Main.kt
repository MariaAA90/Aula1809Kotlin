package br.com.digitalhouse.exercicio10.exercicio4

import br.com.digitalhouse.exercicio10.exercicio3.Aluno

fun main() {
    val listaFuncionario = listOf(Funcionario("João", 1), Funcionario("Pedro", 2), Funcionario("Carlos", 3), Funcionario("Maria", 4))
    val funcionario = Funcionario("Gustavo", 1)
    println(listaFuncionario.contains(funcionario))
}