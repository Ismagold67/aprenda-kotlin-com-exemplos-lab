enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val name: String,val age: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    var cont = 1
    val conteudo = ConteudoEducacional("Conhecendo o Kotlin e sua documentação oficial")
    val conteudo2 = ConteudoEducacional("Introdução prática à Linguagem de Programação Kotlin ", duracao = 120)
    val conteudo3 = ConteudoEducacional("Estruturas de Controle de Fluxo e Coleções em Kotlin", duracao = 120)
    val conteudo4 = ConteudoEducacional("Orientação a Objetos e Tipos de Classes na Prática com Kotlin", duracao = 120)
    val conteudo5 = ConteudoEducacional("O Poder das Funções em Kotlin", duracao = 120)
    val conteudo6 = ConteudoEducacional("Tratamento de Exceções em Kotlin", duracao = 120)
	val conteudo7 = ConteudoEducacional("Abstraindo Formações da DIO Usando Orientação a Objetos com Kotlin", duracao = 120)
    
	val formacaoEmKotlin = Formacao("Formação em Kotlin DIO", Nivel.INTERMEDIARIO, mutableListOf(conteudo, conteudo2, conteudo3, conteudo4, conteudo5, conteudo6, conteudo7))
    
    val usuario1 = Usuario("Ismael Gonçalves", 23)
    val usuario2 = Usuario("Tainara Oliveira", 20)
    val usuario3 = Usuario("Roberto Silva", 20)
    val usuario4 = Usuario("Amanda Ribeiro", 20)
    val usuario5 = Usuario("Jorge Alexandre", 20)
    
    formacaoEmKotlin.matricular(usuario1)
    formacaoEmKotlin.matricular(usuario2)
    formacaoEmKotlin.matricular(usuario3)
    formacaoEmKotlin.matricular(usuario4)
    formacaoEmKotlin.matricular(usuario5)
    
    println("Formação: ${formacaoEmKotlin.nome}")
    println("Nivel: ${formacaoEmKotlin.nivel}")
    println("---------------------------------------------")
    println("Conteúdos")
    for(formacao in formacaoEmKotlin.conteudos){
        println("${cont++}º ${formacao.nome} : (${formacao.duracao} minutos)")
    }
    println("---------------------------------------------")
    println("Inscritos: ${formacaoEmKotlin.inscritos.size}")
    for(inscrito in formacaoEmKotlin.inscritos){
        println("Aluno(a): ${inscrito.name}")
    }
    
}