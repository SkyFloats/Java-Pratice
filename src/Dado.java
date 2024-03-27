public class Dado {
    private int qtdLados = 6;
    private int valorFace;

    public Dado(){
        this.valorFace = 1;
    }
    public Dado(int qtdLados){
        this.qtdLados = qtdLados;
    }

    public int getQtdLados(){
        return qtdLados;
    }

    public int getValorFace(){
        return valorFace;
    }
    public void setValorFace(int valorFace){
        if (valorFace <= qtdLados && valorFace >= 1){
            this.valorFace = valorFace;
        } else {
            System.out.println("Valor inválido para a face do dado.");
        }
    }

    public void rolar(){

        int numeroRolado = (int) (Math.random() * qtdLados) + 1;
       System.out.println("O número que caiu foi: " + numeroRolado);
       valorFace = numeroRolado;
    }
}
