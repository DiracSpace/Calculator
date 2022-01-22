import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc extends JFrame implements ActionListener {

    JButton RTC, CE, CL, Signo, Division, Multiplicacion, Menos, Mas, Igual, Punto, Boton1, Boton2, Boton3, Boton4, Boton5, Boton6, Boton7, Boton8, Boton9, Boton0, Borrar;
    JTextField Resultado;
    JLabel Texto;
    JPanel panelSuperior, panelInferior;
    String PrimerOp, SegundOp, TercerOp, Sign, auxiliar;

    Calc() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cont = getContentPane();
        setLayout(null);
        setTitle("Calc++");
        setSize(1100, 500);

        Instanciando();
        settingBounds();
        adding2Code();
        dandoPower();
        setVisible(true);

    }

    void construyePanelSup() {
        panelSuperior = new JPanel();
        panelSuperior.setLayout(new FlowLayout());
        Resultado = new JTextField(20);
        panelSuperior.add(Resultado);
    }

    public void Instanciando() {
        panelInferior = new JPanel();
        panelInferior.setLayout(new GridLayout(5, 4, 8, 8));
        RTC = new JButton("RTC");
        CE = new JButton("CE");
        CL = new JButton("CL");
        Signo = new JButton("+/-");
        Division = new JButton("/");
        Multiplicacion = new JButton("x");
        Menos = new JButton("-");
        Mas = new JButton("+");
        Igual = new JButton("=");
        Punto = new JButton(".");
        Boton1 = new JButton("1");
        Boton2 = new JButton("2");
        Boton3 = new JButton("3");
        Boton4 = new JButton("4");
        Boton5 = new JButton("5");
        Boton6 = new JButton("6");
        Boton7 = new JButton("7");
        Boton8 = new JButton("8");
        Boton9 = new JButton("9");
        Boton0 = new JButton("0");
        Borrar = new JButton("Borrar");
        Resultado = new JTextField("");
        Texto = new JLabel("Basic Calculator");
        Texto.setBounds(510, 15, 200, 50);
        Font m = new Font("Arial", Font.BOLD, 16);
        Texto.setFont(m);
    }

    public void settingBounds() {

        //Entrada.setBounds(350, 70, 100, 40);
        Resultado.setBounds(350, 70, 415, 40);

        Boton1.setBounds(350, 220, 100, 40);
        Boton2.setBounds(455, 220, 100, 40);
        Boton3.setBounds(560, 220, 100, 40);
        Boton4.setBounds(350, 170, 100, 40);
        Boton5.setBounds(455, 170, 100, 40);
        Boton6.setBounds(560, 170, 100, 40);
        Boton7.setBounds(350, 120, 100, 40);
        Boton8.setBounds(455, 120, 100, 40);
        Boton9.setBounds(560, 120, 100, 40);
        Boton0.setBounds(350, 270, 100, 40);
        Punto.setBounds(455, 270, 100, 40);
        Igual.setBounds(560, 270, 100, 40);

        Mas.setBounds(665, 120, 100, 40);
        Menos.setBounds(665, 170, 100, 40);
        Multiplicacion.setBounds(665, 220, 100, 40);
        Division.setBounds(665, 270, 100, 40);

        RTC.setBounds(350, 320, 150, 40);
        CE.setBounds(505, 320, 155, 40);
        CL.setBounds(665, 320, 100, 90);
        Signo.setBounds(350, 370, 150, 40);
        Borrar.setBounds(505, 370, 155, 40);
        //655
    }

    public void adding2Code() {

        add(Mas);
        add(Menos);
        add(Multiplicacion);
        add(Division);
        add(Igual);
        add(Punto);

        add(Texto);
        add(Resultado);
        add(RTC);
        add(CE);
        add(CL);
        add(Signo);
        add(Borrar);
        add(Boton1);
        add(Boton2);
        add(Boton3);
        add(Boton4);
        add(Boton5);
        add(Boton6);
        add(Boton7);
        add(Boton8);
        add(Boton9);
        add(Boton0);

    }

    public static boolean asPunto(String a) {
        boolean Res;
        int i = 0;
        Res = false;
        for (; i < a.length(); i++) {
            if (a.substring(i, i + 1).equals(".")) {
                Res = true;
                break;
            }

        }
        return Res;
    }

    public void dandoPower() {
        RTC.addActionListener(this);
        CE.addActionListener(this);
        CL.addActionListener(this);
        Signo.addActionListener(this);
        Division.addActionListener(this);
        Multiplicacion.addActionListener(this);
        Menos.addActionListener(this);
        Mas.addActionListener(this);
        Igual.addActionListener(this);
        Punto.addActionListener(this);
        Boton1.addActionListener(this);
        Boton2.addActionListener(this);
        Boton3.addActionListener(this);
        Boton4.addActionListener(this);
        Boton5.addActionListener(this);
        Boton6.addActionListener(this);
        Boton7.addActionListener(this);
        Boton8.addActionListener(this);
        Boton9.addActionListener(this);
        Boton0.addActionListener(this);
        Borrar.addActionListener(this);
        Resultado.addActionListener(this);
    }

    public static String Calculando(String PrimerOp, String SegundOp, String Sign) {
        String ans;
        Double Res = 0.0;
        if (Sign.equals("-")) {
            Res = Double.parseDouble(PrimerOp) - Double.parseDouble(SegundOp);
        }
        if (Sign.equals("+")) {
            Res = Double.parseDouble(PrimerOp) + Double.parseDouble(SegundOp);
        }
        if (Sign.equals("x")) {
            Res = Double.parseDouble(PrimerOp) * Double.parseDouble(SegundOp);
        }
        if (Sign.equals("/")) {
            Res = Double.parseDouble(PrimerOp) / Double.parseDouble(SegundOp);
        }
        ans = Res.toString();
        return ans;
    }

    public static void main(String[] args) {
        new Calc();
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == Boton0) {
                Resultado.setText(Resultado.getText() + "0");
            }
            if (e.getSource() == Boton1) {
                Resultado.setText(Resultado.getText() + "1");
            }
            if (e.getSource() == Boton2) {
                Resultado.setText(Resultado.getText() + "2");
            }
            if (e.getSource() == Boton3) {
                Resultado.setText(Resultado.getText() + "3");
            }
            if (e.getSource() == Boton4) {
                Resultado.setText(Resultado.getText() + "4");
            }
            if (e.getSource() == Boton5) {
                Resultado.setText(Resultado.getText() + "5");
            }
            if (e.getSource() == Boton6) {
                Resultado.setText(Resultado.getText() + "6");
            }
            if (e.getSource() == Boton7) {
                Resultado.setText(Resultado.getText() + "7");
            }
            if (e.getSource() == Boton8) {
                Resultado.setText(Resultado.getText() + "8");
            }
            if (e.getSource() == Boton9) {
                Resultado.setText(Resultado.getText() + "9");
            }

            if (e.getSource() == Punto) {
                auxiliar = Resultado.getText();
                if (auxiliar.length() <= 0) {
                    Resultado.setText("0.");
                } else {
                    if (!asPunto(Resultado.getText())) {
                        Resultado.setText(Resultado.getText() + " . ");
                    }
                }
            }

            if (e.getSource() == Borrar) {
                String c;
                c = Resultado.getText();

                if (c.length() > 0) {
                    c = c.substring(0, c.length() - 1);
                    Resultado.setText(c);
                }
            }

            if (e.getSource() == CE) {
                Resultado.setText("");
            }

            if (e.getSource() == Mas) {
                if (!(Resultado.getText().equals(""))) {
                    PrimerOp = Resultado.getText();
                    Sign = "+";
                    Resultado.setText("");
                }
            }

            if (e.getSource() == Menos) {
                if (!(Resultado.getText().equals(""))) {
                    PrimerOp = Resultado.getText();
                    Sign = "-";
                    Resultado.setText("");
                }
            }

            if (e.getSource() == Multiplicacion) {
                if (!(Resultado.getText().equals(""))) {
                    PrimerOp = Resultado.getText();
                    Sign = "x";
                    Resultado.setText("");
                }
            }

            if (e.getSource() == Division) {
                if (!(Resultado.getText().equals(""))) {
                    PrimerOp = Resultado.getText();
                    Sign = "/";
                    Resultado.setText("");
                }
            }

            if (e.getSource() == Igual) {
                String c;
                SegundOp = Resultado.getText();

                if (!(SegundOp.equals(""))) {
                    c = Calculando(PrimerOp, SegundOp, Sign);
                    Resultado.setText(c);
                }
            }

            if (e.getSource() == Signo) {
                Double n;
                String c;
                c = Resultado.getText();
                if (c.length() > 0) {
                    n = (-1) * Double.parseDouble(c);
                    Resultado.setText(n.toString());

                }

            }

        } catch (Exception df) {
            System.out.println("Error " + df);

        }

    }
}

