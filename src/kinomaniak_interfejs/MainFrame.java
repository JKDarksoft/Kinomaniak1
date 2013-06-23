/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kinomaniak_interfejs;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import kinomaniak_z_interfejsem.Klient2;



/**
 *
 * @author JK
 */
public class MainFrame extends javax.swing.JFrame {
    
    KinomaniakInterface kin = new Klient2();
    /**
     * Creates new form bFrameMain
     */
    public MainFrame() {
        
        super("KINOMANIAK");
        
        
        

        Toolkit zestaw = Toolkit.getDefaultToolkit();
        Dimension wymiary = zestaw.getScreenSize();
        int screenHight = wymiary.height;
        int screenWidth = wymiary.width;
        
        int framePosX = (screenHight/2)-100;
        int framePosY = (screenWidth/2)-150;
        
        setResizable(false);
        //this.setLocation(framePosY, framePosX);
        this.setLocation(0, 0);
        
        
        initComponents();
//        PanelLogin.setVisible(true);
//        ButtonZaloguj.setVisible(true);
//        ButtonWyjscie.setVisible(true);
//        
//        
        PanelLoginOK.setVisible(false);
        PanelLoginError.setVisible(false);
        PanelMainMenu.setVisible(false);
        PanelRezerwacja.setVisible(false);
        PanelLogin.setVisible(false);
        
        PanelLogin.setVisible(true);
        ButtonZaloguj.setVisible(true);
        ButtonWyjscie.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        PanelSala = new javax.swing.JPanel();

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

        ButtonRezerwacjaAnuluj.setText("Anuluj");
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
                        .addGroup(PanelRezerwacjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LabelRezerwacjaSeans, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                            .addComponent(LabelRezerwacjaImNaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtFieldRezerwacjaImNaz))
                        .addGap(0, 143, Short.MAX_VALUE))
                    .addComponent(ScrollListRezerwacjaSeanse))
                .addGap(18, 18, 18)
                .addGroup(PanelRezerwacjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonRezerwacjaPrzejdz, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(ButtonRezerwacjaAnuluj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelRezerwacjaLayout.setVerticalGroup(
            PanelRezerwacjaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRezerwacjaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelRezerwacjaImNaz)
                .addGap(18, 18, 18)
                .addComponent(TxtFieldRezerwacjaImNaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout PanelSalaLayout = new javax.swing.GroupLayout(PanelSala);
        PanelSala.setLayout(PanelSalaLayout);
        PanelSalaLayout.setHorizontalGroup(
            PanelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        PanelSalaLayout.setVerticalGroup(
            PanelSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        PanelSala.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(PanelSala, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
         
         KinomaniakInterface kin = new Klient2();
         
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
        
        String lol = kin.getShow()[1].getFormatted()+" "+kin.getShow()[1].getMovie().getName();
        System.out.println(lol); 

//        String[] shows = new String[kin.getShow().length];
//        
//        for(int i = 0;i<kin.getShow().length;i++){
//            shows[i] = kin.getShow()[i].getFormatted()+" "+kin.getShow()[i].getMovie().getName();
//            System.out.println("lllllllllll "); 
//        } 
//    ListRezerwacjaSeanse.setListData((String[])shows);
    }//GEN-LAST:event_ButtonMainRezerwujActionPerformed

    private void ButtonMainAnulujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMainAnulujActionPerformed
        
        PanelMainMenu.setVisible(false);
        
    }//GEN-LAST:event_ButtonMainAnulujActionPerformed

    private void ButtonMainWyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMainWyjscieActionPerformed
        
        PanelMainMenu.setVisible(false);
        System.exit(0);
        
        
    }//GEN-LAST:event_ButtonMainWyjscieActionPerformed

    private void ButtonMainOdbierzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMainOdbierzActionPerformed
        
        
        PanelMainMenu.setVisible(false);
        
        
        
    }//GEN-LAST:event_ButtonMainOdbierzActionPerformed

    private void ListRezerwacjaSeanseActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
    
                                               
//        pMain.setVisible(false);
//        pListMov.setVisible(true);
//        tMovieMore.setVisible(false);
        
                //String[] movnames = new String[kin.getShow()[].getMovie().getName()];
//        String movname = kin.getShow()[1].getMovie().getName();
        
        //            String movname = kin.getShow()[i].getMovie().getName();
//            String[] movnames = new String[kin.getShow()[].getMovie().getName()];
        //String[] movname = kin.getShow()[i].getMovie().getName();
        
        
        
//        KinomaniakInterface kin = new Klient2();
//
//        String[] movnames = {" "};
//        
//        for (int i = 0 ; i < 100; i++ ){
//         
//            String movname = kin.getShow()[i].getMovie().getName();
//            movnames[i] = movname;
//            
//            
//
//        ListRezerwacjaSeanse.setListData((String[])movnames);
        
        }
      
        
        //kin.getShow()[i].getMovies().length
       // String movs = new String[kin.getShow().getMovie().getName();
        
       // String[] seanse = kin.getShow()[i].getMovie().getName();
        
        //for (int i = 0 ; i < 100; i++ ){
            
    //    }
       // String movs = new String[kin.getShow().getMovie().getName()];
//        for(int i = 0;i<mgmt.getMovies().length;i++){
//            movs[i] = mgmt.getMovies()[i].getName();
//        }
//        liMovieList.setListData((String[])movs);
//    } 
        
        
   // } 
    
    
    private void ButtonRezerwacjaPrzejdzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRezerwacjaPrzejdzActionPerformed
        
        
        
        
        
    }//GEN-LAST:event_ButtonRezerwacjaPrzejdzActionPerformed

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLoginError;
    private javax.swing.JButton ButtonLoginOK;
    private javax.swing.JButton ButtonMainAnuluj;
    private javax.swing.JButton ButtonMainOdbierz;
    private javax.swing.JButton ButtonMainRezerwuj;
    private javax.swing.JButton ButtonMainWyjscie;
    private javax.swing.JButton ButtonRezerwacjaAnuluj;
    private javax.swing.JButton ButtonRezerwacjaPrzejdz;
    private javax.swing.JButton ButtonWyjscie;
    private javax.swing.JButton ButtonZaloguj;
    private javax.swing.JLabel LabelLogin;
    private javax.swing.JLabel LabelLoginError;
    private javax.swing.JLabel LabelLoginOK;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelRezerwacjaImNaz;
    private javax.swing.JLabel LabelRezerwacjaSeans;
    private javax.swing.JList ListRezerwacjaSeanse;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPanel PanelLoginError;
    private javax.swing.JPanel PanelLoginOK;
    private javax.swing.JPanel PanelMainMenu;
    private javax.swing.JPanel PanelRezerwacja;
    private javax.swing.JPanel PanelSala;
    private javax.swing.JScrollPane ScrollListRezerwacjaSeanse;
    private javax.swing.JTextField TxtFieldLogin;
    private javax.swing.JPasswordField TxtFieldPassword;
    private javax.swing.JTextField TxtFieldRezerwacjaImNaz;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}