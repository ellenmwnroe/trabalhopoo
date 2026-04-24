# import os

# conteúdo do readme personalizado e humanizado
readme_content = """# sistema de gestão escolar - undb

[span_1](start_span)este projeto é uma atividade avaliativa da disciplina de **programação orientada a objetos (poo)**, ministrada pelo professor **daniel gusmão pereira**[span_1](end_span). o objetivo aqui foi construir um sistema que evolui passo a passo, aplicando os conceitos fundamentais do desenvolvimento orientado a objetos em java.

## 🎓 informações da aluna
- **nome:** ellen monroe franco de sá diniz
- **[span_2](start_span)curso:** sistemas de informação (4º período)[span_2](end_span)
- **instituição:** centro universitário undb

---

## 🛠️ o que foi desenvolvido
[span_3](start_span)o projeto foi estruturado em um único arquivo (`main.java`) para facilitar a visualização da evolução do código, passando pelas 5 questões propostas na atividade[span_3](end_span):

1.  **[span_4](start_span)[span_5](start_span)[span_6](start_span)questão 1 (classes e objetos):** criação da classe `aluno` com atributos básicos, construtor e o método para exibir os dados no console[span_4](end_span)[span_5](end_span)[span_6](end_span).
2.  **[span_7](start_span)[span_8](start_span)[span_9](start_span)[span_10](start_span)questão 2 (encapsulamento):** proteção dos dados usando o modificador `private` e criação de métodos `get` e `set` com regras de validação (impedindo nomes ou matrículas vazias)[span_7](end_span)[span_8](end_span)[span_9](end_span)[span_10](end_span).
3.  **[span_11](start_span)[span_12](start_span)[span_13](start_span)[span_14](start_span)questão 3 (herança):** criação da classe mãe `pessoa` para reaproveitar código entre as classes `aluno` e `professor`, evitando repetição de atributos comuns como nome e identificador[span_11](end_span)[span_12](end_span)[span_13](end_span)[span_14](end_span).
4.  **[span_15](start_span)[span_16](start_span)[span_17](start_span)[span_18](start_span)questão 4 (polimorfismo):** implementação do método `apresentar()`. aqui, o sistema consegue tratar diferentes tipos de pessoas de forma inteligente, chamando o mesmo método e recebendo respostas diferentes dependendo de quem está se apresentando[span_15](end_span)[span_16](end_span)[span_17](end_span)[span_18](end_span).
5.  **[span_19](start_span)[span_20](start_span)[span_21](start_span)[span_22](start_span)questão 5 (abstração):** transformação da classe `pessoa` em uma classe abstrata. isso garante que ninguém consiga criar uma "pessoa genérica", forçando o sistema a sempre definir se aquela pessoa é um aluno ou um professor[span_19](end_span)[span_20](end_span)[span_21](end_span)[span_22](end_span).

---

## 🚀 como rodar o projeto
como o código foi todo consolidado em um arquivo só para facilitar sua correção, professor, o passo a passo é bem simples:

1. certifique-se de que você tem o **jdk (java development kit)** instalado.
2. baixe o arquivo `main.java`.
3. abra o terminal na pasta do arquivo e compile:
   ```bash
   javac main.java
