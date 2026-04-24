import java.util.ArrayList;
import java.util.List;

// professor, aqui a gente resolve a questão 5: a classe pessoa virou abstrata.
// isso garante que não dá pra criar uma "pessoa genérica" no sistema, ela tem obrigatoriamente que ser aluno ou professor.
abstract class Pessoa {
    
    // questão 2: encapsulamento aplicado aqui. os atributos tão private pra ninguém mexer direto de fora da classe.
    private String nome;
    private String identificador;

    // questões 1 e 3: construtor base pra inicializar os dados principais de quem é cadastrado.
    public Pessoa(String nome, String identificador) {
        this.nome = nome;
        this.identificador = identificador;
    }

    // questão 2: os setters tão com a regra de validação pra não deixar o nome ficar vazio de jeito nenhum.
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("erro de validação: o nome não pode ser registrado como vazio.");
        }
    }

    public String getNome() {
        return nome;
    }

    // questão 2: mesma validação sendo aplicada pro identificador (matrícula).
    public void setIdentificador(String identificador) {
        if (identificador != null && !identificador.trim().isEmpty()) {
            this.identificador = identificador;
        } else {
            System.out.println("erro de validação: a matrícula/identificador não pode ficar vazia.");
        }
    }

    public String getIdentificador() {
        return identificador;
    }

    // questão 5: método abstrato. obriga as subclasses (aluno e professor) a implementarem como vão se apresentar.
    public abstract void apresentar();

    // método de suporte pra exibir os dados comuns sem precisar repetir código lá embaixo.
    public void exibirDados() {
        System.out.println("nome: " + this.nome);
        System.out.println("identificador: " + this.identificador);
    }
}

// questão 3: herança rolando aqui. a classe aluno tá herdando (extends) a base da classe pessoa.
class Aluno extends Pessoa {
    private String curso;

    // questões 1 e 3: o construtor usa o 'super' pra reaproveitar a lógica de inicialização da classe mãe.
    public Aluno(String nome, String identificador, String curso) {
        super(nome, identificador);
        this.curso = curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    // questões 4 e 5: sobrescrevendo o método abstrato (polimorfismo) pro aluno se apresentar do jeito dele.
    @Override
    public void apresentar() {
        System.out.println("olá, meu nome é " + getNome() + " e sou aluno(a) do curso de " + this.curso + ".");
    }

    // questões 1 e 3: reaproveitando o exibirDados da classe mãe e só adicionando o curso que é específico do aluno.
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("curso: " + this.curso);
    }
}

// questão 3: professor também usando herança pra demonstrar o reaproveitamento de código.
class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String identificador, String disciplina) {
        super(nome, identificador);
        this.disciplina = disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    // questões 4 e 5: polimorfismo de novo. a gente sobrescreve o método pra ele falar que é professor e a disciplina.
    @Override
    public void apresentar() {
        System.out.println("olá, meu nome é " + getNome() + " e sou professor(a) da disciplina de " + this.disciplina + ".");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("disciplina: " + this.disciplina);
    }
}

// a classe principal que bota tudo pra rodar
public class Main {
    public static void main(String[] args) {
        
        // questão 4: criamos uma lista com o tipo mais genérico (pessoa) pra conseguir guardar alunos e professores juntos.
        List<Pessoa> cadastroDaEscola = new ArrayList<>();

        // questões 1 e 5: instanciando todo mundo usando o 'new' (3 alunos e 2 professores como a questão pediu).
        Aluno aluno1 = new Aluno("maria silva", "2026001", "informática");
        Aluno aluno2 = new Aluno("joão pereira", "2026002", "redes de computadores");
        Aluno aluno3 = new Aluno("ana luiza", "2026003", "sistemas de informação");
        
        Professor prof1 = new Professor("carlos", "func001", "banco de dados");
        Professor prof2 = new Professor("daniel", "func002", "programação orientada a objetos");

        // questão 2: teste prático pra mostrar que as regras de encapsulamento tão funcionando e barrando dados errados.
        System.out.println("--- testando as regras de encapsulamento (questão 2) ---");
        aluno1.setNome(""); // forçando uma string vazia pra disparar o aviso lá do setter.
        System.out.println("--------------------------------------------------------\n");

        cadastroDaEscola.add(aluno1);
        cadastroDaEscola.add(aluno2);
        cadastroDaEscola.add(aluno3);
        cadastroDaEscola.add(prof1);
        cadastroDaEscola.add(prof2);

        System.out.println("=== sistema de cadastro da escola ===");
        
        // questões 4 e 5: a mágica do polimorfismo. um laço que passa por todo mundo.
        // o mesmo método apresentar() é chamado, mas o java entende se a resposta tem que ser de aluno ou professor.
        for (Pessoa pessoa : cadastroDaEscola) {
            pessoa.exibirDados();
            pessoa.apresentar(); 
            System.out.println("-----------------------");
        }

        // questão 5: comprovando que a abstração deu certo.
        System.out.println("\n--- demonstração da abstração (questão 5) ---");
        System.out.println("nota pro professor: se a gente tentasse dar um 'new Pessoa()', daria erro de compilação,");
        System.out.println("o que prova que a abstração tá garantindo que cada pessoa tenha seu papel definido.");
    }
}
