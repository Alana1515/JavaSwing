import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {

    private JTextField textNome;

    private JPanel mainPanel;

    public MainForm() {

        btnValidar.addActionListener(new ActionListener() {
                                         @Override
                                         public void actionPerformed(ActionEvent e) {
                                             //Obter nome do input
                                             String nomeDigitado = textNome.getText();

                                             txtResultado.setText(nomeDigitado);
                                         }
                                     }
        );

    }

    private JButton btnValidar;

    private JLabel txtResultado;

    public static void main(String[] args) {

        //cria a minha tela (TV)
        JFrame frame = new JFrame("Minha primeira tela");
        //Mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ajusta TV do tamanho no meu painel
        //frame.pack();
        frame.setSize(500, 500);
        //Ligar a TV
        frame.setVisible(true);


    }

}
