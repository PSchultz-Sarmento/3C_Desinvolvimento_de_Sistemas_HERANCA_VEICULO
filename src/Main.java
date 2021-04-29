public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("Fusca");
        carro.setMarca("Wolksvagem",  "A empresa.....");
        carro.setDesc("Azul");
        carro.setnPortas(2);
        System.out.println(carro + "\n\n");

        Carro carro2 = new Carro("Chevette");
        carro2.setMarca("Chevrolet"," A empresa.....");
        carro2.setnPortas(2);
        System.out.println(carro2 + "\n\n");

        Caminhao caminhao = new Caminhao("S460");
        caminhao.setMarca("Scania", " A empresa.....");
        caminhao.setnEixos(6);
        System.out.println(caminhao + "\n\n");

    }
}