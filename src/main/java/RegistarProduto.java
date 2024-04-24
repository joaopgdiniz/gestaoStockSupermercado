import javax.swing.*;
import java.awt.*;

public class RegistarProduto {
    private JPanel panel1;
    private JTextArea gestorDeStockTextArea;
    private JButton consultarProdutoButton;
    private JButton registarLoteButton;
    private JButton registarProdutoButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField5;
    private JTextField textField6;
    private JButton registarProdutoButton1;
    private JComboBox comboBox1;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Cria um JFrame
                JFrame frame = new JFrame("Tela Cheia");

                // Define o tamanho da tela cheia
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setSize(screenSize.width, screenSize.height);

                // Define o comportamento de fechamento
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Define a janela para tela cheia
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setUndecorated(true); // Remove a decoração da janela (barras de título, etc.)

                // Adiciona um JLabel para demonstração
                JLabel label = new JLabel("Janela em Tela Cheia");
                label.setHorizontalAlignment(SwingConstants.CENTER);
                frame.add(label);

                // Torna a janela visível
                frame.setVisible(true);
            }
        });
    }
}
