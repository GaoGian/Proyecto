/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.event.MouseEvent;
import java.util.Arrays;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author JoXhe
 */
public class ventanaGame extends javax.swing.JFrame {

    /**
     * Creates new form ventanaGame
     */
    fileAccess file;
    nextData data;
    Tablero tablero;
    
    private boolean isPlayable = true;    
    private JLabel[][] piezaLab,piezaHP,usersLabel;
    boolean validarNuevoUsuario[] = new boolean[5], can1P = false, can2P = false;
    String select1P = "", select2P = "";
    int myX,myY,attX,attY;
    int cronoHora = 0, cronoMin = 0, cronoSec = 0;
    
    
    Thread crono = new Thread(){
        public void run(){
            try{
                while(true){
                    if(cronoSec==59){ cronoSec=0; cronoMin++; }
                    if(cronoMin==59){ cronoMin=0; cronoHora++; }
                    cronoSec++;
                    chronos.setText(((cronoHora<10)? "0"+cronoHora:cronoHora)+":"+((cronoMin<10)? "0"+cronoMin:cronoMin)+":"+((cronoSec<10)? "0"+cronoSec:cronoSec)); 
                    crono.sleep(1000);
                }
            } catch (Exception ex){

            }
        }
    };
    
    public ventanaGame() {
        initComponents();
        
        file = new fileAccess();
        data = new nextData();
                
        crearBtn.setVisible(false);
        setMenuVisible("HOME"); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detallesUsuario = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        detailNickname = new javax.swing.JLabel();
        detailName = new javax.swing.JLabel();
        detailPartidas = new javax.swing.JLabel();
        detailEmail = new javax.swing.JLabel();
        detailEdad = new javax.swing.JLabel();
        detail_bg = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        menuBtn = new javax.swing.JLabel();
        playBtn = new javax.swing.JLabel();
        statusBtn = new javax.swing.JLabel();
        userBtn = new javax.swing.JLabel();
        prefBtn = new javax.swing.JLabel();
        nowBtn = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();
        home_bg = new javax.swing.JLabel();
        playPanel = new javax.swing.JPanel();
        o_play = new javax.swing.JLabel();
        down_play = new javax.swing.JLabel();
        up_play = new javax.swing.JLabel();
        scrollPartidas = new javax.swing.JScrollPane();
        listPartidasPanel = new javax.swing.JPanel();
        scrollUsersPlay = new javax.swing.JScrollPane();
        listPlayPanel = new javax.swing.JPanel();
        play_bg = new javax.swing.JLabel();
        statusPanel = new javax.swing.JPanel();
        status_bg = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        o_user = new javax.swing.JLabel();
        down_users = new javax.swing.JLabel();
        up_users = new javax.swing.JLabel();
        nickAlert = new javax.swing.JLabel();
        passAlert = new javax.swing.JLabel();
        crearBtn = new javax.swing.JLabel();
        fullName = new javax.swing.JTextField();
        nickName = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        isPassword = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        scrollUsers = new javax.swing.JScrollPane();
        listUsersPanel = new javax.swing.JPanel();
        user_bg = new javax.swing.JLabel();
        prefPanel = new javax.swing.JPanel();
        pref_bg = new javax.swing.JLabel();
        vs_Net = new javax.swing.JLabel();
        down_users1 = new javax.swing.JLabel();
        up_users1 = new javax.swing.JLabel();
        scrollNet = new javax.swing.JScrollPane();
        listNetPanel = new javax.swing.JPanel();
        nowPanel = new javax.swing.JPanel();
        play_1P = new javax.swing.JLabel();
        play_2P = new javax.swing.JLabel();
        chronos = new javax.swing.JLabel();
        play_Users = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        play_Quit = new javax.swing.JLabel();
        play_Att = new javax.swing.JLabel();
        play_Move = new javax.swing.JLabel();
        play_Save_Chat = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        detallesUsuario.setTitle("Detalles del Usuario");
        detallesUsuario.setBounds(new java.awt.Rectangle(300, 300, 400, 210));
        detallesUsuario.setMinimumSize(new java.awt.Dimension(400, 210));
        detallesUsuario.setResizable(false);
//        detallesUsuario.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
//        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detailNickname.setFont(new java.awt.Font("Eurostile", 0, 30)); // NOI18N
        detailNickname.setForeground(new java.awt.Color(255, 255, 255));
        detailNickname.setText("NickName");
//        jPanel1.add(detailNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 220, -1));

        detailName.setFont(new java.awt.Font("Eurostile", 0, 22)); // NOI18N
        detailName.setForeground(new java.awt.Color(255, 255, 255));
        detailName.setText("Nombre Completo");
//        jPanel1.add(detailName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 220, -1));

        detailPartidas.setFont(new java.awt.Font("Eurostile", 0, 16)); // NOI18N
        detailPartidas.setForeground(new java.awt.Color(255, 255, 255));
        detailPartidas.setText("-- Puntos | -- Partidas Ganadas");
//        jPanel1.add(detailPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 128, 280, -1));

        detailEmail.setFont(new java.awt.Font("Eurostile", 0, 14)); // NOI18N
        detailEmail.setForeground(new java.awt.Color(255, 255, 255));
        detailEmail.setText("correo@electron.ico");
//        jPanel1.add(detailEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 170, -1));

        detailEdad.setFont(new java.awt.Font("Eurostile", 0, 16)); // NOI18N
        detailEdad.setForeground(new java.awt.Color(255, 255, 255));
        detailEdad.setText("Edad : --");
//        jPanel1.add(detailEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 80, -1));

        detail_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/user_icon.png"))); // NOI18N
//        jPanel1.add(detail_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

//        detallesUsuario.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Vampire WarsGame");
        setBounds(new java.awt.Rectangle(0, 0, 952, 560));
        setMaximumSize(new java.awt.Dimension(940, 560));
        setMinimumSize(new java.awt.Dimension(940, 560));
        setName("ventanaMain");
        setPreferredSize(new java.awt.Dimension(940, 560));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                canClose(evt);
            }
        });
//        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setMinimumSize(new java.awt.Dimension(952, 560));
        mainPanel.setPreferredSize(new java.awt.Dimension(952, 560));
//        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/HOME_MENU_PRESS.jpg"))); // NOI18N
        menuBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBtnMouseClicked(evt);
            }
        });
//        mainPanel.add(menuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 202, 42));

        playBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PLAY_MENU_UNPRESS.jpg"))); // NOI18N
        playBtn.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PLAY_MENU_DISABLE.jpg"))); // NOI18N
        playBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playBtnMouseClicked(evt);
            }
        });
//        mainPanel.add(playBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 202, 42));

        statusBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/STATUS_MENU_UNPRESS.jpg"))); // NOI18N
        statusBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusBtnMouseClicked(evt);
            }
        });
//        mainPanel.add(statusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 168, 202, 42));

        userBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/USER_MENU_UNPRESS.jpg"))); // NOI18N
        userBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userBtnMouseClicked(evt);
            }
        });
//        mainPanel.add(userBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 126, 202, 42));

        prefBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PREF_MENU_UNPRESS.jpg"))); // NOI18N
        prefBtn.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PREF_MENU_DISABLE.jpg"))); // NOI18N
        prefBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prefBtnMouseClicked(evt);
            }
        });
//        mainPanel.add(prefBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 84, 202, 42));

        nowBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/NOW_MENU_UNPRESS.jpg"))); // NOI18N
        nowBtn.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/NOW_MENU_DISABLE.jpg"))); // NOI18N
        nowBtn.setEnabled(false);
        nowBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nowBtnMouseClicked(evt);
            }
        });
//        mainPanel.add(nowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 202, 42));

        homePanel.setOpaque(false);
        homePanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                homePanelComponentShown(evt);
            }
        });
//        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/HOME_BG.jpg"))); // NOI18N
        home_bg.setText("jLabel2");
//        homePanel.add(home_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 560));

//        mainPanel.add(homePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 0, 750, 580));

        playPanel.setOpaque(false);
        playPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                playPanelComponentShown(evt);
            }
        });
//        playPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        o_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/O_graphic.png"))); // NOI18N
//        playPanel.add(o_play, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 118, -1, -1));

        down_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/down_trans_graphic.png"))); // NOI18N
//        playPanel.add(down_play, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 495, 790, 26));

        up_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/up_trans_graphic.png"))); // NOI18N
//        playPanel.add(up_play, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, 780, -1));

        scrollPartidas.setBackground(new java.awt.Color(0, 0, 0));
        scrollPartidas.setBorder(null);
        scrollPartidas.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPartidas.setAutoscrolls(true);
        scrollPartidas.setOpaque(false);

        listPartidasPanel.setOpaque(false);
//        listPartidasPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scrollPartidas.setViewportView(listPartidasPanel);

//        playPanel.add(scrollPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 440, 400));
        scrollPartidas.getViewport().setOpaque(false);

        scrollUsersPlay.setBackground(new java.awt.Color(0, 0, 0));
        scrollUsersPlay.setBorder(null);
        scrollUsersPlay.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollUsersPlay.setAutoscrolls(true);
        scrollUsersPlay.setOpaque(false);

        listPlayPanel.setOpaque(false);
//        listPlayPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scrollUsersPlay.setViewportView(listPlayPanel);

//        playPanel.add(scrollUsersPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 120, 890, 400));
        scrollUsersPlay.getViewport().setOpaque(false);

        play_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PLAY_BG.png"))); // NOI18N
//        playPanel.add(play_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 142));

//        mainPanel.add(playPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 0, 750, 580));

        statusPanel.setOpaque(false);
        statusPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                statusPanelComponentShown(evt);
            }
        });
//        statusPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/STATUS_BG.png"))); // NOI18N
//        statusPanel.add(status_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

//        mainPanel.add(statusPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 0, 750, 580));

        userPanel.setOpaque(false);
        userPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                userPanelComponentShown(evt);
            }
        });
//        userPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        o_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/O_graphic.png"))); // NOI18N
//        userPanel.add(o_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 118, -1, -1));

        down_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/down_trans_graphic.png"))); // NOI18N
//        userPanel.add(down_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 495, 400, 26));

        up_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/up_trans_graphic.png"))); // NOI18N
//        userPanel.add(up_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 118, 400, -1));

        nickAlert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/field_ALERT.png"))); // NOI18N
        nickAlert.setToolTipText("Usuario existente o exe mas de 16 caracteres.");
        nickAlert.setEnabled(false);
//        userPanel.add(nickAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 266, 35, 41));

        passAlert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/field_ALERT.png"))); // NOI18N
        passAlert.setToolTipText("Contraseñas deven ser iguales");
        passAlert.setEnabled(false);
//        userPanel.add(passAlert, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 320, 35, 41));

        crearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/button_CREAR.png"))); // NOI18N
        crearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearBtnMouseClicked(evt);
            }
        });
//        userPanel.add(crearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 480, -1, -1));

        fullName.setBackground(new java.awt.Color(238, 238, 238));
        fullName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        fullName.setForeground(new java.awt.Color(204, 204, 204));
        fullName.setText("Nombre Completo");
        fullName.setBorder(null);
        fullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fullNameFocusGained(evt);
            }
        });
        fullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fullNameKeyReleased(evt);
            }
        });
//        userPanel.add(fullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 220, 220, 26));

        nickName.setBackground(new java.awt.Color(238, 238, 238));
        nickName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        nickName.setForeground(new java.awt.Color(204, 204, 204));
        nickName.setText("NickName");
        nickName.setBorder(null);
        nickName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nickNameFocusGained(evt);
            }
        });
        nickName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nickNameKeyReleased(evt);
            }
        });
//        userPanel.add(nickName, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 274, 220, 26));

        password.setBackground(new java.awt.Color(238, 238, 238));
        password.setText("password");
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
        });
//        userPanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 328, 105, 26));

        isPassword.setBackground(new java.awt.Color(238, 238, 238));
        isPassword.setText("password");
        isPassword.setBorder(null);
        isPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                isPasswordFocusGained(evt);
            }
        });
        isPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                isPasswordKeyReleased(evt);
            }
        });
//        userPanel.add(isPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 328, 105, 26));

        email.setBackground(new java.awt.Color(238, 238, 238));
        email.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(204, 204, 204));
        email.setText("correo@electron.ico");
        email.setBorder(null);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
//        userPanel.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 382, 220, 26));

        edad.setBackground(new java.awt.Color(238, 238, 238));
        edad.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        edad.setForeground(new java.awt.Color(204, 204, 204));
        edad.setText("00");
        edad.setBorder(null);
        edad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edadFocusGained(evt);
            }
        });
        edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edadKeyReleased(evt);
            }
        });
//        userPanel.add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 436, 34, 26));

        scrollUsers.setBackground(new java.awt.Color(0, 0, 0));
        scrollUsers.setBorder(null);
        scrollUsers.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollUsers.setAutoscrolls(true);
        scrollUsers.setOpaque(false);

        listUsersPanel.setOpaque(false);
//        listUsersPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scrollUsers.setViewportView(listUsersPanel);

//        userPanel.add(scrollUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 440, 400));
        scrollUsers.getViewport().setOpaque(false);

        user_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/USER_BG.png"))); // NOI18N
//        userPanel.add(user_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

//        mainPanel.add(userPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 0, 750, 580));

        prefPanel.setOpaque(false);
        prefPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                prefPanelComponentShown(evt);
            }
        });
//        prefPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pref_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PREF_BG.png"))); // NOI18N
//        prefPanel.add(pref_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        vs_Net.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/VS_graphic.png"))); // NOI18N
//        prefPanel.add(vs_Net, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 118, -1, -1));

        down_users1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/down_trans_graphic.png"))); // NOI18N
//        prefPanel.add(down_users1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 495, 400, 26));

        up_users1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/up_trans_graphic.png"))); // NOI18N
//        prefPanel.add(up_users1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 118, 400, -1));

        scrollNet.setBackground(new java.awt.Color(0, 0, 0));
        scrollNet.setBorder(null);
        scrollNet.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollNet.setAutoscrolls(true);
        scrollNet.setOpaque(false);

        listNetPanel.setOpaque(false);
//        listNetPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scrollNet.setViewportView(listNetPanel);

//        prefPanel.add(scrollNet, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 440, 400));
        scrollNet.getViewport().setOpaque(false);

//        mainPanel.add(prefPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 0, 750, 580));

        nowPanel.setFont(new java.awt.Font("Eurostile", 1, 14)); // NOI18N
        nowPanel.setOpaque(false);
        nowPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                nowPanelComponentShown(evt);
            }
        });
//        nowPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        play_1P.setFont(new java.awt.Font("Eurostile", 0, 18)); // NOI18N
        play_1P.setForeground(new java.awt.Color(255, 255, 255));
        play_1P.setText("USER A");
//        nowPanel.add(play_1P, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 28, -1, -1));

        play_2P.setFont(new java.awt.Font("Eurostile", 0, 18)); // NOI18N
        play_2P.setForeground(new java.awt.Color(255, 255, 255));
        play_2P.setText("USER B");
//        nowPanel.add(play_2P, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 62, -1, -1));

        chronos.setFont(new java.awt.Font("Eurostile", 1, 32)); // NOI18N
        chronos.setForeground(new java.awt.Color(255, 255, 255));
        chronos.setText("00:00:00");
//        nowPanel.add(chronos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 150, 50));

        play_Users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/play_Users.png"))); // NOI18N
//        nowPanel.add(play_Users, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/play_Dado.png"))); // NOI18N
        jLabel1.setEnabled(false);
//        nowPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 154, -1, -1));

        play_Quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/play_Quit.png"))); // NOI18N
        play_Quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play_QuitMouseClicked(evt);
            }
        });
//        nowPanel.add(play_Quit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 474, -1, -1));

        play_Att.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/play_Att.png"))); // NOI18N
        play_Att.setEnabled(false);
        play_Att.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play_AttMouseClicked(evt);
            }
        });
//        nowPanel.add(play_Att, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 426, -1, -1));

        play_Move.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/play_Move.png"))); // NOI18N
        play_Move.setEnabled(false);
        play_Move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play_MoveMouseClicked(evt);
            }
        });
//        nowPanel.add(play_Move, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 378, -1, -1));

        play_Save_Chat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/play_Save.png"))); // NOI18N
        play_Save_Chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                play_Save_ChatMouseClicked(evt);
            }
        });
//        nowPanel.add(play_Save_Chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, -1, -1));

//        mainPanel.add(nowPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 0, 750, 580));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/background.jpg"))); // NOI18N
//        mainPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 580));

//        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 952, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBtnMouseClicked
        setMenuVisible("HOME"); 
    }//GEN-LAST:event_menuBtnMouseClicked

    private void playBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playBtnMouseClicked
        if(!can1P || !can2P)
            setMenuVisible("PLAY");
    }//GEN-LAST:event_playBtnMouseClicked

    private void statusBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusBtnMouseClicked
        setMenuVisible("STATUS");
    }//GEN-LAST:event_statusBtnMouseClicked

    private void userBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBtnMouseClicked
        setMenuVisible("USER");
    }//GEN-LAST:event_userBtnMouseClicked

    private void prefBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prefBtnMouseClicked
        if(!can1P || !can2P)
            setMenuVisible("PREF");
    }//GEN-LAST:event_prefBtnMouseClicked

    private void nowBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nowBtnMouseClicked
        if(can1P && can2P)
            setMenuVisible("NOW");
    }//GEN-LAST:event_nowBtnMouseClicked

    private void playPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_playPanelComponentShown
        setMenuIcon("PLAY");
        listUsersLabel(true);
        can1P = false;
        can2P = false;
    }//GEN-LAST:event_playPanelComponentShown

    private void statusPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_statusPanelComponentShown
        setMenuIcon("STATUS");
    }//GEN-LAST:event_statusPanelComponentShown

    private void userPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_userPanelComponentShown
        setMenuIcon("USER");
        listUsersLabel();
    }//GEN-LAST:event_userPanelComponentShown

    private void prefPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_prefPanelComponentShown
        setMenuIcon("PREF");
    }//GEN-LAST:event_prefPanelComponentShown

    private void nowPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_nowPanelComponentShown
        setMenuIcon("NOW");
    }//GEN-LAST:event_nowPanelComponentShown

    private void homePanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_homePanelComponentShown
        setMenuIcon("HOME");
    }//GEN-LAST:event_homePanelComponentShown

    private void isPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isPasswordKeyReleased
        if(isPasswordCorrect(password.getPassword(),isPassword.getPassword())){
            passAlert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/field_OK.png")));
            passAlert.setEnabled(true);
            validarNuevoUsuario[2] = true;
        }else{
            passAlert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/field_ALERT.png")));
            passAlert.setEnabled(true);
            validarNuevoUsuario[2] = false;
        }
        isCanCreate();
    }//GEN-LAST:event_isPasswordKeyReleased

    private void crearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnMouseClicked
        file.newUser(fullName.getText(), nickName.getText(), data.dataChar(isPassword.getPassword()), Integer.parseInt(edad.getText()), email.getText());
        resetNewUserForm();
        listUsersLabel();
    }//GEN-LAST:event_crearBtnMouseClicked

    private void fullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullNameKeyReleased
        if(!fullName.getText().equals(""))
            validarNuevoUsuario[0] = true;
        isCanCreate();
    }//GEN-LAST:event_fullNameKeyReleased

    private void nickNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nickNameKeyReleased
        nickName.setText(nickName.getText().toUpperCase());
        if(!nickName.getText().equals("") )
            if(!file.nickNameExist(nickName.getText())){
                nickAlert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/field_OK.png")));
                nickAlert.setEnabled(true);
                validarNuevoUsuario[1] = true;
            }else{
                nickAlert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/field_ALERT.png")));
                nickAlert.setEnabled(true);
                validarNuevoUsuario[1] = false;
            }
        isCanCreate();
    }//GEN-LAST:event_nickNameKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        email.setText(data.dataTextEmail(email.getText()));
        if(!email.getText().equals(""))
            validarNuevoUsuario[3] = true;
        isCanCreate();
    }//GEN-LAST:event_emailKeyReleased

    private void edadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edadKeyReleased
        int edadInt = data.dataInt(edad.getText(), -1);
        if(edadInt<99 && edadInt>0)
            validarNuevoUsuario[4] = true;
        else
            JOptionPane.showMessageDialog(null, "Ingrese una edad valida" , "Alerta", 0);
        isCanCreate();
    }//GEN-LAST:event_edadKeyReleased

    private void fullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullNameFocusGained
        fullName.setForeground(new java.awt.Color(35, 35, 35));
        fullName.setText("");
    }//GEN-LAST:event_fullNameFocusGained

    private void nickNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nickNameFocusGained
        nickName.setForeground(new java.awt.Color(35, 35, 35));
        nickName.setText("");
    }//GEN-LAST:event_nickNameFocusGained

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        password.setForeground(new java.awt.Color(35, 35, 35));
        password.setText("");
    }//GEN-LAST:event_passwordFocusGained

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        email.setForeground(new java.awt.Color(35, 35, 35));
        email.setText("");
    }//GEN-LAST:event_emailFocusGained

    private void isPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isPasswordFocusGained
        isPassword.setForeground(new java.awt.Color(35, 35, 35));
        isPassword.setText("");
    }//GEN-LAST:event_isPasswordFocusGained

    private void edadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edadFocusGained
        edad.setForeground(new java.awt.Color(35, 35, 35));
        edad.setText("");
    }//GEN-LAST:event_edadFocusGained

    private void canClose(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_canClose
        if(isPlayable)
            System.exit(0);
        else
            JOptionPane.showMessageDialog(null, "Hay una partida en proceso aun" , "Alerta", 0);
    }//GEN-LAST:event_canClose

    private void play_QuitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_QuitMouseClicked
        System.exit(0);        
    }//GEN-LAST:event_play_QuitMouseClicked

    private void play_Save_ChatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_Save_ChatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_play_Save_ChatMouseClicked

    private void play_MoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_MoveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_play_MoveMouseClicked

    private void play_AttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_play_AttMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_play_AttMouseClicked

    public void resetNewUserForm(){
        fullName.setForeground(new java.awt.Color(204, 204, 204));
        fullName.setText("Nombre Completo");
        nickName.setForeground(new java.awt.Color(204, 204, 204));
        nickName.setText("NickName");
        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("password");
        isPassword.setForeground(new java.awt.Color(204, 204, 204));
        isPassword.setText("password");
        email.setForeground(new java.awt.Color(204, 204, 204));
        email.setText("correo@electron.ico");
        edad.setForeground(new java.awt.Color(204, 204, 204));
        edad.setText("--");
        passAlert.setEnabled(false);
        nickAlert.setEnabled(false);
        crearBtn.setVisible(false);
    }
    
    private void piezaLabMouseClicked(java.awt.event.MouseEvent evt,int x, int y) {
        
        /*if(!canAttack.isSelected()){
            if(tablero.Piezas[x][y]!=null){
                piezaData.setText(tablero.Piezas[x][y].toString());
                canAttack.setSelected((tablero.Piezas[x][y].tipo!=piezaTipo.ZOMBIE)? true : false);
                is1P.setSelected(tablero.Piezas[x][y].nPlayer);
                myX = x;
                myY = y;
            }else{
                piezaData.setText("Espacio en Blanco\nPosicion X:"+x+" Y:"+y);
                canAttack.setSelected(false);
                is1P.setSelected(false);
            }
        }else{
            if(tablero.Piezas[x][y]!=null){
                mover.setEnabled(false);
                piezaDataAttack.setText(tablero.Piezas[x][y].toString());
                if(tablero.Piezas[x][y].nPlayer!=is1P.isSelected()){
                    attack.setEnabled(true);
                    attX = x;
                    attY = y;
                }
            }else{
                piezaDataAttack.setText("Espacio en Blanco\nPosicion X:"+x+" Y:"+y);
                attack.setEnabled(false);
                mover.setEnabled(true);
                attX = x;
                attY = y;
            }
        }*/
        //setCrono(0,0,0);
        JOptionPane.showMessageDialog(null, "X: "+x+" / Y: "+y+"\n Player 1P "+tablero.getPlayer1P()+"\n"+ true , "Alerta", 0);
    }
    
    private static boolean isPasswordCorrect(char[] input, char[] isInput) {
        boolean isCorrect = true;
        char[] correctPassword = isInput;

        if (input.length != correctPassword.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals (input, correctPassword);
        }

        //Zero out the password.
        Arrays.fill(correctPassword,'0');

        return isCorrect;
    }
    
    private boolean isCanCreate(){
        for(boolean y : validarNuevoUsuario){
            if(!y){
                crearBtn.setVisible(false);
                return false;
            }
        }
        crearBtn.setVisible(true);
        return true;
    }
    
    private void setCrono(int hora, int min, int sec){
        this.cronoHora = hora;
        this.cronoMin = min;
        this.cronoSec = sec;
    }
 
    private void tableroNewGame(String name1P, String name2P) {
        crono.start();
        setTitle("Vampire WarGame - "+name1P+" Vrs. "+name2P);
        play_1P.setText(name1P);
        play_2P.setText(name2P);
        tablero = new Tablero(name1P,name2P);
        piezaLab = new javax.swing.JLabel[6][6];
        piezaHP = new javax.swing.JLabel[6][6];
        int xpos = 14;
        int ypos = 12;
        for(int x=0;x<6;x++){
            for(int y=0;y<6;y++){
                tableroPieza(x,y,xpos,ypos);
                xpos = xpos+84;
            }
            xpos = 10;
            ypos = ypos+86;
        }
    }
    
    public void tableroPieza(final int x,final int y,int xpos,int ypos) {
        
        piezaHP[x][y] = new javax.swing.JLabel();
        piezaHP[x][y].setFont(new java.awt.Font("Eurostile", 1, 12));
        piezaHP[x][y].setPreferredSize(new java.awt.Dimension(30, 30));
        piezaHP[x][y].setSize(new java.awt.Dimension(30, 30));
        piezaHP[x][y].setText("");
        piezaHP[x][y].setForeground(new java.awt.Color(255, 255, 255));
//        nowPanel.add(piezaHP[x][y], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos+7, ypos+50, -1, -1));
        setHPtxt(x,y);

        piezaLab[x][y] = new javax.swing.JLabel();
        piezaLab[x][y].setPreferredSize(new java.awt.Dimension(80, 80));
        piezaLab[x][y].setSize(new java.awt.Dimension(80, 80));
        piezaLab[x][y].setText(null);
//        nowPanel.add(piezaLab[x][y], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos, ypos, -1, -1));
        setIconPos(x,y,"");
        
        piezaLab[x][y].addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                piezaLabMouseClicked(evt,x,y);
            }
        });
        
    }
    
    public void listUsersLabel(){
        listUsersLabel(false);
    }
    
    public void listUsersLabel(boolean isPlay){
        listUsersPanel.removeAll();
        listUsersPanel.revalidate();
        listUsersPanel.setVisible(false);
        listUsersPanel.setVisible(true);
        listPlayPanel.removeAll();
        listPlayPanel.revalidate();
        listPlayPanel.setVisible(false);
        listPlayPanel.setVisible(true);
        listPartidasPanel.removeAll();
        listPartidasPanel.revalidate();
        listPartidasPanel.setVisible(false);
        listPartidasPanel.setVisible(true);
        
        if(file.numPartidas()==0){
            JLabel info_Play = new javax.swing.JLabel();
            info_Play.setText(null);
            info_Play.setPreferredSize(new java.awt.Dimension(339, 111));
            info_Play.setSize(new java.awt.Dimension(339, 111));
//            listPartidasPanel.add(info_Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 118, 339, 111));
            info_Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/info_PLAY.png")));
        }
        
        if(file.cantActiveUsers()==0){
            JLabel alert_User = new javax.swing.JLabel();
            alert_User.setText(null);
            alert_User.setPreferredSize(new java.awt.Dimension(339, 111));
            alert_User.setSize(new java.awt.Dimension(339, 111));
//            listUsersPanel.add(alert_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 118, 339, 111));
            alert_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/alerta_USERS.png")));

            JLabel alert_Play = new javax.swing.JLabel();
            alert_Play.setText(null);
            alert_Play.setPreferredSize(new java.awt.Dimension(339, 111));
            alert_Play.setSize(new java.awt.Dimension(339, 111));
//            listPlayPanel.add(alert_Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 118, 339, 111));
            alert_Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/alerta_PLAY.png")));
        }else{
            String users[][] = file.listStringUsers();
            if(file.cantActiveUsers()!=0)
            usersLabel = new javax.swing.JLabel[file.cantActiveUsers()][6];
            int xpos , ypos;
            if(isPlay)
                xpos = 26;
            else
                xpos = 15;
            if(file.cantActiveUsers()>6)
                ypos = 25;
            else
                ypos = 175-(file.cantActiveUsers()*25);
            for(int i=0;i<file.cantActiveUsers();i++){
                usersLabel(i,xpos,ypos,users[i],isPlay);
                ypos += 50;
            }
            javax.swing.JLabel usersLabelPie = new javax.swing.JLabel();
            usersLabelPie.setText(null);
            usersLabelPie.setPreferredSize(new java.awt.Dimension(317, 25));
            usersLabelPie.setSize(new java.awt.Dimension(317, 25));
//            if(isPlay)
//            listPlayPanel.add(usersLabelPie, new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos, ypos, -1, -1));
//            else
//            listUsersPanel.add(usersLabelPie, new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos, ypos, -1, -1));
        }
    }
    
    public void usersLabel(final int u,int xpos,int ypos,final String [] user,final boolean isPlay){
        
        usersLabel[u][5] = new javax.swing.JLabel();
        usersLabel[u][5].setText(null);
        usersLabel[u][5].setPreferredSize(new java.awt.Dimension(27, 27));
        usersLabel[u][5].setSize(new java.awt.Dimension(27, 27));
//        listUsersPanel.add(usersLabel[u][5], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos+245, ypos+9, 27, 27));
        
        usersLabel[u][5].addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersLabelEditMouseClicked(evt,user);
            }
        });
        
        usersLabel[u][4] = new javax.swing.JLabel();
        usersLabel[u][4].setText(null);
        usersLabel[u][4].setPreferredSize(new java.awt.Dimension(27, 27));
        usersLabel[u][4].setSize(new java.awt.Dimension(27, 27));
//        if(!isPlay)
//        listUsersPanel.add(usersLabel[u][4], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos+280, ypos+9, 27, 27));
//        else{
//        listPlayPanel.add(usersLabel[u][4], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos+280, ypos+9, 27, 27));
//        usersLabel[u][4].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pin.png")));
//        usersLabel[u][4].setEnabled(false);
//        }
        
        if(!isPlay){
            usersLabel[u][4].addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    usersLabelDeleteMouseClicked(evt,user);
                }
            });
        }
        
        usersLabel[u][3] = new javax.swing.JLabel();
        usersLabel[u][3].setFont(new java.awt.Font("Eurostile", 1, 16)); // NOI18N
        usersLabel[u][3].setForeground(new java.awt.Color(255, 255, 255));
        usersLabel[u][3].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usersLabel[u][3].setText(user[6]);
        usersLabel[u][3].setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        usersLabel[u][3].setPreferredSize(new java.awt.Dimension(25, 25));
        usersLabel[u][3].setSize(new java.awt.Dimension(25, 25));
//        if(!isPlay)
//        listUsersPanel.add(usersLabel[u][3], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos+10, ypos+10, 25, 25));
//        else
//        listPlayPanel.add(usersLabel[u][3], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos+10, ypos+10, 25, 25));
        if(Integer.parseInt(user[6])>99){
        usersLabel[u][3].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/+99.png")));
        usersLabel[u][3].setText(null);
        }
        
        usersLabel[u][2] = new javax.swing.JLabel();
        usersLabel[u][2].setFont(new java.awt.Font("Eurostile", 0, 12)); // NOI18N
        usersLabel[u][2].setForeground(new java.awt.Color(255, 255, 255));
        usersLabel[u][2].setText(user[5]+" PUNTOS");
//        if(!isPlay)
//        listUsersPanel.add(usersLabel[u][2], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos+45, ypos+24, -1, -1));
//        else
//        listPlayPanel.add(usersLabel[u][2], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos+45, ypos+24, -1, -1));
        
        usersLabel[u][1] = new javax.swing.JLabel();
        usersLabel[u][1].setFont(new java.awt.Font("Eurostile", 1, 16)); // NOI18N
        usersLabel[u][1].setForeground(new java.awt.Color(255, 255, 255));
        usersLabel[u][1].setText(user[1].toUpperCase());
//        if(!isPlay)
//        listUsersPanel.add(usersLabel[u][1], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos+45, ypos+8, -1, -1));
//        else
//        listPlayPanel.add(usersLabel[u][1], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos+45, ypos+8, -1, -1));
        
        usersLabel[u][0] = new javax.swing.JLabel();
        usersLabel[u][0].setText(null);
        usersLabel[u][0].setPreferredSize(new java.awt.Dimension(317, 44));
        usersLabel[u][0].setSize(new java.awt.Dimension(317, 44));
//        if(!isPlay)
//        listUsersPanel.add(usersLabel[u][0], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos, ypos, -1, -1));
//        else
//        listPlayPanel.add(usersLabel[u][0], new org.netbeans.lib.awtextra.AbsoluteConstraints(xpos, ypos, -1, -1));
        if(!isPlay)
        usersLabel[u][0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/userEdit_FIELD.png")));
        else
        usersLabel[u][0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/userPlay_FIELD.png")));
        
        usersLabel[u][0].addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(!isPlay)
                usersLabelDetailMouseClicked(evt,user);
                else
                toPlayMouseClicked(evt,user,u);    
            }
        });
    }
    
    private void toPlayMouseClicked(MouseEvent evt, String[] user, int label) {
        String passwordValue = "";
        javax.swing.JLabel jPassword = new javax.swing.JLabel("Password");
        javax.swing.JTextField password = new javax.swing.JPasswordField();
        Object[] ob = {jPassword, password};
        int result = JOptionPane.showConfirmDialog(null, ob, "Introdusca la contraseña", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION){
            passwordValue = password.getText();
            if(passwordValue.equals(user[2])){
                if(!can1P){
                    can1P = true;
                    select1P = user[1];
                    usersLabel[label][4].setEnabled(true);
                    
                }else if(!can2P){
                    can2P = true;
                    select2P = user[1];
                    usersLabel[label][4].setEnabled(true);
                }
                if(can1P && can2P){
                    isPlayable = false;
                    setMenuIcon("NOW");
                    setMenuVisible("NOW");
                    tableroNewGame(select1P,select2P);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta, intentelo de nuevo" , "Alerta", 0);
            }
        }
    }
    
    private void usersLabelEditMouseClicked(java.awt.event.MouseEvent evt,String[] user) {
        JOptionPane.showMessageDialog(null, user[2] , "Alerta", 0);
        listUsersLabel();
    }
    
    private void usersLabelDeleteMouseClicked(java.awt.event.MouseEvent evt,String[] user) {
        String passwordValue = "";
        javax.swing.JLabel jPassword = new javax.swing.JLabel("Password");
        javax.swing.JTextField password = new javax.swing.JPasswordField();
        Object[] ob = {jPassword, password};
        int result = JOptionPane.showConfirmDialog(null, ob, "Introdusca la contraseña", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION)
            passwordValue = password.getText();
        if(passwordValue.equals(user[2])){
            if(!file.disableUser(user[1]))
                JOptionPane.showMessageDialog(null, "No se pudo eliminar" , "Alerta", 0);
            else
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta, intentelo de nuevo" , "Alerta", 0);
        }
        listUsersLabel();
    }
    
    private void usersLabelDetailMouseClicked(java.awt.event.MouseEvent evt,String[] user) {
        detailNickname.setText(user[1]);
        detailName.setText(user[0]);
        detailPartidas.setText(user[5]+" PUNTOS  |  "+user[6]+" PARTIDAS GANADAS");
        detailEmail.setText(user[4]);
        detailEdad.setText("EDAD : "+user[3]);
        detallesUsuario.setVisible(true);
    }
    
    public void updatePieza(int x,int y){
        setHPtxt(x,y);
        setIconPos(x,y,"");
    }
    
    public void setHPtxt(int x,int y){
        if(tablero.Piezas[x][y]!=null){
            piezaHP[x][y].setText(""+((tablero.Piezas[x][y].getLP()<10)?"0":"")+tablero.Piezas[x][y].getLP());
        }else{
            piezaHP[x][y].setText("");
        }
    }
    
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ventanaGame().setVisible(true);
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel chronos;
    private javax.swing.JLabel crearBtn;
    private javax.swing.JLabel detailEdad;
    private javax.swing.JLabel detailEmail;
    private javax.swing.JLabel detailName;
    private javax.swing.JLabel detailNickname;
    private javax.swing.JLabel detailPartidas;
    private javax.swing.JLabel detail_bg;
    private javax.swing.JDialog detallesUsuario;
    private javax.swing.JLabel down_play;
    private javax.swing.JLabel down_users;
    private javax.swing.JLabel down_users1;
    private javax.swing.JTextField edad;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullName;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel home_bg;
    private javax.swing.JPasswordField isPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel listNetPanel;
    private javax.swing.JPanel listPartidasPanel;
    private javax.swing.JPanel listPlayPanel;
    private javax.swing.JPanel listUsersPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel menuBtn;
    private javax.swing.JLabel nickAlert;
    private javax.swing.JTextField nickName;
    private javax.swing.JLabel nowBtn;
    private javax.swing.JPanel nowPanel;
    private javax.swing.JLabel o_play;
    private javax.swing.JLabel o_user;
    private javax.swing.JLabel passAlert;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel playBtn;
    private javax.swing.JPanel playPanel;
    private javax.swing.JLabel play_1P;
    private javax.swing.JLabel play_2P;
    private javax.swing.JLabel play_Att;
    private javax.swing.JLabel play_Move;
    private javax.swing.JLabel play_Quit;
    private javax.swing.JLabel play_Save_Chat;
    private javax.swing.JLabel play_Users;
    private javax.swing.JLabel play_bg;
    private javax.swing.JLabel prefBtn;
    private javax.swing.JPanel prefPanel;
    private javax.swing.JLabel pref_bg;
    private javax.swing.JScrollPane scrollNet;
    private javax.swing.JScrollPane scrollPartidas;
    private javax.swing.JScrollPane scrollUsers;
    private javax.swing.JScrollPane scrollUsersPlay;
    private javax.swing.JLabel statusBtn;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JLabel status_bg;
    private javax.swing.JLabel up_play;
    private javax.swing.JLabel up_users;
    private javax.swing.JLabel up_users1;
    private javax.swing.JLabel userBtn;
    private javax.swing.JPanel userPanel;
    private javax.swing.JLabel user_bg;
    private javax.swing.JLabel vs_Net;
    // End of variables declaration//GEN-END:variables
    
    private void setMenuVisible(String menu){
        homePanel.setVisible(false);
        playPanel.setVisible(false);
        statusPanel.setVisible(false);
        userPanel.setVisible(false);
        prefPanel.setVisible(false);
        nowPanel.setVisible(false);
        
        if(menu.equals("HOME"))
            homePanel.setVisible(true);        
        if(menu.equals("PLAY"))
            playPanel.setVisible(true);
        if(menu.equals("STATUS"))
            statusPanel.setVisible(true);
        if(menu.equals("USER"))
            userPanel.setVisible(true);       
        if(menu.equals("PREF"))
            prefPanel.setVisible(true);
        if(menu.equals("NOW"))
            nowPanel.setVisible(true);
    }
    
    private void setMenuIcon(String menu){
        if(menu.equals("HOME"))
            menuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/HOME_MENU_PRESS.jpg")));
        else
            menuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/HOME_MENU_UNPRESS.jpg")));
        if(menu.equals("PLAY")){
            playBtn.setEnabled(true);
            playBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PLAY_MENU_PRESS.jpg")));         
        }
        else if(!isPlayable)
            playBtn.setEnabled(false);
        else{           
            playBtn.setEnabled(true);
            playBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PLAY_MENU_UNPRESS.jpg")));
        }
        if(menu.equals("STATUS"))
            statusBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/STATUS_MENU_PRESS.jpg")));
        else
            statusBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/STATUS_MENU_UNPRESS.jpg")));
        if(menu.equals("USER"))
            userBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/USER_MENU_PRESS.jpg")));
        else
            userBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/USER_MENU_UNPRESS.jpg")));
        if(menu.equals("PREF")){
            prefBtn.setEnabled(true);
            prefBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PREF_MENU_PRESS.jpg")));
        }else if(!isPlayable){
            prefBtn.setEnabled(false);
        }else{
            prefBtn.setEnabled(true);
            prefBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/PREF_MENU_UNPRESS.jpg")));
        }
        if(menu.equals("NOW")){
            nowBtn.setEnabled(true);
            nowBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/NOW_MENU_PRESS.jpg")));         
        }
        else if(!isPlayable){
            nowBtn.setEnabled(true);
            nowBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/NOW_MENU_UNPRESS.jpg")));
        }else{           
            nowBtn.setEnabled(false);
            nowBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/NOW_MENU_UNPRESS.jpg")));
        }
    }
    
    public void setIconPos(int x,int y,String acc){
        if(tablero.Piezas[x][y]!=null){
            if(true){
                if(tablero.Piezas[x][y].tipo == piezaTipo.WOLF)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/wolfBlack"+acc+".png")));
                if(tablero.Piezas[x][y].tipo == piezaTipo.VAMPIRE)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/vampireBlack"+acc+".png")));
                if(tablero.Piezas[x][y].tipo == piezaTipo.DEATH)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/deathBlack"+acc+".png")));
                if(tablero.Piezas[x][y].tipo == piezaTipo.ZOMBIE)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/zombieBlack"+acc+".png")));
            }else{
                if(tablero.Piezas[x][y].tipo == piezaTipo.WOLF)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/wolfWhite"+acc+".png")));
                if(tablero.Piezas[x][y].tipo == piezaTipo.VAMPIRE)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/vampireWhite"+acc+".png")));
                if(tablero.Piezas[x][y].tipo == piezaTipo.DEATH)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/deathWhite"+acc+".png")));
                if(tablero.Piezas[x][y].tipo == piezaTipo.ZOMBIE)
                    piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/zombieWhite"+acc+".png")));
            }
        }else{
            piezaLab[x][y].setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/piece"+acc+".png")));
        }
    }

}