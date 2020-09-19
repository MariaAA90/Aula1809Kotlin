package br.com.digitalhouse.exercicio10.exercicio4

import br.com.digitalhouse.exercicio10.exercicio3.Aluno

class Funcionario(val nome: String, val numeroDeRegistro: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Funcionario) {
            return false
        }
        return this.numeroDeRegistro == other.numeroDeRegistro
    }
}