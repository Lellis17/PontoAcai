public class Acai {
    public String tamanho;
    public double valor;
    public boolean acrescimoSorvete;

    public double CalculaValor(Boolean acrescimoSorvete, String tamanho) {
        if (tamanho.equals("p")) {
            valor = 8.00;

        } else if (tamanho.equals("M")) {
            valor = 10.00;
        } else {
            valor = 12.00;

        }
        if (acrescimoSorvete){
            valor += 2.00;

        }
        return valor;
    }
}




