import java.util.ArrayList; //Importa classe ArrayList
import java.util.Arrays; //Importa array

public class Aluno {
 /*----- Atributos -----*/
    String nome;
    String sobreNome;
    int matricula;
    String curso;
    ArrayList<String> disciplinasAprovadas;
    ArrayList<Double> notas;
    String[] disciplinasMatriculadas = new String[6];

/*----- Métodos -----*/
    void atualizaNomeAluno(String nome){
        this.nome = nome;
    }

    void atualizaSobrenomeAluno(String sobrenome){
        this.sobreNome = sobrenome;
    }

    void atualizaMatriculaAluno(int matricula){
        this.matricula = matricula;
    }

    void atualizaNomeCurso(String curso){
        this.curso = curso;
    }

    void insereDisciplinaAprovada(String disciplinaAprovada){
        this.disciplinasAprovadas.add(disciplinaAprovada);
    }

    void insereDisciplinasMatriculadas(String disciplina){
        int totalCursos = 0;
        if(totalCursos == 6){
           System.out.println("Quantidade de cursos chegou ao limite.");
        }
        this.disciplinasMatriculadas[totalCursos] = disciplina;
        totalCursos++;
    }

    void moveDisciplinaParaAprovada(String disciplina){
        Arrays.stream(disciplinasMatriculadas).filter(i -> i != disciplina).toArray();
        this.disciplinasAprovadas.add(disciplina);
    }
    
    int quantidadeDisciplinasAprovadas(){
        return(disciplinasAprovadas.size());
    }

    int quantidadeDisciplinasMatriculadas(){
        return(disciplinasMatriculadas.length);
    }

    void dadosAlunos(){
        System.out.println("Nome: "+this.nome+"\nSobrenome: "+this.sobreNome+"\nMatricula: "+this.matricula+"\nCurso: "+this.curso);
    }

    void mediaAluno(){
        double media = 0;

        for (int i = 0; i < notas.size(); i++) {
            media += notas.get(i);           
        }

        media = media/notas.size();
        System.out.println(media);
    }

    /*----- Contrutores -----*/
    public Aluno(String nome, String sobreNome, int matricula){
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public Aluno(String nome, String sobreNome, int matricula, String curso, String[]disciplinas){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinasMatriculadas = disciplinas;
    }
}