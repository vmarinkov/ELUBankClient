
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


/** 
 * Class used for managing client accounts including: 
 * creating new client's accounts 
 * deleting client's account
 * deleting clients 
 * opening new banking accounts
 * 
 * @author Lyubomira Kazandzhieva
 */
public class RegistrationForm extends javax.swing.JFrame {

    DefaultTableModel accountsTableModel, allUsersTableModel;

    public RegistrationForm() {

        initComponents();

        for (int count = 0; count < 21; count++) {
            Accounts_table.setRowHeight(count, 25);
            Accounts_table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        }
        accountsTableModel = (DefaultTableModel) Accounts_table.getModel();
        accountsTableModel.setColumnIdentifiers(new Object[]{
            "IBAN ", "N на сметка", "Тип на сметка", "Сума", "Валута"});
        for (int i = 0; i < 21; i++) {
            accountsTableModel.insertRow(i, new Object[]{});

        }

        for (int count = 0; count < 21; count++) {
            allClientsTable.setRowHeight(count, 25);
            allClientsTable.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        }
        allUsersTableModel = (DefaultTableModel) allClientsTable.getModel();
        allUsersTableModel.setColumnIdentifiers(new Object[]{
            "Име ", "Презиме", "Фамилия", "ЕГН", "Град", "Адрес", "Телефон"});
        for (int i = 0; i < 21; i++) {
            allUsersTableModel.insertRow(i, new Object[]{});

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currencyTypeBtnGrp = new javax.swing.ButtonGroup();
        ELUBank_lbl = new javax.swing.JLabel();
        MenuCardLayoutPanel = new javax.swing.JPanel();
        ManagementPanel = new javax.swing.JPanel();
        btnCreateClient = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        btnDeleteAccount = new javax.swing.JButton();
        btnDeleteClient = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        CentralCardLayoutPanel = new javax.swing.JPanel();
        WelcomePanel = new javax.swing.JPanel();
        Welcome_lbl = new javax.swing.JLabel();
        RegistrationPanel = new javax.swing.JPanel();
        lblnme = new javax.swing.JLabel();
        lblSnme = new javax.swing.JLabel();
        lblFnme = new javax.swing.JLabel();
        lblegn = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        tfieldNme = new javax.swing.JTextField();
        tfieldSecondNme = new javax.swing.JTextField();
        tfieldLastNme = new javax.swing.JTextField();
        tfieldPIN = new javax.swing.JTextField();
        tfieldAddress = new javax.swing.JTextField();
        lblCountry = new javax.swing.JLabel();
        comboBoxCountry = new javax.swing.JComboBox();
        lblCity = new javax.swing.JLabel();
        tfieldCity = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        tfieldPhone = new javax.swing.JTextField();
        tfieldMail = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        tfieldUsername = new javax.swing.JTextField();
        lblTypeID = new javax.swing.JLabel();
        btnCancelReg = new javax.swing.JButton();
        lblDateOfBirth = new javax.swing.JLabel();
        comboBoxDateOfBirth = new javax.swing.JComboBox();
        comboBoxMonthOfBirth = new javax.swing.JComboBox();
        comboBoxYearOfBirth = new javax.swing.JComboBox();
        comboBoxUserType = new javax.swing.JComboBox();
        NewAccountPanel = new javax.swing.JPanel();
        Fname_lbl = new javax.swing.JLabel();
        Sname_lbl = new javax.swing.JLabel();
        Lname_lbl = new javax.swing.JLabel();
        lblEgn = new javax.swing.JLabel();
        tfieldEgn = new javax.swing.JTextField();
        cmboxAccountType = new javax.swing.JComboBox();
        lblAccountType = new javax.swing.JLabel();
        btnSerachAccount = new javax.swing.JButton();
        lblseparator = new javax.swing.JLabel();
        lblCurrency = new javax.swing.JLabel();
        CheckBox_Panel = new javax.swing.JPanel();
        BGN_checkbox = new javax.swing.JCheckBox();
        EUR_checkbox = new javax.swing.JCheckBox();
        USD_checkbox = new javax.swing.JCheckBox();
        initialAmount_lbl = new javax.swing.JLabel();
        tfieldInitialAmount = new javax.swing.JTextField();
        btnCreateNewAccount = new javax.swing.JButton();
        lblIBAN = new javax.swing.JLabel();
        tfieldIBAN = new javax.swing.JTextField();
        lblFname = new javax.swing.JLabel();
        lblSname = new javax.swing.JLabel();
        lblLname = new javax.swing.JLabel();
        DeleteAccountPanel = new javax.swing.JPanel();
        lblEgn_deleteAccount = new javax.swing.JLabel();
        tfieldEGN = new javax.swing.JTextField();
        btnSearchAccount = new javax.swing.JButton();
        lblFname_deleteAccount = new javax.swing.JLabel();
        lblFirstName_deleteAccount = new javax.swing.JLabel();
        lblSecondnme = new javax.swing.JLabel();
        lblSecondName_deleteAccount = new javax.swing.JLabel();
        lblLastnme = new javax.swing.JLabel();
        lblLastName_deleteAccount = new javax.swing.JLabel();
        table_ScrollPane = new javax.swing.JScrollPane();
        Accounts_table = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        DeleteClientPanel = new javax.swing.JPanel();
        lblEGN = new javax.swing.JLabel();
        tfieldegn = new javax.swing.JTextField();
        btnSearchUser = new javax.swing.JButton();
        TableScrollPane1 = new javax.swing.JScrollPane();
        allClientsTable = new javax.swing.JTable();
        btnDeleteUser = new javax.swing.JButton();
        BackgroundLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1040, 700));
        setMinimumSize(new java.awt.Dimension(1040, 700));
        setPreferredSize(new java.awt.Dimension(1016, 680));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ELUBank_lbl.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        ELUBank_lbl.setForeground(new java.awt.Color(0, 153, 153));
        ELUBank_lbl.setText("ELU Bank");
        getContentPane().add(ELUBank_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, -1));

        MenuCardLayoutPanel.setMaximumSize(new java.awt.Dimension(170, 430));
        MenuCardLayoutPanel.setMinimumSize(new java.awt.Dimension(170, 430));
        MenuCardLayoutPanel.setOpaque(false);
        MenuCardLayoutPanel.setPreferredSize(new java.awt.Dimension(200, 430));
        MenuCardLayoutPanel.setLayout(new java.awt.CardLayout());

        ManagementPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Панел за управление", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18), new java.awt.Color(0, 153, 153))); // NOI18N
        ManagementPanel.setOpaque(false);
        ManagementPanel.setPreferredSize(new java.awt.Dimension(200, 430));

        btnCreateClient.setBackground(new java.awt.Color(168, 199, 200));
        btnCreateClient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCreateClient.setText("Създаване на нов клиент");
        btnCreateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateClientActionPerformed(evt);
            }
        });
        btnCreateClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCreateClientKeyPressed(evt);
            }
        });

        btnCreateAccount.setBackground(new java.awt.Color(168, 199, 200));
        btnCreateAccount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCreateAccount.setText("Откриване на сметка");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        btnCreateAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCreateAccountKeyPressed(evt);
            }
        });

        btnDeleteAccount.setBackground(new java.awt.Color(168, 199, 200));
        btnDeleteAccount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDeleteAccount.setText("Закриване на сметка");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });
        btnDeleteAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDeleteAccountKeyPressed(evt);
            }
        });

        btnDeleteClient.setBackground(new java.awt.Color(168, 199, 200));
        btnDeleteClient.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDeleteClient.setText("Закриване на потребител");
        btnDeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteClientActionPerformed(evt);
            }
        });
        btnDeleteClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDeleteClientKeyPressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(168, 199, 200));
        btnExit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnExit.setText("Изход");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        btnExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnExitKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout ManagementPanelLayout = new javax.swing.GroupLayout(ManagementPanel);
        ManagementPanel.setLayout(ManagementPanelLayout);
        ManagementPanelLayout.setHorizontalGroup(
            ManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ManagementPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(ManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateClient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );
        ManagementPanelLayout.setVerticalGroup(
            ManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManagementPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnCreateClient, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteClient, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        MenuCardLayoutPanel.add(ManagementPanel, "card2");

        getContentPane().add(MenuCardLayoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 260, 450));

        CentralCardLayoutPanel.setMaximumSize(new java.awt.Dimension(804, 680));
        CentralCardLayoutPanel.setMinimumSize(new java.awt.Dimension(804, 680));
        CentralCardLayoutPanel.setOpaque(false);
        CentralCardLayoutPanel.setPreferredSize(new java.awt.Dimension(804, 680));
        CentralCardLayoutPanel.setLayout(new java.awt.CardLayout());

        WelcomePanel.setOpaque(false);
        WelcomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Welcome_lbl.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        Welcome_lbl.setForeground(new java.awt.Color(0, 153, 153));
        Welcome_lbl.setText("Добре дошли в системата за управление на клиенти");
        WelcomePanel.add(Welcome_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 610, 80));

        CentralCardLayoutPanel.add(WelcomePanel, "card5");

        RegistrationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Регистрация", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18), new java.awt.Color(0, 153, 153))); // NOI18N
        RegistrationPanel.setForeground(new java.awt.Color(0, 153, 153));
        RegistrationPanel.setMaximumSize(new java.awt.Dimension(804, 680));
        RegistrationPanel.setMinimumSize(new java.awt.Dimension(804, 680));
        RegistrationPanel.setOpaque(false);
        RegistrationPanel.setPreferredSize(new java.awt.Dimension(804, 680));
        RegistrationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnme.setText("Име");
        RegistrationPanel.add(lblnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        lblSnme.setText("Презиме");
        RegistrationPanel.add(lblSnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        lblFnme.setText("Фамилия");
        RegistrationPanel.add(lblFnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        lblegn.setText("ЕГН");
        RegistrationPanel.add(lblegn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        lblAddress.setText("Адрес:  обл./.........ул./........№/....етl./....ап./.... ");
        RegistrationPanel.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        tfieldNme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldNmeKeyPressed(evt);
            }
        });
        RegistrationPanel.add(tfieldNme, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 160, -1));

        tfieldSecondNme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldSecondNmeKeyPressed(evt);
            }
        });
        RegistrationPanel.add(tfieldSecondNme, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 160, -1));

        tfieldLastNme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldLastNmeKeyPressed(evt);
            }
        });
        RegistrationPanel.add(tfieldLastNme, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 160, -1));

        tfieldPIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldPINKeyPressed(evt);
            }
        });
        RegistrationPanel.add(tfieldPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 160, -1));

        tfieldAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldAddressKeyPressed(evt);
            }
        });
        RegistrationPanel.add(tfieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 380, -1));

        lblCountry.setText("Държава");
        RegistrationPanel.add(lblCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        comboBoxCountry.setBackground(new java.awt.Color(160, 199, 200));
        comboBoxCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Изберете държава", "Австралия", "Австрия", "Азербайджан", "Албания", "Алжир", "Американска Самоа", "Англия", "Ангола", "Андора", "Антигуа и Барбуда", "Аржентина", "Армения", "Афганистан", "Бангладеш", "Барбадос", "Бахамски острови", "Бахрейн", "Беларус", "Белгия", "Белиз", "Бенин", "Боливия", "Босна и Херцеговина", "Ботсвана", "Бразилия", "Бруней", "Буркина Фасо", "Бурунди", "Бутан", "България", "Вануату", "Ватикан", "Венецуела", "Виетнам", "Габон", "Гамбия", "Гана", "Гватемала", "Гвиана", "Гвинея", "Гвинея-Бисау", "Германия", "Гренада", "Гренландия", "Грузия", "Гуам", "Гърция", "Дания", "Демократична република Конго", "Джибути", "Доминиканска република", "Доминика", "Египет", "Еквадор", "Екваториална Гвинея", "Еритрея", "Естония", "Етиопия", "Замбия", "Западна Сахара", "Зимбабве", "Израел", "Източен Тимор", "Индия", "Индонезия", "Ирак", "Иран", "Ирландия", "Исландия", "Испания", "Италия", "Йемен", "Йордания", "Кабо Верде", "Казахстан", "Камбоджа", "Камерун", "Канада", "Катар", "Кения", "Кипър", "Киргизстан", "Кирибати", "Китай", "Колумбия", "Коморски острови", "Конго", "Коста Рика", "Кот д'Ивоар", "Куба", "Кувейт", "Лаос", "Латвия", "Лесото", "Либерия", "Либия", "Лисабон", "Литва", "Лихтенщайн", "Люксембург", "Мавритания", "Мавриций", "Мадагаскар", "Македония", "Малави", "Малайзия", "Малдиви", "Мали", "Малта", "Мариански острови", "Мароко", "Маршалови острови", "Мексико", "Мианмар", "Микронезия", "Мозамбик", "Молдова", "Монако", "Монголия", "Намибия", "Непал", "Нигерия", "Нигер", "Никарагуа", "Ниуе", "Нова Зеландия", "Нова Каледония", "Норвегия", "ОАЕ", "Оман", "Острови Кук", "Пакистан", "Палау", "Панама", "Папуа - Нова Гвинея", "Парагвай", "Перу", "Питкерн", "Полша", "Португалия", "Руанда", "Румъния", "Русия", "Русия", "САЩ", "Салвадор", "Самоа", "Сан Марино", "Саудитска Арабия", "Свазиленд", "Северна Корея", "Сейнт Винсент и Гренадини", "Сейнт Китс и Невис", "Сейнт Лусия", "Сейшелски острови", "Сенегал", "Сиера Леоне", "Сингапур", "Сирия", "Словакия", "Словения", "Соломонови острови", "Сомалия", "Судан", "Суринам", "Сърбия", "Таджикистан", "Тайван", "Тайланд", "Танзания", "Тибет", "Того", "Тонга", "Тринидад и Тобаго", "Тувалу", "Тунис", "Туркменистан", "Турция", "Турция", "Уганда", "Узбекистан", "Украйна", "Унгария", "Уругвай", "Фиджи", "Филипини", "Финландия", "Франция", "Френска Полинезия", "Хаити", "Холандия", "Хондурас", "Хърватия", "ЦАР", "Чад", "Черна гора", "Чехия", "Чили", "Швейцария", "Швеция", "Шри Ланка", "ЮАР", "Южна Корея", "Ямайка", "Япония" }));
        comboBoxCountry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboBoxCountryKeyPressed(evt);
            }
        });
        RegistrationPanel.add(comboBoxCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 160, -1));

        lblCity.setText("Град");
        RegistrationPanel.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 30, -1));

        tfieldCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldCityKeyPressed(evt);
            }
        });
        RegistrationPanel.add(tfieldCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 160, -1));

        lblPhone.setText("Телефонен номер");
        RegistrationPanel.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        lblMail.setText("E-mail ");
        RegistrationPanel.add(lblMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        tfieldPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldPhoneKeyPressed(evt);
            }
        });
        RegistrationPanel.add(tfieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 160, -1));

        tfieldMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldMailKeyPressed(evt);
            }
        });
        RegistrationPanel.add(tfieldMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 160, -1));

        btnConfirm.setBackground(new java.awt.Color(168, 199, 200));
        btnConfirm.setText("Потвърди");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        RegistrationPanel.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 90, 30));

        lblUsername.setText("Потребителско име");
        RegistrationPanel.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        tfieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldUsernameKeyPressed(evt);
            }
        });
        RegistrationPanel.add(tfieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 160, -1));

        lblTypeID.setText("Ниво на достъп");
        RegistrationPanel.add(lblTypeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        btnCancelReg.setBackground(new java.awt.Color(168, 199, 200));
        btnCancelReg.setText("Откажи");
        btnCancelReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRegActionPerformed(evt);
            }
        });
        RegistrationPanel.add(btnCancelReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 90, 30));

        lblDateOfBirth.setText("Дата на раждане");
        RegistrationPanel.add(lblDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        comboBoxDateOfBirth.setBackground(new java.awt.Color(168, 199, 200));
        comboBoxDateOfBirth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ден", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        comboBoxDateOfBirth.setMaximumSize(new java.awt.Dimension(61, 20));
        comboBoxDateOfBirth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboBoxDateOfBirthKeyPressed(evt);
            }
        });
        RegistrationPanel.add(comboBoxDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 70, -1));

        comboBoxMonthOfBirth.setBackground(new java.awt.Color(168, 199, 200));
        comboBoxMonthOfBirth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Месец", "Януари", "Февруари", "Март", "Април", "Май", "Юни", "Юли", "Август", "Септември", "Октомври", "Ноемрви", "Декември" }));
        comboBoxMonthOfBirth.setMaximumSize(new java.awt.Dimension(61, 20));
        RegistrationPanel.add(comboBoxMonthOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 70, -1));

        comboBoxYearOfBirth.setBackground(new java.awt.Color(168, 199, 200));
        comboBoxYearOfBirth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Година", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014" }));
        comboBoxYearOfBirth.setMaximumSize(new java.awt.Dimension(61, 20));
        RegistrationPanel.add(comboBoxYearOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 70, -1));

        comboBoxUserType.setBackground(new java.awt.Color(160, 199, 200));
        comboBoxUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Изберете тип на потребителя", "Банков служител", "Депозиращ Клиент", "Клиент" }));
        comboBoxUserType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboBoxUserTypeKeyPressed(evt);
            }
        });
        RegistrationPanel.add(comboBoxUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 160, -1));

        CentralCardLayoutPanel.add(RegistrationPanel, "RegistrationCard");
        RegistrationPanel.getAccessibleContext().setAccessibleParent(CentralCardLayoutPanel);

        NewAccountPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Нова сметка", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18), new java.awt.Color(0, 153, 153))); // NOI18N
        NewAccountPanel.setMaximumSize(new java.awt.Dimension(804, 680));
        NewAccountPanel.setMinimumSize(new java.awt.Dimension(804, 680));
        NewAccountPanel.setOpaque(false);
        NewAccountPanel.setPreferredSize(new java.awt.Dimension(804, 680));
        NewAccountPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fname_lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Fname_lbl.setText("Име");
        NewAccountPanel.add(Fname_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        Sname_lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Sname_lbl.setText("Презиме");
        NewAccountPanel.add(Sname_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, -1));

        Lname_lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lname_lbl.setText("Фамилия");
        NewAccountPanel.add(Lname_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, 20));

        lblEgn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEgn.setText("Единен Граждански Номер (ЕГН)");
        NewAccountPanel.add(lblEgn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        tfieldEgn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldEgnKeyPressed(evt);
            }
        });
        NewAccountPanel.add(tfieldEgn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 130, -1));

        cmboxAccountType.setBackground(new java.awt.Color(160, 199, 200));
        cmboxAccountType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Изберете вид", "Стандартен депозит", "С фиксирана лихва", "Разплащателна сметка" }));
        cmboxAccountType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmboxAccountTypeKeyPressed(evt);
            }
        });
        NewAccountPanel.add(cmboxAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 180, -1));

        lblAccountType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAccountType.setText("Вид на сметката");
        NewAccountPanel.add(lblAccountType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        btnSerachAccount.setBackground(new java.awt.Color(168, 199, 200));
        btnSerachAccount.setText("Търси");
        btnSerachAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerachAccountActionPerformed(evt);
            }
        });
        NewAccountPanel.add(btnSerachAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        lblseparator.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblseparator.setForeground(new java.awt.Color(0, 102, 102));
        lblseparator.setText("-----------------------------------------------------------------------------------------------------------------------");
        NewAccountPanel.add(lblseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lblCurrency.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCurrency.setText("Валута");
        NewAccountPanel.add(lblCurrency, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        CheckBox_Panel.setOpaque(false);

        currencyTypeBtnGrp.add(BGN_checkbox);
        BGN_checkbox.setSelected(true);
        BGN_checkbox.setText("BGN");

        currencyTypeBtnGrp.add(EUR_checkbox);
        EUR_checkbox.setText("EUR");

        currencyTypeBtnGrp.add(USD_checkbox);
        USD_checkbox.setText("USD");

        javax.swing.GroupLayout CheckBox_PanelLayout = new javax.swing.GroupLayout(CheckBox_Panel);
        CheckBox_Panel.setLayout(CheckBox_PanelLayout);
        CheckBox_PanelLayout.setHorizontalGroup(
            CheckBox_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckBox_PanelLayout.createSequentialGroup()
                .addComponent(BGN_checkbox)
                .addGap(18, 18, 18)
                .addComponent(EUR_checkbox)
                .addGap(18, 18, 18)
                .addComponent(USD_checkbox)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        CheckBox_PanelLayout.setVerticalGroup(
            CheckBox_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckBox_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CheckBox_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BGN_checkbox)
                    .addComponent(EUR_checkbox)
                    .addComponent(USD_checkbox))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NewAccountPanel.add(CheckBox_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 190, 40));

        initialAmount_lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        initialAmount_lbl.setText("Първоначална сума");
        NewAccountPanel.add(initialAmount_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        tfieldInitialAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldInitialAmountKeyPressed(evt);
            }
        });
        NewAccountPanel.add(tfieldInitialAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 180, -1));

        btnCreateNewAccount.setBackground(new java.awt.Color(168, 199, 200));
        btnCreateNewAccount.setText("Създай");
        btnCreateNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewAccountActionPerformed(evt);
            }
        });
        NewAccountPanel.add(btnCreateNewAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, -1));

        lblIBAN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIBAN.setText("Вашата нова сметка е с IBAN ");
        NewAccountPanel.add(lblIBAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));
        NewAccountPanel.add(tfieldIBAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 310, -1));
        NewAccountPanel.add(lblFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));
        NewAccountPanel.add(lblSname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));
        NewAccountPanel.add(lblLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        CentralCardLayoutPanel.add(NewAccountPanel, "createAccountCard");

        DeleteAccountPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Закриване на сметка", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 18), new java.awt.Color(0, 153, 153))); // NOI18N
        DeleteAccountPanel.setOpaque(false);
        DeleteAccountPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEgn_deleteAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblEgn_deleteAccount.setText("Единен Граждански Номер");
        DeleteAccountPanel.add(lblEgn_deleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        tfieldEGN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldEGNKeyPressed(evt);
            }
        });
        DeleteAccountPanel.add(tfieldEGN, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 120, -1));

        btnSearchAccount.setBackground(new java.awt.Color(168, 199, 200));
        btnSearchAccount.setText("Търси");
        btnSearchAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAccountActionPerformed(evt);
            }
        });
        DeleteAccountPanel.add(btnSearchAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        lblFname_deleteAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblFname_deleteAccount.setText("Име");
        DeleteAccountPanel.add(lblFname_deleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));
        DeleteAccountPanel.add(lblFirstName_deleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        lblSecondnme.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSecondnme.setText("Презиме");
        DeleteAccountPanel.add(lblSecondnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));
        DeleteAccountPanel.add(lblSecondName_deleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        lblLastnme.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLastnme.setText("Фамилия");
        DeleteAccountPanel.add(lblLastnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));
        DeleteAccountPanel.add(lblLastName_deleteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        Accounts_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IBAN", "N сметка", "Тип сметка", "Сума", "Валута"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Accounts_table.setOpaque(false);
        Accounts_table.getTableHeader().setResizingAllowed(false);
        Accounts_table.getTableHeader().setReorderingAllowed(false);
        table_ScrollPane.setViewportView(Accounts_table);
        Accounts_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (Accounts_table.getColumnModel().getColumnCount() > 0) {
            Accounts_table.getColumnModel().getColumn(0).setResizable(false);
            Accounts_table.getColumnModel().getColumn(0).setPreferredWidth(60);
            Accounts_table.getColumnModel().getColumn(1).setResizable(false);
            Accounts_table.getColumnModel().getColumn(1).setPreferredWidth(40);
            Accounts_table.getColumnModel().getColumn(2).setResizable(false);
            Accounts_table.getColumnModel().getColumn(2).setPreferredWidth(100);
            Accounts_table.getColumnModel().getColumn(3).setResizable(false);
            Accounts_table.getColumnModel().getColumn(3).setPreferredWidth(100);
            Accounts_table.getColumnModel().getColumn(4).setResizable(false);
            Accounts_table.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        DeleteAccountPanel.add(table_ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 590, 320));

        btnDelete.setBackground(new java.awt.Color(168, 199, 200));
        btnDelete.setText("Изтрий");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        DeleteAccountPanel.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 550, 90, -1));

        btnCancel.setBackground(new java.awt.Color(168, 199, 200));
        btnCancel.setText("Отмени");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        DeleteAccountPanel.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 90, -1));

        CentralCardLayoutPanel.add(DeleteAccountPanel, "DeleteAcntCard");

        DeleteClientPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Закриване на поребител", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 2, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        DeleteClientPanel.setOpaque(false);
        DeleteClientPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEGN.setText("Единен граждански номер");
        DeleteClientPanel.add(lblEGN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        tfieldegn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfieldegnKeyPressed(evt);
            }
        });
        DeleteClientPanel.add(tfieldegn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 150, -1));

        btnSearchUser.setText("Търси");
        btnSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchUserActionPerformed(evt);
            }
        });
        DeleteClientPanel.add(btnSearchUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        allClientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        allClientsTable.setOpaque(false);
        allClientsTable.getTableHeader().setResizingAllowed(false);
        allClientsTable.getTableHeader().setReorderingAllowed(false);
        TableScrollPane1.setViewportView(allClientsTable);

        DeleteClientPanel.add(TableScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 590, 410));

        btnDeleteUser.setText("Изтрий");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });
        DeleteClientPanel.add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, -1, -1));

        CentralCardLayoutPanel.add(DeleteClientPanel, "DeleteClientCard");

        getContentPane().add(CentralCardLayoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 610, 590));

        BackgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abstract_background.jpg"))); // NOI18N
        getContentPane().add(BackgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -20, -1, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
        CardLayout deleteAccount = (CardLayout) (CentralCardLayoutPanel.getLayout());
        deleteAccount.show(CentralCardLayoutPanel, "DeleteAcntCard");
        tfieldEGN.grabFocus();
    }//GEN-LAST:event_btnDeleteAccountActionPerformed

    private void btnCreateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateClientActionPerformed
        CardLayout registrationPanel = (CardLayout) (CentralCardLayoutPanel.getLayout());
        registrationPanel.show(CentralCardLayoutPanel, "RegistrationCard");
        tfieldUsername.grabFocus();
    }//GEN-LAST:event_btnCreateClientActionPerformed

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed

        CardLayout accoutPanel = (CardLayout) (CentralCardLayoutPanel.getLayout());
        accoutPanel.show(CentralCardLayoutPanel, "createAccountCard");
        tfieldEgn.grabFocus();
    }//GEN-LAST:event_btnCreateAccountActionPerformed
/**
 * 
 * @param evt 
 */
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

        String user = tfieldUsername.getText();
        String pass = "elu" + tfieldPIN.getText();
        String Fname = tfieldNme.getText();
        String Mname = tfieldSecondNme.getText();
        String Lname = tfieldLastNme.getText();
        String pin = tfieldPIN.getText();
        String bday = (String) comboBoxDateOfBirth.getSelectedItem();
        String bmonth = (String) comboBoxMonthOfBirth.getSelectedItem();
        String byear = (String) comboBoxYearOfBirth.getSelectedItem();
        String country = (String) comboBoxCountry.getSelectedItem();
        String city = tfieldCity.getText();
        String address = tfieldAddress.getText();
        String phone = tfieldPhone.getText();
        String email = tfieldMail.getText();
        String access = comboBoxUserType.getSelectedIndex() + "";
        String request = "create";

        /**
         * Check if all required fields are filled in
         */
        newUser = new User(user, pass, Fname, Mname, Lname, pin, bday, bmonth, byear,
                country, city, address, phone, email, access);

        if (user.trim().length() == 0 || Fname.length() == 0 || Mname.trim().length() == 0
                || Lname.trim().length() == 0 || pin.trim().length() == 0
                || country.trim().length() == 0 || city.trim().length() == 0
                || address.length() == 0 || phone.length() == 0 || email.length() == 0
                || comboBoxCountry.getSelectedIndex() == 0 || comboBoxDateOfBirth.getSelectedIndex() == 0
                || comboBoxMonthOfBirth.getSelectedIndex() == 0 || comboBoxYearOfBirth.getSelectedIndex() == 0
                || comboBoxUserType.getSelectedIndex() == 0) {

            JOptionPane.showMessageDialog(null, "Моля, поълнете всички полета!");
            return;
        }

        /**
         * check PIN field for 10 digits
         */
        Pattern egn_val = Pattern.compile("\\d{10,10}");
        Matcher m_val = egn_val.matcher(pin);
        if (!m_val.find() || pin.length() != 10) {
            JOptionPane.showMessageDialog(null, "ЕГН трябва да съдържа само цифри"
                    + "\nи да има дължина равна на 10 символа.",
                    "Грешка", JOptionPane.ERROR_MESSAGE);
            return;
        }

// PIN verification 
        CheckPIN verify = new CheckPIN(newUser.getEgn());

        if (verify.isValid()) {
            newUser.setEgn(pin);
        } else {
            JOptionPane.showMessageDialog(null, "Грешно ЕГН!", "Грешка",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        newUser.setRequest(request);
        newUser = (User) client.runClient(newUser);

        if (newUser.getResponse() != null) {
            JOptionPane.showMessageDialog(null, newUser.getResponse(),
                    "Грешка", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Успешно създадохте нов потребител!");
        }
        clearRegistrationForm();
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnSerachAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerachAccountActionPerformed
        lblFname.setText("");
        lblSname.setText("");
        lblLname.setText("");

        pin = tfieldEgn.getText();
        String request = "search";
        /**
         * check EGN field for 10 digits
         */

        Pattern egn_val = Pattern.compile("\\d{10,10}");
        Matcher m_val = egn_val.matcher(pin);
        if (!m_val.find() || pin.length() != 10) {
            JOptionPane.showMessageDialog(null, "ЕГН трябва да съдържа само цифри"
                    + "\nи да има дължина равна на 10 символа.",
                    "Грешка", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /**
         * creates new User object
         *
         */
        newUser = new User();
        newUser.setEgn(pin);
        newUser.setRequest(request);
        newUser = (User) client.runClient(newUser);
        /**
         *
         */
        if (newUser.getResponse() != null) {
            JOptionPane.showMessageDialog(null, newUser.getResponse(),
                    "Грешка", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (newUser.getUserType().equalsIgnoreCase("1")) {
            JOptionPane.showMessageDialog(null, "Банковите служители нямат право"
                    + " на лични сметки", "Грешка", JOptionPane.ERROR_MESSAGE);
            return;
        }

        /**
         * linking information about user from db with label fields
         */
        lblFname.setText(newUser.getName());
        lblSname.setText(newUser.getSurname());
        lblLname.setText(newUser.getFamilyname());
    }//GEN-LAST:event_btnSerachAccountActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
                new InterestsForm().setVisible(false);
            }
        });
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCreateNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewAccountActionPerformed

        String pin = tfieldEgn.getText();
        String InitialAmount_ = tfieldInitialAmount.getText();
        String EUR = EUR_checkbox.getText();
        String USD = USD_checkbox.getText();
        String BGN = BGN_checkbox.getText();

        /**
         * check for selected currency
         */
        if (BGN_checkbox.isSelected()) {
            accounts.setCurrency(BGN_checkbox.getText());
        } else if (EUR_checkbox.isSelected()) {
            accounts.setCurrency(EUR_checkbox.getText());
        } else if (USD_checkbox.isSelected()) {
            accounts.setCurrency(USD_checkbox.getText());
        }

        /**
         * Check if all required fields are filled in
         */
        if (pin.trim().length() == 0 || cmboxAccountType.getSelectedIndex() == 0
                || InitialAmount_.trim().length() == 0 && BGN.trim().length() == 0
                && EUR.trim().length() == 0 && USD.trim().length() == 0) {

            JOptionPane.showMessageDialog(null, "Моля, поълнете всички полета!");
            return;
        }

        // convert commas from numbers to dot (european standard)
        NumberFormat doubleFormat = NumberFormat.getInstance(Locale.GERMAN);
        Number doubleNumber = 0;
        try {
            doubleNumber = doubleFormat.parse(InitialAmount_);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Грешка при форматиране на данните");
            return;
        }
        Double doubleValue = doubleNumber.doubleValue();
        tfieldInitialAmount.setText(doubleValue.toString());

        accounts.setUserEGN(tfieldEgn.getText());
        accounts.setAccountType(cmboxAccountType.getSelectedItem().toString());
        accounts.setAmount(doubleValue.toString());
        accounts.setRequest("create");

        do {
            tfieldIBAN.setText(generateIBAN());
            accounts.setIBAN(tfieldIBAN.getText());
            accounts = (Accounts) client.runClient(accounts);
        } while (accounts.getResponse() != null
                && accounts.getResponse().equalsIgnoreCase("ibanExists"));

        if (accounts.getResponse() != null) {
            JOptionPane.showMessageDialog(null, accounts.getResponse(),
                    "Грешка", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Успешно създадохте нова потребителска сметка!\n"
                    + "IBAN: " + tfieldIBAN.getText());
        }

        clearNewAccountForm();
    }//GEN-LAST:event_btnCreateNewAccountActionPerformed

    private void btnCancelRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRegActionPerformed

        clearRegistrationForm();
    }//GEN-LAST:event_btnCancelRegActionPerformed

    /**
     * Method used to find user and its accounts
     *
     * @param evt - click on button search EGN
     */
    private void btnSearchAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAccountActionPerformed

        if (lblFirstName_deleteAccount.getText().length() != 0
                && tfieldEGN.getText().equals(pin)) {
            return;
        }

        pin = tfieldEGN.getText();
        String request = "search";
        /**
         * check EGN field for 10 digits
         */
        Pattern egn_val = Pattern.compile("\\d{10,10}");
        Matcher m_val = egn_val.matcher(pin);
        if (!m_val.find() || pin.length() != 10) {
            JOptionPane.showMessageDialog(null, "ЕГН трябва да съдържа само цифри"
                    + "\nи да има дължина равна на 10 символа.",
                    "Грешка", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //clear client information 
        //set table in initial state
        clearDeleteAccountForm();

        /**
         * creates new User object
         *
         */
        newUser = new User();
        newUser.setEgn(pin);
        newUser.setRequest(request);
        newUser = (User) client.runClient(newUser);

        if (newUser.getResponse() != null) {
            JOptionPane.showMessageDialog(null, newUser.getResponse(),
                    "Грешка", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (newUser.getUserType().equalsIgnoreCase("1")) {
            JOptionPane.showMessageDialog(null, "Банковите служители нямат право"
                    + " на лични сметки", "Грешка", JOptionPane.ERROR_MESSAGE);
            return;
        }

        lblFirstName_deleteAccount.setText(newUser.getName());
        lblSecondName_deleteAccount.setText(newUser.getSurname());
        lblLastName_deleteAccount.setText(newUser.getFamilyname());

        if (newUser.getAccounts() != null) {
            for (Accounts currentAccout : newUser.getAccounts()) {
                int i = 0;
                accountsTableModel.insertRow(i++, new Object[]{currentAccout.getIBAN(),
                    currentAccout.getIBAN().substring(10), currentAccout.getAccountType(),
                    currentAccout.getAmount(), currentAccout.getCurrency()});
            }
        }

    }//GEN-LAST:event_btnSearchAccountActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int answer = JOptionPane.showConfirmDialog(null, "Сигурни ли сте, че искате"
                + " да изтриете избраната сметка?", "Изтриване", JOptionPane.YES_NO_OPTION);

        if (answer == 0) {
            int row = Accounts_table.getSelectedRow();
            String iban = Accounts_table.getValueAt(row, 0).toString();
            accounts.setIBAN(iban);
            accounts.setRequest("delete");
            accounts = (Accounts) client.runClient(accounts);

            accountsTableModel.removeRow(Accounts_table.getSelectedRow());
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tfieldUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldUsernameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirm.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfieldUsername.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tfieldNme.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_tfieldUsernameKeyPressed

    private void tfieldNmeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldNmeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirm.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfieldUsername.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tfieldSecondNme.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_tfieldNmeKeyPressed

    private void tfieldLastNmeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldLastNmeKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirm.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfieldSecondNme.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            comboBoxDateOfBirth.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_tfieldLastNmeKeyPressed

    private void comboBoxDateOfBirthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBoxDateOfBirthKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirm.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfieldLastNme.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tfieldPIN.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_comboBoxDateOfBirthKeyPressed

    private void tfieldPINKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldPINKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirm.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            comboBoxDateOfBirth.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            comboBoxCountry.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_tfieldPINKeyPressed

    private void tfieldCityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldCityKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirm.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            comboBoxCountry.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tfieldAddress.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_tfieldCityKeyPressed

    private void tfieldSecondNmeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldSecondNmeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirm.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfieldNme.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tfieldLastNme.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }

    }//GEN-LAST:event_tfieldSecondNmeKeyPressed

    private void tfieldAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldAddressKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirm.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfieldCity.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tfieldPhone.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_tfieldAddressKeyPressed

    private void tfieldPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldPhoneKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirm.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfieldAddress.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tfieldMail.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_tfieldPhoneKeyPressed

    private void comboBoxUserTypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBoxUserTypeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirm.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfieldMail.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            comboBoxUserType.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_comboBoxUserTypeKeyPressed

    private void tfieldMailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldMailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirm.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfieldPhone.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            comboBoxUserType.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_tfieldMailKeyPressed

    private void comboBoxCountryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboBoxCountryKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnConfirm.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfieldPIN.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            tfieldCity.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_comboBoxCountryKeyPressed

    private void tfieldEGNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldEGNKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSearchAccount.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnDeleteAccount.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_tfieldEGNKeyPressed

    private void btnDeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteClientActionPerformed

        CardLayout DeleteClient = (CardLayout) (CentralCardLayoutPanel.getLayout());
        DeleteClient.show(CentralCardLayoutPanel, "DeleteClientCard");
        tfieldEGN.grabFocus();

        // populate all user data into the table
        allUsers = new User();
        allUsers.setRequest("getAll");
        allUsers = (User) client.runClient(allUsers);

        clearAllUsersTable();

        if (allUsers.getAllUser() != null) {
            for (User currentUser : allUsers.getAllUser()) {
                int i = 0;
                allUsersTableModel.insertRow(i++, new Object[]{currentUser.getName(),
                    currentUser.getSurname(), currentUser.getFamilyname(),
                    currentUser.getEgn(), currentUser.getCity(),
                    currentUser.getAddress(), currentUser.getPhone()});
            }
        }
    }//GEN-LAST:event_btnDeleteClientActionPerformed

    private void btnSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchUserActionPerformed

        pin = tfieldegn.getText();
        /**
         * check EGN field for 10 digits
         */
        Pattern egn_val = Pattern.compile("\\d{10,10}");
        Matcher m_val = egn_val.matcher(pin);
        if (!m_val.find() || pin.length() != 10) {
            JOptionPane.showMessageDialog(null, "ЕГН трябва да съдържа само цифри"
                    + "\nи да има дължина равна на 10 символа.",
                    "Грешка", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // select that row in the table in which contains the pin searched 
        for (int i = 0; i < allUsersTableModel.getRowCount(); i++) {
            if (allUsersTableModel.getValueAt(i, 3) == null) {
                continue;
            }
            if (pin.equalsIgnoreCase(allUsersTableModel.getValueAt(i, 3).toString())) {
                allClientsTable.setRowSelectionInterval(i, i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Не е намерен потребител с такъв ЕГН!");
    }//GEN-LAST:event_btnSearchUserActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearDeleteAccountForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void tfieldEgnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldEgnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSerachAccount.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateAccount.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            cmboxAccountType.grabFocus();
        }
    }//GEN-LAST:event_tfieldEgnKeyPressed

    private void tfieldInitialAmountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldInitialAmountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCreateNewAccount.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateAccount.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            tfieldEgn.grabFocus();
        }
    }//GEN-LAST:event_tfieldInitialAmountKeyPressed

    private void cmboxAccountTypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmboxAccountTypeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnCreateAccount.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            EUR_checkbox.grabFocus();
        }
    }//GEN-LAST:event_cmboxAccountTypeKeyPressed

    private void tfieldegnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfieldegnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            btnDeleteClient.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            EUR_checkbox.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSearchUser.doClick();
        }
    }//GEN-LAST:event_tfieldegnKeyPressed

    private void btnCreateClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCreateClientKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCreateClient.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            tfieldUsername.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            btnCreateAccount.grabFocus();
        }

    }//GEN-LAST:event_btnCreateClientKeyPressed

    private void btnCreateAccountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCreateAccountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnCreateAccount.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            tfieldEgn.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            btnDeleteAccount.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btnCreateClient.grabFocus();
        }
    }//GEN-LAST:event_btnCreateAccountKeyPressed

    private void btnDeleteAccountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDeleteAccountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnDeleteAccount.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            tfieldEGN.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            btnDeleteClient.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btnCreateAccount.grabFocus();
        }
    }//GEN-LAST:event_btnDeleteAccountKeyPressed

    private void btnDeleteClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDeleteClientKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnDeleteClient.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            tfieldegn.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            btnExit.grabFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btnDeleteAccount.grabFocus();
        }
    }//GEN-LAST:event_btnDeleteClientKeyPressed

    private void btnExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnExitKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnExit.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            btnDeleteClient.grabFocus();
        }
    }//GEN-LAST:event_btnExitKeyPressed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed

        int answer = JOptionPane.showConfirmDialog(null, "Сигурни ли сте, че искате"
                + " да изтриете потребителския акаунт?", "Изтриване", JOptionPane.YES_NO_OPTION);

        if (answer == 0) {
            int row = allClientsTable.getSelectedRow();
            pin = allClientsTable.getValueAt(row, 3).toString();

            for (User userToBeDeleted : allUsers.getAllUser()) {
                if (userToBeDeleted.getEgn().equalsIgnoreCase(pin)) {
                    userToBeDeleted.setRequest("delete");
                    userToBeDeleted = (User) client.runClient(userToBeDeleted);
                }
            }

            allUsersTableModel.removeRow(allClientsTable.getSelectedRow());
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed
    /**
     * creates method for clearing out the form
     */

    private void clearRegistrationForm() {
        tfieldUsername.setText("");
        tfieldNme.setText("");
        tfieldSecondNme.setText("");
        tfieldLastNme.setText("");
        tfieldPIN.setText("");
        comboBoxDateOfBirth.setSelectedIndex(0);
        comboBoxMonthOfBirth.setSelectedIndex(0);
        comboBoxYearOfBirth.setSelectedIndex(0);
        comboBoxCountry.setSelectedIndex(0);
        tfieldCity.setText("");
        tfieldAddress.setText("");
        tfieldPhone.setText("");
        tfieldMail.setText("");
        comboBoxUserType.setSelectedIndex(0);
    }

    private void clearNewAccountForm() {
        tfieldEgn.setText("");
        tfieldIBAN.setText("");
        lblFname.setText("");
        lblSname.setText("");
        lblLname.setText("");
        BGN_checkbox.setSelected(true);
        tfieldInitialAmount.setText("");
        cmboxAccountType.setSelectedIndex(0);
    }

    private void clearDeleteAccountForm() {
        lblFirstName_deleteAccount.setText("");
        lblSecondName_deleteAccount.setText("");
        lblLastName_deleteAccount.setText("");

        while (accountsTableModel.getRowCount() > 0) {
            accountsTableModel.removeRow(0);
        }
        for (int i = 0; i < 21; i++) {
            accountsTableModel.insertRow(i, new Object[]{});
        }
    }

    private void clearAllUsersTable() {
        while (allUsersTableModel.getRowCount() > 0) {
            allUsersTableModel.removeRow(0);
        }
        for (int i = 0; i < 21; i++) {
            allUsersTableModel.insertRow(i, new Object[]{});
        }
    }

    public String generateIBAN() {
        // begging of the IBAN: BG + code + EBUBank initials + Sofia postal code.
        String IBAN = "BG11ELUB1632";

        // followed by type of account 01, 02, 03, etc.
        String accountType = "0" + (cmboxAccountType.getSelectedIndex() - 1);
        IBAN += accountType;

        // followed by random code.
        int minValue = 10000000;
        int maxValue = 99999999;
        int IBANrandom = minValue + (int) (Math.random() * ((maxValue - minValue) + 1));
        IBAN += IBANrandom;

        return IBAN;
    }

    private final SSLClient client = new SSLClient();
    private Accounts accounts = new Accounts();
    private User newUser;
    private User allUsers;
    private String pin = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Accounts_table;
    private javax.swing.JCheckBox BGN_checkbox;
    private javax.swing.JLabel BackgroundLbl;
    private javax.swing.JPanel CentralCardLayoutPanel;
    private javax.swing.JPanel CheckBox_Panel;
    private javax.swing.JPanel DeleteAccountPanel;
    private javax.swing.JPanel DeleteClientPanel;
    private javax.swing.JLabel ELUBank_lbl;
    private javax.swing.JCheckBox EUR_checkbox;
    private javax.swing.JLabel Fname_lbl;
    private javax.swing.JLabel Lname_lbl;
    private javax.swing.JPanel ManagementPanel;
    private javax.swing.JPanel MenuCardLayoutPanel;
    private javax.swing.JPanel NewAccountPanel;
    private javax.swing.JPanel RegistrationPanel;
    private javax.swing.JLabel Sname_lbl;
    private javax.swing.JScrollPane TableScrollPane1;
    private javax.swing.JCheckBox USD_checkbox;
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JLabel Welcome_lbl;
    private javax.swing.JTable allClientsTable;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancelReg;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnCreateClient;
    private javax.swing.JButton btnCreateNewAccount;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JButton btnDeleteClient;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearchAccount;
    private javax.swing.JButton btnSearchUser;
    private javax.swing.JButton btnSerachAccount;
    private javax.swing.JComboBox cmboxAccountType;
    private javax.swing.JComboBox comboBoxCountry;
    private javax.swing.JComboBox comboBoxDateOfBirth;
    private javax.swing.JComboBox comboBoxMonthOfBirth;
    private javax.swing.JComboBox comboBoxUserType;
    private javax.swing.JComboBox comboBoxYearOfBirth;
    private javax.swing.ButtonGroup currencyTypeBtnGrp;
    private javax.swing.JLabel initialAmount_lbl;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblCurrency;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEGN;
    private javax.swing.JLabel lblEgn;
    private javax.swing.JLabel lblEgn_deleteAccount;
    private javax.swing.JLabel lblFirstName_deleteAccount;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblFname_deleteAccount;
    private javax.swing.JLabel lblFnme;
    private javax.swing.JLabel lblIBAN;
    private javax.swing.JLabel lblLastName_deleteAccount;
    private javax.swing.JLabel lblLastnme;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSecondName_deleteAccount;
    private javax.swing.JLabel lblSecondnme;
    private javax.swing.JLabel lblSname;
    private javax.swing.JLabel lblSnme;
    private javax.swing.JLabel lblTypeID;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblegn;
    private javax.swing.JLabel lblnme;
    private javax.swing.JLabel lblseparator;
    private javax.swing.JScrollPane table_ScrollPane;
    private javax.swing.JTextField tfieldAddress;
    private javax.swing.JTextField tfieldCity;
    private javax.swing.JTextField tfieldEGN;
    private javax.swing.JTextField tfieldEgn;
    private javax.swing.JTextField tfieldIBAN;
    private javax.swing.JTextField tfieldInitialAmount;
    private javax.swing.JTextField tfieldLastNme;
    private javax.swing.JTextField tfieldMail;
    private javax.swing.JTextField tfieldNme;
    private javax.swing.JTextField tfieldPIN;
    private javax.swing.JTextField tfieldPhone;
    private javax.swing.JTextField tfieldSecondNme;
    private javax.swing.JTextField tfieldUsername;
    private javax.swing.JTextField tfieldegn;
    // End of variables declaration//GEN-END:variables
}
