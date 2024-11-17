import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Agenda_Diaria {
    private JTextField txtCompromisso;
    private JSpinner spnData;
    private JTable tblResultado;
    private JButton btnRemover;
    private JButton btnAdicionar;
    private JPanel jpAgenda;
    private JLabel lblSelecioneData;
    private JLabel lblQualseuCompromisso;
    private JSpinner spnHora;
    private JLabel lblselecioneHora;

    private String Compromisso;


    public Agenda_Diaria() {
        Compromisso = txtCompromisso.getText().trim();

        spnData.setModel(new SpinnerDateModel());
        JSpinner.DateEditor editorData = new JSpinner.DateEditor(spnData, "dd/MM/yyyy");
        spnData.setEditor(editorData);

        JSpinner.DateEditor editorTemporal = new JSpinner.DateEditor(spnHora, "hh:mm:ss");
        spnHora.setEditor(editorTemporal);

        btnAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Agenda Diaria");
        frame.setContentPane(new Agenda_Diaria().jpAgenda);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}