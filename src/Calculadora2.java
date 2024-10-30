import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora2 {
    private JTextField txtPrimeiroValor;

    private JTextField txtSegundoValor;

    private JButton btnSomar;

    private JTextField txtResultado;

    private JButton btnLimpar;

    private JPanel panelMain;

    public Calculadora2() {
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());

                //Procesei
                Integer soma = primeiro + segundo;

                //Mandei pra tela o resultado
                txtResultado.setText(soma.toString());

            }
    });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new Calculadora2().panelMain);
        frame.setSize(400, 400);
        frame.setVisible(true);


    }}