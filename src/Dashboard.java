import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

class Dashboard extends JFrame {

    public Dashboard() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/Imagenees/this_is_pure-removebg-preview.png")));
        getContentPane().setBackground(new Color(175, 238, 238));
        setTitle("Cuadro de Mando");
        setSize(1024, 768);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[] {100, 0, 0};
        gridBagLayout.rowHeights = new int[] {0, 0, 10, 30, 0};
        gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
        getContentPane().setLayout(gridBagLayout);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 191, 255));
        panel_1.setBorder(new LineBorder(new Color(100, 149, 237), 3, true));
        GridBagConstraints gbc_panel_1 = new GridBagConstraints();
        gbc_panel_1.fill = GridBagConstraints.BOTH;
        gbc_panel_1.insets = new Insets(0, 0, 5, 5);
        gbc_panel_1.gridx = 0;
        gbc_panel_1.gridy = 0;
        getContentPane().add(panel_1, gbc_panel_1);
        panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
                        
        JLabel BienvenidoLabel = new JLabel("Bienvenido a tu perfil!");
        BienvenidoLabel.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 22));
        BienvenidoLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        BienvenidoLabel.setForeground(Color.BLACK);
        panel_1.add(BienvenidoLabel);
        
        JButton btnInformes = new JButton("Generar Informes");
        btnInformes.setFont(new Font("Segoe UI Historic", Font.PLAIN, 11));
        btnInformes.setBorder(new LineBorder(new Color(0, 0, 128), 3, true));
        btnInformes.setBackground(new Color(143, 188, 143));
        GridBagConstraints gbc_btnInformes = new GridBagConstraints();
        gbc_btnInformes.weightx = 0.015;
        gbc_btnInformes.fill = GridBagConstraints.BOTH;
        gbc_btnInformes.insets = new Insets(0, 0, 5, 5);
        gbc_btnInformes.gridx = 1;
        gbc_btnInformes.gridy = 0;
        getContentPane().add(btnInformes, gbc_btnInformes);
        
        JButton btnCerrarSesion = new JButton("Cerrar Sesion");
        btnCerrarSesion.setBounds(new Rectangle(0, 0, 23, 0));
        btnCerrarSesion.setBorder(new LineBorder(new Color(0, 0, 128), 2, true));
        btnCerrarSesion.setBackground(new Color(102, 205, 170));
        btnCerrarSesion.setFocusable(false);
        btnCerrarSesion.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17)); 
        GridBagConstraints gbc_btnCerrarSesion = new GridBagConstraints();
        gbc_btnCerrarSesion.weightx = 0.2;
        gbc_btnCerrarSesion.fill = GridBagConstraints.BOTH;
        gbc_btnCerrarSesion.insets = new Insets(0, 0, 5, 0);
        gbc_btnCerrarSesion.gridx = 2;
        gbc_btnCerrarSesion.gridy = 0;
        getContentPane().add(btnCerrarSesion, gbc_btnCerrarSesion);
        btnCerrarSesion.setAlignmentX(Component.RIGHT_ALIGNMENT);
        btnCerrarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                Login login = new Login();
                login.setVisible(true);
            }
        });

        //panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(176, 224, 230));
        GridBagConstraints gbc_panelPrincipal = new GridBagConstraints();
        gbc_panelPrincipal.insets = new Insets(0, 0, 5, 0);
        gbc_panelPrincipal.fill = GridBagConstraints.BOTH;
        gbc_panelPrincipal.gridx = 0;
        gbc_panelPrincipal.gridy = 1;
        gbc_panelPrincipal.gridwidth = 3;
        getContentPane().add(panelPrincipal, gbc_panelPrincipal);
        GridBagLayout gbl_panelPrincipal = new GridBagLayout();
        gbl_panelPrincipal.rowWeights = new double[]{0.0, 1.0};
        gbl_panelPrincipal.columnWeights = new double[]{0.0, 1.0};
        panelPrincipal.setLayout(gbl_panelPrincipal);

        //foto de perfil de Nicolas Cage
        JLabel label = new JLabel("");
        label.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
        label.setIcon(new ImageIcon(Dashboard.class.getResource("/Imagenees/ar33qcWbEgREn07ZpXv5Pbj8hbM.png")));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        GridBagConstraints gbc_label = new GridBagConstraints();
        gbc_label.insets = new Insets(0, 0, 5, 5);
        gbc_label.gridx = 0;
        gbc_label.gridy = 0;
        panelPrincipal.add(label, gbc_label);

        //panel debajo de la imagen para Nicolas Cage
        JPanel nombrePanel = new JPanel();
        nombrePanel.setBackground(new Color(255, 228, 225));
        nombrePanel.setBorder(new LineBorder(new Color(160, 82, 45), 2, true));
        GridBagConstraints gbc_nombrePanel = new GridBagConstraints();
        gbc_nombrePanel.fill = GridBagConstraints.HORIZONTAL;
        gbc_nombrePanel.gridx = 0;
        gbc_nombrePanel.gridy = 1;
        gbc_nombrePanel.insets = new Insets(5, 0, 0, 5);
        panelPrincipal.add(nombrePanel, gbc_nombrePanel);

        JLabel nombreLabel = new JLabel("Nicolas Cage");
        nombreLabel.setForeground(new Color(0, 0, 139));
        nombrePanel.add(nombreLabel);

        //pongo un apartado de noticias
        JPanel noticias = new JPanel();
        noticias.setBackground(new Color(204, 255, 204));
        noticias.setBorder(new LineBorder(new Color(60, 179, 113), 5, true));
        GridBagConstraints gbc_noticias = new GridBagConstraints();
        gbc_noticias.insets = new Insets(0, 0, 5, 0);
        gbc_noticias.gridx = 1;
        gbc_noticias.gridy = 0;
        gbc_noticias.fill = GridBagConstraints.BOTH; 
        gbc_noticias.weightx = 1.0; 
        panelPrincipal.add(noticias, gbc_noticias);
        noticias.setLayout(new BorderLayout());

        JLabel noticiasLabel = new JLabel("Noticias");
        noticiasLabel.setBackground(new Color(153, 204, 153));
        noticiasLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
        noticiasLabel.setHorizontalAlignment(SwingConstants.CENTER);
        noticias.add(noticiasLabel, BorderLayout.NORTH);

        //noticias para rellenar
        JTextArea noticiasTextArea = new JTextArea();
        noticiasTextArea.setBackground(new Color(153, 204, 153));
        noticiasTextArea.setEditable(false);
        noticiasTextArea.setLineWrap(true);
        noticiasTextArea.setWrapStyleWord(true);
        noticiasTextArea.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
        noticiasTextArea.setText(
            "Noticias recientes:\n" +
            "- Evento de tecnología en la ciudad: 15 de octubre.\n" +
            "- Actualización del software de seguridad lanzada ayer.\n" +
            "- Importantes cambios en la industria energética.\n" +
            "- Nueva película de Nicolas Cage llega a los cines la próxima semana.\n" +
            "- Últimas tendencias en inteligencia artificial y aprendizaje automático."
        );
        JScrollPane noticiasScrollPane = new JScrollPane(noticiasTextArea);
        noticias.add(noticiasScrollPane, BorderLayout.CENTER);
        
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 102, 102), 4, true));
        panel.setBackground(new Color(153, 204, 204));
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.gridx = 1;
        gbc_panel.gridy = 1;
        panelPrincipal.add(panel, gbc_panel);
        
        JLabel lblGifMar = new JLabel("");
        lblGifMar.setIcon(new ImageIcon(Dashboard.class.getResource("/Imagenees/23-10-46-542_512-ezgif.com-resize2.gif")));
        panel.add(lblGifMar);

        JPanel panel_2 = new JPanel();
        GridBagConstraints gbc_panel_2 = new GridBagConstraints();
        gbc_panel_2.insets = new Insets(0, 0, 5, 0);
        gbc_panel_2.fill = GridBagConstraints.BOTH;
        gbc_panel_2.gridx = 0;
        gbc_panel_2.gridy = 2;
        gbc_panel_2.gridwidth = 3; 
        getContentPane().add(panel_2, gbc_panel_2);
        panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));

        //un apartado para publicar cosas y decir lo que estas haciendo
        JInternalFrame internalFrame = new JInternalFrame("Estado");
        internalFrame.setForeground(new Color(175, 238, 238));
        internalFrame.setFrameIcon(null);
        panel_2.add(internalFrame);
        internalFrame.getContentPane().setLayout(new BoxLayout(internalFrame.getContentPane(), BoxLayout.X_AXIS));

        JEditorPane editorPane = new JEditorPane();
        editorPane.setBackground(new Color(224, 255, 255));
        internalFrame.getContentPane().add(editorPane);

        JPanel panel_3 = new JPanel();
        GridBagConstraints gbc_panel_3 = new GridBagConstraints();
        gbc_panel_3.fill = GridBagConstraints.BOTH;
        gbc_panel_3.gridx = 0;
        gbc_panel_3.gridy = 3;
        gbc_panel_3.gridwidth = 3;
        getContentPane().add(panel_3, gbc_panel_3);
        panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.X_AXIS));

        JPanel panel_4 = new JPanel();
        panel_4.setBorder(new LineBorder(new Color(147, 112, 219), 5, true));
        panel_4.setBackground(new Color(72, 61, 139));
        panel_3.add(panel_4);
        panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));
        
        JLabel lblpublicidad = new JLabel("");
        lblpublicidad.setIcon(new ImageIcon(Dashboard.class.getResource("/Imagenees/dd2c9e089b2ff3d1abb56fecd529e3f6.gif")));
        panel_4.add(lblpublicidad);

        //bandeja de entrada donde te llegaran mensajes
        JTextPane txtpnBandejaDeEntrada = new JTextPane();
        txtpnBandejaDeEntrada.setBackground(new Color(230, 230, 250));
        txtpnBandejaDeEntrada.setEditable(false);
        txtpnBandejaDeEntrada.setBorder(new LineBorder(new Color(224, 255, 255), 3, true));
        txtpnBandejaDeEntrada.setFont(new Font("Quicksand", Font.PLAIN, 12));
        txtpnBandejaDeEntrada.setText("Bandeja de entrada:\n\n"
            + "1. Quieres consejos de como mejorar tu horario para ser mas productivo? Picha aqui!.\n"
            + "2. Respuesta a tu mensaje: Como hacer una tarta de manzana.\n"
            + "3. Recordatorio: presentación de avance de proyecto el viernes.\n"
            + "4. Nuevas políticas de seguridad implementadas.\n"
            + "5. Mensaje de seguridad: Nuevo inicio de sesion detectado.");
        panel_4.add(txtpnBandejaDeEntrada);
        internalFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
}
