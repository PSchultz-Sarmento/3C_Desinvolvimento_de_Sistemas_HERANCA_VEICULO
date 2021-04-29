/**
 * Class carro
 */
public final class Carro extends Veiculo{

    /**
     * Atributo
     */
    private int nPortas;

    /**
     * Construtor de carro
     */
    public Carro(String nome){
        super(nome);
    }

    /**
     * Get n�mero de portas
     * @return n�mero de portas
     */
    public int getnPortas() {
        return nPortas;
    }
    /**
     * Informar o n�mero de portas
     * @param nPortas
     */
    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    /**
     * Imprimir o objeto
     */
    public String toString() {
        return super.toString()
        + "N�mero de Portas: " + nPortas;
    }
}