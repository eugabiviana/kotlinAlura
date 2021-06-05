abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
){
    abstract val bonificacao: Double //essa abstração permite que as outras classes a usem, mas com suas especificações;


}