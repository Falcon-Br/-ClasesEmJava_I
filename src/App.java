public class App {
    public static void main(String[] args) throws Exception {

        Carro carro1 = new Carro();
        carro1.cor = "Vemelho";

        Carro carro2 = new Carro("X1F3265");
        carro2.cor = "Preto";

        //Movimenta Carro 1
        System.out.println("---------- CARRRO 1 ----------");
        while(carro1.velocidade != 90){
            if(carro1.velocidade <= 90){
                carro1.acelerar();
                System.out.println("Velocidade Atual "+carro1.velocidade+"km/h");
            }else{
                System.out.println("Velocidade de 90 Km/h Atingida!");
            }
        }

        //Movimento Carro 2
        System.out.println("\n---------- CARRRO 2 ----------\n");
        while(carro2.velocidade != 90){
            if(carro2.velocidade <= 90){
                carro2.acelerar();
                System.out.println("Velocidade Atual "+carro2.velocidade+"km/h");
            }else{
                System.out.println("Velocidade de 90 Km/h Atingida!");
            }
        }    
    }
}
