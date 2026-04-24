# sistema de gestão escolar - undb

este projeto é a entrega da atividade avaliativa da disciplina de **programação orientada a objetos**, ministrada pelo professor **daniel gusmão pereira**. o objetivo foi construir um sistema que evolui gradualmente, aplicando os pilares da poo em java.

## 🎓 identificação
- **aluna:** ellen monroe franco de sá diniz
- **curso:** tecnologia em sistemas de informação
- **período:** 4º período

---

## 🛠️ o que foi implementado
o código foi consolidado em um único arquivo (`main.java`) e cobre os seguintes requisitos:

1. **questão 1 (molde básico):** criação da classe aluno com atributos de nome, matrícula e curso, utilizando construtores para inicialização e métodos para exibição.
2. **questão 2 (segurança):** aplicação de encapsulamento com atributos privados e métodos getters/setters, incluindo validações para impedir campos vazios.
3. **questão 3 (herança):** criação da classe base `pessoa` para reaproveitamento de código entre alunos e professores, evitando a repetição de atributos comuns.
4. **questão 4 (polimorfismo):** implementação do método `apresentar()`, permitindo que diferentes objetos respondam à mesma chamada de forma específica.
5. **questão 5 (abstração):** transformação da classe `pessoa` em abstrata, garantindo que o sistema não permita a criação de usuários sem uma função definida (aluno ou professor).

---

## 🚀 como executar
para rodar a simulação completa que cadastra 3 alunos e 2 professores:

1. compile o arquivo:
   ```bash
   javac main.java
