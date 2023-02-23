import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "hello "+name);
        String x = JOptionPane.showInputDialog("Enter your age: ");
        Integer.parseInt(x);
        JOptionPane.showMessageDialog(null,"you are "+x);


    }
}
