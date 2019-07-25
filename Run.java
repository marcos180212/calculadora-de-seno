import javax.swing.*;

public class Run {
    static double res = 0;

    public static double fatorial(double n) {
        if (n < 2) {
            return n;
        }
        return n * fatorial(n - 1);
    }

    public static double seno(float x) {
        double rad = (x / 360) * (2*Math.PI);
        for (int n = 0; n < 10; n++) {
            double fatorial = fatorial(2*n+1);
            res += Math.pow(-1, n) * Math.pow(rad, 2*n+1) / fatorial;
        }
        return res;
    }

    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um ângulo:"));
        String seno = String.format("%.5f", seno(x));
        JOptionPane.showMessageDialog(null, "O seno de "+x+" = "+seno, "CALCULADORA DE SENO", 1);
    }
}
