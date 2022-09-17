public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();

        //Set pai e mãe
        pessoa2.setNome("Cláudia");
        pessoa3.setNome("José");

        //Set pessoa que tem pai, mãe
        pessoa1.setNome("Eduardo");
        pessoa1.setMae(pessoa2);
        pessoa1.setPai(pessoa3);

        //Mostra o Pai e mãe de Eduardo
        System.out.println("Os pais de "+pessoa1.getNome()+ " são: ");
        System.out.println("* Pai - "+pessoa1.getPai().getNome());
        System.out.println("* Mãe - "+pessoa1.getMae().getNome());
        System.out.println();

        //Cria e configura 2 carros diferentes
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setModelo("Corolla");
        carro1.setDono(pessoa1);

        carro2.setModelo("Honda");
        carro2.setDono(pessoa2);

        //Mostra quais Carros Eduardo tem
        System.out.println(pessoa1.getNome()+" comprou os seguintes carros: ");
        pessoa1.comprarCarro(carro1);
        pessoa1.comprarCarro(carro2);
        pessoa1.todosOsCarros();

        System.out.println();

        System.out.println(pessoa1.getNome()+" vendeu um carro. Agora ele tem os seguintes carros: ");
        pessoa1.venderCarro(carro2);
        pessoa1.todosOsCarros();

        System.out.println();

        //Mostra o dono atual e os donos passados
        System.out.println("Lista de pessoas que já dirigiram o "+carro1.getModelo()+": ");
        carro1.getListaDirigiu();

        System.out.println();

        System.out.println("Lista de pessoas que já dirigiram o "+carro2.getModelo()+": ");
        carro1.getListaDirigiu();
    }
}
