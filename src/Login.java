import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

public class Login extends JFrame {

    private JLabel logoLabel;
    private ImageIcon logoIcon;
    private Image logoImage;
    private JTextField campoEmail;
    private JPasswordField contrasena;
    private JCheckBox sesionIniciada;
    private JButton loginButton;
    private JButton olvideContrasena;
    private double aspectRatio;
    private JButton btnMenu;
    JPanel barra;

    public Login() {
    	setResizable(false);
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Imagenees/this_is_pure-removebg-preview.png")));
        setTitle("Inicio Sesion");
        setSize(804, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(173, 216, 230));
        getContentPane().add(panel);

        logoIcon = new ImageIcon(Login.class.getResource("/Imagenees/this_is_pure-removebg-preview.png"));
        
        btnMenu = new JButton("MENU");
        btnMenu.setBackground(new Color(173, 216, 230));
        btnMenu.setFocusable(false);
        btnMenu.setBorder(new CompoundBorder(new LineBorder(new Color(0, 191, 255), 2, true), null));
        btnMenu.setBounds(10, 11, 129, 40);
        panel.add(btnMenu);

        campoEmail = new JTextField("Correo electrónico");
        campoEmail.setBounds(461, 150, 240, 30);
        panel.add(campoEmail);

        contrasena = new JPasswordField("Contraseña");
        contrasena.addFocusListener(new FocusAdapter() {
        });
        contrasena.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        contrasena.setBounds(461, 195, 240, 30);
        panel.add(contrasena);

        sesionIniciada = new JCheckBox("Mantener sesión iniciada la próxima vez");
        sesionIniciada.setBounds(461, 245, 240, 20);
        panel.add(sesionIniciada);

        loginButton = new JButton("Iniciar Sesión");
        loginButton.setBounds(504, 291, 120, 30);
        panel.add(loginButton);

        olvideContrasena = new JButton("¿Olvidó la contraseña?");
        olvideContrasena.setBounds(375, 332, 384, 20);
        olvideContrasena.setBorderPainted(false);
        olvideContrasena.setContentAreaFilled(false);
        olvideContrasena.setFocusPainted(false);
        olvideContrasena.setForeground(Color.BLUE);
        panel.add(olvideContrasena);
        
        
        logoLabel = new JLabel();
        logoLabel.setIcon(new ImageIcon(Login.class.getResource("/Imagenees/this_is_pure-removebg-preview.png")));
        logoLabel.setBounds(0, 0, 462, 461);
        panel.add(logoLabel);
        
        barra = new JPanel();
        barra.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        barra.setBackground(new Color(95, 158, 160));
        barra.setBounds(0, 0, 788, 67);
        panel.add(barra);

        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent evt) {
                
            }
        });

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dashboard dash = new Dashboard();
                dash.setVisible(true);
                dispose();
            }
        });
    }

    

    public static void main(String[] args) {
        Login loginFrame = new Login();
        loginFrame.setVisible(true);
    }
}
