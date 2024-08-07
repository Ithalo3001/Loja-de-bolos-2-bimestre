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

public class LojaDeDocesBorderLayout extends JFrame {

    public LojaDeDocesBorderLayout() {
        setTitle("Seja bem vindo (a) a Loja de Doces ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configurando o layout BorderLayout
        setLayout(new BorderLayout());

        // Componentes
        JLabel labelTitulo = new JLabel("Loja de Doces", JLabel.CENTER);
        add(labelTitulo, BorderLayout.NORTH);

        JTextArea areaDoces = new JTextArea("Lista de Doces-->");
        add(new JScrollPane(areaDoces), BorderLayout.CENTER);

        JButton botaoComprar = new JButton("Comprar");
        add(botaoComprar, BorderLayout.SOUTH);

        JPanel panelLateral = new JPanel();
        panelLateral.setLayout(new GridLayout(3, 1));
        panelLateral.add(new JButton("Brigadeiro R$ 1,00"));
        panelLateral.add(new JButton("Pudim R$ 8,99"));
        panelLateral.add(new JButton("Barra de chocolate R$ 6,99"));
        panelLateral.add(new JButton("Tapioca doce R$ 9,99"));
        panelLateral.add(new JButton("Fatia de bolo R$ 8,99"));
        panelLateral.add(new JButton("Pastel doce R$ 10,99"));
        add(panelLateral, BorderLayout.EAST);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LojaDeDocesBorderLayout().setVisible(true);
        });
    }
}

public class LojaDeDocesBorderLayout {
    
}
