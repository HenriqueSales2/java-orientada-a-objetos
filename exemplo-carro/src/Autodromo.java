
public class Autodromo {
    public static void main(String[] args) {
        Carro onix = new Carro();
        onix.setChassi("896896");
        onix.ligar();

        Moto z400 = new Moto();
        z400.setChassi("123123");
        z400.ligar();

        Veiculo coringa = onix;

        coringa.ligar();
        

    }
}