/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package klinikuntan;

/**
 *
 * @author USER
 */
public class Doctor extends javax.swing.JFrame {

    /**
     * Creates new form NewDokter
     */
    public Doctor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        doctorTabbedPane = new javax.swing.JTabbedPane();
        pemeriksaanDoctorTabbedPane = new javax.swing.JTabbedPane();
        panelDiagnosaPemeriksaanDoctor = new javax.swing.JPanel();
        labelKodePemeriksaan3 = new javax.swing.JLabel();
        labelDiagnosa2 = new javax.swing.JLabel();
        textKdPemeriksaanDokter = new javax.swing.JTextField();
        buttonDiagnosaPemeriksaan = new javax.swing.JButton();
        scrollPaneDiagnosaPemeriksaan = new javax.swing.JScrollPane();
        textAreaDiagnosaPemeriksaan = new javax.swing.JTextArea();
        resepDoctorTabbedPane = new javax.swing.JTabbedPane();
        panelTambahObatResepDoctor = new javax.swing.JPanel();
        textDosisObat = new javax.swing.JTextField();
        labelObat3 = new javax.swing.JLabel();
        labelNamaObat3 = new javax.swing.JLabel();
        textNamaObatResep = new javax.swing.JTextField();
        labelStok3 = new javax.swing.JLabel();
        textJumlahObatResep = new javax.swing.JTextField();
        labelObat4 = new javax.swing.JLabel();
        scrollPaneDeskripsiResep = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        buttonTambahResepDoctor = new javax.swing.JButton();
        panelResepObatDoctor = new javax.swing.JPanel();
        scrollPaneResep = new javax.swing.JScrollPane();
        tableResepObat = new javax.swing.JTable();
        buttonCetakResepDoctor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Dokter");

        doctorTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        doctorTabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        labelKodePemeriksaan3.setText("Kode Pemeriksaan");
        labelKodePemeriksaan3.setPreferredSize(new java.awt.Dimension(90, 25));

        labelDiagnosa2.setText("Diagnosa");
        labelDiagnosa2.setPreferredSize(new java.awt.Dimension(90, 25));

        textKdPemeriksaanDokter.setPreferredSize(new java.awt.Dimension(300, 25));

        buttonDiagnosaPemeriksaan.setText("Tambah");
        buttonDiagnosaPemeriksaan.setMaximumSize(new java.awt.Dimension(80, 25));
        buttonDiagnosaPemeriksaan.setMinimumSize(new java.awt.Dimension(80, 25));
        buttonDiagnosaPemeriksaan.setPreferredSize(new java.awt.Dimension(80, 25));
        buttonDiagnosaPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDiagnosaPemeriksaanActionPerformed(evt);
            }
        });

        textAreaDiagnosaPemeriksaan.setColumns(20);
        textAreaDiagnosaPemeriksaan.setRows(5);
        scrollPaneDiagnosaPemeriksaan.setViewportView(textAreaDiagnosaPemeriksaan);

        javax.swing.GroupLayout panelDiagnosaPemeriksaanDoctorLayout = new javax.swing.GroupLayout(panelDiagnosaPemeriksaanDoctor);
        panelDiagnosaPemeriksaanDoctor.setLayout(panelDiagnosaPemeriksaanDoctorLayout);
        panelDiagnosaPemeriksaanDoctorLayout.setHorizontalGroup(
            panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelKodePemeriksaan3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDiagnosa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textKdPemeriksaanDokter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPaneDiagnosaPemeriksaan))
                .addGap(167, 167, 167))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDiagnosaPemeriksaanDoctorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDiagnosaPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        panelDiagnosaPemeriksaanDoctorLayout.setVerticalGroup(
            panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodePemeriksaan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textKdPemeriksaanDokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDiagnosaPemeriksaanDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneDiagnosaPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDiagnosa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(buttonDiagnosaPemeriksaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pemeriksaanDoctorTabbedPane.addTab("Diagnosa Pasien", panelDiagnosaPemeriksaanDoctor);

        doctorTabbedPane.addTab("Pemeriksaan", pemeriksaanDoctorTabbedPane);

        textDosisObat.setPreferredSize(new java.awt.Dimension(300, 25));

        labelObat3.setText("Dosis");
        labelObat3.setPreferredSize(new java.awt.Dimension(90, 25));

        labelNamaObat3.setText("Nama Obat");
        labelNamaObat3.setPreferredSize(new java.awt.Dimension(90, 25));

        textNamaObatResep.setPreferredSize(new java.awt.Dimension(300, 25));

        labelStok3.setText("Jumlah");
        labelStok3.setPreferredSize(new java.awt.Dimension(90, 25));

        textJumlahObatResep.setPreferredSize(new java.awt.Dimension(300, 25));

        labelObat4.setText("Deskripsi");
        labelObat4.setPreferredSize(new java.awt.Dimension(90, 25));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setPreferredSize(new java.awt.Dimension(300, 84));
        scrollPaneDeskripsiResep.setViewportView(jTextArea2);

        buttonTambahResepDoctor.setText("Tambah");
        buttonTambahResepDoctor.setMaximumSize(new java.awt.Dimension(80, 25));
        buttonTambahResepDoctor.setMinimumSize(new java.awt.Dimension(80, 25));
        buttonTambahResepDoctor.setPreferredSize(new java.awt.Dimension(80, 25));
        buttonTambahResepDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahResepDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTambahObatResepDoctorLayout = new javax.swing.GroupLayout(panelTambahObatResepDoctor);
        panelTambahObatResepDoctor.setLayout(panelTambahObatResepDoctorLayout);
        panelTambahObatResepDoctorLayout.setHorizontalGroup(
            panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahObatResepDoctorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelObat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelObat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStok3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNamaObat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textNamaObatResep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textJumlahObatResep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textDosisObat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPaneDeskripsiResep))
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTambahObatResepDoctorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonTambahResepDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        panelTambahObatResepDoctorLayout.setVerticalGroup(
            panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahObatResepDoctorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNamaObat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNamaObatResep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStok3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textJumlahObatResep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelObat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDosisObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelTambahObatResepDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelObat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scrollPaneDeskripsiResep, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(buttonTambahResepDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        resepDoctorTabbedPane.addTab("Buat Resep", panelTambahObatResepDoctor);

        scrollPaneResep.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tableResepObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NO", "Nama Obat", "Jumlah", "Dosis"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneResep.setViewportView(tableResepObat);

        buttonCetakResepDoctor.setText("Cetak");
        buttonCetakResepDoctor.setMaximumSize(new java.awt.Dimension(80, 25));
        buttonCetakResepDoctor.setMinimumSize(new java.awt.Dimension(80, 25));
        buttonCetakResepDoctor.setPreferredSize(new java.awt.Dimension(80, 25));

        javax.swing.GroupLayout panelResepObatDoctorLayout = new javax.swing.GroupLayout(panelResepObatDoctor);
        panelResepObatDoctor.setLayout(panelResepObatDoctorLayout);
        panelResepObatDoctorLayout.setHorizontalGroup(
            panelResepObatDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResepObatDoctorLayout.createSequentialGroup()
                .addGroup(panelResepObatDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelResepObatDoctorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCetakResepDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelResepObatDoctorLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(scrollPaneResep, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)))
                .addGap(55, 55, 55))
        );
        panelResepObatDoctorLayout.setVerticalGroup(
            panelResepObatDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResepObatDoctorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(scrollPaneResep, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(buttonCetakResepDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        resepDoctorTabbedPane.addTab("Cetak Resep", panelResepObatDoctor);

        doctorTabbedPane.addTab("Resep", resepDoctorTabbedPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(doctorTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(doctorTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDiagnosaPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDiagnosaPemeriksaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDiagnosaPemeriksaanActionPerformed

    private void buttonTambahResepDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahResepDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonTambahResepDoctorActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCetakResepDoctor;
    private javax.swing.JButton buttonDiagnosaPemeriksaan;
    private javax.swing.JButton buttonTambahResepDoctor;
    private javax.swing.JTabbedPane doctorTabbedPane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel labelDiagnosa2;
    private javax.swing.JLabel labelKodePemeriksaan3;
    private javax.swing.JLabel labelNamaObat3;
    private javax.swing.JLabel labelObat3;
    private javax.swing.JLabel labelObat4;
    private javax.swing.JLabel labelStok3;
    private javax.swing.JPanel panelDiagnosaPemeriksaanDoctor;
    private javax.swing.JPanel panelResepObatDoctor;
    private javax.swing.JPanel panelTambahObatResepDoctor;
    private javax.swing.JTabbedPane pemeriksaanDoctorTabbedPane;
    private javax.swing.JTabbedPane resepDoctorTabbedPane;
    private javax.swing.JScrollPane scrollPaneDeskripsiResep;
    private javax.swing.JScrollPane scrollPaneDiagnosaPemeriksaan;
    private javax.swing.JScrollPane scrollPaneResep;
    private javax.swing.JTable tableResepObat;
    private javax.swing.JTextArea textAreaDiagnosaPemeriksaan;
    private javax.swing.JTextField textDosisObat;
    private javax.swing.JTextField textJumlahObatResep;
    private javax.swing.JTextField textKdPemeriksaanDokter;
    private javax.swing.JTextField textNamaObatResep;
    // End of variables declaration//GEN-END:variables
}