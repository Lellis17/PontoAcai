import javax.swing.JOptionPane;
public class PontoAcai {
    public static void main(String[] args) {
        String tamanho = JOptionPane.showInputDialog("Ponto do Acai:\n Escolha a opcao \n P - 300 \n M - 500 \n G - 700");
         String desejaSorvete = JOptionPane.showInputDialog("Deseja Acrescimo de Sorvete? \n S - Sim \n N - Nao");

         Acai acai = new Acai();

         Boolean acrescimodeSorvete;

         if (desejaSorvete.equals("s")){
             acrescimodeSorvete = true;
         }else {
             acrescimodeSorvete = false;
         }
         Double valorTotal = acai.CalculaValor (acrescimodeSorvete,tamanho);

         JOptionPane.showMessageDialog(null, "O valor e"+ valorTotal, "Acai", JOptionPane.INFORMATION_MESSAGE );
    }
}
