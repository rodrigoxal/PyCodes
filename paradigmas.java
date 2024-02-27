import java.util.*; // Importa todas as classes do pacote java.util, como List, ArrayList, etc.

public class ExemploMultiparadigma { // Declaração da classe ExemploMultiparadigma
    public static void main(String[] args) { // Declaração do método principal main
        // Criando uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usando paradigma funcional para calcular a soma dos números
        int soma = numeros.stream() // Convertendo a lista em um fluxo (Stream)
                          .reduce(0, Integer::sum); // Reduzindo os elementos a uma soma
        System.out.println("Soma dos números: " + soma); // Imprime a soma dos números

        // Usando paradigma imperativo para imprimir os números pares
        System.out.print("Números pares: ");
        for (int num : numeros) { // Itera sobre a lista de números
            if (num % 2 == 0) { // Verifica se o número é par
                System.out.print(num + " "); // Imprime o número par
            }
        }
        System.out.println(); // Imprime uma nova linha

        // Usando paradigma orientado a objetos para manipular uma lista de objetos
        List<Pessoa> pessoas = new ArrayList<>(); // Cria uma lista de pessoas
        pessoas.add(new Pessoa("João", 30)); // Adiciona uma pessoa à lista
        pessoas.add(new Pessoa("Maria", 25)); // Adiciona outra pessoa à lista
        pessoas.add(new Pessoa("Carlos", 40)); // Adiciona mais uma pessoa à lista

        // Ordenando a lista de pessoas pelo nome
        Collections.sort(pessoas, Comparator.comparing(Pessoa::getNome));

        // Imprimindo a lista ordenada
        System.out.println("Lista de pessoas ordenada pelo nome:");
        for (Pessoa pessoa : pessoas) { // Itera sobre a lista de pessoas
            System.out.println(pessoa); // Imprime cada pessoa
        }
    }
}

// Classe Pessoa para demonstrar o paradigma orientado a objetos
class Pessoa { // Declaração da classe Pessoa
    private String nome; // Declaração do atributo nome
    private int idade; // Declaração do atributo idade

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) { // Método construtor com parâmetros
        this.nome = nome; // Atribui o nome passado como parâmetro ao atributo nome
        this.idade = idade; // Atribui a idade passada como parâmetro ao atributo idade
    }

    // Método getter para o atributo nome
    public String getNome() { // Método getter para obter o nome da pessoa
        return nome; // Retorna o nome da pessoa
    }

    // Método getter para o atributo idade
    public int getIdade() { // Método getter para obter a idade da pessoa
        return idade; // Retorna a idade da pessoa
    }

    // Sobrescrita do método toString para imprimir informações da pessoa
    @Override
    public String toString() { // Sobrescrita do método toString
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]"; // Retorna uma representação em string da pessoa
    }
}
