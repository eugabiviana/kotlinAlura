fun main() {
    testaAutenticacao()
}

/*
- Todas as classes e funções, do curso anterior, foram separadas em arquivos próprios para seguir a Orientação a objetos;
- Para copiar uma classe e apenas mudar o nome dela, seleciona a classe e pressiona f5;
- Para reutilização de código por herança, super.algumacoisa para a classe filha usar a função desejada sem a necessidade de reescrever todo o código;
- Uma classe abstrata é usada como base para criar uma classe real, como é o caso de Funcionário. Ela tem todos os valores gerais de um funcionário, por isso é usada para gerente, diretor, analista etc, mas não contém as especificações de cada cargo. Por isso as outras classes herdam as características gerais dela.
Ao utilizar o anstract antes do nome da classe, ela já é identificada como open, ou seja, uma classe mãe, de onde outras herdarão suas características.
private - NENHUMA classe pode modificar o objeto
protected - apenas as classes FILHAS podem modificar esses objetos
A interface Autenticavel: acaba com o problema de ter que usar herança em todas as classes que precisam de senha para entrar no sistema, já que nem todos os usuários são funcionários, como é o caso de cliente.

Atalhos:
Ctrl + n = abre caixa de busca de classes;
Selecionar uma classe e pressionar f5 = copia e cria uma nova classe com novo nome;
Alt + Shft + x = fecha todas as abas

*/
