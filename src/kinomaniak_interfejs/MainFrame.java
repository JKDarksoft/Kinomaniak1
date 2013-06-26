
package kinomaniak_interfejs;

//import java.awt.Dimension;
import java.awt.GridLayout;
//import java.awt.Toolkit;
//import java.awt.event.ActionEvent;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
//import java.util.ArrayList;
//import javax.swing.JButton;
//import javax.swing.JFrame;
import javax.swing.JToggleButton;
import kinomaniak_z_interfejsem.Klient2;



/**
 *
 * @author JK
 */
public class MainFrame extends javax.swing.JFrame {
    
    KinomaniakInterface kin = new Klient2();

    public MainFrame() {
        
        super("KINOMANIAK");
        
        
        

//        Toolkit zestaw = Toolkit.getDefaultToolkit();
//        Dimension wymiary = zestaw.getScreenSize();
//        int screenHight = wymiary.height;
//        int screenWidth = wymiary.width;
//        
//        int framePosX = (screenHight/2)-100;
//        int framePosY = (screenWidth/2)-150;
        
        setResizable(false);
        this.setLocation(0, 0);
        
        
        initComponents();
   
        PanelLoginOK.setVisible(false);
        PanelLoginError.setVisible(false);
        PanelMainMenu.setVisible(false);
        PanelRezerwacja.setVisible(false);
        PanelLogin.setVisible(false);
        PanelOdbierz.setVisible(false);
        PanelSala.setVisible(false);
        PanelAnuluj.setVisible(false);
        PanelRezerwacjaOK.setVisible(false);
        
        PanelLogin.setVisible(true);
        ButtonZaloguj.setVisible(true);
        ButtonWyjscie.setVisible(true);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        PanelLogin = new javax.swing.JPanel();
        ButtonZaloguj = new javax.swing.JButton();
        ButtonWyjscie = new javax.swing.JButton();
        TxtFieldLogin = new javax.swing.JTextField();
        TxtFieldPassword = new javax.swing.JPasswordField();
        LabelLogin = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();
        PanelLoginOK = new javax.swing.JPanel();
        LabelLoginOK = new javax.swing.JLabel();
        ButtonLoginOK = new javax.swing.JButton();
        PanelLoginError = new javax.swing.JPanel();
        LabelLoginError = new javax.swing.JLabel();
        ButtonLoginError = new javax.swing.JButton();
        PanelMainMenu = new javax.swing.JPanel();
        ButtonMainRezerwuj = new javax.swing.JButton();
        ButtonMainOdbierz = new javax.swing.JButton();
        ButtonMainAnuluj = new javax.swing.JButton();
        ButtonMainWyjscie = new javax.swing.JButton();
        PanelRezerwacja = new javax.swing.JPanel();
        LabelRezerwacjaImNaz = new javax.swing.JLabel();
        ButtonRezerwacjaPrzejdz = new javax.swing.JButton();
        ButtonRezerwacjaAnuluj = new javax.swing.JButton();
        ScrollListRezerwacjaSeanse = new javax.swing.JScrollPane();
        ListRezerwacjaSeanse = new javax.swing.JList();
        TxtFieldRezerwacjaImNaz = new javax.swing.JTextField();
        LabelRezerwacjaSeans = new javax.swing.JLabel();
        LabelRezerwacjaKomunikat = new javax.swing.JLabel();
        PanelSala = new javax.swing.JPanel();
        PanelMiejsca = new javax.swing.JPanel();
        ButtonSalaZatwierdz = new javax.swing.JButton();
        ButtonSalaPowrot = new javax.swing.JButton();
        PanelOdbierz = new javax.swing.JPanel();
        LabelOdbierzNazwisko = new javax.swing.JLabel();
        TxtFieldOdbierzNazwisko = new javax.swing.JTextField();
        ButtonOdbierzOdbierz = new javax.swing.JButton();
        ButtonOdbierzPowrot = new javax.swing.JButton();
        LabelOdbierzKomunikat = new javax.swing.JLabel();
        PanelAnuluj = new javax.swing.JPanel();
        LabelAnulujNazwisko = new javax.swing.JLabel();
        TxtFieldAnulujNazwisko = new javax.swing.JTextField();
        ButtonAnulujAnuluj = new javax.swing.JButton();
        ButtonAnulujPowrot = new javax.swing.JButton();
        LabelAnulujKomunikat = new javax.swing.JLabel();
        PanelRezerwacjaOK = new javax.swing.JPanel();
        ButtonRezerwacjaOK = new javax.swing.JButton();
        LabelRezerwacjaOK = new javax.swing.JLabel();
        PanelSala3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelLogin.setPreferredSize(new java.awt.Dimension(800, 600));

        ButtonZaloguj.setText("ZALOGUJ");
        ButtonZaloguj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonZalogujActionPerformed(evt);
            }
        });

        ButtonWyjscie.setText("WYJSCIE");
        ButtonWyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonWyjscieActionPerformed(evt);
            }
        });

        TxtFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldLoginActionPerformed(evt);
            }
        });
        TxtFieldLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtFieldLoginKeyPressed(evt);
            }
        });

        TxtFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldPasswordActionPerformed(evt);
            }
        });

        LabelLogin.setText("LOGIN");

        LabelPassword.setText("HASLO");

        javax.swing.GroupLayout PanelLoginLayout = new javax.swing.GroupLayout(PanelLogin);
        PanelLogin.setLayout(PanelLoginLayout);
        PanelLoginLayout.setHorizontalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TxtFieldPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(TxtFieldLogin, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonWyjscie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonZaloguj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );
        PanelLoginLayout.setVerticalGroup(
            PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginLayout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonZaloguj)
                    .addComponent(LabelLogin)
                    .addComponent(TxtFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(PanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPassword)
                    .addComponent(TxtFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonWyjscie))
                .addGap(263, 263, 263))
        );

        PanelLogin.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(PanelLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PanelLoginOK.setPreferredSize(new java.awt.Dimension(800, 600));

        LabelLoginOK.setText("Logowanie zakonczylo sie zakakujacym sukcesem!");

        ButtonLoginOK.setText("OK");
        ButtonLoginOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoginOKLayout = new javax.swing.GroupLayout(PanelLoginOK);
        PanelLoginOK.setLayout(PanelLoginOKLayout);
        PanelLoginOKLayout.setHorizontalGroup(
            PanelLoginOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginOKLayout.createSequentialGroup()
                .addGroup(PanelLoginOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLoginOKLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(LabelLoginOK, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLoginOKLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(ButtonLoginOK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        PanelLoginOKLayout.setVerticalGroup(
            PanelLoginOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginOKLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(LabelLoginOK)
                .addGap(45, 45, 45)
                .addComponent(ButtonLoginOK)
                .addContainerGap(280, Short.MAX_VALUE))
        );

        PanelLoginOK.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(PanelLoginOK, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PanelLoginError.setPreferredSize(new java.awt.Dimension(800, 600));

        LabelLoginError.setText("Zła nazwa uzytkownika lub haslo! Sprobuj jeszcze raz.");

        ButtonLoginError.setText("OK");
        ButtonLoginError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginErrorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLoginErrorLayout = new javax.swing.GroupLayout(PanelLoginError);
        PanelLoginError.setLayout(PanelLoginErrorLayout);
        PanelLoginErrorLayout.setHorizontalGroup(
            PanelLoginErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLoginErrorLayout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(LabelLoginError, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addGroup(PanelLoginErrorLayout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(ButtonLoginError, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLoginErrorLayout.setVerticalGroup(
            PanelLoginErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLoginErrorLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(LabelLoginError)
                .addGap(66, 66, 66)
                .addComponent(ButtonLoginError)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        PanelLoginError.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(PanelLoginError, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PanelMainMenu.setPreferredSize(new java.awt.Dimension(800, 600));

        ButtonMainRezerwuj.setText("Rezerwuj");
        ButtonMainRezerwuj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMainRezerwujActionPerformed(evt);
            }
        });

        ButtonMainOdbierz.setText("Odbierz rezerwacje");
        ButtonMainOdbierz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMainOdbierzActionPerformed(evt);
            }
        });

        ButtonMainAnuluj.setText("Anuluj rezerwacje");
        ButtonMainAnuluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMainAnulujActionPerformed(evt);
            }
        });

        ButtonMainWyjscie.setText("Wyjscie");
        ButtonMainWyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMainWyjscieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMainMenuLayout = new javax.swing.GroupLayout(PanelMainMenu);
        PanelMainMenu.setLayout(PanelMainMenuLayout);
        PanelMainMenuLayout.setHorizontalGroup(
            PanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainMenuLayout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addGroup(PanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonMainOdbierz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonMainRezerwuj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonMainAnuluj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonMainWyjscie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        PanelMainMenuLayout.setVerticalGroup(
            PanelMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMainMenuLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(ButtonMainRezerwuj)
                .addGap(65, 65, 65)
                .addComponent(ButtonMainOdbierz)
                .addGap(69, 69, 69)
                .addComponent(ButtonMainAnuluj)
                .addGap(69, 69, 69)
                .addComponent(ButtonMainWyjscie)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        PanelMainMenu.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(PanelMainMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PanelRezerwacja.setPreferredSize(new java.awt.Dimension(800, 600));

        LabelRezerwacjaImNaz.setText("---- Imie i Nazwisko -----------------------------------------------------");

        ButtonRezerwacjaPrzejdz.setText("Przejdz do sali");
        ButtonRezerwacjaPrzejdz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRezerwacjaPrzejdzActionPerformed(evt);
            }
        });

        ButtonRezerwacjaAnuluj.setText("Powrot");
        ButtonRezerwacjaAnuluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRezerwacjaAnulujActionPerformed(evt);
            }
        });

        ListRezerwacjaSeanse.setModel(new javax.swing.AbstractListModel() {

            String[] strings = Start.movnames;
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ScrollListRezerwacjaSeanse.setViewportView(ListRezerwacjaSeanse);

        TxtFieldRezerwacjaImNaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldRezerwacjaImNazActionPerformed(evt);
            }
        });

        LabelRezerwacjaSeans.setText("---- Seans ----------------------------------------------------------------");

        javax.swing.GroupLayout PanelRezerwacjaLayout = new javax.swing.GroupLayout(PanelRezerwacja);
        PanelRezerwacja.setLayout(PanelRezerwacjaLayout);
        PanelRezerwacjaLayout.setHorizontalGroup(
            PanelRezerwacjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRezerwacjaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRezerwacjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRezerwacjaLayout.createSequentialGroup()
                        .addComponent(ScrollListRezerwacjaSeanse)
                        .addGap(18, 18, 18)
                        .addGroup(PanelRezerwacjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonRezerwacjaPrzejdz, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(ButtonRezerwacjaAnuluj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelRezerwacjaLayout.createSequentialGroup()
                        .addGroup(PanelRezerwacjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelRezerwacjaSeans, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(LabelRezerwacjaImNaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtFieldRezerwacjaImNaz))
                        .addGap(83, 83, 83)
                        .addComponent(LabelRezerwacjaKomunikat, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelRezerwacjaLayout.setVerticalGroup(
            PanelRezerwacjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRezerwacjaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelRezerwacjaImNaz)
                .addGap(18, 18, 18)
                .addGroup(PanelRezerwacjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFieldRezerwacjaImNaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRezerwacjaKomunikat))
                .addGap(48, 48, 48)
                .addComponent(LabelRezerwacjaSeans)
                .addGap(27, 27, 27)
                .addGroup(PanelRezerwacjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollListRezerwacjaSeanse, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addGroup(PanelRezerwacjaLayout.createSequentialGroup()
                        .addComponent(ButtonRezerwacjaPrzejdz)
                        .addGap(85, 85, 85)
                        .addComponent(ButtonRezerwacjaAnuluj)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PanelRezerwacja.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(PanelRezerwacja, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PanelSala.setPreferredSize(new java.awt.Dimension(800, 600));

        PanelMiejsca.setLayout(new java.awt.GridLayout(10, 10));

        ButtonSalaZatwierdz.setText("Zatwierdz");
        ButtonSalaZatwierdz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalaZatwierdzActionPerformed(evt);
            }
        });

        ButtonSalaPowrot.setText("Powrot");
        ButtonSalaPowrot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalaPowrotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSalaLayout = new javax.swing.GroupLayout(PanelSala);
        PanelSala.setLayout(PanelSalaLayout);
        PanelSalaLayout.setHorizontalGroup(
            PanelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelMiejsca, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(PanelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonSalaZatwierdz, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(ButtonSalaPowrot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        PanelSalaLayout.setVerticalGroup(
            PanelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSalaLayout.createSequentialGroup()
                .addGroup(PanelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSalaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelMiejsca, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelSalaLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(ButtonSalaZatwierdz)
                        .addGap(116, 116, 116)
                        .addComponent(ButtonSalaPowrot)))
                .addContainerGap())
        );

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){

                //javax.swing.JButton ButtonSeat = new javax.swing.JButton();

                String nr = Integer.toString(i);
                this.add(new javax.swing.JButton(nr));

            }

        }

        this.revalidate();
        this.repaint();

        PanelSala.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(PanelSala, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PanelOdbierz.setPreferredSize(new java.awt.Dimension(800, 600));

        LabelOdbierzNazwisko.setText("Imie i nazwisko");

        ButtonOdbierzOdbierz.setText("Odbierz rezerwacje");
        ButtonOdbierzOdbierz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOdbierzOdbierzActionPerformed(evt);
            }
        });

        ButtonOdbierzPowrot.setText("Powrot");
        ButtonOdbierzPowrot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOdbierzPowrotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelOdbierzLayout = new javax.swing.GroupLayout(PanelOdbierz);
        PanelOdbierz.setLayout(PanelOdbierzLayout);
        PanelOdbierzLayout.setHorizontalGroup(
            PanelOdbierzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOdbierzLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(PanelOdbierzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelOdbierzNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFieldOdbierzNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelOdbierzLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(PanelOdbierzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonOdbierzOdbierz, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(ButtonOdbierzPowrot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(LabelOdbierzKomunikat, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        PanelOdbierzLayout.setVerticalGroup(
            PanelOdbierzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelOdbierzLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(LabelOdbierzNazwisko)
                .addGap(18, 18, 18)
                .addComponent(TxtFieldOdbierzNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(ButtonOdbierzOdbierz)
                .addGap(76, 76, 76)
                .addComponent(ButtonOdbierzPowrot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(LabelOdbierzKomunikat)
                .addGap(154, 154, 154))
        );

        PanelOdbierz.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(PanelOdbierz, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PanelAnuluj.setPreferredSize(new java.awt.Dimension(800, 600));

        LabelAnulujNazwisko.setText("Imie i nazwisko");

        TxtFieldAnulujNazwisko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldAnulujNazwiskoActionPerformed(evt);
            }
        });

        ButtonAnulujAnuluj.setText("Anuluj rezerwacje");
        ButtonAnulujAnuluj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnulujAnulujActionPerformed(evt);
            }
        });

        ButtonAnulujPowrot.setText("Powrot");
        ButtonAnulujPowrot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnulujPowrotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAnulujLayout = new javax.swing.GroupLayout(PanelAnuluj);
        PanelAnuluj.setLayout(PanelAnulujLayout);
        PanelAnulujLayout.setHorizontalGroup(
            PanelAnulujLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAnulujLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(PanelAnulujLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelAnulujNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFieldAnulujNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAnulujLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(PanelAnulujLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonAnulujAnuluj, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(ButtonAnulujPowrot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(LabelAnulujKomunikat, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        PanelAnulujLayout.setVerticalGroup(
            PanelAnulujLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAnulujLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(LabelAnulujNazwisko)
                .addGap(18, 18, 18)
                .addComponent(TxtFieldAnulujNazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(ButtonAnulujAnuluj)
                .addGap(76, 76, 76)
                .addComponent(ButtonAnulujPowrot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(LabelAnulujKomunikat)
                .addGap(154, 154, 154))
        );

        PanelAnuluj.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(PanelAnuluj, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PanelRezerwacjaOK.setPreferredSize(new java.awt.Dimension(800, 600));

        ButtonRezerwacjaOK.setText("OK");
        ButtonRezerwacjaOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRezerwacjaOKActionPerformed(evt);
            }
        });

        LabelRezerwacjaOK.setText("Dokonano rezerwacji!");

        javax.swing.GroupLayout PanelRezerwacjaOKLayout = new javax.swing.GroupLayout(PanelRezerwacjaOK);
        PanelRezerwacjaOK.setLayout(PanelRezerwacjaOKLayout);
        PanelRezerwacjaOKLayout.setHorizontalGroup(
            PanelRezerwacjaOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRezerwacjaOKLayout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addGroup(PanelRezerwacjaOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonRezerwacjaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelRezerwacjaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        PanelRezerwacjaOKLayout.setVerticalGroup(
            PanelRezerwacjaOKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRezerwacjaOKLayout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addComponent(LabelRezerwacjaOK)
                .addGap(69, 69, 69)
                .addComponent(ButtonRezerwacjaOK)
                .addGap(255, 255, 255))
        );

        PanelRezerwacjaOK.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(PanelRezerwacjaOK, javax.swing.JLayeredPane.DEFAULT_LAYER);

        PanelSala3.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout PanelSala3Layout = new javax.swing.GroupLayout(PanelSala3);
        PanelSala3.setLayout(PanelSala3Layout);
        PanelSala3Layout.setHorizontalGroup(
            PanelSala3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        PanelSala3Layout.setVerticalGroup(
            PanelSala3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        PanelSala3.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(PanelSala3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonZalogujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonZalogujActionPerformed

         Start.wpisanyLogin = TxtFieldLogin.getText();
         Start.wpisaneHaslo = TxtFieldPassword.getText();
      
         
                  int log;
         
         
         log = kin.setLogin(Start.wpisanyLogin, Start.wpisaneHaslo);
         
         
         
         System.out.println(log);
         
         
         
         if (log==0){
         
         PanelLogin.setVisible(false);

         PanelLoginOK.setVisible(true);
         ButtonLoginOK.setVisible(true);
         LabelLoginOK.setVisible(true);
             
         
         
         }else{
             
            PanelLogin.setVisible(false);

            PanelLoginError.setVisible(true);
         PanelLoginError.setVisible(true);
         ButtonLoginError.setVisible(true);
         LabelLoginError.setVisible(true);
         
//            FrameLoginError flogerr = new FrameLoginError();
//            flogerr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            flogerr.setVisible(true);
             
         }
    }//GEN-LAST:event_ButtonZalogujActionPerformed

    private void ButtonWyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonWyjscieActionPerformed
        //kin.rozlacz();
        System.exit(0);
    }//GEN-LAST:event_ButtonWyjscieActionPerformed

    private void TxtFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldLoginActionPerformed
         Start.wpisanyLogin = TxtFieldLogin.getText();
    }//GEN-LAST:event_TxtFieldLoginActionPerformed

    private void TxtFieldLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFieldLoginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFieldLoginKeyPressed

    private void TxtFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldPasswordActionPerformed
        Start.wpisaneHaslo = TxtFieldLogin.getText();
    }//GEN-LAST:event_TxtFieldPasswordActionPerformed

    private void ButtonMainRezerwujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMainRezerwujActionPerformed
        PanelMainMenu.setVisible(false);
        PanelRezerwacja.setVisible(true);
        
        String[] shows = new String[kin.getShow().length];
        
        for(int i = 0;i<kin.getShow().length;i++){
            shows[i] = kin.getShow()[i].getFormatted()+" "+kin.getShow()[i].getMovie().getName();
        } 
    ListRezerwacjaSeanse.setListData((String[])shows);
    }//GEN-LAST:event_ButtonMainRezerwujActionPerformed

    private void ButtonMainAnulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMainAnulujActionPerformed
        
        PanelMainMenu.setVisible(false);
        PanelAnuluj.setVisible(true);
        
    }//GEN-LAST:event_ButtonMainAnulujActionPerformed

    private void ButtonMainWyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMainWyjscieActionPerformed
        
        PanelMainMenu.setVisible(false);
        //kin.rozlacz();
        System.exit(0);
        
        
    }//GEN-LAST:event_ButtonMainWyjscieActionPerformed

    private void ButtonMainOdbierzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMainOdbierzActionPerformed
        
        
        PanelMainMenu.setVisible(false);
        PanelOdbierz.setVisible(true);
        
        
        
    }//GEN-LAST:event_ButtonMainOdbierzActionPerformed

    
 
    
    
    private void ButtonRezerwacjaPrzejdzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRezerwacjaPrzejdzActionPerformed
        
        int sel = ListRezerwacjaSeanse.getSelectedIndex();
        if(sel < 0) return;
        if(TxtFieldRezerwacjaImNaz.getText().equals("")) {
            LabelRezerwacjaKomunikat.setText("Podaj nazwisko!");
            return;
        }
        
           for ( int i = 0; i < 10; i++){
       for (int j = 0; j < 10; j++) {
           
           Start.potencjalnieZarezerwowane[i][j] = 0;
           
            }
       }
        
        
        LabelRezerwacjaKomunikat.setText("");

        
        Start.ilMiejsc = 0;
        PanelRezerwacja.setVisible(false);
        PanelSala.setVisible(true);
       
        Start.idSeansu = kin.getShow()[sel].getID();
        
        System.out.println("Wybrano seans :"+Start.idSeansu);
        
        int zajeteMiejsca[][] = kin.czyZajete(Start.idSeansu);

        PanelMiejsca.setLayout(new GridLayout(10,10));
        
         

        Start.bindex = 0;
           
        
       
        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                

                Start.buttons.add( new JToggleButton(Integer.toString(Start.bindex+1)));
                PanelMiejsca.add(Start.buttons.get(Start.bindex)); 
                       
                Start.buttons.get(Start.bindex).addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSeatActionPerformed(evt);
            }
        });
                
                if (zajeteMiejsca[i][j] == 1){
                Start.buttons.get(Start.bindex).setEnabled(false);
                }else{
                Start.buttons.get(Start.bindex).setEnabled(true); 
                }
                 Start.bindex++;
           // }
        }
        PanelMiejsca.setSize(580, 580);
        PanelMiejsca.setVisible(true);
        }

        Start.seatsCreated=true;
        



  
        
    }//GEN-LAST:event_ButtonRezerwacjaPrzejdzActionPerformed
   
    private void ButtonSeatActionPerformed(java.awt.event.ActionEvent evt) { 
        Start.bindex=0;
        Start.ilMiejsc=0;
   for ( int i = 0; i < 10; i++){
       for (int j = 0; j < 10; j++) {
     
             

        if(Start.buttons.get(Start.bindex).isSelected()){
        
            Start.potencjalnieZarezerwowane[i][j] = 1;
            System.out.println("pot zar "+i+" "+j);
            
        }else{Start.potencjalnieZarezerwowane[i][j] = 0;}
        

        Start.bindex++;
        }
    }
   
   for ( int k = 0; k < 100; k++){
       if(Start.buttons.get(k).isSelected()){
           Start.ilMiejsc++;
       }
       
   }
  
        System.out.println("ilMiejsc "+Start.ilMiejsc);
        
   
}

    
    
    private void ButtonRezerwacjaAnulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRezerwacjaAnulujActionPerformed
        
        PanelRezerwacja.setVisible(false);
        PanelMainMenu.setVisible(true);
        
        
    }//GEN-LAST:event_ButtonRezerwacjaAnulujActionPerformed

    private void TxtFieldRezerwacjaImNazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldRezerwacjaImNazActionPerformed
        Start.imieNazRez = TxtFieldRezerwacjaImNaz.getText();
    }//GEN-LAST:event_TxtFieldRezerwacjaImNazActionPerformed

    private void ButtonLoginOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginOKActionPerformed
        
        PanelLoginOK.setVisible(false);
        PanelMainMenu.setVisible(true);
    }//GEN-LAST:event_ButtonLoginOKActionPerformed

    private void ButtonLoginErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginErrorActionPerformed
        
        PanelLoginError.setVisible(false);
        PanelLogin.setVisible(true);
        
    }//GEN-LAST:event_ButtonLoginErrorActionPerformed

    private void ButtonOdbierzPowrotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOdbierzPowrotActionPerformed
                LabelAnulujKomunikat.setText("");        
                PanelMainMenu.setVisible(true);
                PanelOdbierz.setVisible(false);
    }//GEN-LAST:event_ButtonOdbierzPowrotActionPerformed

    private void ButtonOdbierzOdbierzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOdbierzOdbierzActionPerformed
        String nazwisko = TxtFieldOdbierzNazwisko.getText();
        
        int czyOdebrano = kin.goToGetRes(nazwisko);
        
        if (czyOdebrano==0){
            LabelOdbierzKomunikat.setText("Odebrano rezerwacje!");
        }else{
            LabelOdbierzKomunikat.setText("Blad! Nie ma rezerwacji na to nazwisko!");
        }
        
    }//GEN-LAST:event_ButtonOdbierzOdbierzActionPerformed

    private void ButtonSalaZatwierdzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalaZatwierdzActionPerformed
        
    if(Start.ilMiejsc != 0){    
        int irytujacaZmienna = 0;
        int[][] irytujacaTablica = new int[Start.ilMiejsc][2];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (Start.potencjalnieZarezerwowane[i][j] == 1){
                    System.out.println(i+" "+j+" iryt przed "+irytujacaZmienna);
                    
                    irytujacaTablica[irytujacaZmienna][0]=i;
                    irytujacaTablica[irytujacaZmienna][1]=j;
                    irytujacaZmienna++;
                }
            }
            }              

        int czyZarezerwowano = kin.goToReserve(Start.imieNazRez, Start.idSeansu, irytujacaTablica); 
        System.out.println("skutek rezerwacji: "+czyZarezerwowano);
        
        PanelSala.setVisible(false);
        PanelRezerwacjaOK.setVisible(true);
        ButtonRezerwacjaOK.setVisible(true);
        LabelRezerwacjaOK.setVisible(true);
        
    }//GEN-LAST:event_ButtonSalaZatwierdzActionPerformed
    }
    
    private void ButtonSalaPowrotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalaPowrotActionPerformed

                   for ( int i = 0; i < 10; i++){
       for (int j = 0; j < 10; j++) {
           
           Start.potencjalnieZarezerwowane[i][j] = 0;
           
            }
       }
        
        Start.ilMiejsc=0;
        
//                if (Start.seatsCreated==true){
                    for(int i = 0; i < 100; i++){

                    if(Start.buttons.get(i).isSelected()){
                    Start.buttons.get(i).setSelected(false);
            }
        }
        
        
        PanelSala.setVisible(false);
        PanelRezerwacja.setVisible(true);
        
    }//GEN-LAST:event_ButtonSalaPowrotActionPerformed

    private void ButtonAnulujAnulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnulujAnulujActionPerformed

        String nazwisko = TxtFieldAnulujNazwisko.getText();
        
        int czyAnulowano = kin.goToCancelRes(nazwisko);
        
        if (czyAnulowano==0){
            LabelAnulujKomunikat.setText("Anulowano rezerwacje!");
        }else{
            LabelAnulujKomunikat.setText("Blad! Nie ma rezerwacji na to nazwisko!");
        }
   
        
    }//GEN-LAST:event_ButtonAnulujAnulujActionPerformed

    private void ButtonAnulujPowrotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnulujPowrotActionPerformed
        LabelAnulujKomunikat.setText("");
        PanelAnuluj.setVisible(false);
        PanelMainMenu.setVisible(true);
    }//GEN-LAST:event_ButtonAnulujPowrotActionPerformed

    private void TxtFieldAnulujNazwiskoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldAnulujNazwiskoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFieldAnulujNazwiskoActionPerformed

    private void ButtonRezerwacjaOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRezerwacjaOKActionPerformed
        
        PanelRezerwacjaOK.setVisible(false);
        PanelRezerwacja.setVisible(true);
        
    }//GEN-LAST:event_ButtonRezerwacjaOKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAnulujAnuluj;
    private javax.swing.JButton ButtonAnulujPowrot;
    private javax.swing.JButton ButtonLoginError;
    private javax.swing.JButton ButtonLoginOK;
    private javax.swing.JButton ButtonMainAnuluj;
    private javax.swing.JButton ButtonMainOdbierz;
    private javax.swing.JButton ButtonMainRezerwuj;
    private javax.swing.JButton ButtonMainWyjscie;
    private javax.swing.JButton ButtonOdbierzOdbierz;
    private javax.swing.JButton ButtonOdbierzPowrot;
    private javax.swing.JButton ButtonRezerwacjaAnuluj;
    private javax.swing.JButton ButtonRezerwacjaOK;
    private javax.swing.JButton ButtonRezerwacjaPrzejdz;
    private javax.swing.JButton ButtonSalaPowrot;
    private javax.swing.JButton ButtonSalaZatwierdz;
    private javax.swing.JButton ButtonWyjscie;
    private javax.swing.JButton ButtonZaloguj;
    private javax.swing.JLabel LabelAnulujKomunikat;
    private javax.swing.JLabel LabelAnulujNazwisko;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelLoginError;
    private javax.swing.JLabel LabelLoginOK;
    private javax.swing.JLabel LabelOdbierzKomunikat;
    private javax.swing.JLabel LabelOdbierzNazwisko;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelRezerwacjaImNaz;
    private javax.swing.JLabel LabelRezerwacjaKomunikat;
    private javax.swing.JLabel LabelRezerwacjaOK;
    private javax.swing.JLabel LabelRezerwacjaSeans;
    private javax.swing.JList ListRezerwacjaSeanse;
    private javax.swing.JPanel PanelAnuluj;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPanel PanelLoginError;
    private javax.swing.JPanel PanelLoginOK;
    private javax.swing.JPanel PanelMainMenu;
    private javax.swing.JPanel PanelMiejsca;
    private javax.swing.JPanel PanelOdbierz;
    private javax.swing.JPanel PanelRezerwacja;
    private javax.swing.JPanel PanelRezerwacjaOK;
    private javax.swing.JPanel PanelSala;
    private javax.swing.JPanel PanelSala3;
    private javax.swing.JScrollPane ScrollListRezerwacjaSeanse;
    private javax.swing.JTextField TxtFieldAnulujNazwisko;
    private javax.swing.JTextField TxtFieldLogin;
    private javax.swing.JTextField TxtFieldOdbierzNazwisko;
    private javax.swing.JPasswordField TxtFieldPassword;
    private javax.swing.JTextField TxtFieldRezerwacjaImNaz;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
