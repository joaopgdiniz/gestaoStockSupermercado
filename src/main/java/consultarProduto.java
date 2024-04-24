import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class consultarProduto extends JFrame {
    private JButton consultarProdutosButton;
    private JButton registarLoteButton;
    private JButton registarProdutoButton;
    private JTable table1;
    private JPanel panel1;

    public consultarProduto() {
        // Set title
        setTitle("Consultar Produto");

        add(panel1);

        // Set full-screen mode
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set visible
        setVisible(true);
        consultarProdutosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                populateTable();
            }
        });
    }

    // Método para preencher a tabela com dados
    private void populateTable() {
        // Cria um modelo de tabela e define as colunas
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Marca");
        model.addColumn("Código");
        model.addColumn("Categoria");
        model.addColumn("Nome");
        model.addColumn("Preço Unitário");
        model.addColumn("Fornecedor");

        // Obter os dados da MainClass (supondo que seja o nome da sua classe principal)
        LinkedList<Produto> produtos = MainClass.produtos;

        // Preenche a tabela com os dados dos produtos
        for (Produto produto : produtos) {
            if(produto.getDeletedAt() != null) continue;
            model.addRow(new Object[]{
                    produto.getMarca(),
                    produto.getCodProduto(),
                    produto.getCategoria(),
                    produto.getNome(),
                    produto.getPreco_unit(),
                    produto.getFornecedor(),
            });
        }

        // Define o modelo da tabela
        table1.setModel(model);
    }
}
