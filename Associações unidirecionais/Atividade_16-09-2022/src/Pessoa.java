import java.util.ArrayList; // Importa a ArrayList class

public class Pessoa{
    //Atributos
    private String nome;
    private Pessoa pai;
    private Pessoa mae;
    private ArrayList<Carro> carros = new ArrayList<Carro>();

    //Métodos
    void setPai(Pessoa pai){
        this.pai = pai;
    }

    Pessoa getPai(){
        return this.pai;
    }

    void setMae(Pessoa mae){
        this.mae = mae;
    }

    Pessoa getMae(){
        return this.mae;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    void comprarCarro(Carro carro){
        this.carros.add(carro);
    }

    void venderCarro(Carro carro){
        for (Carro i : carros) {
            this.carros.remove(i);
        }
    }

    void todosOsCarros(){
        for (Carro i : carros) {
           System.out.println(i.getModelo());
        }
    }
}