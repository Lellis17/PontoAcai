public class Acai {
    public String tamanho;
    public double valor;
    public boolean acrescimo;

            public double calcularacrescimento(boolean acrescimo){
                if (acrescimo) {
                    return valor + 2.00;

                }
                return valor;

            }
            public String consultaNome(){
                return tamanho;
            }


}

