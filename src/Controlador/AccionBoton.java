package Controlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLOutput;

public class AccionBoton implements ActionListener, ItemListener {
    JButton enviarB;
    JButton limpiarB;
    JTextField numero1B;
    JTextField numero2B;
    JComboBox combo1B;
    JComboBox combo2B;
    JLabel resultadoB;

    public AccionBoton(JButton enviar, JButton limpiar, JTextField numero1, JTextField numero2, JComboBox combo1, JComboBox combo2, JLabel resultado) {
        this.enviarB = enviar;
        this.limpiarB = limpiar;
        this.numero1B = numero1;
        this.numero2B = numero2;
        this.combo1B = combo1;
        this.combo2B = combo2;
        this.resultadoB = resultado;

        enviarB.addActionListener(this);
        limpiarB.addActionListener(this);
        combo1B.addItemListener(this);
        combo2B.addItemListener(this);

    }




    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == combo1B){
            int seleccion = combo1B.getSelectedIndex();
            String cadena = String.valueOf(seleccion);
            numero1B.setText(cadena);
        }else if (e.getSource() == combo2B){
            int seleccion2 = combo2B.getSelectedIndex();
            String cadena = String.valueOf(seleccion2);
            numero2B.setText(cadena);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enviarB){

            if (numero1B.getText().equals(" ") || numero2B.getText().equals(" ")){
                JOptionPane.showMessageDialog(null,"Ingrese un numero en la casilla");
            }else {
                String op =  numero1B.getText();
                String op2 = numero2B.getText();
                System.out.println(op);
                System.out.println(numero1B.getText());
                int num1 = Integer.parseInt(op);
                int num2 = Integer.parseInt(op2);

                int total = num1 + num2;

                String total2 = String.valueOf(total);

                resultadoB.setText("El total de la suma es "+total2);
            }


        }else if (e.getSource() == limpiarB){
            numero1B.setText(" ");
            numero2B.setText(" ");
        }
    }
}
