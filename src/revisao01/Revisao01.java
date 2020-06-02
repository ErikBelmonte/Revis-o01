
package revisao01;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Revisao01 {
    public static void main(String[] args) {
        double VTpao, VTbroa, VTotal, VTP;
        int Tpao, Tbroa;
        DecimalFormat f = new DecimalFormat("0.00");
        
        Tpao = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pães vendidos:"));
        Tbroa = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de broas vendidas:"));
        VTpao = Tpao * 0.12;
        VTbroa = Tbroa * 1.50;
        VTotal = VTpao + VTbroa;
        VTP = ((VTotal * 10)/100);
        JOptionPane.showMessageDialog(null,"O total de dinheiro ganho hoje foi: R$"+f.format(VTotal) +"\n"+"Você deve guardar na popança: R$"+f.format(VTP));
    }
    
}
