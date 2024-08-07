/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
import javax.swing.*;
import java.awt.*;

public class LojaDeDocesGridLayout extends JFrame {

    public LojaDeDocesGridLayout() {
        setTitle("Loja de Doces");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurando o layout GridLayout
        setLayout(new GridLayout(3, 1));

        // Componentes
        JLabel labelTitulo = new JLabel("Loja de Doces", JLabel.CENTER);
        add(labelTitulo);

        // Adicionando imagem
        ImageIcon imagemDoce = new ImageIcon("brigadeiro.jpg");
        JLabel labelImagem = new JLabel(imagemDoce);
        add(labelImagem);

        

        JPanel panelBotoes = new JPanel(new GridLayout(1, 3));
        panelBotoes.add(new JButton("Brigadeiro R$ 1,00"));
        panelBotoes.add(new JButton("Pudim R$ 8,99"));
        panelBotoes.add(new JButton("Barra de chocolate R$ 6,99"));
        panelBotoes.add(new JButton("Tapioca doce R$ 9,99"));
        panelBotoes.add(new JButton("Fatia de bolo R$ 8,99"));
        panelBotoes.add(new JButton("Pastel doce R$ 10,99"));
        add(panelBotoes);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LojaDeDocesGridLayout().setVisible(true);
        });
    }
}

public class LojaDeDocesGridLayout {
    
}
