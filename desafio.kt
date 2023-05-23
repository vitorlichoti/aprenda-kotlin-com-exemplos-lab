enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val nivel: Nivel, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
   
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val formacao = Formacao("TQI", listOf(ConteudoEducacional("Java Kotlin", Nivel.BASICO, 80)))
    formacao.matricular(Usuario("Vitor"))
    formacao.matricular(Usuario("Luis"))
    formacao.matricular(Usuario("Hugo"))
   
    println(formacao.inscritos)
    println(formacao.conteudos)
}
