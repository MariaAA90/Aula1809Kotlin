package br.com.digitalhouse.exercicio10.exercicio1

import br.com.digitalhouse.exercicio10.exercicio3.Aluno

class Pessoa(val nome: String, val rg: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Pessoa) {
            return false
        }
        return this.rg == other.rg
    }
}