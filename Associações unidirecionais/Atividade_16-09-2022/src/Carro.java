import java.util.ArrayList; // Importa a ArrayList class

public class Carro{
    private String modelo;
    private Pessoa dono;
    private ArrayList<String> jaDirigiu = new ArrayList<String>();

    void imprimeCarro(){
        System.out.println("Modelo: " + this.modelo+"\nDono: "+this.dono.getNome());
    }

    Pessoa getDono(){
        return this.dono;
    }

    void setDono(Pessoa dono){
        this.dono = dono;
        setListaDirigiu(dono.getNome());
    }

    String getModelo(){
        return this.modelo;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    void setListaDirigiu(String jaDirigiu){
        if(jaDirigiu !=  null){
            this.jaDirigiu.add(jaDirigiu);
        }
        
    }

    void getListaDirigiu(){
        for (String i : jaDirigiu) {
            System.out.println("* "+i);
         }
    }
}