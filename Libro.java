package org.example.Vistas;

import org.example.Modelos.LibroModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Libro extends JDialog{
    private JPanel panel1;
    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JButton agregarButton;
    private LibroModel libro = new LibroModel();

public Libro()
{
    setContentPane(panel1);
    setModal(true);
    setSize(800, 600);
    setLocationRelativeTo(null);
    agregarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("nombre");
            model.addColumn("autor");
        }
    });
}
public static void main(String[] args)
{
    Libro dialog = new Libro();
    dialog.setVisible(true);
}
}
