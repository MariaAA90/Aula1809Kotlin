package br.com.digitalhouse.exercicio10.exercicio2

import br.com.digitalhouse.exercicio10.exercicio3.Aluno

class Coca(val tamanho: Int, val preco: Double) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Coca) {
            return false
        }
        return this.tamanho == other.tamanho
    }
}