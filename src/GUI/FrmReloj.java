package GUI;

import Cronometro.Cronometro;
import RelojDigital.Reloj2;
import Temporizador.Temporizador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class FrmReloj extends javax.swing.JFrame {
    
    private Reloj2 reloj;
    private Cronometro cronometro;
    private Temporizador temporizador;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmReloj.class.getName());

    
    public FrmReloj() {
        initComponents();
        reloj = new Reloj2();
        cronometro = new Cronometro();
        temporizador = new Temporizador();
        timer.start();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTabbedPanel = new javax.swing.JTabbedPane();
        paneReloj = new javax.swing.JPanel();
        btnConfiReloj = new javax.swing.JButton();
        lblReloj = new javax.swing.JLabel();
        paneTemporizador = new javax.swing.JPanel();
        lblTemporizador = new javax.swing.JLabel();
        btnIniciarTempo = new javax.swing.JButton();
        btnConfiTempo = new javax.swing.JButton();
        btnPausarTempo = new javax.swing.JButton();
        btnDetenerTempo = new javax.swing.JButton();
        paneCronometro = new javax.swing.JPanel();
        lblCronometro = new javax.swing.JLabel();
        btnIniciarCrono = new javax.swing.JButton();
        btnPausarCrono = new javax.swing.JButton();
        btnDetenerCrono = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTabbedPanel.setAutoscrolls(true);
        JTabbedPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnConfiReloj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfiReloj.setText("Configurar Hora");
        btnConfiReloj.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnConfiReloj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiRelojActionPerformed(evt);
            }
        });

        lblReloj.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(0, 0, 0));
        lblReloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReloj.setText("00:00:00");
        lblReloj.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout paneRelojLayout = new javax.swing.GroupLayout(paneReloj);
        paneReloj.setLayout(paneRelojLayout);
        paneRelojLayout.setHorizontalGroup(
            paneRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(paneRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneRelojLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(paneRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblReloj)
                        .addGroup(paneRelojLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnConfiReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        paneRelojLayout.setVerticalGroup(
            paneRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
            .addGroup(paneRelojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneRelojLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblReloj)
                    .addGap(102, 102, 102)
                    .addComponent(btnConfiReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JTabbedPanel.addTab("tab2", paneReloj);

        lblTemporizador.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        lblTemporizador.setForeground(new java.awt.Color(0, 0, 0));
        lblTemporizador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemporizador.setText("00:00:00");
        lblTemporizador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnIniciarTempo.setText("Iniciar");
        btnIniciarTempo.setToolTipText("");
        btnIniciarTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarTempoActionPerformed(evt);
            }
        });

        btnConfiTempo.setText("Configurar Hora");
        btnConfiTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiTempoActionPerformed(evt);
            }
        });

        btnPausarTempo.setText("Pausar");
        btnPausarTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarTempoActionPerformed(evt);
            }
        });

        btnDetenerTempo.setText("Detener");
        btnDetenerTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerTempoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneTemporizadorLayout = new javax.swing.GroupLayout(paneTemporizador);
        paneTemporizador.setLayout(paneTemporizadorLayout);
        paneTemporizadorLayout.setHorizontalGroup(
            paneTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(paneTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneTemporizadorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(paneTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(paneTemporizadorLayout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(lblTemporizador))
                        .addGroup(paneTemporizadorLayout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(btnConfiTempo))
                        .addGroup(paneTemporizadorLayout.createSequentialGroup()
                            .addComponent(btnIniciarTempo)
                            .addGap(78, 78, 78)
                            .addComponent(btnPausarTempo)
                            .addGap(88, 88, 88)
                            .addComponent(btnDetenerTempo)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        paneTemporizadorLayout.setVerticalGroup(
            paneTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 263, Short.MAX_VALUE)
            .addGroup(paneTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(paneTemporizadorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblTemporizador)
                    .addGap(72, 72, 72)
                    .addComponent(btnConfiTempo)
                    .addGap(17, 17, 17)
                    .addGroup(paneTemporizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnIniciarTempo)
                        .addComponent(btnPausarTempo)
                        .addComponent(btnDetenerTempo))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        JTabbedPanel.addTab("tab3", paneTemporizador);

        lblCronometro.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        lblCronometro.setForeground(new java.awt.Color(0, 0, 0));
        lblCronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronometro.setText("00:00:00");
        lblCronometro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnIniciarCrono.setText("Iniciar");
        btnIniciarCrono.setToolTipText("");
        btnIniciarCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarCronoActionPerformed(evt);
            }
        });

        btnPausarCrono.setText("Pausar");
        btnPausarCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarCronoActionPerformed(evt);
            }
        });

        btnDetenerCrono.setText("Detener");
        btnDetenerCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerCronoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneCronometroLayout = new javax.swing.GroupLayout(paneCronometro);
        paneCronometro.setLayout(paneCronometroLayout);
        paneCronometroLayout.setHorizontalGroup(
            paneCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCronometroLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(paneCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCronometroLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblCronometro))
                    .addGroup(paneCronometroLayout.createSequentialGroup()
                        .addComponent(btnIniciarCrono)
                        .addGap(78, 78, 78)
                        .addComponent(btnPausarCrono)
                        .addGap(88, 88, 88)
                        .addComponent(btnDetenerCrono)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        paneCronometroLayout.setVerticalGroup(
            paneCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCronometroLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblCronometro)
                .addGap(112, 112, 112)
                .addGroup(paneCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciarCrono)
                    .addComponent(btnPausarCrono)
                    .addComponent(btnDetenerCrono))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        JTabbedPanel.addTab("tab1", paneCronometro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabbedPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTabbedPanel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarTempoActionPerformed
         temporizador.iniciar();
    }//GEN-LAST:event_btnIniciarTempoActionPerformed

    private void btnConfiTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiTempoActionPerformed
        String h = JOptionPane.showInputDialog(this, "Horas:", "0");
        String m = JOptionPane.showInputDialog(this, "Minutos:", "0");
        String s = JOptionPane.showInputDialog(this, "Segundos:", "0");
        try {
            int horas = Integer.parseInt(h);
            int minutos = Integer.parseInt(m);
            int segundos = Integer.parseInt(s);
            temporizador.configurar(horas, minutos, segundos);
            lblTemporizador.setText(temporizador.toString());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores válidos.");
        }
    }//GEN-LAST:event_btnConfiTempoActionPerformed

    private void btnPausarTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarTempoActionPerformed
        temporizador.detener();
    }//GEN-LAST:event_btnPausarTempoActionPerformed

    private void btnDetenerTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerTempoActionPerformed
        temporizador.detener();
        temporizador.configurar(0, 0, 0);
        lblTemporizador.setText(temporizador.toString());
    }//GEN-LAST:event_btnDetenerTempoActionPerformed

    private void btnConfiRelojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiRelojActionPerformed
        String h = JOptionPane.showInputDialog(this, "Horas:", "0");
        String m = JOptionPane.showInputDialog(this, "Minutos:", "0");
        String s = JOptionPane.showInputDialog(this, "Segundos:", "0");
        try {
            int horas = Integer.parseInt(h);
            int minutos = Integer.parseInt(m);
            int segundos = Integer.parseInt(s);
            reloj.configurar(horas, minutos, segundos);
            lblReloj.setText(reloj.toString());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese valores válidos.");
        }
    }//GEN-LAST:event_btnConfiRelojActionPerformed

    private void btnIniciarCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarCronoActionPerformed
        cronometro.iniciar();
    }//GEN-LAST:event_btnIniciarCronoActionPerformed

    private void btnPausarCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarCronoActionPerformed
        cronometro.detener();
    }//GEN-LAST:event_btnPausarCronoActionPerformed

    private void btnDetenerCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerCronoActionPerformed
        cronometro.detener();
        lblCronometro.setText(cronometro.toString());
    }//GEN-LAST:event_btnDetenerCronoActionPerformed

      
    Timer timer = new Timer (1000, new ActionListener(){      
        @Override
        public void actionPerformed(ActionEvent e) {
            iniciarTimer();
        }
     });
             
    private void iniciarTimer() {
            reloj.correr();
            cronometro.correr();
            temporizador.correr();

            lblReloj.setText(reloj.toString());
            lblCronometro.setText(cronometro.toString());
            lblTemporizador.setText(temporizador.toString());
    }
    
    public static void main(String args[]) {
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new FrmReloj().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabbedPanel;
    private javax.swing.JButton btnConfiReloj;
    private javax.swing.JButton btnConfiTempo;
    private javax.swing.JButton btnDetenerCrono;
    private javax.swing.JButton btnDetenerTempo;
    private javax.swing.JButton btnIniciarCrono;
    private javax.swing.JButton btnIniciarTempo;
    private javax.swing.JButton btnPausarCrono;
    private javax.swing.JButton btnPausarTempo;
    private javax.swing.JLabel lblCronometro;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblTemporizador;
    private javax.swing.JPanel paneCronometro;
    private javax.swing.JPanel paneReloj;
    private javax.swing.JPanel paneTemporizador;
    // End of variables declaration//GEN-END:variables

    }
