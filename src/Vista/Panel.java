package Vista;

import Controlador.AccionBoton;
import Modelo.InsertarDatos;

import javax.swing.*;

public class Panel extends JPanel {

    //Componentes
    JButton enviar;
    JButton limpiar;
    JTextField numero1;
    JTextField numero2;
    JComboBox combo1;
    JComboBox combo2;
    JLabel resultado;

    //Constructor
    public Panel(){
        this.setLayout(null);

        //Creamos metodos
        crearEtiqueta();
        crearCombo();
        crearBoton();

    }

    private void crearEtiqueta() {
        resultado = new JLabel();
        numero1 = new JTextField();
        numero2 = new JTextField();

        resultado.setBounds(100,400,150,20);

        numero1.setBounds(90,100,150,30);
        numero2.setBounds(240,100,150,30);

        this.add(resultado);
        this.add(numero1);
        this.add(numero2);
    }
    private void crearCombo(){
        combo1 = new JComboBox();
        combo2 = new JComboBox();

        combo1.setBounds(90,40,80,20);
        combo2.setBounds(240,40,80,20);

        combo1 = new InsertarDatos().InsertarCombo(combo1,combo2);


        this.add(combo1);
        this.add(combo2);

    }
    private void crearBoton(){
        enviar = new JButton("Enviar");
        limpiar = new JButton("Limpiar");

        enviar.setBounds(90,150,90,30);
        limpiar.setBounds(240,150,90,30);

        this.add(enviar);
        this.add(limpiar);

        AccionBoton instancai = new AccionBoton(enviar,limpiar,numero1,numero2,combo1,combo2,resultado);


    }
}
