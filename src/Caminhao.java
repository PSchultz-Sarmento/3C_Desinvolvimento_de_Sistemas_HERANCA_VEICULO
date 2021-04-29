public class Caminhao extends Veiculo{ // define que o veiculo vai ser um caminh�o

    private int nEixos;

    /**
     * Construtor da classe
     *
     * @param nome
     */
    public Caminhao(String nome) {
        super(nome);
    }

    /**
     * Get e set
     */
    public int getnEixos() {
        return nEixos;
    }
    public void setnEixos(int nEixos) {
        this.nEixos = nEixos;
    }

    @Override
    public String toString(){ // printa o numero de eixos
        return super.toString() + "n�mero de eixos: " + nEixos;
    }
}