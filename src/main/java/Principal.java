

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        String option="";
        
        Calculator calculator = new Calculator();
        while(!option.equals("9")) {
            option = JOptionPane.showInputDialog("1 - Value  \n2 - Sum \n3 - Difference \n4 - Product \n5 - Quotient \n9 - Exit ");
          
            switch(Integer.parseInt(option)) {
                case 1:
                    calculator.setValueA(Double.parseDouble(JOptionPane.showInputDialog("Type value A")));
                    calculator.setValueB(Double.parseDouble(JOptionPane.showInputDialog("Type value B")));
                    break;
                case 2: 
                    JOptionPane.showMessageDialog(null,"Sum: " + calculator.getSum());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Difference: " + calculator.getDifference());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Produto: " + calculator.getProduct());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Quociente: " + calculator.getQuotient());
                    break;
            }
        }
    }
}