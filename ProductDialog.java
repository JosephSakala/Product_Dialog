import javax.swing.*;//needed for JFrame componets


public class ProductDialog{


    public static void main(String []args){

        double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the first number","eg 2"));
        double num2 =Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the second number", "eg 3"));

        double product  =num1 * num2;

        JOptionPane.showMessageDialog(null,"Your Product is "+product);



    }
}