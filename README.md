Avaliação P2 - Linguagem de Programação - Prof. Bruno Zolotareff

Miguel Lucas Andrade de Souza


## Resposta da Pergunta

Neste projeto foi desenvolvida uma simulação de uma máquina de café utilizando a linguagem Java e os conceitos da Programação Orientada a Objetos (POO). O sistema permite que o usuário escolha entre seis opções de bebidas através de uma interface gráfica criada com a biblioteca JOptionPane. Após a seleção, o programa exibe o nome da bebida escolhida, seu valor e verifica a disponibilidade de café para realizar o preparo.

Durante o desenvolvimento foram aplicados os principais conceitos da Programação Orientada a Objetos: Encapsulamento, Herança e Abstração. Além disso, o projeto possui estrutura que possibilita a implementação futura do Polimorfismo.

### Encapsulamento

O encapsulamento é um dos pilares da Programação Orientada a Objetos e tem como objetivo proteger os dados de uma classe, impedindo que sejam acessados diretamente por outras partes do programa. Em vez disso, o acesso é realizado por métodos específicos, garantindo maior controle e segurança sobre as informações.

No projeto, o encapsulamento foi aplicado na classe abstrata `Drink`, onde os atributos `sabor` e `valor` foram declarados como privados:

```java
private String sabor;
private double valor;
```

Como esses atributos são privados, eles não podem ser acessados diretamente por outras classes. Para manipular seus valores foram criados métodos públicos getters e setters:

```java
public String getSabor()
public void setSabor(String sabor)

public double getValor()
public void setValor(double valor)
```

A classe `Cafe` utiliza esses métodos para alterar e consultar o valor da bebida selecionada. Por exemplo, quando o usuário escolhe um café, o método `selecionar()` utiliza:

```java
this.setValor(lista[0]);
```

para alterar o preço da bebida e posteriormente utiliza:

```java
this.getValor();
```

para exibir o valor ao usuário.

Dessa forma, os dados ficam protegidos e somente podem ser modificados por meio dos métodos definidos pela própria classe.

### Herança

A herança permite que uma classe reutilize características e comportamentos de outra classe, evitando repetição de código e facilitando a manutenção do sistema.

No projeto, a herança foi aplicada quando a classe `Cafe` foi criada como uma especialização da classe `Drink`:

```java
public class Cafe extends Drink
```

A palavra-chave `extends` indica que a classe `Cafe` herda todos os atributos e métodos da classe `Drink`.

Quando o objeto é criado:

```java
Cafe cafe = new Cafe("tradicional", 1.00);
```

o construtor da classe `Cafe` chama o construtor da superclasse através do comando:

```java
super(sabor, valor);
```

Esse comando envia os valores recebidos para a classe `Drink`, que será responsável por armazenar os dados da bebida.

Graças à herança, a classe `Cafe` já possui acesso aos atributos e métodos herdados da classe `Drink`, como:

* getSabor()
* setSabor()
* getValor()
* setValor()

sem que seja necessário reescrever esses métodos novamente.

### Abstração

A abstração consiste em representar apenas as características essenciais de um objeto, ocultando detalhes desnecessários para quem utiliza a classe.

No projeto, a abstração foi aplicada através da classe:

```java
public abstract class Drink
```

A classe `Drink` representa o conceito genérico de uma bebida. Ela contém informações que qualquer bebida da máquina poderia possuir, como:

* Sabor
* Valor

Essas características são comuns para todos os tipos de bebidas.

A utilização de uma classe abstrata torna o projeto mais organizado, pois centraliza as informações compartilhadas entre diferentes bebidas. Caso futuramente sejam criadas novas bebidas, elas poderão herdar essas características da classe `Drink`.

A abstração permite enxergar a bebida apenas pelos seus atributos e comportamentos essenciais, sem se preocupar inicialmente com detalhes específicos de cada tipo de café.

### Polimorfismo

O polimorfismo é a capacidade de objetos diferentes responderem de formas diferentes ao mesmo método quando são tratados através de uma referência comum.

No projeto atual existe apenas a classe concreta `Cafe`, portanto o polimorfismo ainda não foi implementado completamente. Entretanto, a estrutura do sistema já permite sua utilização.

Uma possível evolução seria criar classes específicas para cada bebida:

```java
public class Cappuccino extends Drink
public class Latte extends Drink
public class CafeComLeite extends Drink
public class CafeChocolate extends Drink
```

Além disso, a classe abstrata `Drink` poderia possuir um método abstrato:

```java
public abstract void prepararBebida();
```

Cada classe implementaria esse método de maneira diferente:

```java
@Override
public void prepararBebida() {
    System.out.println("Preparando Cappuccino");
}
```

```java
@Override
public void prepararBebida() {
    System.out.println("Preparando Latte");
}
```

Nesse cenário seria possível escrever:

```java
Drink bebida = new Cappuccino();
bebida.prepararBebida();
```

ou

```java
Drink bebida = new Latte();
bebida.prepararBebida();
```

Embora a variável seja do tipo `Drink`, cada objeto executaria sua própria implementação do método `prepararBebida()`. Esse comportamento caracteriza o polimorfismo.

No contexto da máquina de café, o polimorfismo permitiria adicionar novos sabores sem modificar a lógica principal do sistema. Bastaria criar uma nova classe herdando de `Drink` e implementar seus comportamentos específicos.

### Conclusão

O projeto da Máquina de Café demonstrou a aplicação prática dos conceitos fundamentais da Programação Orientada a Objetos. O encapsulamento foi utilizado para proteger os atributos das classes; a herança permitiu o reaproveitamento de código entre as classes `Drink` e `Cafe`; a abstração foi aplicada através da criação da classe abstrata `Drink`; e o polimorfismo foi apresentado como uma possível evolução do sistema para suportar diferentes tipos de bebidas de forma flexível e organizada.

Esses conceitos tornam o software mais modular, reutilizável, fácil de manter e preparado para futuras expansões.
