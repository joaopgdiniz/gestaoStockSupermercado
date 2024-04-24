import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuPrincipal extends JFrame {
    private JPanel panel1;
    private JButton gestorDeStockButton;
    private JButton funcionarioButton;

    public menuPrincipal() {
        add(panel1);
        setTitle("Menu Principal");
        setSize(800, 600);
        funcionarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new consultarProduto().setVisible(true);
                dispose();
            }
        });
    }
}
