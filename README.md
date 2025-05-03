[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/zaY_p4dR)

# Atividade de Programação Orientada a Objetos

## Questão 1: Getters e Setters

É considerado boa prática usar getters e setters em vez de atributos públicos pelos seguintes motivos:

1. **Encapsulamento**: Protege os dados internos da classe, controlando como eles são acessados e modificados
2. **Validação de dados**: Permite implementar regras de validação antes de modificar os atributos
3. **Flexibilidade**: Possibilita alterar a implementação interna sem afetar o código que usa a classe
4. **Manutenção**: Facilita a depuração e manutenção do código

**Exemplo prático**: Em uma classe `ContaBancaria`, um setter para o saldo permite validar se o valor não é negativo:
```java
public void setSaldo(double valor) {
    if (valor >= 0) {
        this.saldo = valor;
    } else {
        throw new IllegalArgumentException("Saldo não pode ser negativo");
    }
}
```

## Questão 2: Sistema de Biblioteca

### a) Informações relevantes para representar um livro:
- ISBN
- Título
- Autor(es)
- Editora
- Ano de publicação
- Número de páginas
- Categoria/Gênero
- Status (disponível, emprestado, em manutenção)
- Localização na biblioteca (prateleira/seção)

### b) A classe Livro como abstração:
A classe `Livro` é uma abstração pois representa uma simplificação de um livro real, capturando apenas as características e comportamentos relevantes para o sistema da biblioteca. Ela ignora aspectos físicos irrelevantes (como peso, material das páginas) e foca nas informações necessárias para o gerenciamento da biblioteca.

### c) Métodos relevantes para a classe Livro:
1. `emprestar()`: Registra o empréstimo do livro
2. `devolver()`: Registra a devolução do livro
3. `consultarDisponibilidade()`: Verifica se o livro está disponível
4. `atualizarLocalizacao()`: Atualiza a localização do livro na biblioteca
5. `registrarManutencao()`: Marca o livro como em manutenção 