package Modelo;

import javax.swing.*;

public class InsertarDatos {

    public JComboBox InsertarCombo(JComboBox combo, JComboBox combo1) {
        int num = 0;
        for (int i = 0; i <10 ; i++) {

            combo.addItem(num);
            combo1.addItem(num);
            num++;
        }

        return combo;
    }
}
