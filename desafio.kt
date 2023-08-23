// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)
class Genero(val genero: String)

data class Inscricao(val usuario: Usuario, val genero: Genero)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel : Nivel) {

    val inscritos = mutableListOf<Inscricao>()
   
    fun matricular(usuarios: Usuario, generos: Genero) {
        val inscricao = Inscricao(usuarios, generos)
        inscritos.add(inscricao)

        println("Usuário ${usuarios.nome} (g:${generos.genero}), matriculado(a) na formação $nome")
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

//conteudos
val conteudosKotlin = listOf(
    	ConteudoEducacional("Introdução", 20),
        ConteudoEducacional("Funcoes",40),
        ConteudoEducacional("Assincronismo",60)
)
val conteudosAndroid = listOf(
    	ConteudoEducacional("Introdução", 10),
        ConteudoEducacional("View",30),
        ConteudoEducacional("XML completo",50)
)

//formações

val formacaoKotlin = Formacao("kotlin",conteudosKotlin, Nivel.DIFICIL)
val formacaoAndroid = Formacao("Android",conteudosAndroid, Nivel.INTERMEDIARIO)

//usuarios
val Caio = Usuario("Caio")
val Adriele = Usuario("Adriele")

//genero
val feminino = Genero("feminino")
val masculino = Genero("masculino")

fun main() {
    formacaoKotlin.matricular(Caio, masculino)
    formacaoAndroid.matricular(Adriele, feminino)
    //formacaoAndroid.matricular(usuario2)
    
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}