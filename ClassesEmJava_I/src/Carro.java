public class Carro {
    /* ----- Atributos ----- */
    String numChassi;
    double velocidadeMaxima;
    double velocidade;
    double quilometragem;
    double potencia;
    String cor;
    int quantidadePortas;
    int marcha;
    boolean ligado;

    /* ----- Métodos ---- */
    void ligar(){
        this.ligado = true;
    }

    void desligar(){
        this.ligado = false;
    }

    void acelerar(){
       if(verificaVelocidade())
            this.velocidade = velocidade + 5;
        System.out.println("Velocidade aumentou.");
    }

    void frear(){
        if(this.velocidade < 0){
            System.out.println("Carro já está parada.");
        }else{
            this.velocidade = velocidade - 5;
            System.out.println("Velocidade Diminuiu.");
        }
    }

    void girarVolante(){
        System.out.println("Volante girou!");
    }

    void reduzirMarcha(){
        this.marcha = marcha--;
    }

    void subirMachar(){
        this.marcha = marcha++;
    }

    boolean verificaVelocidade(){
        if(this.marcha == 1 || this.marcha == 0){  
            if(this.velocidade == 20){
                System.out.println("Velocidade máxima da 1ª Marcha atingida. Trocando de marcha");
                this.marcha++;
                return(false);
            }else{
                return(true);
            }
        }else if(this.marcha == 2){
            if(this.velocidade == 30){
                System.out.println("Velocidade máxima da 2ª Marcha atingida! Trocando de marcha");
                this.marcha++;
                return(false);
            }else{
                return(true);
            }
        }else if(this.marcha == 3){
            if(this.velocidade == 40){
                System.out.println("Velocidade máxima da 3ª Marcha atingida! Trocando de marcha");
                this.marcha++;
                return(false);
            }else{
                return(true);
            }
        }else if(this.marcha == 4){
            if(this.velocidade == 65){
                System.out.println("Velocidade máxima da 4ª Marcha atingida! Trocando de marcha");
                this.marcha++;
                return(false);
            }else{
                return(true);
            }
        }else if(this.marcha == 5){;
            if(this.velocidade == this.velocidadeMaxima){
                System.out.println("Velocidade máxima da 5ª Marcha atingida! Velocidade máximo do Carro atingida, reduza a Marcha.");
                return(false);
            }else{
                return(true);
            }
        }else{
            System.out.println("Marcha incorreta! Coloque uma Marcha válida.");
            return(false);
        }
    }
    /* ----- Construtores ----- */

    public Carro(){

    }

    public Carro(String chassi){
        this.numChassi = chassi;
        this.velocidadeMaxima = 180;
        this.quilometragem = 0;
        this.potencia = 80;
        this.cor = "Branco";
        this.quantidadePortas = 4;
        this.velocidade = 0;
        this.marcha = 0;
        this.ligado = false;
    }

}
