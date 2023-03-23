import javax.swing.JOptionPane;

public class PontodoAcai {
    public static void main(String[] args) {

        String Pedido = JOptionPane.showInputDialog("Boa noite, qual é seu pedido:\n 1acai300 \n 2acai500 \n 3acai700");
        if (Pedido.equals("1")) {
            String tamanho = JOptionPane.showInputDialog("Informe o tamanho do acai:");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("O valor do acai"));

            String valorAcrescimo = JOptionPane.showInputDialog("Acresicimo de Sorvete? \n Sim \n Não");
            boolean acrescimoParaCalculo;

            if (valorAcrescimo.equals("Sim")) {
                acrescimoParaCalculo = true;
            } else {
                acrescimoParaCalculo = false;
            }
            Acai pequeno = new Acai();
            pequeno.tamanho = tamanho;
            pequeno.valor = valor;

            double valotTotal = pequeno.calcularacrescimento(acrescimoParaCalculo);

            JOptionPane.showMessageDialog(null, "Pedido" + valotTotal, "pedido", JOptionPane.INFORMATION_MESSAGE);
        }
        if (Pedido.equals("2")) {
            String tamanho = JOptionPane.showInputDialog("Informe o tamanho do acai:");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("O valor do acai"));

            String valorAcrescimo = JOptionPane.showInputDialog("Acresicimo de Sorvete? \n Sim \n Não");
            boolean acrescimoParaCalculo;

            if (valorAcrescimo.equals("Sim")) {
                acrescimoParaCalculo = true;
            } else {
                acrescimoParaCalculo = false;
            }
            Acai medio = new Acai();
            medio.tamanho = tamanho;
            medio.valor = valor;

            double valotTotal = medio.calcularacrescimento(acrescimoParaCalculo);

            JOptionPane.showMessageDialog(null, "Pedido" + valotTotal, "pedido", JOptionPane.INFORMATION_MESSAGE);
        }
        if (Pedido.equals("3")) {
            String tamanho = JOptionPane.showInputDialog("Informe o tamanho do acai:");
            double valor = Double.parseDouble(JOptionPane.showInputDialog("O valor do acai"));

            String valorAcrescimo = JOptionPane.showInputDialog("Acresicimo de Sorvete? \n Sim \n Não");
            boolean acrescimoParaCalculo;

            if (valorAcrescimo.equals("Sim")) {
                acrescimoParaCalculo = true;
            } else {
                acrescimoParaCalculo = false;
            }
            Acai grande = new Acai();
            grande.tamanho = tamanho;
            grande.valor = valor;

            double valotTotal = grande.calcularacrescimento(acrescimoParaCalculo);

            JOptionPane.showMessageDialog(null, "Pedido" + valotTotal, "pedido", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
